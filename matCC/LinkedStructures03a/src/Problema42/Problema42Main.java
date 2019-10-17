
package Problema42;
import LinkedStructures.*;

/**
 * Problema 42 - Estructuras Entrelazadas
 * @author EDg1
 */
public class Problema42Main {

    public static void main(String[] args) {

        LinkedStruct<Integer> esInt= new LinkedStruct();
        esInt.add(10, 1); esInt.add(-20, 2);
        esInt.add(30, 3); esInt.add(-40, 4); 
        System.out.println("1-) Est. original: "+esInt.toString() +
                "    size(): " + esInt.size() );        

        System.out.println("2)- ¿Inserta 6 anterior a 22? "+
                esInt.insertaAntesQue(22,6));
        System.out.println("3-) Est. resultante: "+esInt.toString() +
                "    size(): " + esInt.size() );        

        System.out.println("4)- ¿Inserta 6 anterior a 10? "+
                esInt.insertaAntesQue(10,6));
        System.out.println("5)- Est. resultante: "+esInt.toString() +
                "    size(): " + esInt.size() );        

        System.out.println("6)- ¿Inserta 19 anterior a -20? "+
                esInt.insertaAntesQue(-20, 19));
        System.out.println("7)- Est. resultante: "+esInt.toString() +
                "    size(): " + esInt.size() );        

        System.out.println("8)- ¿Inserta -37 anterior a -40? "+
                esInt.insertaAntesQue(-40, -37));
        System.out.println("9)- Est. resultante: "+esInt.toString() +
                "    size(): " + esInt.size() );        
    }
    
}
