package Composite;

import java.util.ArrayList;
import java.util.List;

public class Picture implements Graphic {

    private List<Graphic> childs = new ArrayList<>();

    @Override
    public void add(Graphic graphic) {
      childs.add(graphic);
    }

    @Override
    public void remove(Graphic graphic) {
       childs.remove(graphic);
    }

    @Override
    public List<Graphic> getChilds() {
        return childs;
    }

    @Override
    public void draw() {

        for (Graphic graphic: childs) {
            graphic.draw();
        }
    }

    @Override
    public void getExtent() {
    }
}
