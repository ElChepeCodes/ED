/*
 * Contiene datos básicos de una persona.
 */
package Problema39;
import java.util.Objects;

/**
 * Problema 39 de Estructuras Entrelazadas
 * @author EDg1
 */
public class Persona {
    private int clave;
    private String nombre;

    public Persona(int clave, String nombre) {
        this.clave = clave;
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Prsn{" + "clave=" + clave + ", nombre=" + nombre + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;
        if (this.clave != other.clave) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }
    
}
