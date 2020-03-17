package pers.pgb.design_pattern.struct.proxy.static_proxy;

/**
 * 代理主题
 */
public class ProxySubject implements Subject {
    private Subject subject = new RealSubject();

    @Override
    public void request() {
        beforeRequest();
        subject.request();
        afterRequest();
    }

    public void beforeRequest() {
        System.out.println("before request");
    }

    public void afterRequest() {
        System.out.println("after request");
    }
}
