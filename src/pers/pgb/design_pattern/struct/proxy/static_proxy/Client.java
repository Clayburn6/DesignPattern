package pers.pgb.design_pattern.struct.proxy.static_proxy;

public class Client {
    public static void main(String[] args) {
        Subject subject = new ProxySubject();
        subject.request();;
    }
}
