/*
 * Estructuras de datos
 * Autor: Jose Luis Gutierrez Espinosa
 */
package ejercicio10;
public class DeVolteo extends Camion{
    private double capacidadTon;
    
    public DeVolteo(String mar, String num, String pla, double capa){
        super(mar, num, pla);
        capacidadTon=capa;
    }//builder
    
    public void setCap(double capa){
        capacidadTon=capa;
    }//setter
    
    public double getCap(){
        return capacidadTon;
    }//getter
    
    @Override
    public String toString(){
        return "Marca: "+this.getMarca()+"\nNumero de motor: "+this.getNumMotor()+"\nPlacas: "+this.getPlacas()+"\nCapacidad de toneladas: "+capacidadTon;
    }//toString
    
}//class
