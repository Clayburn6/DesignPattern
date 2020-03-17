package pers.pgb.design_pattern.create.builder;

/**
 * 指挥者
 */
public class ShoesDirector {
    private ShoesBuilder shoesBuilder;

    public ShoesDirector(ShoesBuilder shoesBuilder) {
        this.shoesBuilder = shoesBuilder;
    }

    public Shoes director() {
        shoesBuilder.productSole();
        shoesBuilder.productLace();
        shoesBuilder.productVamp();
        return shoesBuilder.productShoes();
    }
}
