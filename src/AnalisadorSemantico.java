import java.io.IOException;

import antlr4.AlgumaLexer;
import antlr4.AlgumaParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class AnalisadorSemantico {
    public static void main(String[] args) {
        //parsing the input
        AlgumaParser parser = getParser("C:\\Users\\chrystian.amaral\\Documents\\Pessoal\\UFLA\\Compiladores\\REO 5\\analisador-lexico-sintatico-semantico\\src\\teste\\codigo.txt");

        //obter arvore
        ParseTree ast = parser.inicio();

        System.out.println(ast.toStringTree());

        //Inicia o MyListener, nossa implementacao do baseListener
        MyListener listener = new MyListener();

        ParseTreeWalker walker = new ParseTreeWalker();

        //percorre a ast com a nossa implementacao no listener
        walker.walk(listener, ast);

        //imprime a tabela de simbolos
        System.out.println(listener.getTabelaSimbolos().toString());
    }

    private static AlgumaParser getParser(String fileName){
        AlgumaParser parser = null;

        try{
            CharStream input = CharStreams.fromFileName(fileName);
            AlgumaLexer lexer = new AlgumaLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            parser = new AlgumaParser(tokens);
        }catch (IOException e){
            e.printStackTrace();
        }

        return parser;
    }
}
