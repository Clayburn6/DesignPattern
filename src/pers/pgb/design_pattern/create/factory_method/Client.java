package pers.pgb.design_pattern.create.factory_method;

/**
 * 测试类
 * @author clayburn
 */
public class Client {
    public static void main(String[] args) {
        // 生产一双板鞋
        IShoesFactory boardShoesFactory = new BoardShoesFactory();
        AbstractShoes boardShoes = boardShoesFactory.createShoes();
        System.out.println("生产一双板鞋：" + boardShoes);
        // 生产一双跑鞋
        IShoesFactory runShoesFactory = new RunShoesFactory();
        AbstractShoes runShoes = runShoesFactory.createShoes();
        System.out.println("生产一双跑鞋：" + runShoes);
        // 生产一双皮鞋鞋
        IShoesFactory leatherShoesFactory = new LeatherShoesFactory();
        AbstractShoes leatherShoes = leatherShoesFactory.createShoes();
        System.out.println("生产一双皮鞋：" + leatherShoes);
    }
}
