package ProbleQueues36;
import Queues.CircularArrayQueue;
import java.util.ArrayList;

/**
 * Problema 36
 * @author EDg1
 */
public class Prob36QMain {

    public static void main(String[] args) {
        
        CircularArrayQueue<String> qs = new CircularArrayQueue(10);
        qs.enqueue("uno");    qs.enqueue("dos");    qs.enqueue("tres");
        qs.enqueue("cuatro");    qs.enqueue("cinco");    qs.enqueue("seis");
        qs.enqueue("siete");    qs.enqueue("ocho");    qs.enqueue("nueve");
        System.out.print( "Cola qs: " + qs.toString() );
        
        System.out.println("36.a)- qs.cuentaElementos(): " + qs.cuentaElementos() );
        System.out.println("36.b)- qs.consultaUltimo(): " + qs.consultaUltimo() );

        // Quitando cuatro elementos y agregando tres nuevo
        qs.dequeue();    qs.dequeue();    qs.dequeue();    qs.dequeue();
        qs.enqueue("diez");    qs.enqueue("once");    qs.enqueue("doce");
        System.out.print( "\nCola qs: " + qs.toString() );

        System.out.println("36.a)- qs.cuentaElementos(): " + qs.cuentaElementos() );        
        System.out.println("36.b)- qs.consultaUltimo(): " + qs.consultaUltimo() );

        System.out.println("\n36.c)- qs.multiQuita(n)");
        ArrayList<String> als = qs.multiQuita(4);
        System.out.print( "Cola qs: " + qs.toString() );
        System.out.println( "ArrayList als: " + als.toString() );
        
    }
    
}
