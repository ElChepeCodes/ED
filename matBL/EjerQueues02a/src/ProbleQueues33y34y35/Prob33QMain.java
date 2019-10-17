
package ProbleQueues33y34y35;
import Queues.*;
import Stacks.*;    // ArrayStack

/**
 * Aplicacion con Queues, problema 33
 * @author EDg1
 */
public class Prob33QMain {

    public static void main(String[] args) {
        
        CircularArrayQueue<Integer> colaI= new CircularArrayQueue(5);
        
        // Guardando en colaI {40, 50, 60, 70}
        colaI.enqueue(40); colaI.enqueue(50);
        colaI.enqueue(60); colaI.enqueue(70);
        System.out.println("A- ColaI original: \n  " + colaI.toString());

        invierteQg(colaI);
        System.out.println("B- ColaI invertida: \n  " + colaI.toString());
        
        System.out.println("ADIOS");
    }
    
    /**
     * Ejercicio 33.
     * Invertir el orden de los elementos de una cola genérica.
     * Puede usar, como auxiliar, cualquier estructura de datos.
     */
    public static <T> void invierteQg(CircularArrayQueue<T> Cgc) {
        ArrayStack<T> stack= new ArrayStack();
    
        while ( !Cgc.isEmpty() ) {
            stack.push( Cgc.dequeue() );
        }
    
        while ( !stack.isEmpty() ) {
            Cgc.enqueue( stack.pop() );
        }
    }
    
}
