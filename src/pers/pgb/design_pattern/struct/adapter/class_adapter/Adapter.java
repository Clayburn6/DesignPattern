package pers.pgb.design_pattern.struct.adapter.class_adapter;

public class Adapter extends Adaptee implements Target {
    @Override
    public void request() {
        specificRequest();
    }
}
