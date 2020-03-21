package pers.pgb.design_pattern.behavior.responsibility;

public class ConcreteHandlerA extends Handler {
    public ConcreteHandlerA(Handler next) {
        super(next);
    }

    @Override
    public void handler() {
        System.out.println("ConcreteHandlerA 处理");
        if (super.next != null) {
            super.next.handler();
        }
    }
}
