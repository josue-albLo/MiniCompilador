// Generated from C:/Users/click/IdeaProjects/minicompiladror/src\minicompi.g4 by ANTLR 4.12.0
package compilador;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link minicompiParser}.
 */
public interface minicompiListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link minicompiParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(minicompiParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link minicompiParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(minicompiParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link minicompiParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(minicompiParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link minicompiParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(minicompiParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link minicompiParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(minicompiParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link minicompiParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(minicompiParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link minicompiParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(minicompiParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link minicompiParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(minicompiParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link minicompiParser#variableAssignment}.
	 * @param ctx the parse tree
	 */
	void enterVariableAssignment(minicompiParser.VariableAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link minicompiParser#variableAssignment}.
	 * @param ctx the parse tree
	 */
	void exitVariableAssignment(minicompiParser.VariableAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link minicompiParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(minicompiParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link minicompiParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(minicompiParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link minicompiParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(minicompiParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link minicompiParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(minicompiParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link minicompiParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(minicompiParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link minicompiParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(minicompiParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link minicompiParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(minicompiParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link minicompiParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(minicompiParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link minicompiParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(minicompiParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link minicompiParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(minicompiParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link minicompiParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOrExpression(minicompiParser.LogicalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link minicompiParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOrExpression(minicompiParser.LogicalOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link minicompiParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalAndExpression(minicompiParser.LogicalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link minicompiParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalAndExpression(minicompiParser.LogicalAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link minicompiParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(minicompiParser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link minicompiParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(minicompiParser.EqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link minicompiParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(minicompiParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link minicompiParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(minicompiParser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link minicompiParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(minicompiParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link minicompiParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(minicompiParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link minicompiParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(minicompiParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link minicompiParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(minicompiParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link minicompiParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(minicompiParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link minicompiParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(minicompiParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link minicompiParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpression(minicompiParser.PrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link minicompiParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpression(minicompiParser.PrimaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link minicompiParser#asignmentStatement}.
	 * @param ctx the parse tree
	 */
	void enterAsignmentStatement(minicompiParser.AsignmentStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link minicompiParser#asignmentStatement}.
	 * @param ctx the parse tree
	 */
	void exitAsignmentStatement(minicompiParser.AsignmentStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link minicompiParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void enterPrintStatement(minicompiParser.PrintStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link minicompiParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void exitPrintStatement(minicompiParser.PrintStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link minicompiParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(minicompiParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link minicompiParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(minicompiParser.BlockContext ctx);
}