/*
 * Autor: Jos� Luis Guti�rrez Espinosa
 */
package ejerciciosenclase;

abstract class Empleado {
    private static int serie=100;
    private int claveEmpleado;
    private String nombreEmpleado;
    private double sueldoBase;
    
    public Empleado(int clave){
        claveEmpleado=clave;
    }//builder
    
    public Empleado(String nom, double sueldo){
        nombreEmpleado=nom;
        sueldoBase=sueldo;
        claveEmpleado=serie;
        serie++;
    }//builder
    
    
    public double getSueldoBase(){
        return sueldoBase;
    }//get
    
    public String getNombreEmpleado(){
        return nombreEmpleado;
    }//get
    
    public void aumentoSueldo(double aumento){
    sueldoBase+=aumento;    
    }//method
    
    public int getClave(){
        return claveEmpleado;
    }//get
    
    public String toString(){
        return "Nombre: "+nombreEmpleado+"\nClave: "+claveEmpleado+"\nSueldo base: "+sueldoBase;
    }//toString
    
    public boolean equals(Empleado otro){
        return claveEmpleado==otro.claveEmpleado;
    }//equals
    
    abstract double calculaSalario(double prestac, double deduc);
        
}//class
