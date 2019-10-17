package problema27Rv;

/**
 * Problema 27, suma de los elementos enteros de un vector
 * @author EDg1
 */
public class problema27RvMain {

    public static void main(String[] args) {
        int arri [] = {101, 202, 303, 404, 505};
        int total = sumaVeciRv(arri, arri.length-1);
        System.out.println("total suma arri= " + total + "\n");
    }
    
    // Suma de los enteros de un vector, ascendente, recursivo (Backwards)
    public static int sumaVeciRv(int [] Vi, int vc) {
        int sum;
        if( vc < 1 ) {  // una vuelta de mas con vc < 0
            // Caso o casos base
            sum = Vi[0];  //= 0;
        } else {
            // Caso o casos recursivos, vc >= 0
            sum = sumaVeciRv(Vi, vc-1) + Vi[vc];
        }
        // BACKWARDS
        System.out.println("    sumaVeciRv, parcial: " + sum);
        return sum;
    }            
    
}
