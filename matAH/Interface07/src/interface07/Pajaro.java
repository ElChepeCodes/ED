//
package interface07;

/**
 * Clase que implementa ObjVolador
 * @author EDg2
 * 01 febrero 2019
 */
public class Pajaro implements ObjVolador {
    // Atributos
    private double extenAlas;   // En metros
    private double largo;   // En metros
    private double alcance;   // En kilometros
    
    // Constructor
    public Pajaro(double extenAlas, double largo, double alcance) {
        this.extenAlas = extenAlas;
        this.largo = largo;
        this.alcance = alcance;
    }
    
    // Metodos implementados
    public void despega() {
        // TODO
    }
    
    public void aterriza() {
        // TODO
    }
    
    public void seDesplaza() {
        // TODO
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
        final Pajaro other = (Pajaro) obj;
        if ( this.extenAlas != other.extenAlas ) {
            return false;
        }
        if ( this.largo != other.largo ) {
            return false;
        }
        if ( this.alcance != other.alcance ) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Pajaro{" + "extenAlas=" + extenAlas
                + ", largo=" + largo + ", alcance=" + alcance + '}';
    }
    

}
