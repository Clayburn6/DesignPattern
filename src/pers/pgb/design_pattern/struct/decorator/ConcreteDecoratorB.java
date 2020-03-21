package pers.pgb.design_pattern.struct.decorator;

public class ConcreteDecoratorB extends AbstractDecorator {
    public ConcreteDecoratorB(Compnent compnent) {
        super(compnent);
    }

    @Override
    public double checkout() {
        return 2.3 + super.compnent.checkout();
    }
}
