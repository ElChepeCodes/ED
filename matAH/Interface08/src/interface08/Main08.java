/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interface08;

/**
 * Clase principal del ejercicio 08 sobre Interface
 * @author EDg2
 * 01 febrero 2019
 */
public class Main08 {

    public static void main(String[] args) {
        Triangulo tri;
        Circulo cir;
        
        tri = new Triangulo(6, 5, 7);
        System.out.println("\nPerimetro y Area de un Triangulo:\n"
                + tri.calculaPerim() + ",  " + tri.calculaArea());
        System.out.println("\nInfo del Triangulo: " + tri);
        
        cir = new Circulo(10);
        System.out.println("\nPerimetro y Area de un Circulo:\n"
                + cir.calculaPerim() + ",  " + cir.calculaArea());
        System.out.println("\nInfo del Triangulo: " + cir);        
    }
    
}
