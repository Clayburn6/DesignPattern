package pers.pgb.design_pattern.behavior.iterator;

import java.util.ArrayList;
import java.util.List;

public class Collection {
    public List<String> list = new ArrayList<>();

    public Iterator iterator() {
        return new ConcreteIterator(this.list);
    }
}
