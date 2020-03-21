package pers.pgb.design_pattern.behavior.memento;

public class Client {
    public static void main(String[] args) {
        Caretaker caretaker = new Caretaker();

        Originator originator = new Originator();
        originator.setState("state 1");
        caretaker.setMemento(originator.createMemento());

        originator.setState("state 2");
        caretaker.setMemento(originator.createMemento());

        originator.setState("state 3");
        caretaker.setMemento(originator.createMemento());

        originator.setState("state 4");

        System.out.println(originator.getState());

        originator.restoreMemento(caretaker.getMemento());
        System.out.println(originator.getState());

        originator.restoreMemento(caretaker.getMemento());
        System.out.println(originator.getState());

        originator.restoreMemento(caretaker.getMemento());
        System.out.println(originator.getState());
    }
}
