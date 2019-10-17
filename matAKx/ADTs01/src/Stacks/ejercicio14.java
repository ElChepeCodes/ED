/*
 * Estructuras de datos
 * Autor: Jose Luis Gutierrez Espinosa
 */
package Stacks;

/**
 *
 * @author jlgut
 */
public class ejercicio14<T> extends ArrayStack<T>{

    /**
     *
     * @param <T>
     * @param stack
     * @return
     */
    public static <T> int cuentaElem(ArrayStack<T> sta){
     int res=0;
     ArrayStack<T> st= new ArrayStack();
     while (!sta.isEmpty()){
         st.push(sta.pop());
         res++;
     }
     while(!st.isEmpty())
         sta.push(st.pop());
     return res;
    }//method
}//class