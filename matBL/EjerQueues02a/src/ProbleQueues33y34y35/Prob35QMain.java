package ProbleQueues33y34y35;
import Queues.*;

/**
 * Aplicacion con Queues, problema 35
 * @author EDg1
 */
public class Prob35QMain {

    public static void main(String[] args) {
        
        CircularArrayQueue<Integer> colaI = new CircularArrayQueue(10); 
        colaI.enqueue(33);    colaI.enqueue(22);
        colaI.enqueue(-33);    colaI.enqueue(44);
        colaI.enqueue(-33);    colaI.enqueue(-33);
        colaI.enqueue(55);    colaI.enqueue(66);

        System.out.println("E- ColaI original: \n  " + colaI.toString());

        int dato = -33;
        quitaElementoQg(colaI, dato);
        System.out.println("F- ColaI sin valores :" + dato +
                ":\n  " + colaI.toString());

    }

    /**
     * Ejercicio 35.
     * Quitar de una cola generica, todas las ocurrencias de un elemento.
     */
    public static <T> void quitaElementoQg(CircularArrayQueue<T> Cgc,
            T elem) {
        CircularArrayQueue<T> Caux= new CircularArrayQueue();
        T temp;
    
        while (!Cgc.isEmpty()) {
            temp= Cgc.dequeue();
            if ( !temp.toString().equals(elem.toString()) ) {
                Caux.enqueue(temp);
            }
        }
        while ( !Caux.isEmpty() ) {
            Cgc.enqueue(Caux.dequeue());    
        }
    }
    
}
