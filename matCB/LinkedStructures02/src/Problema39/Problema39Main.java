
package Problema39;
import LinkedStructures.*;

/**
 * Problema 39, de Estructuras Entrelazadas (Linked Structure)
 * Definicion de clases que representan a un Nodo y a una
 * Estructura Enlazada, agregando todos los metodos de comportamiento.
 * @author EDg1
 */
public class Problema39Main {
    /**
     * Ejercicio 31, metodo main(...).
     * Pruebas de uso de Estructuras Entrelazadas
     */
    
    public static void main(String[] args) {
        LinkedStruct<String> es= new LinkedStruct();        
        //Prueba de add y toString.
        es.add("Mercedes", 1); es.add("Audi", 2); es.add("BMW", 3);
        es.add("Porshe", 1); es.add("VolksWagen", 4);
        System.out.println("1) Estructura completa: \n"+es.toString());

        System.out.println("2) Prueba de get");
        for (int i=1; i<=es.size(); i++) {
            System.out.println("Elemento " + i + ": " + es.get(i));
        }
        
        System.out.println("\n3) Prueba de remove");
        System.out.println("Elemento 4: "+es.remove(4));
        System.out.println("Elemento 1: "+es.remove(1));
        System.out.println("Elemento 3: "+es.remove(3));
        System.out.println("\n4) Estructura completa: \n"+es.toString());

        try {
            System.out.println("Elemento 3: "+es.remove(3));  //Error.
        } catch (Exception e) {
            System.out.println("5)" + e.toString());
        }

        LinkedStruct<Persona> esPers= new LinkedStruct();
        //Estructura enlazada que contiene objetos Persona.
        Persona pa, pb, pc, pd;
        pa= new Persona(10,"Mario"); pb= new Persona(20,"Luis");
        pc= new Persona(30,"Armando"); pd= new Persona(40,"Rebeca");
        esPers.add(pa, 1); esPers.add(pb, 2); esPers.add(pc, 3);
        esPers.add(pd, 4);
        System.out.println("\n6) Estructura con objetos Persona");
        System.out.println(esPers.toString());

        System.out.println("7) Remueve elemento 2: "+esPers.remove(2));        
        System.out.println(esPers.toString());
    }
    
}
