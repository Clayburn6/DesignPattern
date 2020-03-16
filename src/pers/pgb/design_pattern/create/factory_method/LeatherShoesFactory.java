package pers.pgb.design_pattern.create.factory_method;

/**
 * 具体工厂角色
 * 生产皮鞋
 * @author clayburn
 */
public class LeatherShoesFactory implements IShoesFactory {
    @Override
    public AbstractShoes createShoes() {
        return new LeatherShoes();
    }
}
