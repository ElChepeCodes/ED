/*
 * Manejo de Herencia y Clase Abstracta.
 * Empresa con Empleados.
 */
package empleadosGenerico;

/**
 * 11 febrero 2019
 * @author EDg1
 */
public class EmplresaEmpleadosMain {

    public static void main(String[] args) {
        // Declaracion de variables y referencias
        Administrativo a1, a2, a3;
        Operario o1, o2, o3;
        Empresa e;
    
        //Crear objetos de empleados.
        System.out.println("\n ---- PRUEBA 1 ----");
        a1= new Administrativo("Computación","5405","Rebeca",15000);
        a2= new Administrativo("Mate","3160","Pablo",20000);
        a3= new Administrativo("Ing. Ind.","8943","Juan",60000);
        o1= new Operario("Paco",6000,10);
        o2= new Operario("Hugo",7000,15);
        o3= new Operario("Luis",7500,5);
    
        //Imprimir valores.
        System.out.println("\n ---- PRUEBA 2 ----");
        System.out.println("Administrativos:");
        System.out.println(a2.toString());
        System.out.println("Salario: "+a2.calculaSalario(0.15, 0.2));
        System.out.println("\n");

        System.out.println("\n ---- PRUEBA 3 ----");
        System.out.println("Operarios:");
        System.out.println(o3.toString());
        System.out.println("Salario: "+o3.calculaSalario(0.1, 0.15, 10));  

        System.out.println("\n¿Son iguales estos Administrativos: " +
                a2.equals(a3) + "\n");

        // 1) Se crea la empresa y se dan de alta los empleados.
        System.out.println("\n ---- PRUEBA 4 ----");
        e= new Empresa("Oracle","Calle 1-10","Albert");
        e.altaEmp(a1); e.altaEmp(a2); e.altaEmp(a3);
        e.altaEmp(o1); e.altaEmp(o2); e.altaEmp(o3);

        // 2) Genera reporte de los administartivos y operarios.
        System.out.println("\n ---- PRUEBA 5 ----");
        System.out.println(e.reporteEmps(a1));   
        System.out.println(e.reporteEmps(o1));   

    }
}
