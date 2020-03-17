package pers.pgb.design_pattern.create.singleton;

/**
 * 枚举实现
 * 该实现可以防止反射攻击。在其它实现中，通过 setAccessible() 方法可以将私有构造函数的访问级别设置为
 * public，然后调用构造函数从而实例化对象，如果要防止这种攻击，需要在构造函数中添加防止多次实例化的代码。
 * 该实现是由 JVM 保证只会实例化一次，因此不会出现上述的反射攻击。
 * @author clayburn
 */
public enum Singleton4 {
    /**
     * 实例
     */
    INSTANCE;
}
