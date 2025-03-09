package AbstractFactoryDesignPattern;

public class UBCFeeCalculator implements FeeCalulator  {

    @Override
    public double calculateFee() {
        return 5000;
    }
}
