package pers.pgb.design_pattern.struct.decorator;

public class Client {
    public static void main(String[] args) {
        Compnent cake = new Cake();
        ConcreteDecoratorA concreteDecoratorA = new ConcreteDecoratorA(cake);
        ConcreteDecoratorB concreteDecoratorB = new ConcreteDecoratorB(concreteDecoratorA);

        System.out.println(concreteDecoratorB.checkout());
    }
}
