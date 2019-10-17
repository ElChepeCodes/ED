package Problema41;
import LinkedStructures.*;

/**
 * Problema 41
 * @author EDg1
 */
public class Problema41Main {

    public static void main(String[] args) {

        LinkedStruct<Integer> esInt= new LinkedStruct();
        esInt.add(10, 1); esInt.add(-20, 2);
        esInt.add(30, 3); esInt.add(-40, 4); 
        System.out.println("1) Est. original: "+esInt.toString() +
                "    size(): " + esInt.size() );        

        System.out.println("2) ¿Elimina posterior a -40? "+
                esInt.eliminaSiguienteDe(-40));
        System.out.println("3) Est. resultante: "+esInt.toString());        

        System.out.println("4) ¿Elimina posterior a 43? "+
                esInt.eliminaSiguienteDe(43));
        System.out.println("5) Est. resultante: "+esInt.toString());        

        System.out.println("6) ¿Elimina posterior a 30? "+
                esInt.eliminaSiguienteDe(30));
        System.out.println("7) Est. resultante: "+esInt.toString() +
                "    size(): " + esInt.size() );        

    }
    
}
