package WithStrategyPattern;

import WithStrategyPattern.Strategy.SpecificDrive;

public class SportVehicle extends Vehicle{

    public SportVehicle() {
        super(new SpecificDrive());
    }
}
