package Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class ListaReversa implements AbstractList {

    private final ArrayList lista = new ArrayList();

    @Override
    public void appent(Object object) {
        lista.add(object);
    }

    @Override
    public int size() {
        return lista.size();
    }

    @Override
    public Object get(int i) {
        return lista.get(i);
    }

    @Override
    public Iterator iterator() {
        return new IteratorReverso(this);
    }
}
