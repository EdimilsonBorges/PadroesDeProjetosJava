package Decorator;
public abstract class Decorator implements VisualComponent {
    private VisualComponent component;

    public Decorator(VisualComponent component){
        this.component = component;
    }

    @Override
    public void draw() {
        component.draw();
    }
}
