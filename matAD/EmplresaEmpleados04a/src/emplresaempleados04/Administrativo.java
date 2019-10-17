/*
 * Caracteristicas y funcionalidades de un empleado Administrativos.
 * Ademas de sus propios atributos y metodos, hereda los de empleado.
 */
package emplresaempleados04;

/**
 * 23 enero 2019
 * @author EDg2
 */

public class Administrativo extends Empleado {
    // Atributos
    private String departamento;
    private String telefono;
    
    // Constructor
    public Administrativo(String depto, String tele,
            String nombreEmp, double sueldoBa) {
        super(nombreEmp, sueldoBa); // Reusando constructor Empleado
        departamento = depto;
        telefono = tele;
    }
    
    // Getters y Setters
    public String getDepartamento() {
        return departamento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setDepartamento(String depto) {
        departamento = depto;
    }

    public void setTelefono(String tele) {
        telefono = tele;
    }
    
    // Override, toString
    @Override
    public String toString() {
        String cade;
        StringBuilder strb;
        strb = new StringBuilder();
        cade = "HOLA";
        strb.append(cade + "\n");   // Agregando dos cadenas
        strb.append("Departamento " + departamento + "\n");
        strb.append("Telefono " + telefono + "\n");
        return strb.toString();
    }
        
}
