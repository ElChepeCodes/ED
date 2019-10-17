package finaleddiciembre2012;

import java.util.Iterator;

public interface ListADT<T> extends Iterable<T> {
    public T removeFirst ();
    public T removeLast ();
    public T remove (T dato);
    public T first ();
    public T last ();
    public boolean isEmpty();
    public int size();
    public Iterator<T> iterator();
    public boolean contains (T dato);
    public void clear ();
    public String toString();
}
