package Decorator;

public class ScrollDecorator extends Decorator{

    public ScrollDecorator(VisualComponent component) {
        super(component);
    }

    @Override
    public void draw() {
        super.draw();
        scrollTo();
    }

    public void scrollTo(){
        System.out.println("Executou ScrollDecorator - Decorator");
    }
}
