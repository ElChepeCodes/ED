/*
 * Caracteristicas y funcionalidades de un Empleado.
 * Atributos y metodos.
 */
package previoempresa06;

import java.util.Objects;   // Para usar Objects.equals( )

/**
 * 23 enero 2019
 * @author EDg2
 */

public class Empleado {
    // Atributos de clase
    private static int serie = 100;

    // Atributos
    private int claveEmpleado;
    private String nombreEmpleado;
    private double sueldoBase;

    // Constructor
    public Empleado(String nombreEmp, double sueldoBa) {
        claveEmpleado = serie;
        serie++;
        nombreEmpleado = nombreEmp;
        sueldoBase = sueldoBa;
    }
    
    // Getters
    public int getClaveEmpleado() {
        return claveEmpleado;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }
    
    // Setters
    public void setSueldoBase(double sueldoBa) {
        this.sueldoBase = sueldoBa;
    }
    
    /*
    * Calcula el salario de un empleado.
    * Parámetros: prestac - porcentaje de prestaciones, en decimales;
    * deduc- porcentaje de deducciones, en decimales.
    */
    public double calculaSalario(double prestac, double deduc) {    
        return sueldoBase * (1 + prestac - deduc);
    }

    // Override methods: equals, toString
    @Override
    public boolean equals(Object otroObj) {
        if(otroObj == null) {
            return false;
        }
        if( this == otroObj) {
            return true;
        }
        if( this.getClass() != otroObj.getClass()) {
            return false;
        }

        Empleado otroRec = (Empleado) otroObj;

        boolean b1, b2, b3;
        b1 = this.claveEmpleado == otroRec.claveEmpleado;
        b2 = this.sueldoBase == otroRec.sueldoBase;
        b3 = Objects.equals(this.nombreEmpleado, otroRec.nombreEmpleado);
        return b1 && b2 && b3;
    }
    
    @Override
    public String toString() {
        String cade;  
        cade = "Empleado[" + "clave=" + claveEmpleado + ", nombre="
            + nombreEmpleado + ", sueldoBase=" + sueldoBase + ']';
        return cade;
    }
        
}
