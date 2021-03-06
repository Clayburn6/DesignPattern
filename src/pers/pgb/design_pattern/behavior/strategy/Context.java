package pers.pgb.design_pattern.behavior.strategy;

public class Context {
    private Strategy strategy;

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void operation() {
        strategy.algorithm();
    }
}
