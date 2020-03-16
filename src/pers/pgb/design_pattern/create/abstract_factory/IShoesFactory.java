package pers.pgb.design_pattern.create.abstract_factory;

/**
 * 抽象工厂角色
 * @author clayburn
 */
public interface IShoesFactory {
    /**
     * 生产板鞋
     * @return 板鞋
     */
    BoardShoes createBoardShoes();

    /**
     * 生产跑鞋
     * @return 跑鞋
     */
    RunShoes createRunShoes();

    /**
     * 生产皮鞋
     * @return 皮鞋
     */
    LeatherShoes createLeatherShoes();
}
