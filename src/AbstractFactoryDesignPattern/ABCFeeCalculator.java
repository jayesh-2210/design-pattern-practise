package AbstractFactoryDesignPattern;

public class ABCFeeCalculator implements FeeCalulator {

    @Override
    public double calculateFee() {
        return 100;
    }
}
