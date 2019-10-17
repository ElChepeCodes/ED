
package ejerciciosenclase;

/**
 *
 * @author jlgut
 */
public class Rectangulo {
    private double lado1, lado2;
    
    public Rectangulo(){   
    }//builder
    
    public Rectangulo (double l1, double l2){
        if (l1>0 && l2>0)
        lado1=l1; lado2=l2;
    }//builder
    
    public void setLado1(double lado){
        if (lado>0)
        lado1=lado;
    }//set
    
    public void setLado2(double lado){
        if (lado>0)
        lado2=lado; 
    }//set
    
    public double getLado1(){
        return lado1;
    }//get
    
    public double getLado2(){
        return lado2;
    }//get
    

    
    public String toString(){
        return "Lado 1 = "+lado1+"\nLado 2 = "+lado2;
    }//toString
    
    public double calculaArea(){
        return lado1*lado2;
    }//method
    
    public double calculaPerimetro(){
        return (lado1 + lado2)*2;
    }//method

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + (int) (Double.doubleToLongBits(this.lado1) ^ (Double.doubleToLongBits(this.lado1) >>> 32));
        hash = 31 * hash + (int) (Double.doubleToLongBits(this.lado2) ^ (Double.doubleToLongBits(this.lado2) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
       boolean res=true;
        if (this == obj) {
            res=true;
        }
        if (obj == null) {
            res=false;
        }
        if (getClass() != obj.getClass()) {
            res=false;
        }
        final Rectangulo other = (Rectangulo) obj;
        if (Double.doubleToLongBits(this.lado1) != Double.doubleToLongBits(other.lado1)) {
            res=false;
        }
        if (Double.doubleToLongBits(this.lado2) != Double.doubleToLongBits(other.lado2)) {
            res=false;
        }
        return res;
    }
    
    
}//class
