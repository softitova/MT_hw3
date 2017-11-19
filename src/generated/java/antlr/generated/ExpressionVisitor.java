// Generated from Expression.g4 by ANTLR 4.5.3
package antlr.generated;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ExpressionParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ExpressionVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#parse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParse(ExpressionParser.ParseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(ExpressionParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#lVal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLVal(ExpressionParser.LValContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#rVal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRVal(ExpressionParser.RValContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#expr1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr1(ExpressionParser.Expr1Context ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(ExpressionParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#expr2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr2(ExpressionParser.Expr2Context ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#fact}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFact(ExpressionParser.FactContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#unaryOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryOp(ExpressionParser.UnaryOpContext ctx);
}