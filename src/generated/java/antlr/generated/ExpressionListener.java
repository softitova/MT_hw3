// Generated from Expression.g4 by ANTLR 4.5.3
package antlr.generated;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExpressionParser}.
 */
public interface ExpressionListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExpressionParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(ExpressionParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(ExpressionParser.ParseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(ExpressionParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(ExpressionParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionParser#lVal}.
	 * @param ctx the parse tree
	 */
	void enterLVal(ExpressionParser.LValContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#lVal}.
	 * @param ctx the parse tree
	 */
	void exitLVal(ExpressionParser.LValContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionParser#rVal}.
	 * @param ctx the parse tree
	 */
	void enterRVal(ExpressionParser.RValContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#rVal}.
	 * @param ctx the parse tree
	 */
	void exitRVal(ExpressionParser.RValContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionParser#expr1}.
	 * @param ctx the parse tree
	 */
	void enterExpr1(ExpressionParser.Expr1Context ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#expr1}.
	 * @param ctx the parse tree
	 */
	void exitExpr1(ExpressionParser.Expr1Context ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(ExpressionParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(ExpressionParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionParser#expr2}.
	 * @param ctx the parse tree
	 */
	void enterExpr2(ExpressionParser.Expr2Context ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#expr2}.
	 * @param ctx the parse tree
	 */
	void exitExpr2(ExpressionParser.Expr2Context ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionParser#fact}.
	 * @param ctx the parse tree
	 */
	void enterFact(ExpressionParser.FactContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#fact}.
	 * @param ctx the parse tree
	 */
	void exitFact(ExpressionParser.FactContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionParser#unaryOp}.
	 * @param ctx the parse tree
	 */
	void enterUnaryOp(ExpressionParser.UnaryOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#unaryOp}.
	 * @param ctx the parse tree
	 */
	void exitUnaryOp(ExpressionParser.UnaryOpContext ctx);
}