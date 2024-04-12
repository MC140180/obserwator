package cwiczenie1;

public class ListeningConfig implements Observer {

    KeyboardDataEmiter keyboardDataEmiter;
    ListenEven listenEven;
    ListenLargerThanZero listenLargerThanZero;
    ListenThrees listenThrees;
    private int number;
    private boolean configMode = false;

    public ListeningConfig(KeyboardDataEmiter keyboardDataEmiter) {
        this.keyboardDataEmiter = keyboardDataEmiter;
        this.keyboardDataEmiter.registerObserver(this);
        this.keyboardDataEmiter.notifyObservers();
    }

    @Override
    public void update(int number) {
        if (configMode) {
            if (number == 1) {
                this.keyboardDataEmiter.deleteObserver(listenLargerThanZero);
                listenLargerThanZero = new ListenLargerThanZero(this.keyboardDataEmiter);
            }
            if (number == 2) {
                this.keyboardDataEmiter.deleteObserver(listenEven);
                listenEven = new ListenEven(this.keyboardDataEmiter);
            }
            if (number == 3) {
                this.keyboardDataEmiter.deleteObserver(listenThrees);
                listenThrees = new ListenThrees(this.keyboardDataEmiter);
            }
            this.configMode = false;
        }

        if (number == 0) {
            this.configMode = true;
            System.out.println("Wprowadz 1 by sluchac liczb wiekszych od 0");
            System.out.println("Wprowadz 2 by sluchac liczb parzystych");
            System.out.println("Wprowadz 3 by sluchac licz rownych 3");
            System.out.println("Wprowadz 0 by ponownie wywolac ustawienia configuracji nasluchiwania");
        }
        this.number = number;
    }
}
