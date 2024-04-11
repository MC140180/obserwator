package cwiczenie1;


import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class KeyboardDataEmiter implements Subject{
    private ArrayList<Observer> observers ;
    private int number;

    public KeyboardDataEmiter() {
        System.out.println("Wprowadź liczbę, aby wyjść z programu nacisnij q:");

        this.observers = new ArrayList<>();
    }

    void readKey(){
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("q")) {
                break;
            }
            this.number = Integer.parseInt(input);
            this.notifyObservers();
        }
        scanner.close();
    }

    @Override
    public void registerObserver(Observer o) {
        this.observers.add(o);
    }

    @Override
    public void deleteObserver(Observer o) {
        this.observers.remove(o);

    }

    @Override
    public void notifyObservers() {
        ArrayList<Observer> observerArrayList = new ArrayList<>(observers);
        for(Observer observer: observerArrayList) {
            observer.update(this.number);
        }
    }
}
