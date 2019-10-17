/*
 * Genera objetos Alumno con las carreras que cursa y los idiomas que domina.
 */
package encuestaalumno;
import Sets.*;

/**
 * @author EDg1.
 * Exercise 26
 */
public class Alumno {
    private int cu;
    private String nombre;
    private ArraySet<String> carreras;
    private ArraySet<String> idiomas;

    public Alumno(int cup, String nombrep, ArraySet<String> carrerasp, 
          ArraySet<String> idiomasp) {
        cu = cup;
        nombre = nombrep;
        carreras = carrerasp;
        idiomas = idiomasp;
    }

    //Sólo getters.
    public int getCu() {
        return cu;
    }
    public String getNombre() {
        return nombre;
    }
    public ArraySet<String> getCarreras() {
        return carreras;
    }
    public ArraySet<String> getIdiomas() {
        return idiomas;
    }

    @Override
    public String toString() {
        return "Alumno[" + "cu=" + cu + ", nombre=" + nombre + ", carreras=" + 
                carreras.toString() + ", idiomas=" + idiomas.toString() + "]";
    }
    
}
