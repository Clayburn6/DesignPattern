package pers.pgb.design_pattern.create.simple_factory;

/**
 * 简单工厂
 */
public class ShoesFactory {
    public static <T extends AbstractShoes> AbstractShoes createShoes(Class<T> clazz) {
        T result = null;
        try {
            result = clazz.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return result;
    }
}
