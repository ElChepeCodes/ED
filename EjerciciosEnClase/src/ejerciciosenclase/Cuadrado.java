/*
 * Autor: Jos� Luis Guti�rrez Espinosa
 */
package ejerciciosenclase;

public class Cuadrado {
    private double lado;

    public Cuadrado(){
    }//builder

    public Cuadrado(double l){
      if (l>0)
        lado=l;
    }//builder

    public void setLado(double l){
      if (l>0)
        lado=l;
    }//set

    public double getLado(){
      return lado;
    }//get

    public double calculaArea(){
      return lado*lado;
    }//method

    public double calculaPerimetro(){
      return lado*4;
    }//method

    @Override
    public String toString(){
      return "Lados: "+lado+"\nArea: "+ this.calculaArea()+"\nPerimetro: "+this.calculaPerimetro();
    }//toString

    @Override
    public boolean equals(Object obj) {
        boolean res=true;
        if (this == obj) {
            res=true;
        }
        if (obj == null) {
            res=false;
        }
        if (obj!=null && getClass() != obj.getClass()) {
            res=false;
        }
        final Cuadrado other = (Cuadrado) obj;
        if (Double.doubleToLongBits(this.lado) != Double.doubleToLongBits(other.lado)) {
            res=false;
        }
        return res;
    }
    
    
}//class
