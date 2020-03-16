package pers.pgb.design_pattern.create.simple_factory;
/**
 * 测试类
 * @author clayburn
 */
public class Client {
    public static void main(String[] args) {
        AbstractShoes boardShoes = ShoesFactory.createShoes(BoardShoes.class);
        System.out.println("生产一双板鞋：" + boardShoes);
        AbstractShoes runShoes = ShoesFactory.createShoes(RunShoes.class);
        System.out.println("生产一双跑鞋：" + runShoes);
        AbstractShoes leatherShoes = ShoesFactory.createShoes(LeatherShoes.class);
        System.out.println("生产一双皮鞋：" + leatherShoes);
    }
}
