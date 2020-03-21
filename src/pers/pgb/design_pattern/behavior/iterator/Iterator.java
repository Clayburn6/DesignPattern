package pers.pgb.design_pattern.behavior.iterator;

public interface Iterator {
    Object next();
    boolean hashNext();
    void remove();
}
