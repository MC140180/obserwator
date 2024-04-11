package cwiczenie1;

public class ListenThrees implements Observer{
    private int number;
    KeyboardDataEmiter keyboardDataEmiter;
    public ListenThrees(KeyboardDataEmiter keyboardDataEmiter) {
        this.keyboardDataEmiter = keyboardDataEmiter;
        this.keyboardDataEmiter.registerObserver(this);
    }
    @Override
    public void update(int number) {
        if(number == 3){
            this.number = number;
            System.out.println("Liczba rowna 3");
        }
    }
}
