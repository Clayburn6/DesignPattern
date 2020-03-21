package pers.pgb.design_pattern.struct.flyweight;

/**
 * 非享元角色
 */
public class UnshareConcreteFlyweight {
    private String unshareInfo;

    public UnshareConcreteFlyweight(String unshareInfo) {
        this.unshareInfo = unshareInfo;
    }

    public String getUnshareInfo() {
        return unshareInfo;
    }

    public void setUnshareInfo(String unshareInfo) {
        this.unshareInfo = unshareInfo;
    }
}
