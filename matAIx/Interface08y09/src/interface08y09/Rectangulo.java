
package interface08y09;

/**
 *
 * @author EDg2
 */
public class Rectangulo extends Quadrilatero {
    // Constructor
    private double lado1, lado2;
    
    public Rectangulo(double lado1, double lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    // Metodos implementados
    public double calculaArea(){
        return lado1*lado2;
    }
    
    public double calculaPerim() {
        return 2.0*(lado1 + lado2);
    }    

    @Override
    public String toString() {
        return "Rectangulo{" + "lado1=" + lado1 + ", lado2=" + lado2 + '}';
    }
    
    
}
