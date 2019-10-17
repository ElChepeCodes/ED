
/*
 * Autor: José Luis Gutiérrez Espinosa
 */
package ejerciciosenclase;

public class ComplejoVacacional {
    private String nombre;
    private int numAlb;
    private final int MAX_ALB=10;
    private Rectangulo [] albercas;

    public ComplejoVacacional (String nom, int Alb, double l1, double l2){
        if (Alb>0 && Alb<=MAX_ALB){
            nombre=nom;
            numAlb=Alb;
            albercas = new Rectangulo [Alb];
            for (int i=0; i<Alb; i++)
                albercas[i]= new Rectangulo(l1,l2);
        }//if
    }//builder

    public ComplejoVacacional (String nom){
        nombre=nom;
        numAlb=0;
        albercas=new Rectangulo[MAX_ALB];
    }//builder

    public boolean altaAlberca(double l1, double l2){
      boolean res = false;
      if (numAlb<MAX_ALB){
        albercas[numAlb]= new Rectangulo (l1,l2);
        numAlb++;
        res= true;
      }//if
      return res;
    }//method

    public double calculaAreaLonasDiferentes(){
      double res=0;
      for (int i=0; i<numAlb; i++){
        res+=albercas[i].calculaArea();
      }//for
      return res;
    }//method

    public double CalculaPerimetroCercasDiferentes(){
      double res=0;
      for (int i=0; i<numAlb; i++){
        res+=albercas[i].calculaPerimetro();
      }//for
      return res;
    }//method

    public double CalculaAreaLonasIguales(){
        return numAlb*albercas[0].getLado1()*albercas[0].getLado2();
    }//method

    public double CalculaPerimetroCercasIguales(){
        return numAlb*2*(albercas[0].getLado1()+albercas[0].getLado2());
    }//method
   /* public static void main (String[] args){
      ComplejoVacacional comVa = new ComplejoVacacional("Nuevo Vallarta");
      comVa.altaAlberca(100,502);
      System.out.println("Metros cuadrados de lona: "+ comVa.calculaAreaLonasDiferentes());
    }//main
*/
}//class
