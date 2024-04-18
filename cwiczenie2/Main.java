package cwiczenie2;

public class Main {
    public static void main(String[] args) {
        Market market1 = new Market();
        Company facebook = new Company(market1, "facebook");
        Company amazon = new Company(market1, "amazon");
        Company superCompany = new Company(market1, "superCompany");
        System.out.format("facebook: %.2f\n", facebook.getCompanyValue());
        System.out.format("amazon: %.2f\n", amazon.getCompanyValue());
        System.out.format("superCompany: %.2f", superCompany.getCompanyValue());
    }
}
