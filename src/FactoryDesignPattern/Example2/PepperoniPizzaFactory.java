package FactoryDesignPattern.Example2;

public class PepperoniPizzaFactory implements PizzaFactory{

    @Override
    public Pizza createPizza() {
        return new PepperoniPizza();
    }
}
