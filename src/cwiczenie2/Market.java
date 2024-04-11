package cwiczenie2;

import java.util.ArrayList;

public class Market implements Subject{

    private ArrayList<Observer> observers = new ArrayList<>();
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
        for(Observer observer: observers){
            observer.update(Math.random() * 1000);
        }
    }
}
