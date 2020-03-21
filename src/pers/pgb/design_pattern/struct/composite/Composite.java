package pers.pgb.design_pattern.struct.composite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Composite implements Component {
    private List<Component> components = new ArrayList<>();


    @Override
    public void commentMethod() {
        System.out.println("树枝的方法");
    }

    public void specialMethod() {
        System.out.println(Arrays.toString(components.toArray()));
    }
}
