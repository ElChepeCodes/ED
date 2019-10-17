/*
 * Caracteristicas y funcionalidades de un Empleado.
 * Atributos y metodos.
 */
package emplresaempleados04;

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
        return 0.0;
    }

    // Override methods: equals, toString
    @Override
    public boolean equals(Object otroObj) {
        boolean bo1, bo2, bo3, bor;
       bor = false;
        if (otroObj != null) {    // Objeto existente?
            if (getClass() == otroObj.getClass()) {    // Objeto Rectangulo?
                bor = true;
                if (this != otroObj) {    // No es el mismo objeto?
                    Empleado otroRec = (Empleado) otroObj;
                    bo1 = true;
                    bo2 = true;
                    bo3 = true;
                    bor = bo1 && bo2 && bo3;
                }                    
            }
        }
        return bor;      
    }
    
    @Override
    public String toString() {
        String cade;  
        cade = "Empleado[" + "clave=" + claveEmpleado + ", nombre="
            + nombreEmpleado + ", sueldoBase=" + sueldoBase + ']';
        return cade;
    }
        
}
