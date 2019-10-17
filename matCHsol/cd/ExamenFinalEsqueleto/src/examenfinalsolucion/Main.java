/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenfinalsolucion;

/**
 *
 * @author ZVIX0
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Pruebas diseñadas para el Problema de Programación 1:");
        // Prueba #0:
        ListaDesordenada<Character> lista0=new ListaDesordenada();
        lista0.addToFront(new Character('T'));
        lista0.addToFront(new Character('E'));
        lista0.addToFront(new Character('A'));
        lista0.addToFront(new Character('N'));
        lista0.addToFront(new Character('E'));
        lista0.addToFront(new Character('F'));
        lista0.addToFront(new Character('E'));
        lista0.addToFront(new Character('L'));

        // Deberíia imprimir: L, E, F, E, N, A, E, T:
        System.out.print(lista0);
        lista0.intercambiaPorPares();
        // Debería imprimir: E, L, E, F, A, N, T, E:
        System.out.println(lista0);
        
        // Prueba #1:
        ListaDesordenada<Persona> lista1=new ListaDesordenada();
        lista1.addToFront(new Persona("Isabel", 34));
        lista1.addToFront(new Persona("Hermenegildo",8));
        lista1.addToFront(new Persona("Beatriz",17));
        lista1.addToFront(new Persona("Susana",1));
        lista1.addToFront(new Persona("Juan",78));

        // Debería imprimir: Juan, Susana, Beatriz, Hermenegildo, Isabel:
        System.out.print(lista1);
        lista1.intercambiaPorPares();
        // Debería imprimmir Susana, Juan, Hermenegildo, Beatriz, Isabel:
        System.out.println(lista1);
        
        // Prueba #2:
        ListaDesordenada<Character> lista2=new ListaDesordenada();
        lista2.addToFront(new Character('A'));

        // Debería imprimir: A:
        System.out.print(lista2);
        lista2.intercambiaPorPares();
        // Debería imprimir: A:
        System.out.println(lista2);
        
        // Prueba #3:
        ListaDesordenada<Character> lista3=new ListaDesordenada();
        lista3.addToFront(new Character('C'));
        lista3.addToFront(new Character('B'));
        lista3.addToFront(new Character('A'));

        // Debería imprimir: A, B, C:
        System.out.print(lista3);
        lista3.intercambiaPorPares();
        // Debería imprimir: B, A, C:
        System.out.println(lista3);
        
        // Prueba #4:
        ListaDesordenada<Character> lista4=new ListaDesordenada();
        
        // Debería imprimir: (lista vacía):
        System.out.print(lista4);
        lista4.intercambiaPorPares();
        // Debería imprimir: (lista vacía):
        System.out.println(lista4);
        
        System.out.println("Pruebas diseñadas para el Problema de Programación 2:");
        // Prueba #5:
        ListaDesordenada<Character> lista5=new ListaDesordenada();
        lista5.addToFront(new Character('D'));
        lista5.addToFront(new Character('C'));
        lista5.addToFront(new Character('B'));
        lista5.addToFront(new Character('A'));
        
        // Debería imprimir: A, B, C, D:
        System.out.print(lista5);
        lista5.eliminaNesimoDesdeElfinal(0);
        // Debería imprimir: A, B, C:
        System.out.println(lista5);
        
        // Prueba #6:
        lista5=new ListaDesordenada();
        lista5.addToFront(new Character('D'));
        lista5.addToFront(new Character('C'));
        lista5.addToFront(new Character('B'));
        lista5.addToFront(new Character('A'));
        
        // Debería imprimir: A, B, C, D:
        System.out.print(lista5);
        lista5.eliminaNesimoDesdeElfinal(2);
        // Debería imprimir: A, C, D:
        System.out.println(lista5);        

        // Prueba #7:
        lista5=new ListaDesordenada();
        lista5.addToFront(new Character('D'));
        lista5.addToFront(new Character('C'));
        lista5.addToFront(new Character('B'));
        lista5.addToFront(new Character('A'));
        
        // Debería imprimir: A, B, C, D:
        System.out.print(lista5);
        lista5.eliminaNesimoDesdeElfinal(3);
        // Debería imprimir: B, C, D:
        System.out.println(lista5);
 
        // Prueba #8:
        lista5=new ListaDesordenada();
        lista5.addToFront(new Character('D'));
        lista5.addToFront(new Character('C'));
        lista5.addToFront(new Character('B'));
        lista5.addToFront(new Character('A'));
        
        // Debería imprimir: A, B, C, D:
        System.out.print(lista5);
        lista5.eliminaNesimoDesdeElfinal(50);
        // Debería imprimir: A, B, C, D:
        System.out.println(lista5);
 
        // Prueba #9:
        lista5=new ListaDesordenada();
        lista5.addToFront(new Character('D'));
        lista5.addToFront(new Character('C'));
        lista5.addToFront(new Character('B'));
        lista5.addToFront(new Character('A'));

        // Debería imprimir: A, B, C, D:
        System.out.print(lista5);
        lista5.eliminaNesimoDesdeElfinal(-16);
        // Debería imprimir: A, B, C, D:
        System.out.println(lista5);
        
        // Prueba #10:
        lista5=new ListaDesordenada();
        
        // Debería imprimir: (lista vacía):
        System.out.print(lista5);
        lista5.eliminaNesimoDesdeElfinal(8);
        // Debería imprimir: (lista vacía):
        System.out.println(lista5);
    }
}
