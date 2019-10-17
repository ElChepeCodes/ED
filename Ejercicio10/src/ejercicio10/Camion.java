/*
 * Estructuras de datos
 * Autor: Jose Luis Gutierrez Espinosa
 */
package ejercicio10;

public abstract class Camion {
    
    private String marca, numMotor, placas;
    
    public Camion (String mar, String num, String pla){
        marca=mar;
        numMotor=num;
        placas=pla;
    }//builder
    
    
    
    public abstract String toString();
    
    public String getPlacas(){
        return placas;
    }//getter
    
    public String getMarca(){
        return marca;
    }
    public String getNumMotor(){
        return numMotor;
    }//getter
    
    public boolean equals(Camion otro){
        return placas.equals(otro.getPlacas());
    }//equals
    
    
}//class
