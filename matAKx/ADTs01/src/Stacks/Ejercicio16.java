/*
 * Estructuras de datos
 * Autor: Jose Luis Gutierrez Espinosa
 */
package Stacks;

/**
 *
 * @author jlgut
 */
public class Ejercicio16<T> extends ArrayStack<T>{
    public static <T> ArrayStack<T> invierteStack(ArrayStack<T> sta){
        ArrayStack<T> st= new ArrayStack();
        while(!sta.isEmpty())
            st.push(sta.pop());
        sta=st;
        return sta;
    }//method
}//class
