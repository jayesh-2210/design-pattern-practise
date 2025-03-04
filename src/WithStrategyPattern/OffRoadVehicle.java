package WithStrategyPattern;

import WithStrategyPattern.Strategy.OffRoadDrive;

public class OffRoadVehicle extends Vehicle {

    public OffRoadVehicle() {
        super(new OffRoadDrive());
    }
}
