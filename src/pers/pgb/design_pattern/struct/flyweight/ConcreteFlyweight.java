package pers.pgb.design_pattern.struct.flyweight;

public class ConcreteFlyweight implements Flyweight {
    private String shareInfo;

    public ConcreteFlyweight(String shareInfo) {
        this.shareInfo = shareInfo;
        System.out.println("具体享元"+shareInfo+"被创建！");
    }

    @Override
    public void operation(UnshareConcreteFlyweight unshareConcreteFlyweight) {
        System.out.print("具体享元"+shareInfo+"被调用，");
        System.out.println("非享元信息是:"+unshareConcreteFlyweight.getUnshareInfo());
    }
}
