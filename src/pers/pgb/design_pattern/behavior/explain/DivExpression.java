package pers.pgb.design_pattern.behavior.explain;

public class DivExpression extends NonterminalExpression {
    public DivExpression(Expression leftExpression, Expression rightExpression) {
        super(leftExpression, rightExpression);
    }

    @Override
    public double interpret() {
        return leftExpression.interpret() / rightExpression.interpret();
    }
}
