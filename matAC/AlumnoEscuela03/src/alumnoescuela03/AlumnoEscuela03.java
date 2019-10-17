/*
 * Proyecto 03 del cuadernillo de ejercicios.
 * Clases principal, Alumno y Escuela.
 */
package alumnoescuela03;

/**
 * Fecha: 21 enero 2019
 * @author JRIOSS
 * Clase principal AlumnoEscuela03
 */
public class AlumnoEscuela03 {

    /**
     * @param args ninguno
     */
    public static void main(String[] args) {
        // Variables y Referencias
        Alumno alu1, alu2, alu3;
        Escuela esc1, esc2;
        
        //Creacion de los Alumnos
        alu1 = new Alumno("Maria");
        alu1.altaCalificacion(9.1);
        
        alu2 = new Alumno("Juan");
        alu2.altaCalificacion(9.1);
        alu2.altaCalificacion(8.9);
        
        alu3 = new Alumno("Margarita");
        alu3.altaCalificacion(9.1);
        alu3.altaCalificacion(8.9);
        alu3.altaCalificacion(9.0);
        
        // Promedio de alu3
        System.out.println("\nAlumno: " + alu3.getNombreAlum() + " - "
            + alu3.calculaPromedio());
        
        // Info de alu2
        System.out.println("\n" + alu2.toString());
        // Info de alu3
        System.out.println("\n" + alu3.toString());
        
        // Creacion de escuelas
        esc1 = new Escuela("Puebla", "Puebla 201, CDMX");
        
        // Agregando alumnos
        esc1.altaAlumno(alu2);
        esc1.altaAlumno(alu1);
        esc1.altaAlumno(alu3);
        
        // Datos del alumno alu3 en la Escuela Puebla
        int clal = 102;
        System.out.println("\nAlumno " + clal + ":\n"  + esc1.infoAlumnoClv(102));
        
        // Promedio de todos los alumnos de esc1
        System.out.println("Promedios de la escuela " + esc1.getNombreEscuela());
        System.out.println(esc1.calculoPromedioTodos()+"\n");
        
        // Alumno con mayor cantidad de materias aprobadas en Escuela Puebla
        System.out.println("Alumno mayor numero de aprobadas ");
        System.out.println(esc1.mayorMateriasAprob()+"\n");        
        
    }
    
}
