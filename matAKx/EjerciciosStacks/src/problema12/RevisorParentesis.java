/*
 * Clase con metodos para revisar un String expresionStr aritmetica con
 * Parentesis Balanceados, izquierdos ( y derchos ).
 */
package problema12;
import Stacks.*;

/**
 * Clase RevisorParentesis del ejercicio 12
 * E.g. (10+12)*(40+50/2)
 * @author EDg1
 */
public class RevisorParentesis {
    // String donde va la cadena de la expresion
    String expresionStr = "";

    // Constructor
    public RevisorParentesis(String expresion) {
        expresionStr = expresion;
    }

    //Determina si la expresionStr tiene losparéntesis balanceados.
    public boolean parentesisBalan() {
        boolean resp;
        char c; int i,t;
        resp = true;
        i = 0;
        t = expresionStr.length();       //Tamaño de la expresionStr.
        ArrayStack<Character> letras= new ArrayStack();
        //Recorrido de la expresionStr.
        while (i<t && resp==true){
            if (expresionStr.charAt(i)=='(' || expresionStr.charAt(i)==')'){
                if (letras.isEmpty()  ){
                    if (expresionStr.charAt(i)=='(')
                    letras.push('(');
                }else{
                    if (letras.peek()!=expresionStr.charAt(i))
                        letras.push(expresionStr.charAt(i));
                else
                        resp=false;
                }
            }//if
            
            i++;
        }//while
        if (!letras.isEmpty()){
            if (letras.pop()=='(')
                resp=false;
        }//if
        return resp;
    }    
}
