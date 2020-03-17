package pers.pgb.design_pattern.struct.bridge;

/**
 * 拓展抽象化角色
 */
public class RefinedAbstraction extends Abstraction {
    public RefinedAbstraction(Implementor implementor) {
        super(implementor);
    }

    @Override
    public void specialFunction() {
        System.out.println("扩展抽象化(Refined Abstraction)角色被访问" );
        implementor.operationImpl();
    }
}
