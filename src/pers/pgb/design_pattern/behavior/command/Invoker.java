package pers.pgb.design_pattern.behavior.command;

/**
 * 调用者
 */
public class Invoker {
    private Command commandA = new ConcreteCommandA();

    private Command commandB = new ConcreteCommandA();

    public void commandA() {
        commandA.execute();
    }

    public void commandB() {
        commandB.execute();
    }
}
