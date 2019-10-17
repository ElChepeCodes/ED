
package Problemas00Lists;
import Lists.*;

/**
 * Segundos ejrcicios de LinkedOrderedLists
 * @author EDg2
 */
public class LinkedOrdListsUso02 {

    public static void main(String[] args) {
        // Creacion de la lista vacia
        LinkedOrderedList<Personax> listor2= new LinkedOrderedList();
        
        // Creacion de objetos Personax
        Personax pa, pb, pc, pd, pe;
        pa = new Personax(11, "Hugo");
        pb = new Personax(22, "Paco");
        pc = new Personax(33, "Luis");
        pd = new Personax(44, "Donald");
        
        // Agregado a la LinkedOrderedList
        listor2.add(pa);    listor2.add(pb);    
        listor2.add(pc);    listor2.add(pd);    
        System.out.println("1)- Lista inicial:\n" + listor2.toString());

        System.out.println("2)- Remueve ultimo: " + listor2.removeLast());       
        System.out.println("3)- Lista:\n" + listor2.toString());
        
        listor2.add(pc);    listor2.add(pd);    
        System.out.println("4)- Lista:\n" + listor2.toString());
        
        try {
            System.out.println("5)- Remueve: " + listor2.remove(pb));
        } catch (Exception e) {
            System.out.println("6)- " + e.toString());
        }
        
        System.out.println("7)- Remueve: " + listor2.remove(pc));        
        System.out.println("\n8) Lista final: \n" + listor2.toString());

    }
    
}
