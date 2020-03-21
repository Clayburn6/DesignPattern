package pers.pgb.design_pattern.behavior.observer;

public class ConcreteObserver implements Observer {
    @Override
    public void notice() {
        System.out.println(this + "被通知");
    }
}
