package pers.pgb.design_pattern.create.simple_factory;

import java.util.StringJoiner;

/**
 * 具体产品类
 * 板鞋
 * @author clayburn
 */
public class BoardShoes extends AbstractShoes {
    public BoardShoes() {
        super("橡胶鞋底", "皮鞋面", "布鞋带");
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", "板鞋[", "]")
                .add("鞋底：" + getSole())
                .add("鞋面：" + getVamp())
                .add("鞋带：" + getLace())
                .toString();
    }
}
