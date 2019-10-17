//

/**
 * Excepcion de Usuario, Inheriting Exception
 * @author EDg1
 */
public class ExceptionUserInheritMain {

    public static void main(String[] args) {
        System.out.println("\nPRUEBA 1");
        int nu1, nu2;
        ObSu uno;
        nu1 = 6;
        nu2 = -90;
        uno = new ObSu(nu1, nu2);
        System.out.println("El total de la suma es: " + uno.getSu() );
    
        System.out.println("\nPRUEBA 2");
        try {
            uno.CheNe();            
        } catch (Exception e) {
            System.out.println("\nmain() Exception: " + e.toString());
        }
    }
    
}
