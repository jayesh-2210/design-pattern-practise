package AbstractFactoryDesignPattern;

public class CalTechFeeCalculator implements FeeCalulator
{

    @Override
    public double calculateFee() {
        return 10000;
    }
}
