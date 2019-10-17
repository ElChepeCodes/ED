package ProbleQueues37;
import Queues.*;
import java.util.Calendar;


/**
 * Problema 37
 * @author EDg1
 */
public class Prob37QMain {

    public static void main(String[] args) {
        
        Persona37 per1 = new Persona37(2,6,2015,"Alfonso");
        System.out.println("edad " + per1.edad31dicAct());
        
        Persona37 per2 = new Persona37(12,11,2010,"Rebeca");
        System.out.println("edad " + per2.edad31dicAct());
        
        CircularArrayQueue<Persona37> q1 = new CircularArrayQueue(20); 
        q1.enqueue(per1);
        q1.enqueue(per2);
        q1.enqueue( new Persona37(8,1,2012,"Alba") );
        System.out.println("q1 inicial: \n" + q1.toString());
        ordenEdad(q1);
        System.out.println("q1 por edad: \n" + q1.toString());        
        
    }
    
    public static void ordenEdad(CircularArrayQueue<Persona37> que) {
        Persona37 [] arrt = new Persona37[que.size()];
        Persona37 aux;
        int indx = 0;
        while( !que.isEmpty() ) {
            arrt[indx] = que.dequeue();
            indx++;
        }
        
        // Ordenamiento por seleccion direcc, de mayor a menor
        for(int i=0; i<arrt.length-1; i++) {
            for(int j=i+1; j<arrt.length; j++) {
                if( arrt[i].edad31dicAct() < arrt[j].edad31dicAct() ) {
                    aux = arrt[i];
                    arrt[i] = arrt[j];
                    arrt[j] = aux;
                }
            }
        }
        
        for( indx=0; indx<arrt.length; indx++) {  
            que.enqueue( arrt[indx] );
        }
    }
    
}
