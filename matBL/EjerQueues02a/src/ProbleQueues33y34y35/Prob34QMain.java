package ProbleQueues33y34y35;
import Queues.*;

/**
 * Aplicacion con Queues, problema 34
 * @author EDg1
 */
public class Prob34QMain {

    public static void main(String[] args) {
                
        CircularArrayQueue<Double> colaD = new CircularArrayQueue(8);        
        colaD.enqueue(110.0);    colaD.enqueue(220.0);
        colaD.enqueue(330.0);    colaD.enqueue(330.0);
        colaD.enqueue(550.0);    colaD.enqueue(660.0);

        System.out.println("C- ColaD original: \n  " + colaD.toString());

        quitaRepetidosQg(colaD);
        System.out.println("D- ColaD sin repetidos: \n  " + colaD.toString());

        System.out.println("ADIOS");
    }

    /**
     * Ejercicio 34.
     * Quita los elementos repetidos de una cola generica.
     * Los elementos repetidos se encuentran en posiciones consecutivas.
     */
    public static <T> void quitaRepetidosQg(CircularArrayQueue<T> Cgc) {
        CircularArrayQueue<T> Caux= new CircularArrayQueue();
        T temp;
    
        while ( !Cgc.isEmpty() ) {
            temp= Cgc.dequeue();
            Caux.enqueue( temp );
            while ( !Cgc.isEmpty() && temp.equals(Cgc.first()) ) {
                Cgc.dequeue();
            }
        }
        while (!Caux.isEmpty()) {
            temp= Caux.dequeue();
            Cgc.enqueue( temp );
        }
    }
    
}
