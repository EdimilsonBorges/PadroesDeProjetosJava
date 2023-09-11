package Iterator;

import java.util.Iterator;

public class IteratorReverso implements Iterator {

    private ListaReversa listaReversa;
    private int position;

    public IteratorReverso(ListaReversa listaReversa){
        this.listaReversa = listaReversa;
        this.position = listaReversa.size();
    }

    @Override
    public boolean hasNext() {
        return position != 0;
    }

    @Override
    public Object next() {
        return listaReversa.get(--position);
    }
}
