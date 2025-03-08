package FactoryDesignPattern.Example2;

public class MargheritaPizzaFactory implements PizzaFactory {

    @Override
    public Pizza createPizza() {
        return new MargheritaPizza();
    }
}
