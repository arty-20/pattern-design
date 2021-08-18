package comportamiento.observer;

import creacional.builder.Empleado;

import java.util.LinkedList;
import java.util.List;

/**
 * @author arturo
 */
public abstract class Subject {
    private List<Observer> observers = new LinkedList<>();

    public void addObserver(Observer o){
        observers.add(o);
    }

    public void removeObserver(Observer o){
        observers.remove(o);
    }

    public void notifyObserver(Empleado value){
        for (Observer observer : observers) {
            observer.update(value);
        }
    }
}
