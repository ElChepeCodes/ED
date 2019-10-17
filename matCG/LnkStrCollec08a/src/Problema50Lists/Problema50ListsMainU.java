package Problema50Lists;
import Lists.LinkedUnorderedList;

/**
 * Variacion del problema 50 con LinkedUnorderedLists
 * @author EDg1
 */
public class Problema50ListsMainU {

    public static void main(String[] args) {

        System.out.println("\n ----Prueba de equals() Iterativo----");
        LinkedUnorderedList<String> listaA= new LinkedUnorderedList();
        LinkedUnorderedList<String> listaB= new LinkedUnorderedList();
        LinkedUnorderedList<String> listaC= new LinkedUnorderedList();

        listaA.addToRear("Hugo");    listaA.addToRear("Paco");    listaA.addToRear("Luis"); 
        listaB.addToRear("Hugo");    listaB.addToRear("Paco");    listaB.addToRear("Luis"); 
        listaC.addToRear("Luis");    listaC.addToRear("Paco");    listaC.addToRear("Hugo"); 
        
        System.out.println("7)- Listas A, B iguales? " + listaA.equals(listaB) );
        System.out.println("8)- Listas B, C iguales? " + listaB.equals(listaC) );
        
        listaB.addToRear("Donald");
        System.out.println("9)- Listas A, B iguales? " + listaA.equals(listaB) );

        System.out.println("\n ----Prueba de equalsRv() Recursivo----");
        LinkedUnorderedList<String> listaD= new LinkedUnorderedList();
        LinkedUnorderedList<String> listaE= new LinkedUnorderedList();
        LinkedUnorderedList<String> listaF= new LinkedUnorderedList();

        listaD.addToRear("Hugo");    listaD.addToRear("Paco");    listaD.addToRear("Luis"); 
        listaE.addToRear("Hugo");    listaE.addToRear("Paco");    listaE.addToRear("Luis"); 
        listaF.addToRear("Luis");    listaF.addToRear("Paco");    listaF.addToRear("Hugo"); 
        
        System.out.println("10)- Listas D, E iguales? " + listaD.equalsRv(listaE) );
        System.out.println("11)- Listas E, F iguales? " + listaE.equalsRv(listaF) );
        
        listaE.addToRear("Donald");
        System.out.println("12)- Listas D, E iguales? " + listaD.equalsRv(listaE) );
    }
    
}
