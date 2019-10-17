/*
 * Estructuras de datos
 * Autor: Jose Luis Gutierrez Espinosa
 */
package Stacks;

public class Ejercicio13 {
    public static String volteaCadena(String cad){
        
        StringBuilder res= new StringBuilder();
        
        ArrayStack <Character> letras =  new ArrayStack();
        
        for (int i=0;i<cad.length();i++){
            
            letras.push(cad.charAt(i));
            
        }
        while (!letras.isEmpty()){
            res.append(letras.pop());
        
        }//while
        return res.toString();
    }//method
    
    
    
}//class
