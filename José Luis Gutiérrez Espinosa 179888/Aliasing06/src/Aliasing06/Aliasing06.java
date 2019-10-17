/*
 * Manejo de Herencia.
 * Empresa con Empleados.
 */
package Aliasing06;

/**
 * 30 enero 2019
 * @author EDg2
 */
public class Aliasing06 {

    public static void main(String[] args) {
        // Declaracion de variables y referencias
      /*  Administrativo a1, a2, a3, d1, d2, d3;
        Operario o1, o2, o3;
        Empresa e;
    
        //Crear objetos de empleados y operarios.
        System.out.println("---- Pruebas 1 ----");
        a1= new Administrativo("Computación","5405","Rebeca",15000);
        a2= new Administrativo("Mate","3160","Pablo",20000);
        a3= new Administrativo("Ing. Ind.","8943","Juan",60000);
        o1= new Operario("Paco",6000,10);
        o2= new Operario("Hugo",7000,15);
        o3= new Operario("Luis",7500,5);
    
        // Prueba de Aliasing
        System.out.println("\n---- Pruebas 2 ----");
        d1 = a1;
        System.out.println("a1 " + a1.toString());
        System.out.println("d1 " + d1.toString());        
        
        System.out.println("\n---- Pruebas 3 ----");
        Miscela m1 = new Miscela();
        m1.modObjAdm(d1);
        System.out.println("d1 " + d1.toString());       
        
        System.out.println("\n---- Pruebas 4 ----");
        d2 = m1.creaObjAdm();
        System.out.println("d2 " + d2.toString());       

        
        // 1) Se crea la empresa y se dan de alta los empleados.
        System.out.println("\n---- Pruebas 5 ----");
        e= new Empresa("Oracle","Calle 1-10","Albert");
        e.altaEmp(a1); e.altaEmp(a2); e.altaEmp(a3);
        e.altaEmp(o1); e.altaEmp(o2); e.altaEmp(o3);
        */
            Empresa emp= new Empresa("","","");
    
    emp.altaEmp(new Administrativo("depto", "telefono", "Juan", 150));
    emp.altaEmp(new Operario("Pablo", 15, 150));
    emp.altaEmp(new Operario("Alvaro", 15, 150));
    emp.altaEmp(new Operario("William", 15, 150));
    emp.altaEmp(new Operario("Lucas", 15, 150));
    
    System.out.println(emp.reporteEmplClave(101));
    System.out.println(emp.reporteEmplClave(100));
    
    System.out.println(emp.impArreEmps());
    
        
    }
}
