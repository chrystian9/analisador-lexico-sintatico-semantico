// Generated from Alguma.g4 by ANTLR 4.7.2

    package antlr4;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AlgumaParser}.
 */
public interface AlgumaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code NInicio}
	 * labeled alternative in {@link AlgumaParser#inicio}.
	 * @param ctx the parse tree
	 */
	void enterNInicio(AlgumaParser.NInicioContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NInicio}
	 * labeled alternative in {@link AlgumaParser#inicio}.
	 * @param ctx the parse tree
	 */
	void exitNInicio(AlgumaParser.NInicioContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BlocoDeclaracao}
	 * labeled alternative in {@link AlgumaParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void enterBlocoDeclaracao(AlgumaParser.BlocoDeclaracaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BlocoDeclaracao}
	 * labeled alternative in {@link AlgumaParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void exitBlocoDeclaracao(AlgumaParser.BlocoDeclaracaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NDeclaracao}
	 * labeled alternative in {@link AlgumaParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterNDeclaracao(AlgumaParser.NDeclaracaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NDeclaracao}
	 * labeled alternative in {@link AlgumaParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitNDeclaracao(AlgumaParser.NDeclaracaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BlocoPrograma}
	 * labeled alternative in {@link AlgumaParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterBlocoPrograma(AlgumaParser.BlocoProgramaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BlocoPrograma}
	 * labeled alternative in {@link AlgumaParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitBlocoPrograma(AlgumaParser.BlocoProgramaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NAtribuicao}
	 * labeled alternative in {@link AlgumaParser#instr}.
	 * @param ctx the parse tree
	 */
	void enterNAtribuicao(AlgumaParser.NAtribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NAtribuicao}
	 * labeled alternative in {@link AlgumaParser#instr}.
	 * @param ctx the parse tree
	 */
	void exitNAtribuicao(AlgumaParser.NAtribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NOperacao}
	 * labeled alternative in {@link AlgumaParser#operacao}.
	 * @param ctx the parse tree
	 */
	void enterNOperacao(AlgumaParser.NOperacaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NOperacao}
	 * labeled alternative in {@link AlgumaParser#operacao}.
	 * @param ctx the parse tree
	 */
	void exitNOperacao(AlgumaParser.NOperacaoContext ctx);
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
}