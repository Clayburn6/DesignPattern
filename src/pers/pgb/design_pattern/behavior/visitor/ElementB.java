package pers.pgb.design_pattern.behavior.visitor;

public class ElementB implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visitorElementB(this);
    }

    public void specialB() {
        System.out.println("ElementB中的特殊方法");
    }
}
