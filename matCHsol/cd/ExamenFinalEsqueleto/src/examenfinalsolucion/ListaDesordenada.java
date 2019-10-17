/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenfinalsolucion;

/**
 *
 * @author ZVIX0
 */
public class ListaDesordenada<T> {
    private LinearNode<T> primero;
    
    public ListaDesordenada() {
        primero=null;
    }

    public LinearNode<T> getPrimero() {
        return primero;
    }
    
    public void addToFront(T dato) {
        LinearNode<T> nuevo=new LinearNode(dato);
        nuevo.setSiguiente(primero);
        primero=nuevo;
    }

    public String toString() {
        StringBuilder sb=new StringBuilder("");
        LinearNode<T> aux=primero;
        if(aux!=null) {
            while(aux.getSiguiente()!=null) {
                sb.append(aux.getDato()+", ");
                aux=aux.getSiguiente();
            }
            sb.append(aux.getDato()+"\n");
        }
        else
            sb.append("\n");
        
        return sb.toString();
    }
    
    public void intercambiaPorPares(){
        if (primero!=null && primero.getSiguiente()!=null){
            LinearNode<T> current=primero, posterior=primero.getSiguiente(), anterior=null;
            current.setSiguiente(posterior.getSiguiente());            
            primero=posterior;
            posterior.setSiguiente(current);
            anterior=current;
            current=current.getSiguiente();
            posterior=current.getSiguiente();
            while(posterior!=null && current!=null){                
                current.setSiguiente(posterior.getSiguiente());
                posterior.setSiguiente(current);
                if (anterior!=null)
                anterior.setSiguiente(posterior);
                anterior=current;
                current=current.getSiguiente();
                if (current!=null)
                    posterior=current.getSiguiente();
            }//while
        }//if
    }//method
    
    public int Size(){
        int res;
        if (primero==null)
            res=0;
        else
            if(primero.getSiguiente()==null)
                res=1;
            else{
                res=Size(1, primero.getSiguiente());
            }//else
        return res;
    }//method
    
    public int Size(int n, LinearNode<T> node){
        if (node!=null){
            n=Size(n+1, node.getSiguiente());
        }
        return n;
    }
    
    public void eliminaNesimoDesdeElfinal(int n){
        int tamanio=Size(), posicion=tamanio-n, i;    
        System.out.println("tam-"+tamanio+"\npos-"+posicion+"\nn-"+n);
        if (posicion>=0 && n>=0){
            if (posicion==1){
                primero=primero.getSiguiente();
            }//if
            else{
                i=0;
                LinearNode<T>anterior=null,current=primero;
                while(i<posicion-1){
                    i++;
                    anterior=current;
                    current=current.getSiguiente();
                }//while
                anterior.setSiguiente(current.getSiguiente());
            }//else
        }//while
    }//method
}
