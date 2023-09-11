package Memento;

import java.util.Stack;

public class CareTacker {

    private Stack<Memento> estados = new Stack<>();
    private Originator originator;

    public CareTacker(Originator originator) {
        this.originator = originator;
    }

    public void saveStates(){
        estados.push(originator.createMemento());
    }

    public void undo(){
     originator.setMemento(estados.pop());
    }

}
