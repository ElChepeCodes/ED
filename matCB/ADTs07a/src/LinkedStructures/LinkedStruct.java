
package LinkedStructures;
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
                    "LinkedStruct: pos fuera de limites");
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
                    "LinkedStruct: pos fuera de limites");
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
                    "LinkedStruct: pos fuera de limites");
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
        
        String result = "{LnkdStrctr:";
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
            throw new ParamErrException("<info> con null");
        }

        LinearNode<T> current, previous= null, anteprevious= null;
        boolean elimi= false;
        int i= 1;
        if (!isEmpty()){
            current=front;//inicio de la estructura
            while(i<=size() && !elimi){
                if (current.getElement().equals(info)){
                    elimi=true;
                }//if
                else{
                    anteprevious=previous;
                    previous=current;
                    current=current.getNext();
                    i++;
                }//else
            }//while
            //En la "i" esta la posicion donde se encontro, si es que se encontro
            if (elimi){
                if (i==1){
                    //caso 3: "info" en la posicion 1, y no hay "info" a eliminar
                    elimi=false;
                }//if
                else{
                    //caso 4: "i" >=2, opcion remove(i-1)
                    if (anteprevious==null){
                        front=current;                        
                    }//if
                    else{
                        anteprevious.setNext(current);
                        //eliminando a partir de la posicion >=2
                    }//else
                    count--;
                }//else
            }//if
        }//Caso1 estructura vacia

        return elimi;
    }
  
    /** Problema 41: elimina el nodo posterior al que contiene el dato info
     * dado como parametro. Regresa true, si lo elimino; false, si no.
     */
    public boolean eliminaSiguienteDe(T info) 
                throws ParamErrException {
        if( info == null ) {
            throw new ParamErrException("<info> con null");
        }

        LinearNode<T> current, posterior= null, postPosterior= null;
        boolean elimi= false;
        int i= 1;
        if (!isEmpty()){
            current=front;//inicio de la estructura
            while(i<=size() && !elimi){
                if (current.getElement().equals(info)){
                    elimi=true;
                }//if
                else{
                    current=current.getNext();
                    if (current!=null){
                        posterior=current.getNext();
                        if (posterior!=null)
                        postPosterior=posterior.getNext();
                        else
                        postPosterior=null;
                    }//if
                    
                    i++;
                }//else
            }//while
            //En la "i" esta la posicion donde se encontro, si es que se encontro
            if (elimi){
                if (i==size()){
                    //caso 3: "info" en la posicion 1, y no hay "info" a eliminar
                    elimi=false;
                }//if
                else{
                    //caso 4: "i" >=2, opcion remove(i-1)
                    if (postPosterior==null){
                        current.setNext(null);
                    }//if
                    else{
                        current.setNext(postPosterior);
                        //eliminando a partir de la posicion >=2
                    }//else
                    count--;
                }//else
            }//if
        }//Caso1 estructura vacia

        return elimi;

    }//method
    
    public boolean insertaAntesQue(T refer, T nuevo)throws ParamErrException {
        if( refer == null ) {
            throw new ParamErrException("<refer> con null");
        }

        LinearNode<T> current, previous= null, anteprevious= null, nuevoNodo=new LinearNode();
        boolean encuentra= false;
        int i= 1;
        if (!isEmpty()){
            current=front;//inicio de la estructura            
            while(i<=size() && !encuentra){
                if (current.getElement().equals(refer)){
                    encuentra=true;
                }//if
                else{
                    anteprevious=previous;
                    previous=current;
                    current=current.getNext();
                    i++;
                }//else
            }//while
            
            if (encuentra){
                
                if (i==1){
                   
                    nuevoNodo.setElement(nuevo);
                    front=nuevoNodo;
                    nuevoNodo.setNext(current);                    
                }//if
                else{                    
                        System.out.println("anteprevious=null");
                        nuevoNodo.setElement(nuevo);
                        anteprevious=previous;
                        previous=nuevoNodo;
                        anteprevious.setNext(previous);
                        previous.setNext(current);
                }//else
                count++;
            }//if
        }

        return encuentra;
    }
    
}
