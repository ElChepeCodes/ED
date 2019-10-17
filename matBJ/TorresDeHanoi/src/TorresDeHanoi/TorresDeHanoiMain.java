package TorresDeHanoi;
import java.util.Scanner;

/**
 * Torres de Hanoi
 * @author EDg1
 */
public class TorresDeHanoiMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int discos;
        System.out.print("No. de discos: ");
        discos = teclado.nextInt();
        
        TorresDeHanoi tdh = new TorresDeHanoi();
        // Movimiento de discos, con torres origen 0, destino 2, y auxiliar 1.
        tdh.mueveDiscosTorres(discos, 0, 1, 2);
        
        System.out.println("ADIOS.");
    }
}
