package pers.pgb.design_pattern.create.builder;

/**
 * 产品部件
 */
public class Lace {
    private String laceName;

    public Lace(String laceName) {
        this.laceName = laceName;
    }

    public Lace() {
    }

    public String getLaceName() {
        return laceName;
    }

    public void setLaceName(String laceName) {
        this.laceName = laceName;
    }
}
