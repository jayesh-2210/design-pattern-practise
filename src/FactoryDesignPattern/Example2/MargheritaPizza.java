package FactoryDesignPattern.Example2;

public class MargheritaPizza implements Pizza {

    @Override
    public void prepare() {
        System.out.println("Preparing Margherita pizza");
    }

    @Override
    public void bake() {
        System.out.println("Baking Margherita pizza");
    }

    @Override
    public void cut() {
        System.out.println("Cutting Margherita pizza");
    }

    @Override
    public void box() {
        System.out.println("Boxing Margherita pizza");
    }
}
