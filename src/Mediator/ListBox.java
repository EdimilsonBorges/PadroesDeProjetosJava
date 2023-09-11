package Mediator;

public class ListBox extends Widget{

    public ListBox(DialogDirector dialogDirector) {
        super(dialogDirector);
    }

    public void getSelection(){
        System.out.println("Recuperou a seleção - Mediator");
    }
}
