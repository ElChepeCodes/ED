package Problema50Lists;
import Lists.LinkedOrderedList;

/**
 * Problema 50 de LinkedOrderedLists
 * @author EDg1
 */
public class Problema50ListsMain {

    public static void main(String[] args) {
        
        System.out.println("\n ----Prueba de equals() Iterativo----");
        LinkedOrderedList<String> listaA= new LinkedOrderedList();
        LinkedOrderedList<String> listaB= new LinkedOrderedList();
        LinkedOrderedList<String> listaC= new LinkedOrderedList();

        listaA.add("Hugo");    listaA.add("Paco");    listaA.add("Luis"); 
        listaB.add("Paco");    listaB.add("Luis");    listaB.add("Hugo"); 
        listaC.add("Luis");    listaC.add("Donald");    listaC.add("Hugo"); 
        System.out.println("A-"+listaA.toString());
        System.out.println("B-"+listaB.toString());
        System.out.println("1)- Listas A, B iguales? " + listaA.equals(listaB) );
        System.out.println("A-"+listaA.toString());
        System.out.println("C-"+listaC.toString());
        System.out.println("2)- Listas B, C iguales? " + listaB.equals(listaC) );
        
        listaB.add("Donald");
        System.out.println("A-"+listaA.toString());
        System.out.println("B-"+listaB.toString());
        System.out.println("3)- Listas A, B iguales? " + listaA.equals(listaB) );

        System.out.println("\n ----Prueba de equalsRv() Recursivo----");
        LinkedOrderedList<String> listaD= new LinkedOrderedList();
        LinkedOrderedList<String> listaE= new LinkedOrderedList();
        LinkedOrderedList<String> listaF= new LinkedOrderedList();

        listaD.add("Hugo");    listaD.add("Paco");    listaD.add("Luis"); 
        listaE.add("Paco");    listaE.add("Luis");    listaE.add("Hugo"); 
        listaF.add("Luis");    listaF.add("Donald");    listaF.add("Hugo"); 
        
        System.out.println("D-"+listaD.toString());
        System.out.println("E-"+listaE.toString());
        System.out.println("4)- Listas D, E iguales? " + listaD.equalsRv(listaE) );
        System.out.println("E-"+listaE.toString());
        System.out.println("F-"+listaF.toString());
        System.out.println("5)- Listas E, F iguales? " + listaE.equalsRv(listaF) );
        
        listaE.add("Donald");
        System.out.println("D-"+listaD.toString());
        System.out.println("E-"+listaE.toString());
        System.out.println("6)- Listas D, E iguales? " + listaD.equalsRv(listaE) );
    }
    
}
