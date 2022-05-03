import antlr4.AlgumaBaseListener;
import antlr4.AlgumaParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.*;

public class MyListener extends AlgumaBaseListener {

    private List<String> errosSemanticos = new ArrayList<>();
    private Map<String, String> tabelaSimbolos = new HashMap<String, String>();

    public Map<String, String> getTabelaSimbolos() {
        return tabelaSimbolos;
    }

    public List<String> getErrosSemanticos() {
        return errosSemanticos;
    }

    @Override
    public void exitNDeclaracao(AlgumaParser.NDeclaracaoContext ctx) {
        String tipo = ctx.TIPO().getText();
        String id = ctx.ID().getText();

        if(tabelaSimbolos.containsKey(id)){
            errosSemanticos.add("Declaração duplicada! Variável " + id + " já declarada " + ctx.toString());
        } else {
            tabelaSimbolos.put(id, tipo);
        }
    }

    @Override
    public void enterNAtribuicao(AlgumaParser.NAtribuicaoContext ctx) {
        String id = null;
        String tipo = null;

        if(ctx.ID().size() > 1){
            id = ctx.ID().get(1).getText();
            tipo = tabelaSimbolos.get(ctx.ID().get(0).getText());
        }else {
            id = ctx.ID().get(0).getText();
            if (ctx.BOOL() != null) {
                tipo = "Bool";
            } else if (ctx.NUM() != null) {
                String atribuido = ctx.NUM().getText();

                if(atribuido.matches("[0-9]+")){
                    tipo = "int";
                }else{
                    tipo = "float";
                }
            } else if (ctx.STRING() != null) {
                tipo = "string";
            }
        }

        if(!tabelaSimbolos.containsKey(id)){
            errosSemanticos.add("Variavel não declarada: " + id + " " + ctx.toString());
        }

        if(tipo == null) {
            String tipoOperandor = ctx.operacao().getChild(1).getText();

            if(tipoOperandor.matches("['>'|'<'|'>='|'<='|'==']")){
                tipo = "Bool";
            }else{
                String operando1 = ctx.operacao().getChild(0).getText();
                String tipoOperacao = "int";

                if(tabelaSimbolos.containsKey(operando1)) {
                    if(tabelaSimbolos.get(operando1).equals("float")) {
                        tipoOperacao = "float";
                    }
                }else if(!operando1.matches("[0-9]")){
                    tipoOperacao = "float";
                }

                if(tipoOperacao != "float"){
//                    ParseTree child = ctx.operacao().getChild(2);
//                    boolean control = true;
//                    while (control){
//                        operando1 = child.getChild(0).getText();
//                        if(tabelaSimbolos.containsKey(operando1)) {
//                            if(tabelaSimbolos.get(operando1).equals("float")) {
//                                tipoOperacao = "float";
//                            }
//                        }else if(!operando1.matches("[0-9]")){
//                            tipoOperacao = "float";
//                        }
//
//                        if(tipoOperacao == "float"){
//                            control = false;
//                        }
//                    }
                }

//                ctx.operacao().getChild(2).getChild();
            }

            if (!tabelaSimbolos.get(id).equals(tipo)) {
                errosSemanticos.add("Tipos não correspondentes: " + ctx.operacao().getText() + " não retorna " + tabelaSimbolos.get(id) + " " + ctx.toString());
            }
        }else {
            if (!tabelaSimbolos.get(id).equals(tipo)) {
                errosSemanticos.add("Tipos não correspondentes: " + tipo + " não é " + tabelaSimbolos.get(id) + " " + ctx.toString());
            }
        }
    }

    @Override
    public void exitNAtribuicao(AlgumaParser.NAtribuicaoContext ctx) {
        super.exitNAtribuicao(ctx);
    }

    @Override
    public void enterNOperacao(AlgumaParser.NOperacaoContext ctx) {
        String operando = ctx.OPERADOR().getText();
        String op = ctx.operando().get(0).getText();
        String tipo = tabelaSimbolos.get(op);
        String op2 = ctx.operando().get(1).getText();
        String tipo2 = tabelaSimbolos.get(op2);
        Boolean error = false;

        if(Objects.equals(tipo, "string")){
            if(Objects.equals(tipo2, "Bool")){
                error = true;
            }

            else if(Objects.equals(tipo2, "int")){
                error = true;
            }

            else if(Objects.equals(tipo2, "float")){
                error = true;
            }
        }

        else if(Objects.equals(tipo, "Bool") && Objects.equals(tipo2, "string")){
            error = true;
        }
        else if(Objects.equals(tipo, "int") && Objects.equals(tipo2, "string")){
            error = true;
        }

        else if(Objects.equals(tipo, "float") && Objects.equals(tipo2, "string")){
            error = true;
        }


        if(error)
            errosSemanticos.add("No match for operator " + operando +
                    " (operand types are " + tipo + " and " + tipo2 + ")");

    }

    @Override
    public void exitNOperacao(AlgumaParser.NOperacaoContext ctx) {
        super.exitNOperacao(ctx);
    }

    @Override
    public void enterOperando(AlgumaParser.OperandoContext ctx) {
        String id = ctx.ID().getText();

        if(!tabelaSimbolos.containsKey(id)){
            errosSemanticos.add("Variavel não declarada: " + id + " " + ctx.toString());
            System.out.println("Variavel não declarada: " + id + " " + ctx.toString());
        }
    }

    @Override
    public void exitOperando(AlgumaParser.OperandoContext ctx) {
        super.exitOperando(ctx);
    }
}
