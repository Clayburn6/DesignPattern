package pers.pgb.design_pattern.behavior.state;

public class StateA implements State {
    @Override
    public void handler(Context context) {
        System.out.println("状态A");
        context.setState(Context.stateB);
    }
}
