package Memento;

public class Originator {
    private String state = "";

    public Memento createMemento(){
        System.out.println("Salvou o estado "+state+" Memento");
        return new Memento(state);
    }

    public void setMemento(Memento memento){
        this.state = memento.getState();
        System.out.println("Recuperou o estado "+state+" Memento");
    }

    public void moveLeft(){
       this.state += "->";
    }

    public void moveRigth(){
        this.state += "<-";
    }
}
