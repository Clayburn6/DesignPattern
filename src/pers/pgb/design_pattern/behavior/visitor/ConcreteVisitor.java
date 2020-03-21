package pers.pgb.design_pattern.behavior.visitor;

public class ConcreteVisitor implements Visitor {
    @Override
    public void visitorElementA(ElementA elementA) {
        System.out.print(this + "访问元素A   ");
        elementA.specialA();
    }

    @Override
    public void visitorElementB(ElementB elementB) {
        System.out.print(this + "访问元素B   ");
        elementB.specialB();
    }
}
