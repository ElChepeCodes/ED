/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comvaalbercas01;

/**
 *
 * @author estructuras00
 */
public class ComVaAlbercas01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Rectangulo alber1, alber2, alber3;
        boolean ig1, ig2, bo1, bo2;
        
        //Instanciar objetos Rectangulo
        alber1 = new Rectangulo(12, 25);
        alber2 = new Rectangulo(20, 50);
        alber3 = new Rectangulo(12, 25);
        
        System.out.println("alber1:: " + alber1);
        
        ig1 = alber1.equals(alber2);
        System.out.println("\n¿son iguales alber1 y alber2: " + ig1);
        
        // Complejo Vacacional
        ComplejoVacacional comVa;
        comVa = new ComplejoVacacional("Nuevo Vallarta");
        bo1 = comVa.altaAlberca(alber1);
        if(bo1) {
            System.out.println("Alta de alber1 exitosa");
        } else {
            System.out.println("Alta de alber1 fallida");
        }
        
        bo2 = comVa.altaAlberca(alber2);
        
        System.out.println("\nMetros cuadrados de Lona: " + 
                comVa.totalLona());
            
        
    }
    
}
