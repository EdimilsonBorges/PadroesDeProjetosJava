package Observer;

public class ConcreteObserver implements Observer{

    @Override
    public void update(ConcreteSubject concreteSubject) {
        System.out.println("Observer notificado -  " + concreteSubject.getState());
    }
}
