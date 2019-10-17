
package finaleddiciembre2012;

import java.util.*;

/**
 * 18-12-2012
 * @author COMPLETAR
 */
public class Main {

//DEBE ESCRIBIR EL MÉTODO QUE SE PIDE.



    public static void main(String[] args) {

        /* Caso de prueba 1: los 3 conjuntos están vacíos.
         * Debe regresar true
         */
        ConjuntoADT <String> cI1 = new ConjuntoArreglo<String> ();
        ConjuntoADT <String> c1 = new ConjuntoArreglo<String> ();
        ConjuntoADT <String> c2 = new ConjuntoArreglo<String> ();
        System.out.println("CP 1: " + esIntersección(cI1, c1, c2));

        /* Caso de prueba 2: el conj. intersección está vacío,
         * uno de los conjuntos de entrada está vacío y el otro tiene
         * elementos. Debe regresar true
         */
        c2.agrega("lunes");
        c2.agrega("martes");
        System.out.println("CP 2: " + esIntersección(cI1, c1, c2));

        /* Caso de prueba 3: el conj. intersección está vacío,
         * y los 2 conjuntos de entrada tienen elementos.
         * Debe regresar true
         */
        c1.agrega("enero");
        c1.agrega("febrero");
        System.out.println("CP 3: " + esIntersección(cI1, c1, c2));

        /* Caso de prueba 4: el conj. intersección tiene elementos,
         * y los 2 conjuntos de entrada están vacíos.
         * Debe regresar false
         */
        cI1.agrega("uno");
        cI1.agrega("dos");
        ConjuntoADT <String> c3 = new ConjuntoArreglo<String> ();
        ConjuntoADT <String> c4 = new ConjuntoArreglo<String> ();
        System.out.println("CP 4: " + esIntersección(cI1, c3, c4));

        /* Caso de prueba 5: los 3 conjuntos tienen elementos, pero
         * los elementos del conj. intersección no están en ninguno de los otros
         * dos conjuntos. Debe regresar false
         */
        System.out.println("CP 5: " + esIntersección(cI1, c1, c2));

        /* Caso de prueba 6: los 3 conjuntos tienen elementos, pero
         * los elementos del conj. intersección están en el primer conjunto
         * de entrada, pero no en el segundo. Debe regresar false
         */
        c1.agrega("uno");
        c1.agrega("dos");
        System.out.println("CP 6: " + esIntersección(cI1, c1, c2));

        /* Caso de prueba 7: los 3 conjuntos tienen elementos, pero
         * los elementos del conj. intersección están en el segundo conjunto
         * de entrada, pero no en el primero. Debe regresar false
         */
        System.out.println("CP 7: " + esIntersección(cI1, c2, c1));

        /* Caso de prueba 8: los 3 conjuntos tienen elementos, y
         * los elementos del conj. intersección están en los 2 conjuntos
         * de entrada. Debe regresar true
         */
        c2.agrega("uno");
        c2.agrega("dos");
        System.out.println("CP 8: " + esIntersección(cI1, c1, c2));

        /* Caso de prueba 9: uno (o más) de los 3 conjuntos no está instanciado.
         * Debe regresar false
         */
        ConjuntoADT <String> cI2 = null;
        System.out.println("CP 9: " + esIntersección(cI2, c1, c2));

        /* Caso de prueba 10: uno (o más) de los 3 conjuntos tiene elementos de
         * distintos tipos, con respecto a los otros conjuntos.
         * Debe regresar false
         */
        ConjuntoADT cI3 = new ConjuntoArreglo();
        cI3.agrega(new Rectangle(2.5, 6.1));
        cI3.agrega(new Rectangle(3.5, 4.8));
        System.out.println("CP 10: " + esIntersección(cI3, c1, c2));

        /* Caso de prueba 11: uno (o más) de los 3 conjuntos tiene elementos de
         * distintos tipos, mezclados.
         * Debe regresar false
         */
        ConjuntoADT c5 = new ConjuntoArreglo();
        c5.agrega(new Rectangle(2.5, 6.1));
        c5.agrega(new Circle(3.5));
        c5.agrega(new Circle(8.2));
        System.out.println("CP 11: " + esIntersección(cI3, c1, c5));
    }

public static <T> boolean esIntersección(ConjuntoADT<T> cI, ConjuntoADT<T> cA,
        ConjuntoADT<T> cB) {
    boolean res;
    if (cA==null || cB==null || cI==null)
        res=false;
    else{
        Iterator itCI=cI.iterator();
        res=esInterseccion(itCI, cA, cB);
    }//else
    return res;
}//method

public static <T> boolean esInterseccion(Iterator it, ConjuntoADT<T> cA, ConjuntoADT<T> cB){
    boolean res;
    if (it.hasNext()){
        T element=(T)it.next();
        if (cA.contiene(element) && cB.contiene(element)){
            cA.remove(element);
            cB.remove(element);
            res=esInterseccion(it,cA,cB);
        }//if
        else
            res=false;
    }
    else{
        res=esInterseccion(cA,cB);
    }//else
    return res;
}//method

public static <T> boolean esInterseccion(ConjuntoADT<T> cA, ConjuntoADT<T> cB){
    boolean res=true;
    if (!cA.estáVacío() && !cB.estáVacío()){
        T aux=cA.removeRandom();
        if (cB.contiene(aux))
            res=false;
        else
            res=esInterseccion(cA,cB);
    }//if
    else
        res=true;
    
    return res;
}
    
}
