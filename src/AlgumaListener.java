// Generated from Alguma.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AlgumaParser}.
 */
public interface AlgumaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(AlgumaParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(AlgumaParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#blocoVar}.
	 * @param ctx the parse tree
	 */
	void enterBlocoVar(AlgumaParser.BlocoVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#blocoVar}.
	 * @param ctx the parse tree
	 */
	void exitBlocoVar(AlgumaParser.BlocoVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(AlgumaParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(AlgumaParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#blocoPrincipal}.
	 * @param ctx the parse tree
	 */
	void enterBlocoPrincipal(AlgumaParser.BlocoPrincipalContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#blocoPrincipal}.
	 * @param ctx the parse tree
	 */
	void exitBlocoPrincipal(AlgumaParser.BlocoPrincipalContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#instr}.
	 * @param ctx the parse tree
	 */
	void enterInstr(AlgumaParser.InstrContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#instr}.
	 * @param ctx the parse tree
	 */
	void exitInstr(AlgumaParser.InstrContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#atr}.
	 * @param ctx the parse tree
	 */
	void enterAtr(AlgumaParser.AtrContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#atr}.
	 * @param ctx the parse tree
	 */
	void exitAtr(AlgumaParser.AtrContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#operando}.
	 * @param ctx the parse tree
	 */
	void enterOperando(AlgumaParser.OperandoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#operando}.
	 * @param ctx the parse tree
	 */
	void exitOperando(AlgumaParser.OperandoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#operacao}.
	 * @param ctx the parse tree
	 */
	void enterOperacao(AlgumaParser.OperacaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#operacao}.
	 * @param ctx the parse tree
	 */
	void exitOperacao(AlgumaParser.OperacaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#funcao}.
	 * @param ctx the parse tree
	 */
	void enterFuncao(AlgumaParser.FuncaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#funcao}.
	 * @param ctx the parse tree
	 */
	void exitFuncao(AlgumaParser.FuncaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(AlgumaParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(AlgumaParser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(AlgumaParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(AlgumaParser.ParamContext ctx);
}