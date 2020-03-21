package pers.pgb.design_pattern.behavior.explain;

public abstract class NonterminalExpression implements Expression {
    protected Expression leftExpression;

    protected Expression rightExpression;

    public NonterminalExpression(Expression leftExpression, Expression rightExpression) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }
}
