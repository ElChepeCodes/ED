/*
 * Clase Alumno del proyecto AlumnoEscuela03.
 */
package alumnoescuela03;

/**
 * Fecha: 21 enero 2019
 * @author JRIOSS
 * Clase para instanciar objetos Alumno
 */
public class Alumno {
    // ATRIBUTOS
    private static int serie = 100; // Clave inicial de la clase
    private int claveUnica;
    private String nombreAlum;
    private final int MAXCALIF = 45;
    private double [] calificaciones;
    private int totalCalif;
    
    // CONSTRUCTORES
    public Alumno() {
        this("vacio" + serie);
    }

    public Alumno(String nombreap) {
        claveUnica = serie;    serie++;
        nombreAlum = nombreap;
        calificaciones = new double[MAXCALIF];
        totalCalif = 0;
    }
    
    // SET-TERS y GET-TERS
    public void setNombreAlum(String nombreap) {
        nombreAlum = nombreap;
    }
    
    public String getNombreAlum() {
        return nombreAlum;
    }
    
    // METODOS DE GESTION Y CALCULO
    // Metodo para dar de alta un alumno.
    public boolean altaCalificacion(double calif) {
        boolean resp;
        if(totalCalif < MAXCALIF) {  // Agrega calificacion si hay espacio
            calificaciones[totalCalif] = calif;
            totalCalif++;
            resp = true;
        } else {
            resp = false;
        }
        return resp;
    }
    
    // Metodo para calcular el promedio de calificaciones
    public double calculaPromedio() {
        double promedio;    promedio = 0;
        for(int i = 0; i < totalCalif; i++) {
            promedio = promedio + calificaciones[i];
        }
        promedio = promedio / totalCalif;
        return promedio;
    }
         
    // METODOS A SOBRE-ESCRIBIR, DE CLASES ASCENDENTES
    // Comparacion por igualdad con otro objeto Alumno
    // por claveUnica y nombreAlum
    @Override
    public boolean equals(Object otroObj) {
        boolean bo1, bo2, bor;
       bor = false;
        if (otroObj != null) {    // Objeto existente?
            if (getClass() == otroObj.getClass()) {    // Objeto Rectangulo?
                bor = true;
                if (this != otroObj) {    // No es el mismo objeto?
                    Alumno otroAlum = (Alumno) otroObj;
                    bo1 = (claveUnica == otroAlum.claveUnica);
                    bo2 = (nombreAlum.compareTo(otroAlum.nombreAlum) == 0);  // Identicos
                    bor = bo1 && bo2;
                }                    
            }
        }
        return bor;       
    }
    
    // Obtencion del String del objeto
    @Override
    public String toString() {
        String cadena;
        cadena = "ALUMNO[" + claveUnica + "," + nombreAlum + "]\n";
        
        // FALTA

        return cadena;
    }
    
}
