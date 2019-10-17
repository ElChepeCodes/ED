/*
 * Estructuras de datos
 * Autor: Jose Luis Gutierrez Espinosa
 */
package Stacks;

/**
 *
 * @author jlgut
 */
public class Ejercicio20 {
    
    public static String transformaBinario(int num){
        ArrayStack<Integer> bin=new ArrayStack();
        do{
            bin.push(num%2);
            num/=2;
        }//do
        while(num/2>0);
        
        return bin.toString();
    }//method
    
    
}//class
