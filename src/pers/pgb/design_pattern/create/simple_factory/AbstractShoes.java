package pers.pgb.design_pattern.create.simple_factory;

/**
 * 抽象产品角色
 * 抽象鞋子类，定义鞋子公有属性
 * @author clayburn
 */
public abstract class AbstractShoes {
    /**
     * 鞋底
     */
    private String sole;
    /**
     * 鞋面
     */
    private String vamp;
    /**
     * 鞋带
     */
    private String lace;

    public AbstractShoes() {
    }

    public AbstractShoes(String sole, String vamp, String lace) {
        this.sole = sole;
        this.vamp = vamp;
        this.lace = lace;
    }

    public String getSole() {
        return sole;
    }

    public void setSole(String sole) {
        this.sole = sole;
    }

    public String getVamp() {
        return vamp;
    }

    public void setVamp(String vamp) {
        this.vamp = vamp;
    }

    public String getLace() {
        return lace;
    }

    public void setLace(String lace) {
        this.lace = lace;
    }
}
