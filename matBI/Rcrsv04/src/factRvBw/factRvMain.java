
package factRvBw;

/**
 * Factorial de un entero largo, recursivo, backwards
 * @author JRIOSS
 */
public class factRvMain {

    public static void main(String[] args) {
        // n!  Factorial de n, con n >= 0
        long n, rfact;
        
        n = 5;
        rfact = factRvbl(n);
        System.out.println("Fact(" + n + ") = " + rfact);
    }
    
    // Metodo factorial recursivo, Backwards, con enteros
    public static long factRvbl( long n ) {
        long fact;
        if( n <= 1 ) {
            // Caso o casos base
            fact = 1;
        } else {
            // Caso o casos recursivos: n > 1
            fact = factRvbl( n-1 ) * n;
        }
        
        System.out.println("    factRvbl, parcial: de " + n +" es " +fact);
        return fact;
    }
    
}
