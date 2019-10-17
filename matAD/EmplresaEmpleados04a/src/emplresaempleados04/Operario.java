/*
 * Caracteristicas y funcionalidades de un empleado Administrativos.
 * Ademas de sus propios atributos y metodos, hereda los de empleado.
 */
package emplresaempleados04;

/**
 * 23 enero 2019
 * @author EDg2
 */

public class Operario extends Empleado {
    // Atributos
    private int horasExtras;
    
    // Constructor
    public Operario(String nombreEmp, double sueldoBa, int horasExtras) {
        super(nombreEmp, sueldoBa);
        this.horasExtras = horasExtras;
    }    
    
    /* Calcula el salario del empleado dependiendo de las
     * prestaciones, horas extras y deduccion de impuestos
    */
    public double calculaSalario(double prestac,
            double deduc, double precioHE) {
        double salario;
        salario = this.getSueldoBase()*(1+prestac-deduc)
                + horasExtras*(1 - deduc);
        return salario;
    }
        
    // Override, toString
    @Override
    public String toString() {
        String cade;
        StringBuilder strb;
        strb = new StringBuilder();
        cade = super.toString();
        strb.append(cade);
        strb.append("Horas extras: " + horasExtras + "\n");
        return strb.toString();
    }



    
}
