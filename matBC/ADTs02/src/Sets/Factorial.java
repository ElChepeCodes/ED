/*
 * Estructuras de datos
 * Autor: Jose Luis Gutierrez Espinosa
 */
package Sets;

/**
 *
 * @author jlgut
 */
public class Factorial {
    
    public static long factorial(int n){
        long res=0;
        if (n==1 || n==0)
            res=1;
        else
            res=n*factorial(n-1);
        return res;
    }//method
    
    public static void main(String[] args){
        
    }//main
    
}//class
