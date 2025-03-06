package StrategyDesignPattern.WithStrategyPattern;

import StrategyDesignPattern.WithStrategyPattern.Strategy.OffRoadDrive;

public class OffRoadVehicle extends Vehicle {

    public OffRoadVehicle() {
        super(new OffRoadDrive());
    }
}
