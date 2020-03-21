package pers.pgb.design_pattern.behavior.responsibility;

public class Client {
    public static void main(String[] args) {
        Handler handlerB = new ConcreteHandlerB(null);
        Handler handlerA = new ConcreteHandlerA(handlerB);
        handlerA.handler();
    }
}
