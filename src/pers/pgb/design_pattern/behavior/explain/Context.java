package pers.pgb.design_pattern.behavior.explain;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class Context {
    private Expression expression;

    public void operation(String exp) {
        // 这里产生一个树型的结构
        expression = new TerminalExpression(1);
    }

    public double interpter() {
        return expression.interpret();
    }
}
