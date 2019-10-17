package Problema40;
import LinkedStructures.*;

/**
 * Problema 40
 * @author EDg1
 */
public class Problema40Main {

    public static void main(String[] args) {

        //Prueba con una estructura ligada de enteros
        LinkedStruct<Integer> esInt= new LinkedStruct();
        esInt.add(10, 1);    esInt.add(-20, 2);
        esInt.add(30, 3);    esInt.add(-40, 4); 
        System.out.println("1)- Est. original enteros: " + esInt.toString());        

        System.out.println("2)- ¿Elimina anterior a 10? "+
                esInt.eliminaAnteriorA(10));
        System.out.println("3)- Est. resultante: "+esInt.toString());        

        System.out.println("4)- ¿Elimina anterior a 43? "+
                esInt.eliminaAnteriorA(43));
        System.out.println("5)- Est. resultante: "+esInt.toString());     

        System.out.println("6)- ¿Elimina anterior a -40? "+
                esInt.eliminaAnteriorA(-40));
        System.out.println("7)- Est. resultante: " + esInt.toString());        

        System.out.println("8)- ¿Elimina anterior a 60? "+
                esInt.eliminaAnteriorA(60));
        System.out.println("9)- Est. resultante: " + esInt.toString() +        
                "    size(): " + esInt.size() ); 
        
        //Prueba con una estructura ligada de Personas
        LinkedStruct<Persona> esPers= new LinkedStruct();
        Persona pa, pb, pc, pd;
        pa= new Persona(10,"Mario"); pb= new Persona(20,"Luis");
        pc= new Persona(30,"Armando"); pd= new Persona(40,"Rebeca");
        esPers.add(pa, 1); esPers.add(pb, 2); esPers.add(pc, 3);
        esPers.add(pd, 4);
        System.out.println("\n10)- Est. original Personas" + esPers.toString());

        System.out.println("11)-¿Elimina anterior a Persona(20,Luis)? "+
                esPers.eliminaAnteriorA(pb));
        System.out.println("12)- " + esPers.toString());
        
        System.out.println("13)- ¿Elimina anterior a Persona(20,Luis)? "+
                esPers.eliminaAnteriorA(pb));
        System.out.println("14)- " + esPers.toString());
    }
    
}
