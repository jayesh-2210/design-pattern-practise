package StrategyDesignPattern.WithStrategyPattern.Strategy;

public class OffRoadDrive implements DriveStrategy {

    @Override
    public void drive() {
        System.out.println("Off-road vehicle is driving.");
    }
}
