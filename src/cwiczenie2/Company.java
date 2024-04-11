package cwiczenie2;

public class Company implements Observer {
    private double companyValue;
    private Subject market;

    public Company(Subject market) {
        this.market = market;
        this.market.registerObserver(this);
        this.market.notifyObservers();
    }

    @Override
    public void update(double price) {
        this.companyValue = price;
    }

    public double getCompanyValue() {
        return companyValue;
    }
}
