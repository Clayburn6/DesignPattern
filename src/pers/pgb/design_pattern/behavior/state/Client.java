package pers.pgb.design_pattern.behavior.state;

public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        context.setState(Context.stateA);
        context.handler();
        context.handler();
        context.handler();
        context.handler();

    }
}
