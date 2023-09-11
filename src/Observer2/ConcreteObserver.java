package Observer2;

import java.util.Observable;
import java.util.Observer;

public class ConcreteObserver implements Observer {
    ConcreteSubject concreteSubject;

    public  ConcreteObserver(ConcreteSubject concreteSubject){
        this.concreteSubject = concreteSubject;
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Observer notificado -  " + concreteSubject.getState());
    }
}
