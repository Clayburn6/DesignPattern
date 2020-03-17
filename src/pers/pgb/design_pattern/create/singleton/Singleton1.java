package pers.pgb.design_pattern.create.singleton;

/**
 * 懒汉模式
 * 双重校验锁
 * @author clayburn
 */
public class Singleton1 {
    private static volatile Singleton1 instance = null;

    private Singleton1() {}

    public static Singleton1 getInstance() {
        if (instance == null) {
            synchronized (Singleton1.class) {
                if (instance == null) {
                    instance = new Singleton1();
                }
            }
        }
        return instance;
    }
}
