/*
 * Manejo de Herencia.
 * Empresa con Empleados.
 */
package emplresaempleados04;

/**
 * 23 enero 2019
 * @author EDg2
 */
public class EmplresaEmpleados04 {

    public static void main(String[] args) {
        // Declaracion de variables y referencias
        Administrativo a1, a2, a3;
        Operario o1, o2, o3;
        Empresa e;
    
        //Crear objetos de empleados.
        a1= new Administrativo("Computación","5405","Rebeca",15000);
        a2= new Administrativo("Mate","3160","Pablo",20000);
        a3= new Administrativo("Ing. Ind.","8943","Juan",60000);
        o1= new Operario("Paco",6000,10);
        o2= new Operario("Hugo",7000,15);
        o3= new Operario("Luis",7500,5);
    
        //Imprimir valores.
        System.out.println("Administrativos:");
        System.out.println(a2.toString());
        System.out.println("Salario: "+a2.calculaSalario(0.15, 0.2));
        System.out.println("\n");

        System.out.println("Operarios:");
        System.out.println(o3.toString());
        System.out.println("Salario: "+o3.calculaSalario(0.1, 0.15, 10));  

        System.out.println("\n¿Son iguales estos Administrativos a2 y a3: " +
                a2.equals(a3) + "\n");

        System.out.println("\n¿Son iguales estos Administrativos a2 y a2: " +
                a2.equals(a2) + "\n");
        
    /*
        // 1) Se crea la empresa y se dan de alta los empleados.
        e= new Empresa("Oracle","Calle 1-10","Albert");
        e.altaAdmin(a1); e.altaAdmin(a2); e.altaAdmin(a3);
        e.altaOper(o1); e.altaOper(o2); e.altaOper(o3);

        // 2) Genera reporte de los administartivos.
        System.out.println(e.reporteAdmins());   

        // 3) Aumento a un administrativo.
        if(e.aumentoAdmin(102, 0.10)) {
            System.out.println("Aumento exitoso");
            System.out.println(a3.toString());
        }
        else  {
              System.out.println("El administrativo no existe");
        }
*/
    }
}
