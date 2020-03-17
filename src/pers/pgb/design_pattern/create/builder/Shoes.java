package pers.pgb.design_pattern.create.builder;

/**
 * 具体产品
 */
public class Shoes {
    private Lace lace;

    private Vamp vamp;

    private Sole sole;

    public Shoes(Lace lace, Vamp vamp, Sole sole) {
        this.lace = lace;
        this.vamp = vamp;
        this.sole = sole;
    }

    public Shoes() {
    }

    public Lace getLace() {
        return lace;
    }

    public void setLace(Lace lace) {
        this.lace = lace;
    }

    public Vamp getVamp() {
        return vamp;
    }

    public void setVamp(Vamp vamp) {
        this.vamp = vamp;
    }

    public Sole getSole() {
        return sole;
    }

    public void setSole(Sole sole) {
        this.sole = sole;
    }
}
