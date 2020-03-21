package pers.pgb.design_pattern.behavior.command;

/**
 * 具体命令
 */
public class ConcreteCommandA implements Command {
    private Receiver receiver = new Receiver();

    @Override
    public void execute() {
        receiver.action1();
    }
}
