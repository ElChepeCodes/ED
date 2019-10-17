/*
 * Estructuras de datos
 * Autor: Jose Luis Gutierrez Espinosa
 */
package EjerciciosStacks;

import Sets.ArraySet;

/**
 *
 * @author jlgut
 */
public class Alumno {
    private String nombre;
    private ArraySet<String> idiomas, materias, carreras;
    private int CU, edad;
    private double promedio;
    private static int claveU=100;
    
    public Alumno(String nom, int ed, double prom){
        nombre=nom;
        edad=ed;
        promedio=prom;
        CU=claveU;
        claveU++;
        idiomas= new ArraySet();
        materias=new ArraySet();
        carreras=new ArraySet();
    }//builder
    

    
    public Alumno(String nom, int cu, ArraySet<String> id, ArraySet<String> mat){
        nombre=nom;
        CU=cu;
        idiomas= new ArraySet();
        materias=new ArraySet();
        idiomas=id;
        materias=mat;
    }//builder
    
    public ArraySet<String> getCarreras(){
        return carreras;
    }//method
    
    public boolean altaIdioma(String idioma){
       boolean res= false;
       if (!idiomas.contains(idioma)){
           res=true;
           idiomas.add(idioma);
       }//if
       return res;
    }//method
    
    public boolean altaMateria(String materia){
       boolean res= false;
       if (!materias.contains(materia)){
           res=true;
           materias.add(materia);
       }//if
       return res; 
    }//method
    
    public boolean altaCarrera(String carrera){
       boolean res= false;
       if (!carreras.contains(carrera)){
           res=true;
           carreras.add(carrera);
       }//if
       return res;  
    }//method
    
    public int getCU(){
        return CU;
    }//getter
    
    public int getEdad(){
        return edad;
    }
    
    public double getPromedio(){
        return promedio;
    }
    
    public String getNombre(){
        return nombre;
    }//getter
    
    public ArraySet<String> getIdiomas(){
        return idiomas;
    }//getter
    
    public ArraySet<String> getMaterias(){
        return materias;
    }//getter
    

    
    public String toString(){
        return "Nombre: "+nombre+"; C.U.: "+CU+"; Carreras: "+carreras.toString();
    }//toString
    
    
    
}//class
