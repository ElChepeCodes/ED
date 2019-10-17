/*
 * Estructuras de datos
 * Autor: Jose Luis Gutierrez Espinosa
 */
package Problema42;

import LinkedStructures.LinkedStruct;

/**
 *
 * @author jlgut
 */
public class Problema42Main {
    
    
    public static void main(String[] args){
        
        LinkedStruct<Integer> esInt= new LinkedStruct();
        esInt.add(10, 1); esInt.add(-20, 2);
        esInt.add(30, 3); esInt.add(-40, 4); 
        System.out.println("1) Est. original: "+esInt.toString() +
                "    size(): " + esInt.size() );        

        System.out.println("2) ¿Inserta 100 antes que 10? "+
                esInt.insertaAntesQue(10, 100));
        System.out.println("3) Est. resultante: "+esInt.toString());        

        System.out.println("4) ¿Inserta 50 antes que 10? "+
                esInt.insertaAntesQue(10, 50));
        System.out.println("5) Est. resultante: "+esInt.toString());        

        System.out.println("6) ¿Inserta 15 antes que 30? "+
                esInt.insertaAntesQue(30, 15));
        System.out.println("7) Est. resultante: "+esInt.toString() +
                "    size(): " + esInt.size() );        


    }//main
}//class
