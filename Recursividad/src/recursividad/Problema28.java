/*
 * Estructuras de datos
 * Autor: Jose Luis Gutierrez Espinosa
 */
package recursividad;

/**
 *
 * @author jlgut
 */
public class Problema28 {
    
    public static String derechaIzquierda(int[] arr, int longi){
        StringBuilder res= new StringBuilder();
        System.out.println(""+longi);
        if (longi>1){            
            res.append(arr[longi-1]+", "+derechaIzquierda(arr, longi-1));
        }//if
        else
            res.append(arr[0]);
            
        return res.toString();
    }//method
    
        public static String izquierdaDerecha(int[] arr, int longi){
        StringBuilder res= new StringBuilder();
        System.out.println(""+longi);
        if (longi>1){            
            res.append(izquierdaDerecha(arr, longi-1)+", "+arr[longi-1]);
        }//if
        else
            res.append(arr[0]);
            
        return res.toString();
    }//method
    
}//class
