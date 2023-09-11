package Mediator;

public abstract class Widget {

    private DialogDirector dialogDirector;

    public Widget(DialogDirector dialogDirector) {
        this.dialogDirector = dialogDirector;
    }

    public void changed(){
      dialogDirector.widgetChanged(this);
    }
}
