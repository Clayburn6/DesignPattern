package pers.pgb.design_pattern.create.factory_method;

import java.util.StringJoiner;

/**
 * 具体产品类
 * 跑鞋
 * @author clayburn
 */
public class RunShoes extends AbstractShoes {
    public RunShoes() {
        super("橡胶鞋底", "网鞋面", "布鞋带");
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", "跑鞋[", "]")
                .add("鞋底：" + getSole())
                .add("鞋面：" + getVamp())
                .add("鞋带：" + getLace())
                .toString();
    }
}
