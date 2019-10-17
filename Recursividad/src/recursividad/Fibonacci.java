/*
 * Estructuras de datos
 * Autor: Jose Luis Gutierrez Espinosa
 */
package recursividad;

/**
 *
 * @author jlgut
 */
public class Fibonacci {
    
    public static int fibonacci(int num, int r1, int r2){        
        int res=0;
        if (num==1 || num==0)
            res=r1+r2;
        else{
            r2+=r1;
            r1=r2-r1;
            res+=fibonacci(num-1,r1,r2);
        }

        return res;
    }//method
    
}//class
