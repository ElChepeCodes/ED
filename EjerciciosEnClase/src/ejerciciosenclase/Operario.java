/*
 * Autor: Jos� Luis Guti�rrez Espinosa
 */
package ejerciciosenclase;

public class Operario extends Empleado{
    private int horasExtras;
    
    public Operario(String nom, double sueldo, int horas){
        super(nom, sueldo);
        horasExtras=horas;       
    }//builder
    
        public Operario(int clav){
        super(clav);
    }//builder
    
    public double calculaSalario(double prestac, double deduc, double pagoHora){
        double tot=this.getSueldoBase();
        tot+=tot*prestac/100;
        tot+=horasExtras*pagoHora;
        tot-=tot*deduc/100;
        return tot;
        
    }//method
    
    public double calculaSalario(double prestac, double deduc){
        return this.getSueldoBase()*(1+prestac-deduc);
    }//method
    
    public String toString(){
        return "Nombre: "+this.getNombreEmpleado()+"\nClave: "+this.getClave()+"\nSueldo Base: "+this.getSueldoBase()+"\nHoras extras: "+horasExtras;
    }//toString
}//class
