package pers.pgb.design_pattern.struct.proxy.static_proxy;

public class RealSubject implements Subject {
    @Override
    public void request() {
        System.out.println("this is RealSubject");
    }
}
