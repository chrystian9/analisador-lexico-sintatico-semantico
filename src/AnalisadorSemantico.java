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
        AlgumaParser parser = getParser("src/teste/codigo.txt");

        //obter arvore
        ParseTree ast = parser.inicio();

        System.out.println(ast.toStringTree());

        //Inicia o MyListener, nossa implementacao do baseListener
        MyListener listener = new MyListener();

        ParseTreeWalker walker = new ParseTreeWalker();

        //percorre a ast com a nossa implementacao no listener
        walker.walk(listener, ast);

        if(listener.getErrosSemanticos().size() > 0){
            System.out.println("Erros semânticos [" + listener.getErrosSemanticos().size() + "]:");
            for (String erro: listener.getErrosSemanticos()) {
                System.out.println(erro);
            }
        }else{
            System.out.println("Não há erros semânticos");
        }
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
