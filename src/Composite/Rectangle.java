package Composite;

import java.util.List;

public class Rectangle implements Graphic{
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
        System.out.println("Rectangle - Composite");
    }

    @Override
    public void getExtent() {
    }
}
