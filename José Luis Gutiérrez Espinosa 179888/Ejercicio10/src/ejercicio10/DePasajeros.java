/*
 * Estructuras de datos
 * Autor: Jose Luis Gutierrez Espinosa
 */
package ejercicio10;
public class DePasajeros extends Camion{
    private int totalPas;
    
    public DePasajeros(String mar, String num, String pla, int totPa){
        super(mar,num,pla);
        totalPas=totPa;
    }//builder
    
    public int getPasajeros(){
    return totalPas;
    }//getter
    
    @Override
    public String toString() {
        return "Marca: "+this.getMarca()+"\nNumero de motor: "+this.getNumMotor()+"\nPlacas: "+this.getPlacas()+"\nTotal de pasajeros: "+totalPas;
    }//toString
    
}//class
