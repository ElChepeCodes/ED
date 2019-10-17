/*
 * Estructuras de datos
 * Autor: Jose Luis Gutierrez Espinosa
 */
package recursividad;

/**
 *
 * @author jlgut
 */
public class ArregloGenerico {
    
    	public static <T> int buscaSecuencial(T [] arre, int tA, T dato) {
		int i=0;
		while (i< tA && !arre[i].equals(dato)) 
			i++;
		if (i==tA)
			i=-1;
		return i;
	}//method
        
	public static <T> String toString(T[] arre,int tot) {
		StringBuilder res = new StringBuilder();
		for(int i=0;i<tot;i++) 
			res.append(arre[i]).append(" ");
		return res.toString();
	}//method        
    
	public static <T extends Comparable <T>> int buscaBin(T [] arre, int tA, T dato) {
		int izq=0, der=tA-1, cen=der/2;
		while (izq<=der && !arre[cen].equals(dato)) {
			if (dato.compareTo(arre[cen])<0)
				der=cen-1;
			else
				izq=cen+1;
			cen=(izq + der)/2;
		}//while
		if (izq>der)
			cen=(izq+1)*-1;
		return cen;
	}//method        
}//class
