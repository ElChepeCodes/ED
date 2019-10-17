
package Problema43;
import LinkedStructures.*;

/**
 * Problema 43 - Estructuras Entrelazadas
 * @author EDg1
 */
public class Problema43Main {

    public static void main(String[] args) {

        //Estructura entrelazada que contiene objetos Persona.
        LinkedStruct<Persona> esPers= new LinkedStruct();

        Persona pa, pb, pc, pd;
        pa= new Persona(10,"Mario"); pb= new Persona(20,"Luis");
        pc= new Persona(30,"Armando"); pd= new Persona(40,"Rebeca");
        esPers.add(pa, 1);    esPers.add(pa, 2);
        esPers.add(pb, 3);
        esPers.add(pc, 4);    esPers.add(pc, 5);
        esPers.add(pd, 6);    esPers.add(pd, 7);    esPers.add(pd, 8);
        
        System.out.println("\n1)- Estructura con objetos Persona");
        System.out.println(esPers.toString());
        
        // Eliminacion de elementos Persona repetidos
        int pr = esPers.eliminaTodosRepetidosOrdenado();
        System.out.println("2)- Total de Persona repetidos borradas: " + pr);

        System.out.println("\n3)- Estructura con objetos Persona, sin repetidos");
        System.out.println(esPers.toString());
        
        // Eliminacion de elementos Persona, sin repetidos
        pr = esPers.eliminaTodosRepetidosOrdenado();
        System.out.println("4)- Total de Persona repetidos borradas: " + pr);        
    }
    
}
