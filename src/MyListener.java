import antlr4.AlgumaBaseListener;
import antlr4.AlgumaParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.HashMap;
import java.util.Map;

public class MyListener extends AlgumaBaseListener {

    private Map<String, String> tabelaSimbolos = new HashMap<String, String>();

    public Map<String, String> getTabelaSimbolos() {
        return tabelaSimbolos;
    }

    @Override
    public void enterNInicio(AlgumaParser.NInicioContext ctx) {
        super.enterNInicio(ctx);
    }

    @Override
    public void exitNInicio(AlgumaParser.NInicioContext ctx) {
        super.exitNInicio(ctx);
    }

    @Override
    public void enterBlocoDeclaracao(AlgumaParser.BlocoDeclaracaoContext ctx) {
        super.enterBlocoDeclaracao(ctx);
    }

    @Override
    public void exitBlocoDeclaracao(AlgumaParser.BlocoDeclaracaoContext ctx) {
        super.exitBlocoDeclaracao(ctx);
    }

    @Override
    public void enterNDeclaracao(AlgumaParser.NDeclaracaoContext ctx) {
        super.enterNDeclaracao(ctx);
    }

    @Override
    public void exitNDeclaracao(AlgumaParser.NDeclaracaoContext ctx) {
        super.exitNDeclaracao(ctx);
    }

    @Override
    public void enterBlocoAlgoritmo(AlgumaParser.BlocoAlgoritmoContext ctx) {
        super.enterBlocoAlgoritmo(ctx);
    }

    @Override
    public void exitBlocoAlgoritmo(AlgumaParser.BlocoAlgoritmoContext ctx) {
        super.exitBlocoAlgoritmo(ctx);
    }

    @Override
    public void enterNInstrucao(AlgumaParser.NInstrucaoContext ctx) {
        super.enterNInstrucao(ctx);
    }

    @Override
    public void exitNInstrucao(AlgumaParser.NInstrucaoContext ctx) {
        super.exitNInstrucao(ctx);
    }

    @Override
    public void enterNAtribuicao(AlgumaParser.NAtribuicaoContext ctx) {
        super.enterNAtribuicao(ctx);
    }

    @Override
    public void exitNAtribuicao(AlgumaParser.NAtribuicaoContext ctx) {
        super.exitNAtribuicao(ctx);
    }

    @Override
    public void enterNOperacao(AlgumaParser.NOperacaoContext ctx) {
        super.enterNOperacao(ctx);
    }

    @Override
    public void exitNOperacao(AlgumaParser.NOperacaoContext ctx) {
        super.exitNOperacao(ctx);
    }

    @Override
    public void enterOperando(AlgumaParser.OperandoContext ctx) {
        super.enterOperando(ctx);
    }

    @Override
    public void exitOperando(AlgumaParser.OperandoContext ctx) {
        super.exitOperando(ctx);
    }

    @Override
    public void enterEveryRule(ParserRuleContext ctx) {
        super.enterEveryRule(ctx);
    }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) {
        super.exitEveryRule(ctx);
    }

    @Override
    public void visitTerminal(TerminalNode node) {
        super.visitTerminal(node);
    }

    @Override
    public void visitErrorNode(ErrorNode node) {
        super.visitErrorNode(node);
    }
}
