
package Problemas00Lists;
import Lists.*;

/**
 * Segundos ejrcicios de LinkedOrderedLists
 * @author EDg2
 */
public class LinkedUnOrdListsUso03 {

    public static void main(String[] args) {
        // Creacion de la lista vacia
        LinkedUnorderedList<Personax> listunor3= new LinkedUnorderedList();
        
        // Creacion de objetos Personax
        Personax pa, pb, pc, pd, pe;
        pa = new Personax(11, "Hugo");
        pb = new Personax(22, "Paco");
        pc = new Personax(33, "Luis");
        pd = new Personax(44, "Donald");
        
        // Agregado a la LinkedOrderedList
        listunor3.addToFront(pa);    listunor3.addToFront(pb);    
        listunor3.addToRear(pc);    listunor3.addToRear(pd);    
        System.out.println("1)- Lista inicial:\n" + listunor3.toString());

        System.out.println("2)- Remueve ultimo: " + listunor3.removeLast());       
        System.out.println("3)- Lista:\n" + listunor3.toString());
        
        //listunor3.add(pc);    listunor3.add(pd);    
        System.out.println("4)- Lista:\n" + listunor3.toString());
        
        try {
            System.out.println("5)- Remueve: " + listunor3.remove(pb));
        } catch (Exception e) {
            System.out.println("6)- " + e.toString());
        }
        
        System.out.println("7)- Remueve: " + listunor3.remove(pc));        
        System.out.println("\n8)- Lista final: \n" + listunor3.toString());

    }
    
}
