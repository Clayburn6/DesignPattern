package pers.pgb.design_pattern.behavior.mediator;

public class ConcreteColleague extends Colleague {
    @Override
    public void receive() {
        System.out.println(this + "收到");
    }

    @Override
    public void send() {
        System.out.println(this + "发言");
        mediator.reply(this);
    }
}
