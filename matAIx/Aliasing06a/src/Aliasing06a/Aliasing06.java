/*
 * Manejo de Herencia.
 * Empresa con Empleados.
 */
package Aliasing06a;

/**
 * 30 enero 2019
 * @author EDg2
 */
public class Aliasing06 {

    public static void main(String[] args) {
        // Declaracion de variables y referencias
        Administrativo a1, a2, a3, d1, d2, d3;
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

        // Se crea la empresa y se dan de alta los empleados.
        System.out.println("\n---- Pruebas 5 ----");
        e= new Empresa("Oracle","Calle 1-10","Albert");
        e.altaEmp(a1); e.altaEmp(a2); e.altaEmp(a3);
        e.altaEmp(o1); e.altaEmp(o2); e.altaEmp(o3);
        
        // Busqueda secuencial de un empleado.
        System.out.println("\n---- Pruebas 6 ----");
        System.out.println("buscaEmp 103 Pos: " + e.buscaEmpPos(103));
                
        // Busqueda binaria de un empleado.
        System.out.println("\n---- Pruebas 7 ----");
        System.out.println("buscaBinEmp 103 Pos: " + e.buscaBinEmpPos(103));
        
    }
}
