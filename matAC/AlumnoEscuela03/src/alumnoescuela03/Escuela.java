/*
 * Clase Escuela del proyecto AlumnoEscuela03.
 */
package alumnoescuela03;

/**
 * Fecha: 21 enero 2019
 * @author JRIOSS
 * Clase para instanciar objetos Escuela
 */
public class Escuela {
    // ATRIBUTOS
    private String nombreEscuela;
    private String direccionEscuela;
    private int numAlumnos;
    private final int MAXALUMNOS = 50;
    private Alumno [] alumnosCardex;
    
    // CONSTRUCTORES
    public Escuela() {
        this("vacio", "vacio");
    }

    public Escuela(String nEsc, String dEsc) {
        nombreEscuela = nEsc;
        direccionEscuela = dEsc;
        numAlumnos = 0;
        alumnosCardex = new Alumno[MAXALUMNOS];
    }

    // SET-TERS y GET-TERS
    public void setNombreEscuela(String nEsc) {
        nombreEscuela = nEsc;
    }

    public void setDireccionEscuela(String dEsc) {
        direccionEscuela = dEsc;
    }
    
    public String getNombreEscuela() {
        return nombreEscuela;
    }
    
    public String getDireccionEscuela() {
        return direccionEscuela;
    }

        // METODOS DE GESTION Y CALCULO
    // Metodo para dar de alta un alumno.
    public boolean altaAlumno(Alumno alump) {
        boolean resp;
        resp = false;
        if(numAlumnos < MAXALUMNOS) {  // Agrega alumnos si hay espacio
            alumnosCardex[numAlumnos] = alump;
            numAlumnos++;
            resp = true;
        }
        return resp;
    }
    
    // Metodo para obtener los datos de un alumno segun su clave
    // Situaciones: No existe el alumno, no existe ningun alumno.
    public String infoAlumnoClv(int claUn) {
        String cade = "Quien sabe";
        
        // FALTA
        
        return cade;
    }
    
    // Nombre y promedio de todos los alumnos
    public String calculoPromedioTodos() {
        String cade = "Quien sabe";
        if(numAlumnos < 1) {
            cade = "No existen alumnos";
        } else {
            cade = "";
        }
        for (int i = 0; i < numAlumnos; i++) {
            cade = cade + "\n" + alumnosCardex[i].getNombreAlum()
                    + " - " + alumnosCardex[i].calculaPromedio();
        }
        return cade;
    }
    
    // Nombre de alumno con mayor cantidad de materias aprobadas
    public String mayorMateriasAprob() {
        String cade;
        cade = "Quien sabe";
        
        // FALTA
        
        return cade;        
    }

    
}
