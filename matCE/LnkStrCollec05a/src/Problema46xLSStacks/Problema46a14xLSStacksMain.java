package Problema46xLSStacks;
import Stacks.*;

/**
 * Problema 46, Stacks sobre Linked Structures, ejercicio 14 de Pilas.
 * @author EDg1
 */
public class Problema46a14xLSStacksMain {

    public static void main(String[] args) {
        
        //Prueba ej14: Cuenta la cantidad de elementos de una pila genérica.
        LnkStrStack<String> pilaStr= new LnkStrStack();
        pilaStr.push("a1");    pilaStr.push("b1");    pilaStr.push("c1");
      
        System.out.println("\n1)- pilaStr: \n" +
                pilaStr.toString());
        System.out.println("2)- Cant. de elementos de la pila: " +
                ctaElemPila(pilaStr));
        
        pilaStr.push("d2");
        System.out.println("\n3)- pilaStr: \n" +
                pilaStr.toString());
        System.out.println("4)- Cant. de elementos de la pila: " +
                ctaElemPilaRv(pilaStr));

    }

    //Problemas 46y14: Cuenta la cantidad de elementos de una pila generica.
    // Sin emplear .size()
    public static <T> int ctaElemPila (LnkStrStack<T> pila) {
        if( pila == null) {
            throw new ParamErrException(
                    "ctaElemPila: <pila> es null");            
        }
        
        LnkStrStack<T> pilaAux= new LnkStrStack();
        int cant= 0;

        //Cuenta la cantidad de elementos de la pila.
        while (!pila.isEmpty()) {
            pilaAux.push( pila.pop() );
            cant++;
        }

        //Devuelve la pila a su estado original.
        while (!pilaAux.isEmpty()) {
            pila.push( pilaAux.pop() );
        }

        return cant;
    }

    /** Problemas 46y14: cuenta recursivamente la cantidad de elementos
     * de una pila genérica. */
    public static <T> int ctaElemPilaRv(LnkStrStack<T> pila){
        
        if( pila == null ) {
            throw new ParamErrException(
                    "ctaElemPilaRv: <pila> es null");            
        }
        
        LnkStrStack<T> pilaAux = new LnkStrStack();
        int cant = 0;
        cant = ctaElemPilaRv(pila, pilaAux, true);
        
        return cant;
    }
    
    private static <T> int ctaElemPilaRv(LnkStrStack<T> pila,
            LnkStrStack<T> pilaAux, boolean flag){

        int cant = 0;
                
        return cant;
    }    
}
