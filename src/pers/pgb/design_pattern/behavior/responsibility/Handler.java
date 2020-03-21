package pers.pgb.design_pattern.behavior.responsibility;

public abstract class Handler {
    protected Handler next;

    public Handler(Handler next) {
        this.next = next;
    }

    public abstract void handler();
}
