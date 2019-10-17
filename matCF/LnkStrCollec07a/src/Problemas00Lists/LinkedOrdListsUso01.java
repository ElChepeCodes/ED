
package Problemas00Lists;
import Lists.*;

/**
 * Primeros ejrcicios de LinkedOrderedLists
 * @author EDg1
 */
public class LinkedOrdListsUso01 {

    public static void main(String[] args) {
        LinkedOrderedList<Integer> listor1= new LinkedOrderedList();
        
        //Prueba de operaciones de lista ordenada.
        System.out.println("1)- Lista inicial:\n" + listor1);

        listor1.add(33);    listor1.add(12);
        listor1.add(42);    listor1.add(25);
        System.out.println("2)- Lista:\n" + listor1.toString());

        System.out.println("3)- Primero: " + listor1.first());
        System.out.println("4)- Ultimo: " + listor1.last());
       
        System.out.println("5)- Remueve primero: " + listor1.removeFirst());
        System.out.println("6)- Remueve ultimo: " + listor1.removeLast());       

        System.out.println("7-) Lista restante:\n" + listor1.toString());
        
        listor1.add(57);    listor1.add(49);
        listor1.add(54);    listor1.add(25);
        System.out.println("\n8)- Nueva lista: \n" + listor1.toString());

        int aux= 250;
        if( listor1.contains(aux) )
            System.out.println("9-) ¿" + aux + "? lo remueve: " +
                    listor1.remove(aux));
        else
            System.out.println("10)- ¿"+aux+"? no existe");
        System.out.println("\n11)- Lista: \n" + listor1.toString());

        System.out.println("12)- Remueve: " + listor1.remove(57));
        System.out.println("13)- Remueve: " + listor1.remove(49));
        System.out.println("\n14)- Lista final: \n" + listor1.toString());
    }
    
}
