package pers.pgb.design_pattern.behavior.visitor;

/**
 * 抽象访问者
 */
public interface Visitor {
    void visitorElementA(ElementA elementA);

    void visitorElementB(ElementB elementB);
}
