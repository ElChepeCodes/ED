/*
 * Estructuras de datos
 * Autor: Jose Luis Gutierrez Espinosa
 */
package interface08;

/**
 *
 * @author jlgut
 */
public class Rectangulo extends Cuadrilatero{
    
    private double lado1, lado2;
    
    public Rectangulo(double l1, double l2){
        lado1=l1;
        lado2=l2;
    }//builder
    
    @Override
    public double calculaArea() {
        return lado2*lado1;
    }//method

    @Override
    public double calculaPerim() {
        return (lado1+lado2)*2;
    }//method
    public String toString(){
        return "Rectangulo de lados: "+lado1+", "+lado2+"\nPerimetro: "+calculaPerim()+"\nArea: "+calculaArea();
    }//method
}
