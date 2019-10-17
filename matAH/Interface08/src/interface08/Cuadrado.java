/*
 * Estructuras de datos
 * Autor: Jose Luis Gutierrez Espinosa
 */
package interface08;

/**
 *
 * @author jlgut
 */
public class Cuadrado extends Cuadrilatero{
    
    private double lado;
    
    public Cuadrado(double l){
        lado=l;
    }//builder
    
    @Override
    public double calculaArea() {
       return lado*lado;
    }//method

    @Override
    public double calculaPerim() {
        return lado*4;
    }
    
    public String toString(){
        return "Cuadrado de lado "+lado+"\nPerimetro: "+calculaPerim()+"\nArea: "+calculaArea();
    }//method
    
}//class
