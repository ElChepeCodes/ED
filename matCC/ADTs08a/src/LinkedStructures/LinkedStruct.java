
package LinkedStructures;
import Sets.ArraySet;
import java.util.Iterator;

/** Clase para manejar una estructura enlazada. */
public class LinkedStruct<T> {
    /** "count", number of nodes or elements,
     * "front", first node or element */  
    private int count;
    private LinearNode<T> front;

    /** Crea una Estructura Enlazada vacía */
    public LinkedStruct() {
        count = 0;
        front = null;
    }

    /** Agrega el elemento especificado en la posicion pos.
     * Si pos<=1, agrega en la posición 1;
     * si pos>count, agrega en la posicion count+1. */
    public void add(T element, int pos) {
        LinearNode<T> node= new LinearNode<T>(element);
        LinearNode<T> current;
        int i;

        if( this.isEmpty() ) {    // Linked Structure vacia
            front= node;
        } else {    //Estructura no vacía.
            if( pos <= 1 ) {
                node.setNext(front);    //Inserta en la posición 1.
                front= node;
            } else {
                //Inserta en una posición >= 2.
                i= 1;
                current= front;
                while( i<(pos-1) && current.getNext() != null ) {
                    i++;        //Avanzar en la estructura.
                    current= current.getNext();
                } 
                //Inserta el nuevo nodo.
                node.setNext( current.getNext() );
                current.setNext( node );
            }
        }
        count++;
    }

    /** Remueve el elemento en la posicion pos y regresa una referencia
     * a el. Lanza una ElementNotFoundException si la posicion
     * esta fuera de los limites. */
    public T remove(int pos) throws ElementNotFoundException {
        LinearNode<T> current, previous= null;
        T result= null;
        int i;

        if( pos<1 || pos>size() ) {
            throw new ElementNotFoundException(
                    "LinkedStruct: posicion fuera de limites o vacio.");
            // Queda incluido el estado de vacio
        }

        if( pos==1 ) {     //Recupera el elemento del nodo de la posición 1.
            result= front.getElement();
            front= front.getNext();
        } else {
            //Recupera el elemento de un nodo en posición >= 2.
            i= 1; current= front;   
            while( i<pos ) {   //Recorre la estructura hasta el nodo en pos.
                previous= current;
                current= current.getNext();
                i++;
            }
            //Recupera el elemento del nodo de la posición pos.
            result= current.getElement();
            previous.setNext(current.getNext());
        }
        count--;
        return result;
    }

    /** Regresa una referencia al elemento que está en la posicion pos.
     * Lanza una ElementNotFoundException si la posicion
     * esta fuera de los limites. */
    public T get(int pos) throws ElementNotFoundException {
        LinearNode<T> current;
    
        if( pos<1 || pos>size() ) {
            throw new ElementNotFoundException(
                    "LinkedStruct: posicion fuera de limites o vacio.");
            // Queda incluido el estado de vacio

        }
        
        current= front;
        for( int i=1; i<pos; i++ ) {
            current= current.getNext();
        }

        return current.getElement();
    }

    /** Coloca el elemento especificado en la posicion pos.
     * Lanza una ElementNotFoundException si la posicion
     * esta fuera de los limites. */
    public void set(T element, int pos) throws ElementNotFoundException {
        LinearNode<T> current;
    
        if( pos<1 || pos>size() ) {
            throw new ElementNotFoundException(
                    "LinkedStruct: posicion fuera de limites o vacio.");
            // Queda incluido el estado de vacio
        }
        
        current= front;
        for( int i=1; i<pos; i++ ) {
            current= current.getNext();
        }
            
        current.setElement(element);
    }

    /** Regresa true si la estructura esta vacia o falso en caso contrario. */
    public boolean isEmpty() {
        return (count == 0);
    }

    /** Regresa la cantidad de elementos en la estructura. */
    public int size() {
        return count;
    }

    /** Returns an iterator for the elements currently in this set.
     */
    public Iterator<T> iterator() {
        return ( new LinkedStructIter<T>(front) );
    }
  
  
    /** Regresa una cadena representando a la estructura. */
    @Override
    public String toString() {
        
        String result = "{LinkedStruct:";
        LinearNode<T> current = front;

        if( front == null) {
            result = result + " <EMPTY>";
        }
        while (current != null) {
            result = result + " " + (current.getElement()).toString() + ",";
            current = current.getNext();
        }
        result = result + " }\n";
        return result;
    }
    
    /** Problema 40: elimina el nodo anterior al que contiene el dato info
     * dado como parametro. Regresa true, si lo elimino; false, si no.
     */
    public boolean eliminaAnteriorA(T info) 
                throws ParamErrException {
        if( info == null ) {
            throw new ParamErrException("LinkedStruct: <info> con null");
        }

        LinearNode<T> current, previous= null, anteprevious= null;
        boolean elimi= false;
        int i= 1;

        if( !isEmpty() ) {
            //Recorre la estructura, mientras haya nodos y no se encuentre info.
            i= 1;
            current= this.front;    //Inicio de la estructura.
            while( i<=size() && !elimi ) {
                if (current.getElement().equals(info)) {
                    elimi= true;     //Lo encontro y puede haber eliminacion.
                } else {    //Avanza al siguiente nodo.
                    anteprevious= previous;
                    previous= current;
                    current= current.getNext();
                    i++;
                }
            }
            if( elimi ) {   // elimi : true
                if( i == 1 ) {   
                    //Caso 3: el info esta en pos. 1 y no hay nodo a eliminar.
                    elimi= false;
                } else {    // pos > 1
                    // Encontro el info en una posicion >= 2.
                    // En lugar del siguiente codigo: remove(pos-1)
                    if( anteprevious == null ) {
                        //Elimina el nodo de la pos. 1.
                        front= current;    // Caso 4
                    } else {
                        //Elimina nodo a partir de pos>=2.
                        anteprevious.setNext(current);    // Caso 5
                    }
                    count--;
                }
            }   // else: Caso 2: el info no esta, elimi : false.
        }    // else, Caso 1: regresa elimi : false
        return elimi;
    }
  
