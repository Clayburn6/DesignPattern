package pers.pgb.design_pattern.create.factory_method;

/**
 * 具体工厂角色
 * 生产跑鞋
 * @author clayburn
 */
public class RunShoesFactory implements IShoesFactory {
    @Override
    public AbstractShoes createShoes() {
        return new RunShoes();
    }
}
