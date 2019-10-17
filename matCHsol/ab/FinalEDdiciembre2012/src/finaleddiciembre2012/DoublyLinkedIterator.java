/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package finaleddiciembre2012;

/**
 *
 * @author MIGUEL_ANGEL
 */
import java.util.*;

// Diseñado para iterar del último dato hacia el primero:
public class DoublyLinkedIterator<T> implements Iterator<T>{
    private DoublyLinkedNode<T> current;//the current position in the iteration
    
    public DoublyLinkedIterator(DoublyLinkedNode<T> last){
        current=last;
    }
    
    public boolean hasNext(){
        return current != null;
    }
    
    public T next(){
        if(current==null)
            throw new NoSuchElementException();
        else{
            T resultado = current.getElement();
            current = current.getPrevious();
            return resultado;
        }
    }
    
    public void remove(){
        throw new UnsupportedOperationException();
    }
}
