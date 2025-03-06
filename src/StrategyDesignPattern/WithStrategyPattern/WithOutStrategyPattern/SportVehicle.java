package StrategyDesignPattern.WithStrategyPattern.WithOutStrategyPattern;

public class SportVehicle extends Vehicle  {

    @Override
    public void drive() {
        // different drive code
        System.out.println("Sport vehicle is driving.");
    }

}
