/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package finaleddiciembre2012;

/**
 *
 * @author MIGUEL_ANGEL
 */
public class DoublyLinkedNode<T> {
    private T element;
    protected DoublyLinkedNode<T> next;
    protected DoublyLinkedNode<T> previous;
    
    public DoublyLinkedNode() {
        element=null;
        next=null;
        previous=null;
    }
    
    public DoublyLinkedNode(T element) {
        this.element=element;
        next=null;
        previous=null;
    }
    
    public DoublyLinkedNode<T> getNext() {
        return next;
    }
    
    public void setNext(DoublyLinkedNode<T> next) {
        this.next=next;
    }
    
    public T getElement() {
        return element;
    }
    
    public void setElement(T element) {
        this.element = element;
    }
    
    public DoublyLinkedNode<T> getPrevious() {
        return previous;
    }
    
    public void setPrevious(DoublyLinkedNode<T> prev) {
        previous=prev;
    }
    
    public String toString() {
        return element.toString();
    }
}
