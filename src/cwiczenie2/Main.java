package cwiczenie2;

public class Main {
    public static void main(String[] args) {
        Market market1 = new Market();
        Company facebook = new Company(market1);
        Company amazon = new Company(market1);
        Company superCompany = new Company(market1);
        System.out.format("facebook: %.2f\n", facebook.getCompanyValue());
        System.out.format("amazon: %.2f\n", amazon.getCompanyValue());
        System.out.format("superCompany: %.2f", superCompany.getCompanyValue());
    }
}
