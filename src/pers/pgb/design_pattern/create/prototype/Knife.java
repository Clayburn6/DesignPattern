package pers.pgb.design_pattern.create.prototype;

import java.io.Serializable;

/**
 * 刀
 * @author clayburn
 */
public class Knife implements Cloneable, Serializable {
    private String name;

    public Knife(String name) {
        this.name = name;
    }

    public Knife() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected Knife clone() throws CloneNotSupportedException {
        return (Knife) super.clone();
    }
}
