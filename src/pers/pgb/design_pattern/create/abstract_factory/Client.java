package pers.pgb.design_pattern.create.abstract_factory;

/**
 * 测试类
 * @author clayburn
 */
public class Client {
    public static void main(String[] args) {
        IShoesFactory shoesFactory = new ShoesFactory();
        AbstractShoes boardShoes = shoesFactory.createBoardShoes();
        System.out.println("生产一双板鞋：" + boardShoes);
        AbstractShoes runShoes = shoesFactory.createRunShoes();
        System.out.println("生产一双跑鞋：" + runShoes);
        AbstractShoes leatherShoes = shoesFactory.createLeatherShoes();
        System.out.println("生产一双皮鞋：" + leatherShoes);
    }
}
