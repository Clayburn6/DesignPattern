package pers.pgb.design_pattern.behavior.explain;

public class MulExpression extends NonterminalExpression {
    public MulExpression(Expression leftExpression, Expression rightExpression) {
        super(leftExpression, rightExpression);
    }

    @Override
    public double interpret() {
        return leftExpression.interpret() * rightExpression.interpret();
    }
}
