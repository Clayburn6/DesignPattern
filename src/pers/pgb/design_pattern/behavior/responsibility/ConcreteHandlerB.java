package pers.pgb.design_pattern.behavior.responsibility;

public class ConcreteHandlerB extends Handler {
    public ConcreteHandlerB(Handler next) {
        super(next);
    }

    @Override
    public void handler() {
        System.out.println("ConcreteHandlerB 处理");
        if (super.next != null) {
            super.next.handler();
        }
    }
}
