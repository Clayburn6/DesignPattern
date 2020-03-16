package pers.pgb.design_pattern.create.abstract_factory;

/**
 * 具体工厂
 * @author clayburn
 */
public class ShoesFactory implements IShoesFactory {
    @Override
    public BoardShoes createBoardShoes() {
        return new BoardShoes();
    }

    @Override
    public RunShoes createRunShoes() {
        return new RunShoes();
    }

    @Override
    public LeatherShoes createLeatherShoes() {
        return new LeatherShoes();
    }
}
