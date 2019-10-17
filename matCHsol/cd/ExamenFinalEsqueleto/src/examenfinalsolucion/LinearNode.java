/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package examenfinalsolucion;

/**
 *
 * @author hca
 */
public class LinearNode<T> {
    private T dato;
    private LinearNode<T> siguiente;
    
    public LinearNode(){
        dato=null;
        siguiente=null;
    }
    
    public LinearNode(T dato) {
        this.dato=dato;
        siguiente=null;
    }
    
    public T getDato(){
        return dato;
    }
    
    public LinearNode<T> getSiguiente() {
        return siguiente;
    }
    
    public void setDato(T dato) {
        this.dato=dato;
    }
    
    public void setSiguiente(LinearNode<T> nodo) {
        siguiente=nodo;
    }
    
    public String toString(){
        return dato.toString();
    }
}
