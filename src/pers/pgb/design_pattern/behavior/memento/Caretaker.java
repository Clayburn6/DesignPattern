package pers.pgb.design_pattern.behavior.memento;

import java.util.LinkedList;

public class Caretaker {
    private LinkedList<Memento> mementos = new LinkedList<>();

    public Memento getMemento() {
        return mementos.pollLast();
    }

    public void setMemento(Memento memento) {
        mementos.addLast(memento);
    }
}
