package FactoryDesignPattern.Example2;

public class PepperoniPizza implements Pizza  {

    @Override
    public void prepare() {
        System.out.println("preparing Pepperoni pizza");
    }

    @Override
    public void bake() {
        System.out.println("baking Pepperoni pizza");
    }

    @Override
    public void cut() {
        System.out.println("cutting Pepperoni pizza");
    }

    @Override
    public void box() {
        System.out.println("boxing Pepperoni pizza");
    }
}
