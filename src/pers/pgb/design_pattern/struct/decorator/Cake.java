package pers.pgb.design_pattern.struct.decorator;

/**
 * 具体组件
 */
public class Cake implements Compnent {
    @Override
    public double checkout() {
        return 8.89;
    }
}
