//
/**
 * Metodos estaticos, con una excepcion
 * @author EDg1
 */

import java.util.Scanner;

public class miscel {
    private static Scanner keyboard;
    
    public static int zint()
    { 
        int vl=0;
        keyboard = new Scanner(System.in);    // Lectura del valor como String.
        try {
            vl = keyboard.nextInt();    // Conversion a entero int.
        } catch ( Exception e) {
            System.out.println("Exception e.toString(): " + e.toString());            
            System.out.println("zint - error de conversion.\n");   
        }
        return vl;
    }
    
    /* Lectura de un valor boolean desde el teclado(stdin). */
    public static boolean zboolean()
    { 
        boolean vl=false;
        keyboard = new Scanner(System.in);    // Lectura del valor como String.
        try {
            vl = keyboard.nextBoolean();    // Conversion a boolean.
        } catch (Exception e) {
            System.out.println("Exception e.toString(): " + e.toString());            
            System.out.println("zboolean - error\n");
        }
        return vl;
    }
    
    public static int convInt(String s) throws Exception {
        int i;
        i = Integer.parseInt(s);    // Wrapper. Conversion a entero.
        System.out.println("Saliendo de convInt(...)\n");
        return i;
    }
    
}
