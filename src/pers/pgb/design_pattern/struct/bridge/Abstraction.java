package pers.pgb.design_pattern.struct.bridge;

/**
 * 抽象化角色
 */
public abstract class Abstraction {
    protected Implementor implementor;

    public Abstraction(Implementor implementor) {
        this.implementor = implementor;
    }

    public abstract void specialFunction();
}
