package pers.pgb.design_pattern.create.singleton;

/**
 * 饿汉模式
 * 普通版
 * @author clayburn
 */
public class Singleton2 {
    private static final Singleton2 instance = new Singleton2();

    private Singleton2() {}

    public static Singleton2 getInstance() {
        return instance;
    }
}
