package pers.pgb.design_pattern.struct.face;

public class Face {
    private SystemA systemA = new SystemA();
    private SystemB systemB = new SystemB();
    private SystemC systemC = new SystemC();

    public void methodA() {
        systemA.methodA();
    }

    public void methodB() {
        systemB.methodB();
    }

    public void methodC() {
        systemC.methodC();
    }
}
