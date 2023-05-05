// Generated from C:/Users/click/IdeaProjects/minicompiladror/src\minicompi.g4 by ANTLR 4.12.0
package compilador;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link minicompiParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface minicompiVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link minicompiParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(minicompiParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link minicompiParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(minicompiParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link minicompiParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(minicompiParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link minicompiParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(minicompiParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link minicompiParser#variableAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableAssignment(minicompiParser.VariableAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link minicompiParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(minicompiParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link minicompiParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(minicompiParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link minicompiParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(minicompiParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link minicompiParser#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(minicompiParser.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link minicompiParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(minicompiParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link minicompiParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOrExpression(minicompiParser.LogicalOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link minicompiParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalAndExpression(minicompiParser.LogicalAndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link minicompiParser#equalityExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpression(minicompiParser.EqualityExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link minicompiParser#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpression(minicompiParser.RelationalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link minicompiParser#additiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression(minicompiParser.AdditiveExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link minicompiParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression(minicompiParser.MultiplicativeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link minicompiParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(minicompiParser.UnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link minicompiParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpression(minicompiParser.PrimaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link minicompiParser#asignmentStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignmentStatement(minicompiParser.AsignmentStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link minicompiParser#printStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStatement(minicompiParser.PrintStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link minicompiParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(minicompiParser.BlockContext ctx);
}