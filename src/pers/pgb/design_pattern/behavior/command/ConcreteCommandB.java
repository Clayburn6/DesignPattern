package pers.pgb.design_pattern.behavior.command;

public class ConcreteCommandB implements Command {
    private Receiver receiver;

    public ConcreteCommandB(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.action2();
    }
}
