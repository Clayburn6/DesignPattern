package pers.pgb.design_pattern.create.builder;

/**
 * 产品部件
 */
public class Vamp {
    private String vampName;

    public Vamp(String vampName) {
        this.vampName = vampName;
    }

    public Vamp() {
    }

    public String getVampName() {
        return vampName;
    }

    public void setVampName(String vampName) {
        this.vampName = vampName;
    }
}
