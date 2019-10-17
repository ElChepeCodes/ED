
package Problema61DblLnkdLists;
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
     * Problema 61.
     * Agrega nodo (con elemento) de lista a this en orden ascendente,
     * upward, de head a tail.
     */
    public void combina( DoublyLinkedOrderedList<T> lista ) {
        
        if( this == null || lista == null || this.isEmpty() || lista.isEmpty()) {
            throw new EmptyCollectionException("Listas con null o vacias.");
        }
        
        DoubleNode<T> currentth, first, last, currentli, currentfita;
        Comparable<T> elemthc, elemlic;
        boolean boo, too, loo;

        //1st. Add every node of lista before this'.        
        elemlic = (Comparable<T>) lista.tail.getElement(); 
        if( elemlic.compareTo(head.getElement()) <= 0 ) {            
            // Se modifican los nodos de this: head y el primero;
            // de lista, el ultimo nodo
            lista.tail.setNext(head);  //Ultimo de lista a primero de this
            head.setPrevious(lista.tail);
            head = lista.head;
        } else {
            //2nd. Add every node of lista after this'.        
            elemlic = (Comparable<T>) lista.head.getElement(); 
            if( elemlic.compareTo(tail.getElement()) >= 0 ) {
                // 
                // Se modifican los nodos de this: el ultimo y tail;
                // de lista, el primer nodo.
                lista.head.setPrevious(tail);
                tail.setNext(lista.head);
                tail = lista.tail;
            } else {
                // 3rd. mixed up nodes of this and lista, ascending
                // This part englobes the three general cases.
                // Combine Nodes, between first and last
                first = last = null;
                currentth = head;        currentli = lista.head;
                currentfita = null;
                too = true;    // There are more this' elem; false, no hay mas
                loo = true;    // Hay elementos de lista; false, no hay mas

                // Manejo del primer nodo definitivo
                elemlic = (Comparable<T>) currentli.getElement(); 
                if( elemlic.compareTo(currentth.getElement()) <= 0 ) {
                    // lista <= this, el primer nodo definitivo
                    first = currentli;
                    currentli.setPrevious(null);
                    currentfita = currentli;
                    currentli = currentli.getNext();
                    if( currentli == null ) {
                        loo = false;    // lista agotada
                    }
                } else {
                    // lista > this, el primer nodo definitivo
                    first = currentth;
                    currentth.setPrevious(null);
                    currentfita = currentth;
                    currentth = currentth.getNext();
                    if( currentth == null ) {
                        too = false;    // this agotada
                    }
                }
                
                // Nodes interleaving of this and list
                while ( too && loo  ) {
                    if( loo ) {
                        elemlic = (Comparable<T>) currentli.getElement(); 
                    }
                    if( elemlic.compareTo(currentth.getElement()) <= 0 ) {
                        // lista <= this
                            currentli.setPrevious(currentfita);
                            currentfita.setNext(currentli);
                        currentfita = currentli;
                        currentli = currentli.getNext();
                        if( currentli == null ) {
                            loo = false;    // lista agotada
                        }
                    } else {
                        // lista > this
                            currentth.setPrevious(currentfita);
                            currentfita.setNext(currentth);
                        currentfita = currentth;
                        currentth = currentth.getNext();
                        if( currentth == null ) {
                            too = false;    // this agotada
                        }
                    }
                }  // while
                
                // Agregado de los ultimos nodos de this o lista, con links
                if( loo == false ) {
                    // lista agotada, agregar ultimos nodos de this
                    last = tail;
                    currentfita.setNext(currentth);
                    currentth.setPrevious(currentfita);               
                }
                if( too == false ) {
                    // this agotada, agregar ultimos nodos de lista
                    last = lista.tail;
                    currentfita.setNext(currentli);
                    currentli.setPrevious(currentfita);               
                }
                
                // Reconformando this y lista
                head = first;        tail = last;
                lista.head = lista.tail = null;
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
