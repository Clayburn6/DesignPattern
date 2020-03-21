package pers.pgb.design_pattern.behavior.strategy;

public class Client {
    public static void main(String[] args) {
        Strategy strategy = new ConcreteStrategyA();
        Context context = new Context();
        context.setStrategy(strategy);
        context.operation();
        Strategy strategy1 = new ConcreteStrategyB();
        context.setStrategy(strategy1);
        context.operation();
    }
}
