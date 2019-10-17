package TorresDeHanoi;

/**
 * Torres de Hanoi
 * @author EDg1
 */
public class TorresDeHanoi {
    
    /**
     * Metodo Recursivo
     * Mueve los discos de una torre a otra, moviendo una subtorre de
     * n-1 discos, y el disco mayor, entonces se regresa la subtorre.
     * Caso Base de un disco.

 d:  numero de discos a mover
 origen:    la torre origen
 desti:      la torre destino
 aux:      la torre auxiliar
     */
    
    public void mueveDiscosTorres(int d, int origen, int aux, int desti) {
        if( d <= 1 ) {
            pintaTransf("Base", d, origen, aux, desti);
        } else {
            mueveDiscosTorres(d-1, origen, desti, aux);
            pintaTransf("  Rv",d, origen, aux, desti);
            mueveDiscosTorres(d-1, aux, origen, desti);
        }
    }
     
    // Metodo para mostrar las transferencias de discos entre torres
    public static void pintaTransf(String txt, int d, int origen, int aux, int desti) {
        int[] Torres = new int [3];
        int vc;
        Torres[origen] = -d;    Torres[aux] = 0;    Torres[desti] = d;
        System.out.print("  " + txt + "   ");
        for(vc=0; vc<=Torres.length-1; vc=vc+1) {
            System.out.print("T"+vc+"("+Torres[vc]+")    ");
        }
        System.out.println();             
    }

}
