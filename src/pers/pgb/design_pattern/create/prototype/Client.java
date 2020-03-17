package pers.pgb.design_pattern.create.prototype;

/**
 * @author clayburn
 */
public class Client {
    public static void main(String[] args) throws Exception {
        Knife knife = new Knife("菜刀");
        Prototype prototype = new Prototype("hello", knife);

        Prototype prototypeClone1 = prototype.clone();
        System.out.println(prototype == prototypeClone1);
        System.out.println(prototype.getKnife() == prototypeClone1.getKnife());

        Prototype prototypeClone2 = prototype.cloneByObjectByte();
        System.out.println(prototype == prototypeClone2);
        System.out.println(prototype.getKnife() == prototypeClone2.getKnife());
    }
}
