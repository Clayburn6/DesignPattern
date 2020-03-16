package pers.pgb.design_pattern.create.factory_method;

/**
 * 抽象工厂角色
 * 定义生产产品的方法
 * @author clayburn
 */
public interface IShoesFactory {
    /**
     * 生产鞋子
     * @return 鞋子
     */
    AbstractShoes createShoes();
}
