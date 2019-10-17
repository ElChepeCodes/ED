//
package interface08y09;

/**
 * Clase Triangulo que implementa Figuras Geometricas
 * @author EDg2
 */
public class Triangulo implements FigGeometrica{
    // Atributos
    private double lado1, lado2, lado3;    // Lados del triangulo
    
    // Constructor
    public Triangulo(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }
    
    // Metodos implementados
    // Perimetro de un Triangulo
    public double calculaPerim() {
        double perim = lado1 + lado2 + lado3;
        return perim;
    }

    // Area de un Triangulo Escaleno
    public double calculaArea() {
        double sePe, area;  // Semiperimentro y Area
        sePe = calculaPerim()/2;
        area = Math.sqrt(sePe*(sePe-lado1)*(sePe-lado2)*(sePe-lado3) );
        return area;
    }
    
    // Overriding
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Triangulo other = (Triangulo) obj;
        if (this.lado1 != other.lado1) {
            return false;
        }
        if (this.lado2 != other.lado2) {
            return false;
        }
        if (this.lado3 != other.lado3) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return "Triangulo{" + "lado1=" + lado1 + ", lado2=" + lado2 + ", lado3=" + lado3 + '}';
    }
        
}
