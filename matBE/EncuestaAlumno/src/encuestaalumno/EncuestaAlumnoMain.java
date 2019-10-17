/*
 * Exercise 26, SETs, Conjuntos.
 */
package encuestaalumno;

/**
 * Exercise 26, Sets
 * @author EDg1
 */
public class EncuestaAlumnoMain {
    public static void main(String[] args) {
        // Vaciado del archivo Alumnos.txt en Encuesta
        
        // Comprobacion del cargado en Encuesta
        System.out.println("Alumnos con Ingles:");
        System.out.println("Alumnos con Frances:");
        System.out.println("Alumnos con otro idioma:");

        //Inciso 1)
        System.out.println("Nombres de Alumnos que dominan Ingles y Frances:");
        
        //Inciso 2)
        System.out.println("Total de Alumnos que solo dominan Ingles: ");

        //Inciso 3)
        System.out.println("Nombres de Alumnos que dominan 3 o mas idiomas:");
     
    }
    // Metodo para Inciso 1
    // Regresa cadena con los nombres de los alumnos que dominan ingles y frances
    public static String cadDomInglFranc(Encuesta enc) {
        String cad = null;

        return cad;
    }
    
    // Metodo para Inciso 2
    // Regresa el total de alumnos que dominan ingles
    public static int totDomIngl(Encuesta enc){
        int total = 0;

        return total;
    }
    
    // Metodo para Inciso 3
    // Regresa cadena de los alumnos que dominan al menos tres idiomas
    public static String cadDom3masIdi(Encuesta enc){
        String cad = null;

        return cad;        
    }    
}
