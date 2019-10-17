/*
 * Estructuras de datos
 * Autor: Jose Luis Gutierrez Espinosa
 */
package recursividad;

/**
 *
 * @author jlgut
 */
public class Recursividad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Problema 28:");
        int[] arr={101,202,303,404};
        System.out.println(Problema28.derechaIzquierda(arr, 4));
        System.out.println(Problema28.izquierdaDerecha(arr, 4));
        System.out.println("Problema 27:");
        System.out.println(Problema27.sumaArr(arr, 4));
        System.out.println("Fibonacci:");
        System.out.println(Fibonacci.fibonacci(2, 0, 1));
    }//main
    
}//class
