//
package interface07;

/**
 * Ejercio 07 de Interface con dos clases derivadas.
 * @author EDg2
 * 01 febrero 2019
 */
public class Main07 {

    public static void main(String[] args) {
        // TODO code application logic here
        Pajaro p;
        Avion a;
        
        p = new Pajaro(0.6, 0.5, 2.0);
        System.out.println("Pajaro: " + p.toString());
        
        a = new Avion(6.0, 6.5, 10.0, 1);
        System.out.println("Avion: " + a.toString());
        
        // Ejemplos de uso de los incisos a), b), c) y d).
    }    
}
