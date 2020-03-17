package pers.pgb.design_pattern.create.builder;


/**
 * 产品部件
 */
public class Sole {
    private String soleName;

    public Sole(String soleName) {
        this.soleName = soleName;
    }

    public Sole() {
    }

    public String getSoleName() {
        return soleName;
    }

    public void setSoleName(String soleName) {
        this.soleName = soleName;
    }
}
