
package Problema61DblLnkdLists;

/**
 * @author EDg1
 */
public class Problema61Main {

    
    public static void main(String[] args) {
        
        
        // PRIMER EJEMPLO de uso y prueba
        DoublyLinkedOrderedList<Integer> dolistInt1 = new DoublyLinkedOrderedList();
        
     //   dolistInt1.add(30);    dolistInt1.add(50);    dolistInt1.add(20);
      //  System.out.println( "1) Contenido de lista dolistInt1:\n" +
              //  dolistInt1.toString() );

        DoublyLinkedOrderedList<Integer> dolistInt2 = new DoublyLinkedOrderedList();
        /*
        dolistInt2.add(-35);    dolistInt2.add(-25);    dolistInt2.add(-45);
        System.out.println( "2) Contenido de lista dolistInt2:\n" +
                dolistInt2.toString() );
        
        dolistInt1.combina(dolistInt2);
        
        System.out.println( "3) Final de lista dolistInt1:\n" +
                dolistInt1.toString() );

        // SEGUNDO EJEMPLO de uso y prueba
        dolistInt1 = new DoublyLinkedOrderedList();
        
        dolistInt1.add(30);    dolistInt1.add(50);    dolistInt1.add(20);
        System.out.println( "4) Contenido de lista dolistInt1:\n" +
                dolistInt1.toString() );

        dolistInt2 = new DoublyLinkedOrderedList();
        
        dolistInt2.add(135);    dolistInt2.add(125);    dolistInt2.add(145);
        System.out.println( "5) Contenido de lista dolistInt2:\n" +
                dolistInt2.toString() );
        
        dolistInt1.combina(dolistInt2);
        
        System.out.println( "6) Final de lista dolistInt1:\n" +
                dolistInt1.toString() );
*/
        // TERCER EJEMPLO de uso y prueba
        dolistInt1 = new DoublyLinkedOrderedList();
        
        dolistInt1.add(30);    dolistInt1.add(50);    dolistInt1.add(20);
        System.out.println( "7) Contenido de lista dolistInt1:\n" +
                dolistInt1.toString() );

        dolistInt2 = new DoublyLinkedOrderedList();
        
        dolistInt2.add(35);    dolistInt2.add(25);    dolistInt2.add(45);
        System.out.println( "8) Contenido de lista dolistInt2:\n" +
                dolistInt2.toString() );
        
        dolistInt1.combina(dolistInt2);
        
        System.out.println( "9) Final de lista dolistInt1:\n" +
                dolistInt1.toString() );
/*
        // CUARTO EJEMPLO de uso y prueba
        dolistInt1 = new DoublyLinkedOrderedList();
        
        dolistInt1.add(30);    dolistInt1.add(50);    dolistInt1.add(20);
        dolistInt1.add(32);    dolistInt1.add(20);    dolistInt1.add(45);
        System.out.println( "10) Contenido de lista dolistInt1:\n" +
                dolistInt1.toString() );

        dolistInt2 = new DoublyLinkedOrderedList();
        
        dolistInt2.add(15);    dolistInt2.add(25);    dolistInt2.add(80);
        dolistInt2.add(35);    dolistInt2.add(25);    dolistInt2.add(45);
        System.out.println( "11) Contenido de lista dolistInt2:\n" +
                dolistInt2.toString() );
        
        dolistInt1.combina(dolistInt2);
        
        System.out.println( "12) Final de lista dolistInt1:\n" +
                dolistInt1.toString() );
        

        // QUINTO EJEMPLO de uso y prueba EXCEPCIONES
        try {
            dolistInt1 = new DoublyLinkedOrderedList();

            System.out.println( "13) Contenido de lista dolistInt1:\n" +
                    dolistInt1.toString() );

            dolistInt2 = new DoublyLinkedOrderedList();
            System.out.println( "14) Contenido de lista dolistInt2:\n" +
                    dolistInt2.toString() );

            dolistInt1.combina(dolistInt2);

            System.out.println( "15) Final de lista dolistInt1:\n" +
                    dolistInt1.toString() );
        }
        catch( Exception e) {
            System.out.println(e.toString());
        }
        
        System.out.println("HASTA LUEGO 61.");*/
    }
}
