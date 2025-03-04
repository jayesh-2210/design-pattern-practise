package WithStrategyPattern.Strategy;

public class SpecificDrive implements DriveStrategy {

    @Override
    public void drive() {
        System.out.println("Specific vehicle is driving.");
    }
}
