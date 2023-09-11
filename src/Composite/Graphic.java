package Composite;

import java.util.List;

public interface Graphic {
    void add(Graphic graphic);
    void remove(Graphic graphic);
    List<Graphic> getChilds();
    void draw();
    void getExtent();
}
