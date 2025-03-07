package DecoratorDesignPattern;

public class PizzaStore {

    public static void main(String[] args) {
        ToppingDecorator pizzaWithTopping = new ExtraCheeze(new Margherita());

        ToppingDecorator advancePizza = new Mushroom(pizzaWithTopping);
        System.out.println(pizzaWithTopping.cost());
        System.out.println(advancePizza.cost());
    }

}
