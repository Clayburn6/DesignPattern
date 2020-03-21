package pers.pgb.design_pattern.struct.decorator;

public class ConcreteDecoratorA extends AbstractDecorator {
    public ConcreteDecoratorA(Compnent compnent) {
        super(compnent);
    }

    @Override
    public double checkout() {
        return 1.2 + super.compnent.checkout();
    }
}
