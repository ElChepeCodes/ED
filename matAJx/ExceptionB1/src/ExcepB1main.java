
/**
 * Handle locally, in place
 * Excepciones Aritmeticas
 * @author EDg1
 */

public class ExcepB1main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nu, de;
        nu = 300;   de = 0;
        try{
            System.out.println("Division 1: " + (nu / de) );            
        } catch (Exception e) {
            System.out.println("Exception e.toString(): " + e.toString());
            System.out.println("CONTINUO vivo.\n");
        }

        de = -2;
        System.out.println("Division 2: " + (nu / de) );
    }
    
}