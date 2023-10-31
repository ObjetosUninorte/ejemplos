package uninorte.simpleobserver;

import java.util.ArrayList;

abstract public class Subject {
    private ArrayList<Observer> observers;

    public Subject() {
        observers = new ArrayList<Observer>();
    }

    public void addObserver(Observer o) {
        observers.add(o);
    }

    public void notifyObservers() {
        for (Observer o : observers) {
            o.update();
        }
    }

    public void removeObserver(Observer o) {
        observers.remove(o);
    }

     
    public int getObserverCount() {
        return observers.size();
    }   



}
