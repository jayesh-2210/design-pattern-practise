package StrategyDesignPattern.WithStrategyPattern;

import StrategyDesignPattern.WithStrategyPattern.Strategy.SpecificDrive;

public class SportVehicle extends Vehicle{

    public SportVehicle() {
        super(new SpecificDrive());
    }
}
