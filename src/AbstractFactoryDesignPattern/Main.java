package AbstractFactoryDesignPattern;

public class Main
{

    public static void main(String[] args) {
        UniversityFactory ivyLeagueUniversityFactory = UniversityFactory.getUniversityFactory(90);

        AdmitCard mathAdmitCard = ivyLeagueUniversityFactory.getAdmitCard("Mathematics");
        FeeCalulator mathFeeCalculator = ivyLeagueUniversityFactory.getFeeCalculator("Mathematics");
        System.out.println("Mathematics Fee Calculator: " + mathFeeCalculator.calculateFee());
        System.out.println("Mathematics Admit Card: " + mathAdmitCard.getCardType());


        UniversityFactory ivyLeagueUniversityFactory1 = UniversityFactory.getUniversityFactory(200);

        AdmitCard mathAdmitCard1 = ivyLeagueUniversityFactory1.getAdmitCard("Mathematics");
        FeeCalulator mathFeeCalculator1 = ivyLeagueUniversityFactory1.getFeeCalculator("Mathematics");
        System.out.println("Mathematics Fee Calculator: " + mathFeeCalculator1.calculateFee());
        System.out.println("Mathematics Admit Card: " + mathAdmitCard1.getCardType());
    }
}
