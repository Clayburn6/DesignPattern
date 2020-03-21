package pers.pgb.design_pattern.behavior.explain;

public class AddExpression extends NonterminalExpression {
    public AddExpression(Expression leftExpression, Expression rightExpression) {
        super(leftExpression, rightExpression);
    }

    @Override
    public double interpret() {
        return leftExpression.interpret() + rightExpression.interpret();
    }
}
