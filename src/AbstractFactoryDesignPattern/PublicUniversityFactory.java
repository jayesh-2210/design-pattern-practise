package AbstractFactoryDesignPattern;

public class PublicUniversityFactory extends UniversityFactory  {

    @Override
    public AdmitCard getAdmitCard(String course) {
        switch (course) {
            case "Mathematics":
                return new UBCAdmitCard();
            case "Science":
                return new ABCAdmitCard();
            default:
                return null;
        }
    }

    @Override
    public FeeCalulator getFeeCalculator(String course) {
        switch (course) {
            case "Mathematics":
                return new UBCFeeCalculator();
            case "Science":
                return new ABCFeeCalculator();
            default:
                return null;
        }
    }
}
