/*
 * Autor: Jos� Luis Guti�rrez Espinosa
 */
package ejerciciosenclase;

public class Alumno {
    private static int serie=100;
    private int claveUnica, totalCalif;
    private String nombreAlum;
    private double[] calificaciones;
    
    public Alumno (){
        this("vacio");
    }//builder
    
    public Alumno(String nom){
        claveUnica=  serie;
        serie++;
        nombreAlum=nom;
        calificaciones=new double [20];
        totalCalif=0;
    }//builder
    
    public String getNombre(){
        return nombreAlum;
    }//get
    
    public boolean altaCalificacion(double calif){
        boolean res=false;
        if (totalCalif<calificaciones.length){
            calificaciones[totalCalif]=calif;
            res=true;
            totalCalif++;
        }//if
        return res;
    }//method
    
    public double calculaPromedio(){
        double sum=0;
        for (int i=0;i<totalCalif;i++)
            sum+=calificaciones[i];
        return sum/totalCalif;
    }//method
    
    public int cuentaAprovadas(){
        int sum=0;
        for (int i=0;i<totalCalif;i++)
            if (calificaciones[i]>=6)
                sum++;
        return sum;
    }//method
    
    public int getClave(){
        return claveUnica;
    }//get
    
    public boolean equals(Alumno otro){
        return otro.claveUnica==claveUnica;
    }//equals
    
    public String imprimeCalifs(){
        StringBuilder res= new StringBuilder();
        if (calificaciones!=null)
        for (int i=0;i<totalCalif;i++)
            res.append(calificaciones[i]).append("\n");
        return res.toString();
    }//method
    
    public String toString(){
        return "Nombre "+nombreAlum+"\nClave única"+claveUnica+"\nTotal de materias "+totalCalif+"\nMaterias aprovadas"+cuentaAprovadas()+"\nPromedio "+calculaPromedio()+"\nCalificaciones: "+imprimeCalifs();
    }//toString
    

    
}//class
