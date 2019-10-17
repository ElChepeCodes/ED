
package interface08y09;

/**
 *
 * @author EDg2
 */
public class Cuadrado extends Quadrilatero {
    private double lado;
    
    //constructor
    public Cuadrado(double lado) {
        this.lado = lado;
    }
    
    // Metodos implementados
    public double calculaArea(){
        return lado*lado;
    }
    
    public double calculaPerim() {
        return 4.0*lado;
    }
    
    @Override
    public String toString() {
        return "Cuadrado{" + "lado=" + lado + '}';
    }
    
    
}
