
package FiboRv;

/**
 * Calculo recursivo del enesimo termino de Fibonacci
 * (0,1) 1, 2, 3, 5, 8, 13, 21, 34 ... 
 * @author EDg1
 */
public class FiboRvMain {

    public static void main(String[] args) {
        int termn;
        System.out.println("Serie de Fibonacci: (0,1) 1, 2, 3, 5, 8, 13, 21, 34 ... ");
        
        termn = fiboiRv(1, 0, 1);
        System.out.println("\nterm 1= " + termn);

        termn = fiboiRv(4, 0, 1);
        System.out.println("\nterm 4= " + termn);

        termn = fiboiRv(7, 0, 1);
        System.out.println("\nterm 7= " + termn);
    }
    
    // Fibonacci recursivo.
    public static int fiboiRv(int m, int f0, int f1) {
        // f0, f1, fs
        int fs;
        if( m <= 1 ) {         // Caso Base
            fs = f0 + f1;
        } else {               // Caso Recursivo
            fs = f0 + f1;
            f0 = f1;
            f1 = fs;
            fs = fiboiRv(m-1, f0, f1);            
        }
        return fs;
    }
    
}
