/*
 * Autor: Jos� Luis Guti�rrez Espinosa
 */
package ejerciciosenclase;

public class Restaurante {
    private String nombre;
    private int numMesas;
    private final int MAX_MESAS= 25;
    private Cuadrado[] mesas;

    public Restaurante(String nom){
      nombre=nom;
      numMesas=0;
      mesas= new Cuadrado[MAX_MESAS];
    }//builder

    public boolean altaMesa(double lado){
      boolean res=false;
      if (lado>0 && numMesas<MAX_MESAS){
        mesas[numMesas]= new Cuadrado(lado);
        numMesas++;
        res=true;
      }//if
      return res;
    }//method

    public double calculaPerimetroTotal(){
      return mesas[0].calculaPerimetro()*numMesas;
    }//method

    public double calculaAreaTotal(){
      return mesas[0].calculaArea()*numMesas;
    }//method



}//class
