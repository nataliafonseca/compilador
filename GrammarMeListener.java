// Generated from GrammarMe.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GrammarMeParser}.
 */
public interface GrammarMeListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GrammarMeParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(GrammarMeParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarMeParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(GrammarMeParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarMeParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(GrammarMeParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarMeParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(GrammarMeParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarMeParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(GrammarMeParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarMeParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(GrammarMeParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarMeParser#loop}.
	 * @param ctx the parse tree
	 */
	void enterLoop(GrammarMeParser.LoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarMeParser#loop}.
	 * @param ctx the parse tree
	 */
	void exitLoop(GrammarMeParser.LoopContext ctx);
}