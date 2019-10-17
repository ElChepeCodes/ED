package ctaImpArriRv;

/**
 * Cuenta recursiva de impares enteros en un arreglo
 * @author EDg1
 */
public class ctaImpArriRVMain {

    public static void main(String[] args) {
        int arr1[] = {-103, 204, -50, 61, -17};
        int nimp = ctaImpArriRv( arr1, arr1.length-1);
        System.out.println("\n1) nimp= " + nimp);
        
        int arr2[] = {-103, 203, -51, 61, -17};
        nimp = ctaImpArriRv( arr2, arr2.length-1);
        System.out.println("\n2) nimp= " + nimp);
        
        int arr3[] = {-102, 204, -50, 62, -18};
        nimp = ctaImpArriRv( arr3, arr3.length-1);
        System.out.println("\n3) nimp= " + nimp);
    }
    
    // Cuenta recursiva de impares, de un arreglo
    public static int ctaImpArriRv(int [] arr, int im) {
        int cta = -1;
        if( im < 0) {             // Caso Base
            cta = 0;
        } else {             // Caso Recursivo
            cta = ctaImpArriRv(arr, im-1);
            if( Math.abs(arr[im])%2 == 1 ) {
                cta = cta + 1;
            }
        }
        return cta;
    }
    
}
