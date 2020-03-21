package pers.pgb.design_pattern.behavior.iterator;

import java.util.List;

public class ConcreteIterator implements Iterator {
    private List<String> list = null;

    public ConcreteIterator(List<String> list) {
        this.list = list;
    }

    @Override
    public Object next() {
        // 这里就不实现了
        return null;
    }

    @Override
    public boolean hashNext() {
        // 这里就不实现了
        return false;
    }

    @Override
    public void remove() {
        // 这里就不实现了
    }
}
