package AbstractFactoryDesignPattern;

public class IvyLeagueUniversityFactory extends UniversityFactory  {

    @Override
    public AdmitCard getAdmitCard(String course) {
        switch (course) {
            case "Mathematics":
                return new CalTechAdmitCard();
            case "Science":
                return new GeorgiaTechAdmitCard();
            default:
                throw new IllegalArgumentException("Invalid course: " + course);
        }
    }

    @Override
    public FeeCalulator getFeeCalculator(String course) {
        switch (course) {
            case "Mathematics":
                return new CalTechFeeCalculator();
            case "Science":
                return new GeorgiaTechFeeCalculator();
            default:
                throw new IllegalArgumentException("Invalid course: " + course);
        }
    }
}
