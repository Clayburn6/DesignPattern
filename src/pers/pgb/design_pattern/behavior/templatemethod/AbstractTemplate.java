package pers.pgb.design_pattern.behavior.templatemethod;

public abstract class AbstractTemplate {
    private void methodA() {
        System.out.println("调用methodA");
    }

    protected abstract void methodB();

    private void methodC() {
        System.out.println("调用methodB");
    }

    public void method() {
        methodA();
        methodB();
        methodC();
    }
}
