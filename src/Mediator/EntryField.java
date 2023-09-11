package Mediator;

public class EntryField extends Widget{

    public EntryField(DialogDirector dialogDirector) {
        super(dialogDirector);
    }

    public void setText(){
        changed();
    }
}
