package pers.pgb.design_pattern.behavior.strategy;

public class ConcreteStrategyA implements Strategy {
    @Override
    public void algorithm() {
        System.out.println("算法A实现");
    }
}
