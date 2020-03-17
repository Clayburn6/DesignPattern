懒汉式：
* 双重校验锁(Singleton1)
* 静态内部类：当 Singleton 类被加载时，静态内部类 SingletonHolder 没有被加载进内存。只有当调用 getUniqueInstance()方法从而触发 SingletonHolder.INSTANCE 时 SingletonHolder 才会被加载，此时初始化 INSTANCE 实例，并且JVM 能确保 INSTANCE 只被实例化一次。这种方式不仅具有延迟初始化的好处，而且由 JVM 提供了对线程安全的支持。(Singleton3)
饿汉式：
* 普通版（Singleton2）
* 枚举版:该实现可以防止反射攻击。在其它实现中，通过 setAccessible() 方法可以将私有构造函数的访问级别设置为public，然后调用构造函数从而实例化对象，如果要防止这种攻击，需要在构造函数中添加防止多次实例化的代码。该实现是由 JVM 保证只会实例化一次，因此不会出现上述的反射攻击。（Singleton4）