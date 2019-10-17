package Problemas00DblLists;
import DoubleLists.*;

/**
 * Problemas usando Double Linked Lists
 * @author EDg1
 */
public class Problemas01DblListsMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Lista ordenada de enteros
        DoublyLinkedOrderedList<Integer> listaInt = new DoublyLinkedOrderedList();
        System.out.println("1) listaInt inicial: " + listaInt.toString());
        listaInt.add(3);        listaInt.add(4);
        listaInt.add(1);        listaInt.add(2);
        System.out.println("2) listaInt final: " + listaInt.toString());
        
        // Lista ordenada de circulos
        DoublyLinkedOrderedList<Circle> listaordCir = 
                new DoublyLinkedOrderedList();
        System.out.println("3) listaordCir inicial: " + listaordCir.toString());
        Circle c1, c2, c3, c4;
        c1 = new Circle(30);        c2 = new Circle(40);
        c3 = new Circle(10);        c4 = new Circle(20);
        listaordCir.add(c1);        listaordCir.add(c2);
        listaordCir.add(c3);        listaordCir.add(c4);
        System.out.println("4) listaordCir final: " + listaordCir.toString());
        
        // Lista ordenada de rectangulos        
        DoublyLinkedOrderedList<Rectangle> listaordRec = 
                new DoublyLinkedOrderedList();
        System.out.println("5) listaordRec inicial: " + listaordRec.toString());
        Rectangle r1, r2, r3, r4;
        r1 = new Rectangle(40,40);        r2 = new Rectangle(20,20);
        r3 = new Rectangle(30,30);        r4 = new Rectangle(10,10);        
        listaordRec.add(r1);        listaordRec.add(r2);
        listaordRec.add(r3);        listaordRec.add(r4);
        System.out.println("6) listaordRec final: " + listaordRec.toString());
        
    }
    
}
