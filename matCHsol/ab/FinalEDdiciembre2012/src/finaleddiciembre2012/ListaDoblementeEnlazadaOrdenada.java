/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package finaleddiciembre2012;

/**
 *
 * @author AGOMEZDG
 */
public class ListaDoblementeEnlazadaOrdenada<T> extends ListaDoblementeEnlazada<T> implements OrderedListADT<T> {

    @Override
    public void add(T dato) {
        DoublyLinkedNode nuevo=new DoublyLinkedNode(dato);
        if (this.isEmpty()){
            primero=nuevo;
            último=nuevo;
            primero.setNext(null);
            primero.setPrevious(null);
        }//if
        
        else{
            DoublyLinkedNode current=primero, anterior=null;
            Comparable <T> element=(Comparable<T>) dato;
            while(current!=null && element.compareTo((T) current.getElement())<0 ){
                anterior=current;
                current=current.getNext();
            }//while
            if (current!=null){
                anterior.setNext(nuevo);
                nuevo.setPrevious(anterior);
                nuevo.setNext(current);
                current.setPrevious(nuevo);
            }//if
                
        }//else
    }//method
    
}
