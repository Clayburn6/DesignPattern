package pers.pgb.design_pattern.struct.adapter.class_adapter;

/**
 * 需要被适配的类
 */
public class Adaptee {
    public void specificRequest() {
        System.out.println("适配者中的业务代码被调用！");
    }
}
