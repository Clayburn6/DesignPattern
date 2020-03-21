package pers.pgb.design_pattern.behavior.templatemethod;

public class ConcreteTemplate extends AbstractTemplate {
    @Override
    protected void methodB() {
        System.out.println("调用methodB");
    }
}
