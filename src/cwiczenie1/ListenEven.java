package cwiczenie1;

public class ListenEven implements Observer {
    KeyboardDataEmiter keyboardDataEmiter;
    private int number;

    public ListenEven(KeyboardDataEmiter keyboardDataEmiter) {
        this.keyboardDataEmiter = keyboardDataEmiter;
        this.keyboardDataEmiter.registerObserver(this);
    }

    @Override
    public void update(int number) {
        if (number % 2 == 0) {
            this.number = number;
            System.out.println("Liczba podzielna przez 2: " + this.number);
        }
    }
}
