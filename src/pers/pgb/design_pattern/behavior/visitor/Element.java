package pers.pgb.design_pattern.behavior.visitor;

/**
 * 抽象元素
 */
public interface Element {
    void accept(Visitor visitor);
}
