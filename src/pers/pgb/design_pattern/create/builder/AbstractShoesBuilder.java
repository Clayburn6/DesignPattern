package pers.pgb.design_pattern.create.builder;

/**
 * 抽象建造者
 * @author clayburn
 */
public abstract class AbstractShoesBuilder {
    protected Shoes shoes = new Shoes();

    protected abstract void productSole();

    protected abstract void productVamp();

    protected abstract void productLace();

    public Shoes productShoes() {
        return this.shoes;
    }
}
