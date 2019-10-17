package problemas28aybRv;

/**
 * Problemaa 28a y 28b
 * @author EDg1
 */
public class problemas28aybRvMain {

    public static void main(String[] args) {
        int vc, n;
        int Veci [] = {101, 202, 303, 404, 505};
        
        // Imprimiendo de izq a der, indices 0..n-1
        System.out.print("IzDe: [");
        impVeciRvIzDe(Veci, Veci.length-1);
        System.out.println("]");

        // Imprimiendo de der a izq, indices n-1..0
        System.out.print("\nDeIz: [");
        impVeciRvDeIz(Veci, Veci.length-1);
        System.out.println("]");
    }
    
    // Impresion izquierda a derecha, recursivo (Backwards)
    public static void impVeciRvIzDe(int [] Vi, int vc) {   
        if( vc < 1 ) {
            // Caso o casos base
            System.out.print( Vi[0] + " ");
        } else {
            // Caso o casos recursivos, vc >= 0
            impVeciRvIzDe(Vi, vc-1);
            System.out.print( Vi[vc] + " ");
        }
        // BACKWARDS
    }        

    // Impresion izquierda a derecha, recursibo (Forwards)
    public static void impVeciRvDeIz(int [] Vi, int vc) {   
        // FORWARDS
        if( vc < 1 ) {
            // Caso o casos base
            System.out.print( Vi[0] + " ");
        } else {
            // Caso o casos recursivos, vc >= 0
            System.out.print( Vi[vc] + " ");
            impVeciRvDeIz(Vi, vc-1);
        }
    }        
    
}
