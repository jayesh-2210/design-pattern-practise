package WithOutStrategyPattern;

public class OffRoadVehicle extends Vehicle  {

    @Override
    public void drive() {
        // different drive code
        System.out.println("Sport vehicle is driving.");
    }

}
