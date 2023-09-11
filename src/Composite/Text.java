package Composite;

import java.util.List;

public class Text implements Graphic{
    @Override
    public void add(Graphic graphic) {

    }

    @Override
    public void remove(Graphic graphic) {

    }

    @Override
    public List<Graphic> getChilds() {
        return null;
    }

    @Override
    public void draw() {
        System.out.println("Text - Composite");
    }

    @Override
    public void getExtent() {
    }
}
