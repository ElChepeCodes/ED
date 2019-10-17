package Problema46xLSQueues;
import Queues.CircularArrayQueue;
import Queues.LnkStrQueue;
import java.util.ArrayList;

/**
 * Problema 46 y 36, Queue implementado con LinkedStruct, en lugar de Array.
 * Pruebas con ambas clases CircularArrayQueue y LnkStrQueue
 * @author EDg1
 */
public class Problema46x36xLSQueuesMain {

    public static void main(String[] args) {

        System.out.println( "\n========= PRUEBAS CON CircularArrayQueue ========" );
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

        System.out.println("\n36.c)- qs.multiQuita(4)");
        ArrayList<String> als = qs.multiQuita(4);
        System.out.print( "Cola qs: " + qs.toString() );
        System.out.println( "ArrayList als: " + als.toString() );
        
        System.out.println( "\n========= PRUEBAS CON LnkStrQueue ========" );
        LnkStrQueue<String> lqs = new LnkStrQueue();
        lqs.enqueue("uno");    lqs.enqueue("dos");    lqs.enqueue("tres");
        lqs.enqueue("cuatro");    lqs.enqueue("cinco");    lqs.enqueue("seis");
        lqs.enqueue("siete");    lqs.enqueue("ocho");    lqs.enqueue("nueve");
        System.out.print( "Cola lqs: " + lqs.toString() );
        
        System.out.println("36.a)- qs.cuentaElementos(): " + lqs.cuentaElementos() );
        System.out.println("36.b)- qs.consultaUltimo(): " + lqs.consultaUltimo() );

        // Quitando cuatro elementos y agregando tres nuevo
        lqs.dequeue();    lqs.dequeue();    lqs.dequeue();    lqs.dequeue();
        lqs.enqueue("diez");    lqs.enqueue("once");    lqs.enqueue("doce");
        System.out.print( "\nCola lqs: " + lqs.toString() );

        System.out.println("36.a)- lqs.cuentaElementos(): " + lqs.cuentaElementos() );        
        System.out.println("36.b)- lqs.consultaUltimo(): " + lqs.consultaUltimo() );

        System.out.println("\n36.c)- lqs.multiQuita(4)");
        ArrayList<String> lals = lqs.multiQuita(4);
        System.out.print( "Cola lqs: " + lqs.toString() );
        System.out.println( "ArrayList lals: " + lals.toString() );

    }
    
}
