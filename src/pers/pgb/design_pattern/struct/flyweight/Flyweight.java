package pers.pgb.design_pattern.struct.flyweight;

/**
 * 抽象享元角色
 */
public interface Flyweight {
    void operation(UnshareConcreteFlyweight unshareConcreteFlyweight);
}
