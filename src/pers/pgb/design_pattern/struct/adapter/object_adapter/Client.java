package pers.pgb.design_pattern.struct.adapter.object_adapter;

public class Client {
    public static void main(String[] args) {
        Adaptee adaptee = new Adaptee();

        Target target = new Adapter(adaptee);

        target.request();
    }
}
