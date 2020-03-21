package pers.pgb.design_pattern.behavior.explain;

public class TerminalExpression implements Expression {
    private double value;

    public TerminalExpression(double value) {
        this.value = value;
    }

    @Override
    public double interpret() {
        return this.value;
    }
}
