package pers.pgb.design_pattern.behavior.visitor;

public class Client {
    public static void main(String[] args) {
        Element element1 = new ElementA();
        Element element2 = new ElementB();
        Element element3 = new ElementB();
        Element element4 = new ElementA();
        Element element5 = new ElementB();
        Element element6 = new ElementA();

        ObjectStrucure objectStrucure = new ObjectStrucure();
        objectStrucure.add(element1);
        objectStrucure.add(element2);
        objectStrucure.add(element3);
        objectStrucure.add(element4);
        objectStrucure.add(element5);
        objectStrucure.add(element6);

        Visitor visitor = new ConcreteVisitor();

        objectStrucure.accept(visitor);
    }
}
