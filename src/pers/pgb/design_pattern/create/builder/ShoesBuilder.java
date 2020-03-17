package pers.pgb.design_pattern.create.builder;

public class ShoesBuilder extends AbstractShoesBuilder {
    @Override
    protected void productSole() {
        this.shoes.setSole(new Sole("橡胶鞋底"));
    }

    @Override
    protected void productVamp() {
        this.shoes.setVamp(new Vamp("橡胶鞋面"));
    }

    @Override
    protected void productLace() {
        this.shoes.setLace(new Lace("布鞋带"));
    }
}
