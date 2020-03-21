package pers.pgb.design_pattern.behavior.templatemethod;

public class Client {
    public static void main(String[] args) {
        AbstractTemplate template = new ConcreteTemplate();
        template.method();
    }
}
