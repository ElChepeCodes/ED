package ProbleSets33y34y35;
import Queues.*;
import Sets.ArraySet;

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
        T auxElem;
        ArraySet<T> auxSet=new ArraySet();
        CircularArrayQueue<T> auxQ=new CircularArrayQueue();
        while(!Cgc.isEmpty()){
            auxElem=Cgc.dequeue();
            if (!auxSet.contains(auxElem)){
                auxSet.add(auxElem);
                auxQ.enqueue(auxElem);
            }//if
        }//while
        while (!auxQ.isEmpty())
            Cgc.enqueue(auxQ.dequeue());
    }//method
    
}//class
