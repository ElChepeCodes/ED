/*
 * Autor: Jos� Luis Guti�rrez Espinosa
 */
package ejerciciosenclase;

public class Administrativo extends Empleado {
    private String departamento, telefono;
    
    public Administrativo(String nom, double salario, String depa, String tele){
        super(nom, salario);
        departamento=depa;
        telefono=tele;
    }//builder
    public Administrativo(int clav){
        super(clav);
    }//builder
    
    public void cambiaDepartamento(String depa){
        departamento=depa;
    }//method
    
    public String toString(){
        return "Nombre: "+this.getNombreEmpleado()+"\nClave: "+this.getClave()+"\nSueldo Base: "+this.getSueldoBase()+"\nDepartamento: "+departamento+"\nTelefono. "+telefono;
    }//toString
    
    public double calculaSalario(double prestac, double deduc){
        return this.getSueldoBase()*(1+prestac-deduc);
    }//method
}//class
