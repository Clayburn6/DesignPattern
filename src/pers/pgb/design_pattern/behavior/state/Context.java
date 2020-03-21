package pers.pgb.design_pattern.behavior.state;

public class Context {
    public static final State stateA = new StateA();
    public static final State stateB = new StateB();

    private State state;

    public void setState(State state) {
        this.state = state;
    }

    public void handler() {
        state.handler(this);
    }
}
