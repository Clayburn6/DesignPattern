package pers.pgb.design_pattern.struct.bridge;

/**
 * 具体实现化角色
 */
public class ConcreteImplementor implements Implementor {
    @Override
    public void operationImpl() {
        System.out.println("具体实现化(Concrete Implementor)角色被访问" );
    }
}
