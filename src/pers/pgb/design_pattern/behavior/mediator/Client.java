package pers.pgb.design_pattern.behavior.mediator;

public class Client {
    public static void main(String[] args) {
        Mediator mediator = new ConcreteMediator();

        Colleague colleague1 = new ConcreteColleague();
        colleague1.setMediator(mediator);
        mediator.register(colleague1);

        Colleague colleague2 = new ConcreteColleague();
        mediator.register(colleague2);

        Colleague colleague3 = new ConcreteColleague();
        mediator.register(colleague3);

        colleague1.send();
    }
}
