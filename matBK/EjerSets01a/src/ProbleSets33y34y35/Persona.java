/*
 * Estructuras de datos
 * Autor: Jose Luis Gutierrez Espinosa
 */
package ProbleSets33y34y35;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author jlgut
 */
public class Persona {
    private String nombre;
    private LocalDate fechaNac;
    
    public Persona(String nom, int dia, int mes, int anio){
        nombre=nom;
        fechaNac=LocalDate.of(dia, mes, anio);
    }//builder
    
    public String getNombre(){
        return nombre;
    }//getter
    
    public LocalDate getFechaNac(){
        return fechaNac;
    }//getter
    
    public String toString(){
        return "Nombre: "+nombre+", Fecha de nacimiento: "+fechaNac.format(DateTimeFormatter.ISO_LOCAL_DATE);
    }
    
}//class
