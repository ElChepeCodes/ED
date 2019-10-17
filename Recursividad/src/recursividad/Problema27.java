/*
 * Estructuras de datos
 * Autor: Jose Luis Gutierrez Espinosa
 */
package recursividad;

/**
 *
 * @author jlgut
 */
public class Problema27 {
    
    public static int sumaArr(int [] arr, int longi){
        int sum=0;
        if (longi==1)
            sum+=arr[0];
        else
            sum+=arr[longi-1]+sumaArr(arr, longi-1);
        
        
        return sum;
    }//method
    
}//class
