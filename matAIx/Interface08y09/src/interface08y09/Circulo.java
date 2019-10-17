//
package interface08y09;

/**
 * Clase Circulo que implementa Figuras Geometricas
 * @author EDg2
 */
public class Circulo implements FigGeometrica{
    // Atributos
    private double radio;
    
    // Constructor
    public Circulo(double radio) {
        this.radio = radio;
    }

    // Getter, por inciso 9.4)
    public double getRadio() {
        return radio;
    }
       
    // Metodos implementados
    // Perimetro de un Circulo
    public double calculaPerim() {
        double perim = 2.0 * Math.PI * radio;
        return perim;
    }

    // Area de un Circulo
    public double calculaArea() {
        double area;
        area = Math.PI * radio * radio;
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
        final Circulo other = (Circulo) obj;
        if (Double.doubleToLongBits(this.radio) != Double.doubleToLongBits(other.radio)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + '}';
    }
    
}
