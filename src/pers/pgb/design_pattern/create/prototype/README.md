* 浅克隆：只克隆各成员变量的值
* 深克隆：克隆各成员变量的值，如果成员为类实例，同时将这个类实例也进行克隆，方法主要有两种：
    1. 实现Cloneable接口，重写每个类的clone() 方法
    2. 实现Serializable接口，序列化和反序列化