package Decorator;

public class BorderDecorator extends Decorator{

    public BorderDecorator(VisualComponent component) {
        super(component);

    }

    @Override
    public void draw() {
        super.draw();
        drawBorder();
    }

    public void drawBorder(){
        System.out.println("Desenhou BorderDecorator - Decorator");
    }
}
