/*
 * Use of SET collections.
 * Exercises: 18 and 19
 */
package Sets;

/**
 * @author EDg1
 * Exercises: 18 and 19
 */
public class ArraySetUseMain {
    public static void main(String[] args) {
        //Ejercicios simples del uso de las operaciones del conjunto.
        ArraySet<Integer> c1= new ArraySet<Integer>(15);
        ArraySet<Integer> c2= new ArraySet<Integer>(15);
        ArraySet<Integer> c3= new ArraySet<Integer>(15);
        ArraySet<Integer> c4= new ArraySet<Integer>(30);
        ArraySet<Integer> c5= new ArraySet<Integer>(30);
        ArraySet<Integer> c6= new ArraySet<Integer>(30);
        
        //Agrega elementos al conjunto.
        c1.add(70);   c1.add(70);   c1.add(-40);   c1.add(30); c1.add(50);
        System.out.println("T1--c1\n" + c1.toString());

        c1.add(-50);   c1.add(-40);   c1.add(60);
        System.out.println("T2--c1\n" + c1.toString());

        System.out.println("T3-- c2: "+c2.toString() + "\n");

        //Prueba de remove.
        c1.remove(60); c1.remove(70);
        System.out.println("T4-- c1 despues remove: \n" + c1.toString());

        //Prueba de removeRandom.
        System.out.println("T5-- c1, Elemento removido: " + c1.removeRandom());
        System.out.println("T6-- c1, Elemento removido: " + c1.removeRandom());
        System.out.println("T7-- c1 después removeRandom: \n" + c1.toString());

        //Prueba de addAll.
        c2.add(200);   c2.add(-300);   c2.add(30);   c2.add(-50); 
        c1.addAll(c2);
        System.out.println("T8-- c1 después addAll: "+c1.toString());

        //Prueba de union.
        c3.add(30);   c3.add(500);
        System.out.println("T9-- c3: "+c3.toString());
        c4 = (ArraySet) c1.union(c3);
        System.out.println("T10-- Unión de c1 y c3, en c4: \n" + c4.toString());

        //Prueba de intersección.
        
        c5 = (ArraySet) c1.intersection(c3);
        System.out.println("T11-- Intersección de c1 y c3, en c5: \n" +
                c5.toString());
    
        //Prueba de diferencia.
        while(!c1.isEmpty())
            c1.removeRandom();
        while(!c3.isEmpty())
            c3.removeRandom();
        c1.add(20); c1.add(30); c1.add(10); c1.add(100);
        c3.add(10); c3.add(10); c3.add(20); c3.add(30); 
        
        System.out.println("c1--"+c1.toString()+"\nc3--"+c3.toString());
        c4 = (ArraySet) c1.difference(c3);
        System.out.println("T12-- Diferencia de c1 y c3, en c4: \n" + c4.toString());

        //Prueba de equals
        c6.add(500);   c6.add(30);    
        System.out.println("T13-- c1: " + c1.toString()); 
        System.out.println("T14-- c3: " + c3.toString()); 
        System.out.println("T15-- ¿c1 es igual a c3? " + c1.equals(c3));
        System.out.println("T16-- c6: " + c6.toString()); 
        System.out.println("T17-- ¿c3 es igual a c6? "+ c3.equals(c6) + "\n");

    }
    
}
