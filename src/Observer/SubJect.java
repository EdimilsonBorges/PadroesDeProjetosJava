package Observer;

import java.util.ArrayList;
import java.util.List;

public abstract class SubJect {

    List<Observer> Observers = new ArrayList<>();

    public void attatch(Observer observer){
        this.Observers.add(observer);
    }

    public void detach(Observer observer){
        this.Observers.remove(observer);
    }

    public void notifyObservers(ConcreteSubject concreteSubject){
        for (Observer observer: Observers) {
            observer.update(concreteSubject);
        }
    }
}