    /** Problema 41: elimina el nodo posterior al que contiene el dato info
     * dado como parametro. Regresa true, si lo elimino; false, si no.
     */
    public boolean eliminaSiguienteDe(T info) 
                throws ParamErrException {

        if( info == null ) {
            throw new ParamErrException("LinkedStruct: <info> con null");
        }
        
        LinearNode<T> current, poste= null, sigposte = null;
        boolean elimi= false;
        int i= 1;

        if( !isEmpty() ) {
            //Recorre la estructura, mientras haya nodos y no se encuentre info.
            i= 1;
            current= this.front;    //Inicio de la estructura.
            while( i<=size() && !elimi ) {
                if (current.getElement().equals(info)) {
                    elimi= true;     //Lo encontro y puede haber eliminacion.
                } else {    //Avanza al siguiente nodo.
                    current = current.getNext();
                    i++;
                }
            }
            if( elimi ) {   // elimi : true
                if( i == size() ) {   
                    //Caso 3: el info esta en ultima pos y no hay nodo a eliminar.
                    elimi= false;
                } else {    // pos>=1 e pos<size() 
                    // Encontro el info en una pos >=1 y < size().
                    // En lugar del siguiente codigo: remove(pos+1)
                    // Caso 4: Elimina el nodo de la pos==size(), o
                    // Caso 5: Elimina el nodo de una pos>=1 y <size()
                    poste = current.getNext();    // <= penultimo nodo
                    sigposte = poste.getNext();
                    current.setNext(sigposte);
                    count--;
                }
            }   // else: Caso 2: el info no esta, elimi : false.
        }    // else, Caso 1: regresa elimi : false
        return elimi;
    }
  
    /** Problema 42: inserta un nuevo elemento antes que el elemento refer
     * dado como parametro. Regresa true, si lo inserto; false, si no.
     */
    public boolean insertaAntesQue(T refer, T nuevo)
                throws ParamErrException {
        if( refer==null || nuevo==null) {
            throw new ParamErrException(
                    "LinkedStruct: <refer> y <nuevo>, con null");
        }
        
        LinearNode<T> current, previous= null, anteprevious= null;
        boolean insert= false;
        int i = 1;

        if( !isEmpty() ) {
            //Recorre la estructura mientras haya nodos y no se encuentre refer.
            i= 1;
            current= front;    //Inicio de la estructura.
            while( i<=size() && !insert ) {
                if (current.getElement().equals(refer)) {
                    insert= true;     //Lo encontro y puede haber insercion.
                } else {    //Avanza al siguiente nodo.
                    anteprevious= previous;
                    previous= current;
                    current= current.getNext();
                    i++;
                }
            }
            LinearNode<T> nodoNuevo =
                    new LinearNode(nuevo);  // Nuevo nodo y elemento
            if( insert ) {   // insert=true, refer encontrado
                if( i == 1 ) {   
                    //Caso 3: el refer esta en pos 1 y se puede insertar nuevo
                    nodoNuevo.setNext(front);
                    front = nodoNuevo;
                } else {    // pos > 1
                    // Caso 4: refer en una pos >= 2 y pos<=size(): inserta.
                    anteprevious = previous;
                    previous = nodoNuevo;
                    anteprevious.setNext(previous);
                    previous.setNext(current);
                }
                count++;
            }    // else, Caso 2: el refer no esta, insert : false.
        }    // else, Caso 1: regresa insert : false
        return insert;
    }

    /** Problema 43: elimina todos los elementos repetidos de una
     * LinkedStruct, dejando una ocurrencia de cada elemento.
     * Regresa como resultado el total de elementos eliminados.
     * Los elementos de LinkedStruct estan ORDENADOS, por lo tanto
     * los repetidos ocupan posiciones consecutivas.
     */
    public int eliminaTodosRepetidosOrdenado() {

        
        LinearNode<T> current, previous= null, previous1 = null;        
        int totelim = 0, pos = 1;
        T aux = null;
        
        current=front;
        while (current!=null){
            aux=current.getElement();
            previous=current;
            current=current.getNext();
            while(current!=null && current.getElement().equals(aux)){
                previous.setNext(current.getNext());
                current=current.getNext();
                totelim++;
            }//while
        }//while

        return totelim;       
    } 
    
    /** Problema 44: elimina todos los elementos repetidos de una
     * LinkedStruct, dejando una ocurrencia de cada elemento.
     * Regresa como resultado el total de elementos eliminados.
     * Los elementos de LinkedStruct estan DESORDENADOS, por lo tanto
     * los repetidos pueden estar en cualquier lugar del LinkedStruct.
     */
    public int eliminaTodosRepetidosDesordenado() {
        
        LinearNode<T> current, previous= null, previous1 = null;        
        int totelim = 0;
        T aux = null;
        current=front;
        ArraySet<T> elementos=new ArraySet();
        while (current!=null){
            aux=current.getElement();
            if (elementos.contains(aux)){
                previous.setNext(current.getNext());
                current=previous.getNext();
                totelim++;
                count--;
            }//if
            else{
                elementos.add(aux);
                previous=current;
                current=current.getNext();
            }//else
        }//while

        return totelim;        
    }
}
