package Decorator;

public class TextView implements VisualComponent{

    @Override
    public void draw() {
        System.out.println("Desenhou TextView - Decorator");
    }
}
