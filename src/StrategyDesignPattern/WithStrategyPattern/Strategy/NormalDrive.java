package StrategyDesignPattern.WithStrategyPattern.Strategy;

public class NormalDrive implements DriveStrategy {

    @Override
    public void drive() {
        System.out.println("Normal vehicle is driving.");
    }
}
