package FactoryDesignPattern.Example2;

public class PizzaStore {

    public static void main(String[] args) {
        PizzaFactory margheritaPizzaFactory = new MargheritaPizzaFactory();
        Pizza margheritaPizzaFactoryPizza = margheritaPizzaFactory.createPizza();
        margheritaPizzaFactoryPizza.prepare();
        margheritaPizzaFactoryPizza.bake();
        margheritaPizzaFactoryPizza.cut();
        margheritaPizzaFactoryPizza.box();


        PizzaFactory pepperoniPizzaFactory = new PepperoniPizzaFactory();
        Pizza pepperoniPizzaFactoryPizza = pepperoniPizzaFactory.createPizza();
        pepperoniPizzaFactoryPizza.prepare();
        pepperoniPizzaFactoryPizza.bake();
        pepperoniPizzaFactoryPizza.cut();
        pepperoniPizzaFactoryPizza.box();
    }
}
