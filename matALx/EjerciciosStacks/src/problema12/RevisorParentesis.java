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
        ArrayStack<Character> stackChar= new ArrayStack<Character>(40);
        boolean resp;
        char c; int i,t;
        resp = true;
        i = 0;
        t = expresionStr.length();       //Tamaño de la expresionStr.

        //Recorrido de la expresionStr.
        while( (i < t) && resp ) {
            c = expresionStr.charAt(i);
            if( c == '(' )   //Guarda en la pila el '('.
                stackChar.push(c);
            else
                if( c == ')' ) {   //Verifica que en el tope haya '('.
                    if(!stackChar.isEmpty() && stackChar.peek()=='(')
                        stackChar.pop();
                    else
                        resp = false;   // No es '('
                } else
                    c = c; // Se desecha cualquier otro caracter
            i++;
        }
        if( !stackChar.isEmpty() )   //Verifica que no haya más '(' que ')'.
            resp = false;

        return resp;
    }    
}
