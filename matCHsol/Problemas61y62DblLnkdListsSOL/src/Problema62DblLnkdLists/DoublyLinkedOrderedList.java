
package Problema62DblLnkdLists;
import java.util.*;
import DblLnkdListsExceptions.*;

public class DoublyLinkedOrderedList<T> implements Iterable<T> {
    private DoubleNode<T> head;
    private DoubleNode<T> tail;
    
    public DoublyLinkedOrderedList() {
        // Lista vacia
        head = tail = null;
    }

    /** Ordena la lista en orden ascendente, upward, de head a tail,
     * insertando antes o despuÃ©s del elem, segun su valor.
     */    
    public void add(T elem) {
        DoubleNode<T> newnode=new DoubleNode(elem);
        // Comparable<T> is needed because the T elem come into live
        // when the program is running and the compareTo(...) is
        // accesable to the element; in the meantime for the compiling time
        // Comparable<T> is needed.
        Comparable<T> elemAux=(Comparable<T>)elem;
        // Si estÃ¡ vacÃ­a la lista:
        if(head==null) {
            head=newnode;
            tail=newnode;
        }
        // En caso contrario, si hay un solo nodo en la lista:
        else
            if(head==tail) {
            // Hay que insertar a la izq. del nodo si el valor a agregar es
            // menor que el que estÃ¡ en el nodo:
                if(elemAux.compareTo(head.getElement())<0) {
                    newnode.setNext(head);
                    head.setPrevious(newnode);
                    head=newnode;
                }
                // En caso contrario hay que insertar a la der. del nodo:
                else {
                    head.setNext(newnode);
                    newnode.setPrevious(head);
                    tail=newnode;
                }
            }
        // En caso contrario hay que buscar el primer nodo que tenga un valor
        // mayor al valor que se va a agregar (ahÃ­ se detendrÃ¡ "aux"):
        else {
            DoubleNode<T> aux=head;
            while(aux!=null&&elemAux.compareTo(aux.getElement())>0)
                aux=aux.getNext();
            // Si "aux" resulta ser "head" quiere decir que hay que insertar
            // el newnode valor a la izq. de todos los que ya estaban:
            if(aux==head) {
                newnode.setNext(head);
                head.setPrevious(newnode);
                head=newnode;
            }
            // En caso contrario, si "aux" resulta ser igual a "null" quiere
            // decir que hay que insertar el newnode valor a la der. de todos los
            // que ya estaban:
            else
                if(aux==null) {
                    tail.setNext(newnode);
                    newnode.setPrevious(tail);
                    tail=newnode;
                }
                // En caso contrario hay que insertar en algÃºn lugar intermedio de
                // la secuencia de nodos enlazados:
                else {
                    newnode.setPrevious(aux.getPrevious());
                    newnode.getPrevious().setNext(newnode);
                    aux.setPrevious(newnode);
                    newnode.setNext(aux);
                }
        }

    }
          
    /**  
     * Returns an iterator for the elements in this list. 
     */    
    public Iterator<T> iterator() {
        return new DoubleIterator(head);
    }
    
    /**
     * Returns true if this list is empty and false otherwise.
     */
    public boolean isEmpty() {
        return head==null;
    }

    /**
     * Returns a string representation of the list    
     */    
    public String toString() {
        DoubleNode<T> current = head;
        String result = "  {LkdList";

        if( this.isEmpty() ) {
            result = result + " || lista VACIA";
        } 

        while (current != null)
        {
            result = result + " || " + current.getElement();
            current = current.getNext();
        }
        
        result = result + "}\n";
        return result;

    }
    
    
}
