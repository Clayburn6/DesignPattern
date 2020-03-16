package pers.pgb.design_pattern.create.factory_method;

import java.util.StringJoiner;

/**
 * 具体产品
 * 皮鞋
 * @author clayburn
 */
public class LeatherShoes extends AbstractShoes {
    public LeatherShoes() {
        super("皮鞋面", "皮鞋底", "没有鞋带");
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", "皮鞋[", "]")
                .add("鞋底：" + getSole())
                .add("鞋面：" + getVamp())
                .add("鞋带：" + getLace())
                .toString();
    }
}
