package pers.pgb.design_pattern.behavior.visitor;

public class ElementA implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visitorElementA(this);
    }

    public void specialA() {
        System.out.println("ElementA中的特殊方法");
    }
}
