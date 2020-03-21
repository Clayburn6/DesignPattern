package pers.pgb.design_pattern.behavior.explain;

public class SubExpression extends NonterminalExpression {
    public SubExpression(Expression leftExpression, Expression rightExpression) {
        super(leftExpression, rightExpression);
    }

    @Override
    public double interpret() {
        return leftExpression.interpret() - rightExpression.interpret();
    }
}
