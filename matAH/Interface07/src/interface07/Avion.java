//
package interface07;

/**
 * Clase que implementa ObjVolador
 * @author EDg2
 * 01 febrero 2019
 */
public class Avion implements ObjVolador {
    // Atributos
    private double extenAlas;
    private double largo;
    private double alcance;
    private int totMotores;
    
    // Constructor
    public Avion(double extenAlas, double largo, double alcance, int totMotores) {
        this.extenAlas = extenAlas;
        this.largo = largo;
        this.alcance = alcance;
        this.totMotores = totMotores;
    }
    
    // Metodos implementados
    public void despega() {
        // TODO
    }
    
    public void aterriza() {
        // TODO
    }
    
    public void seDesplaza() {
        
    }
        // TODO

    // Overriding
    
}
