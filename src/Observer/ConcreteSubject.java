package Observer;


public class ConcreteSubject extends SubJect{

    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state, ConcreteSubject concreteSubject) {
        this.state = state;
        notifyObservers(concreteSubject);
    }

    public void addObserver(ConcreteObserver concreteObserver) {
    }

    public void setState(String string) {
    }

}
