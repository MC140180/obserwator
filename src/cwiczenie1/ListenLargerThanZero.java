package cwiczenie1;

public class ListenLargerThanZero implements Observer {
    KeyboardDataEmiter keyboardDataEmiter;
    private int number;

    public ListenLargerThanZero(KeyboardDataEmiter keyboardDataEmiter) {
        this.keyboardDataEmiter = keyboardDataEmiter;
        this.keyboardDataEmiter.registerObserver(this);
    }

    @Override
    public void update(int number) {
        if (number > 0) {
            this.number = number;
            System.out.println("liczba wieksza niz zero: " + this.number);
        }
    }
}
