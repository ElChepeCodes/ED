
package Problema48Lists;
import Lists.*;

/**
 * Segundos ejrcicios de LinkedOrderedLists
 * @author EDg2
 */
public class Problema48ListsMain {

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
        listor2.add(pc);    listor2.add(pd);    
        System.out.println("1)- Lista:\n" + listor2.p48ToString());
                
        System.out.println("2)- Encuentra " + pc.toString() +
                " en posicion: " + listor2.find(pc) );

        System.out.println("3)- Encuentra rv " + pc.toString() +
                " en posicion: " + listor2.findRv(pc) );

    }
    
}
