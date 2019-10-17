/*
 * Clase con metodos para revisar un String expresionStr aritmetica con
 * Parentesis Balanceados, izquierdos ( y derchos ).
 */
package precalc;
import Stacks.*;

/**
 * Clase RevisorParentesis2oper del ejercicio 12
 E.g. (10+12)*(40+50/2)
 * @author EDg1
 */
public class RevisorParentesis2oper {
    // String donde va la cadena de la expresion
    String [] expresionStr = null;

    // Constructor
    public RevisorParentesis2oper(String [] expresion) {
        expresionStr = expresion;
    }

    //Determina si la expresionStr tiene losparéntesis balanceados.
    public boolean parentesisBalan() {
        ArrayStack<Character> stackChar= new ArrayStack<Character>(40);
        boolean resp;
        char c; int i,t, ant;
        resp = true;
        i = 0;
        t = expresionStr.length;       //Tamaño de la expresionStr.
        ant = -11;  // Para operadores dobles
        
        //Recorrido de la expresionStr.
        while( (i < t) && resp ) {
            c = expresionStr[i].charAt(0);
            if( c == '(' ) {  //Guarda en la pila el '('.
                stackChar.push(c);
            } else
                if( c == ')' ) {   //Verifica que en el tope haya '('.
                    if(!stackChar.isEmpty() && (stackChar.peek() == '(') ) {
                        stackChar.pop();                        
                    } else {
                        resp = false;   // No hay '('
                    }  
                } else {
                    if( isOperator(c) ) {
                        if( ant == i-1 ) {
                            resp = false;
                        } else {
                            ant = i;
                        }
                    } else {
                        ant = -11;
                    }
                }
                
                // Se desecha cualquier otro caracter
            i++;
        }
        while( !stackChar.isEmpty() ) {  // Quita lo restante.
            stackChar.pop();
            resp = false;
        }

        return resp;
    }    
    /**
    * Determina si el caracter especificado es un operador.
    * Regresa verdadero, si lo es; falso, en caso contrario.
    */
    private boolean isOperator (char ch) {
          boolean b;
          b = (ch == '+') || (ch == '-') ||
                  (ch == '*') || (ch == '/');          
        return b;
    }
}
