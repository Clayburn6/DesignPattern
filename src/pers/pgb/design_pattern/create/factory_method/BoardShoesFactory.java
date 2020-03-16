package pers.pgb.design_pattern.create.factory_method;

/**
 * 具体工厂角色
 * 生产板鞋
 * @author clayburn
 */
public class BoardShoesFactory implements IShoesFactory {

    @Override
    public AbstractShoes createShoes() {
        return new BoardShoes();
    }
}
