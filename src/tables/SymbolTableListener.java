package tables;

import compilador.minicompiListener;
import compilador.minicompiParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class SymbolTableListener implements minicompiListener {
    private SymbolTable symbolTable = new SymbolTable();

    public SymbolTable getSymbolTable(){
        return  symbolTable;
    }
    @Override
    public void enterStart(minicompiParser.StartContext ctx) {
        String dataType = String.valueOf(ctx.start.getType());
        String name = ctx.start.getText();
        symbolTable.addSymbol(name, dataType);
    }

    @Override
    public void exitStart(minicompiParser.StartContext ctx) {
        String dataType = String.valueOf(ctx.start.getType());
        String name = ctx.start.getText();

        symbolTable.addSymbol(name, dataType);
    }

    @Override
    public void enterProgram(minicompiParser.ProgramContext ctx) {
        String dataType = String.valueOf(ctx.start.getType());
        String name = ctx.start.getText();

        symbolTable.addSymbol(name, dataType);
    }

    @Override
    public void exitProgram(minicompiParser.ProgramContext ctx) {
        String dataType = String.valueOf(ctx.start.getType());
        String name = ctx.start.getText();

        symbolTable.addSymbol(name, dataType);
    }

    @Override
    public void enterStatement(minicompiParser.StatementContext ctx) {
        String dataType = String.valueOf(ctx.start.getType());
        String name = ctx.start.getText();

        symbolTable.addSymbol(name, dataType);
    }

    @Override
    public void exitStatement(minicompiParser.StatementContext ctx) {
        String dataType = String.valueOf(ctx.start.getType());
        String name = ctx.start.getText();

        symbolTable.addSymbol(name, dataType);
    }

    @Override
    public void enterVariableDeclaration(minicompiParser.VariableDeclarationContext ctx) {
        String dataType = String.valueOf(ctx.start.getType());
        String name = ctx.start.getText();

        symbolTable.addSymbol(name, dataType);
    }

    @Override
    public void exitVariableDeclaration(minicompiParser.VariableDeclarationContext ctx) {
        String dataType = String.valueOf(ctx.start.getType());
        String name = ctx.start.getText();

        symbolTable.addSymbol(name, dataType);
    }

    @Override
    public void enterVariableAssignment(minicompiParser.VariableAssignmentContext ctx) {
        String dataType = String.valueOf(ctx.start.getType());
        String name = ctx.start.getText();

        symbolTable.addSymbol(name, dataType);
    }

    @Override
    public void exitVariableAssignment(minicompiParser.VariableAssignmentContext ctx) {
        String dataType = String.valueOf(ctx.start.getType());
        String name = ctx.start.getText();

        symbolTable.addSymbol(name, dataType);
    }

    @Override
    public void enterIfStatement(minicompiParser.IfStatementContext ctx) {
        String dataType = String.valueOf(ctx.start.getType());
        String name = ctx.start.getText();

        symbolTable.addSymbol(name, dataType);
    }

    @Override
    public void exitIfStatement(minicompiParser.IfStatementContext ctx) {
        String dataType = String.valueOf(ctx.start.getType());
        String name = ctx.start.getText();

        symbolTable.addSymbol(name, dataType);
    }

    @Override
    public void enterWhileStatement(minicompiParser.WhileStatementContext ctx) {
        String dataType = String.valueOf(ctx.start.getType());
        String name = ctx.start.getText();

        symbolTable.addSymbol(name, dataType);
    }

    @Override
    public void exitWhileStatement(minicompiParser.WhileStatementContext ctx) {
        String dataType = String.valueOf(ctx.start.getType());
        String name = ctx.start.getText();

        symbolTable.addSymbol(name, dataType);
    }

    @Override
    public void enterForStatement(minicompiParser.ForStatementContext ctx) {
        String dataType = String.valueOf(ctx.start.getType());
        String name = ctx.start.getText();

        symbolTable.addSymbol(name, dataType);
    }

    @Override
    public void exitForStatement(minicompiParser.ForStatementContext ctx) {
        String dataType = String.valueOf(ctx.start.getType());
        String name = ctx.start.getText();

        symbolTable.addSymbol(name, dataType);
    }

    @Override
    public void enterExpressionStatement(minicompiParser.ExpressionStatementContext ctx) {
        String dataType = String.valueOf(ctx.start.getType());
        String name = ctx.start.getText();

        symbolTable.addSymbol(name, dataType);
    }

    @Override
    public void exitExpressionStatement(minicompiParser.ExpressionStatementContext ctx) {
        String dataType = String.valueOf(ctx.start.getType());
        String name = ctx.start.getText();

        symbolTable.addSymbol(name, dataType);
    }

    @Override
    public void enterExpression(minicompiParser.ExpressionContext ctx) {
        String dataType = String.valueOf(ctx.start.getType());
        String name = ctx.start.getText();

        symbolTable.addSymbol(name, dataType);
    }

    @Override
    public void exitExpression(minicompiParser.ExpressionContext ctx) {
        String dataType = String.valueOf(ctx.start.getType());
        String name = ctx.start.getText();

        symbolTable.addSymbol(name, dataType);
    }

    @Override
    public void enterLogicalOrExpression(minicompiParser.LogicalOrExpressionContext ctx) {
        String dataType = String.valueOf(ctx.start.getType());
        String name = ctx.start.getText();

        symbolTable.addSymbol(name, dataType);
    }

    @Override
    public void exitLogicalOrExpression(minicompiParser.LogicalOrExpressionContext ctx) {
        String dataType = String.valueOf(ctx.start.getType());
        String name = ctx.start.getText();

        symbolTable.addSymbol(name, dataType);
    }

    @Override
    public void enterLogicalAndExpression(minicompiParser.LogicalAndExpressionContext ctx) {
        String dataType = String.valueOf(ctx.start.getType());
        String name = ctx.start.getText();

        symbolTable.addSymbol(name, dataType);
    }

    @Override
    public void exitLogicalAndExpression(minicompiParser.LogicalAndExpressionContext ctx) {
        String dataType = String.valueOf(ctx.start.getType());
        String name = ctx.start.getText();

        symbolTable.addSymbol(name, dataType);
    }

    @Override
    public void enterEqualityExpression(minicompiParser.EqualityExpressionContext ctx) {
        String dataType = String.valueOf(ctx.start.getType());
        String name = ctx.start.getText();

        symbolTable.addSymbol(name, dataType);
    }

    @Override
    public void exitEqualityExpression(minicompiParser.EqualityExpressionContext ctx) {
        String dataType = String.valueOf(ctx.start.getType());
        String name = ctx.start.getText();

        symbolTable.addSymbol(name, dataType);
    }

    @Override
    public void enterRelationalExpression(minicompiParser.RelationalExpressionContext ctx) {
        String dataType = String.valueOf(ctx.start.getType());
        String name = ctx.start.getText();

        symbolTable.addSymbol(name, dataType);
    }

    @Override
    public void exitRelationalExpression(minicompiParser.RelationalExpressionContext ctx) {
        String dataType = String.valueOf(ctx.start.getType());
        String name = ctx.start.getText();

        symbolTable.addSymbol(name, dataType);
    }

    @Override
    public void enterAdditiveExpression(minicompiParser.AdditiveExpressionContext ctx) {
        String dataType = String.valueOf(ctx.start.getType());
        String name = ctx.start.getText();

        symbolTable.addSymbol(name, dataType);
    }

    @Override
    public void exitAdditiveExpression(minicompiParser.AdditiveExpressionContext ctx) {
        String dataType = String.valueOf(ctx.start.getType());
        String name = ctx.start.getText();

        symbolTable.addSymbol(name, dataType);
    }

    @Override
    public void enterMultiplicativeExpression(minicompiParser.MultiplicativeExpressionContext ctx) {
        String dataType = String.valueOf(ctx.start.getType());
        String name = ctx.start.getText();

        symbolTable.addSymbol(name, dataType);
    }

    @Override
    public void exitMultiplicativeExpression(minicompiParser.MultiplicativeExpressionContext ctx) {
        String dataType = String.valueOf(ctx.start.getType());
        String name = ctx.start.getText();

        symbolTable.addSymbol(name, dataType);
    }

    @Override
    public void enterUnaryExpression(minicompiParser.UnaryExpressionContext ctx) {
        String dataType = String.valueOf(ctx.start.getType());
        String name = ctx.start.getText();

        symbolTable.addSymbol(name, dataType);
    }

    @Override
    public void exitUnaryExpression(minicompiParser.UnaryExpressionContext ctx) {
        String dataType = String.valueOf(ctx.start.getType());
        String name = ctx.start.getText();

        symbolTable.addSymbol(name, dataType);
    }

    @Override
    public void enterPrimaryExpression(minicompiParser.PrimaryExpressionContext ctx) {
        String dataType = String.valueOf(ctx.start.getType());
        String name = ctx.start.getText();

        symbolTable.addSymbol(name, dataType);
    }

    @Override
    public void exitPrimaryExpression(minicompiParser.PrimaryExpressionContext ctx) {
        String dataType = String.valueOf(ctx.start.getType());
        String name = ctx.start.getText();

        symbolTable.addSymbol(name, dataType);
    }

    @Override
    public void enterAsignmentStatement(minicompiParser.AsignmentStatementContext ctx) {
        String dataType = String.valueOf(ctx.start.getType());
        String name = ctx.start.getText();

        symbolTable.addSymbol(name, dataType);
    }

    @Override
    public void exitAsignmentStatement(minicompiParser.AsignmentStatementContext ctx) {
        String dataType = String.valueOf(ctx.start.getType());
        String name = ctx.start.getText();

        symbolTable.addSymbol(name, dataType);
    }

    @Override
    public void enterPrintStatement(minicompiParser.PrintStatementContext ctx) {
        String dataType = String.valueOf(ctx.start.getType());
        String name = ctx.start.getText();

        symbolTable.addSymbol(name, dataType);
    }

    @Override
    public void exitPrintStatement(minicompiParser.PrintStatementContext ctx) {
        String dataType = String.valueOf(ctx.start.getType());
        String name = ctx.start.getText();

        symbolTable.addSymbol(name, dataType);
    }

    @Override
    public void enterBlock(minicompiParser.BlockContext ctx) {
        String dataType = String.valueOf(ctx.start.getType());
        String name = ctx.start.getText();

        symbolTable.addSymbol(name, dataType);
    }

    @Override
    public void exitBlock(minicompiParser.BlockContext ctx) {
        String dataType = String.valueOf(ctx.start.getType());
        String name = ctx.start.getText();

        symbolTable.addSymbol(name, dataType);
    }

    @Override
    public void visitTerminal(TerminalNode terminalNode) {
        String dataType = String.valueOf(terminalNode.getSymbol());
        String name = terminalNode.getText();

        symbolTable.addSymbol(name, dataType);
    }

    @Override
    public void visitErrorNode(ErrorNode errorNode) {
        String dataType = String.valueOf(errorNode.getSymbol());
        String name = errorNode.getText();

        symbolTable.addSymbol(name, dataType);
    }

    @Override
    public void enterEveryRule(ParserRuleContext parserRuleContext) {
        String dataType = String.valueOf(parserRuleContext.start.getType());
        String name = parserRuleContext.start.getText();

        symbolTable.addSymbol(name, dataType);
    }

    @Override
    public void exitEveryRule(ParserRuleContext parserRuleContext) {
        String dataType = String.valueOf(parserRuleContext.start.getType());
        String name = parserRuleContext.start.getText();

        symbolTable.addSymbol(name, dataType);
    }

}
