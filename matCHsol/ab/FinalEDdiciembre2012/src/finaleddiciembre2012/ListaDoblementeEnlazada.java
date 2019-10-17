/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package finaleddiciembre2012;

/**
 *
 * @author AGOMEZDG
 */
import java.util.*;

public class ListaDoblementeEnlazada<T> implements ListADT<T> {
    protected DoublyLinkedNode<T> primero,último;
    
    public ListaDoblementeEnlazada() {
        primero=último=null;
    }
    
    public Iterator<T> iterator() {
        return new DoublyLinkedIterator(último);
    }
    
    public void clear() {
        
    }

    @Override
    public T removeFirst() {
        T aux=primero.getElement();
        primero=primero.next;
        primero.setPrevious(null);
        return aux;
    }

    @Override
    public T removeLast() {
        T aux=último.getElement();
        último=último.getPrevious();
        último.setNext(null);
        return aux;
    }

    @Override
    public T remove(T dato) {
        DoublyLinkedNode current=primero, anterior=null, posterior=primero.getNext();
        while (current!=null && !current.getElement().equals(dato)){
            anterior=current; current=posterior; posterior=posterior.getNext();
        }
        if (current.getElement().equals(dato)){
            anterior.setNext(posterior);
            posterior.setPrevious(anterior);
        }
        return dato;
    }

    @Override
    public T first() {
        return primero.getElement();
    }

    @Override
    public T last() {
        return último.getElement();
    }

    @Override
    public boolean isEmpty() {
        return primero.equals(null);
    }

    @Override
    public int size() {
        int i=0;
        DoublyLinkedNode current=primero;
        while(current!=null){
            current=current.getNext();
            i++;
        }            
        return i;
    }

    @Override
    public boolean contains(T dato) {
        DoublyLinkedNode current=primero;
        boolean res;
        while(current!=null && !dato.equals(current.getElement()))
            current=current.getNext();
        if (current!=null)
            res=true;
        else
            res=false;
        return res;
    }

}
