package pers.pgb.design_pattern.behavior.state;

public class StateB implements State {
    @Override
    public void handler(Context context) {
        System.out.println("状态B");
        context.setState(Context.stateA);
    }
}
