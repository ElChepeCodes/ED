/*
 * Manejo de Herencia.
 * Empresa con Empleados.
 */
package previoempresa06;

/**
 * 23 enero 2019
 * @author EDg2
 */
public class PrevioEmpresa06 {

    public static void main(String[] args) {
        // Declaracion de variables y referencias
        Administrativo a1, a2, a3;
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
    
        //Imprimir valores.
        System.out.println("\n---- Pruebas 2 ----");
        System.out.println("Administrativos:");
        System.out.println(a2.toString());
        System.out.println("Salario: "+a2.calculaSalario(0.15, 0.2));
        System.out.println("\n");

        System.out.println("Operarios:");
        System.out.println(o3.toString());
        System.out.println("Salario: "+o3.calculaSalario(0.1, 0.15, 10));  

        System.out.println("\n¿Son iguales estos Administrativos: " +
                a2.equals(a3) + "\n");

        // 1) Se crea la empresa y se dan de alta los empleados.
        System.out.println("\n---- Pruebas 3 1)----");
        e= new Empresa("Oracle","Calle 1-10","Albert");
        e.altaEmp(a1); e.altaEmp(a2); e.altaEmp(a3);
        e.altaEmp(o1); e.altaEmp(o2); e.altaEmp(o3);

        // 2) Genera reporte de los administartivos y operarios.
        System.out.println("\n---- Pruebas 4 2)----");
        System.out.println(e.reporteEmps(a1));   
        System.out.println(e.reporteEmps(o1));   

        // 3) Aumento a un administrativo.
        System.out.println("\n---- Pruebas 5 3)----");
       if(e.aumentoEmp(102, 0.10)) {
            System.out.println("Aumento exitoso");
            System.out.println(a3.toString());
        }
        else  {
              System.out.println("El administrativo no existe");
        }
        
        // 4) Cambio de un administrativo a otro departamento.
        System.out.println("\n---- Pruebas 6 4)----");
        if( e.cambioDepto(102, "Informatica") ) {
            System.out.println("Cambio exitoso");
            System.out.println(a3.toString());
        }
        else  {
              System.out.println("El administrativo no existe");
        }
        
        // 5) Cobro que hara un operario
        System.out.println("\n---- Pruebas 7 5)----");
        e.impriCobra(0, 0, 0, 0);
        e.impriCobra(105, 0.2, 0.03, 6.0);
        
        // 6) Operarios que ganan menos que una cantidad
        System.out.println("\n---- Pruebas 8 6)----");
        System.out.println(e.reporteToOpera(10000.0));
        System.out.println(e.reporteToOpera(7100.0));
        
        // Polymorphism
        System.out.println("\n---- Pruebas 9 POLIMORFISMO----");
        Empleado emp1, emp5;
        emp1 = new Administrativo("Computación","5405","Rebeca",15000);
        emp5 = new Operario("Paco",6000,10);
        
        System.out.println("\n emp1 " + emp1.toString() );
        System.out.println("\n emp5 " + emp5.toString() );  // porque imprime menos?

        Class cla;
        cla = emp1.getClass();
        
        System.out.println("\n getName: " + cla.getName() );
        System.out.println("\n getSimpleName: " + cla.getSimpleName() );
        System.out.println("\n getTypeName: " + cla.getTypeName() );
        System.out.println("\n toGenericString: " + cla.toGenericString() );
        
        if( emp5 instanceof Operario) {
            System.out.println("emp5 es un Operario");
        } 
        
    }
}
