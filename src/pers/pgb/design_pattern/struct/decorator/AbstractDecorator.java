package pers.pgb.design_pattern.struct.decorator;

/**
 * 抽象装饰
 */
public abstract class AbstractDecorator implements Compnent {
    protected Compnent compnent;

    public AbstractDecorator(Compnent compnent) {
        this.compnent = compnent;
    }
}
