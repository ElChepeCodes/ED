/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package previoempresa06;

/**
 * 23 enero 2019
 * @author EDg2
 */
public class Empresa {
    //Atributos.
    private String nombre;
    private String direccion;
    private String dueño;
    private Empleado empsDir[];
    private int cantEmps=0;
    private final int MAX=10;
    
    // Constructor
    public Empresa(String nombre, String direccion, String dueño) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.dueño = dueño;
        this.empsDir = new Empleado[MAX];
    }    
    
    //Alta de un Empleado administrativo u operario.
    public boolean altaEmp(Empleado e) {
        boolean resp = false;
        // Da de alta si hay espacio en el arreglo
        if( cantEmps < MAX) {
            empsDir[cantEmps] = e;
            cantEmps++;
            resp = true;
        }
        return resp;
    }
       
    //Genera un reporte con el nombre y sueldo base de
    //los Administrativos o los Operarios.
    //empDir[] esta ordenado por claves.
    public String reporteEmps(Empleado e) {
        StringBuilder strb;
        strb = new StringBuilder();
        strb.append(nombre + "\n");
        strb.append("Nombre y sueldo base de Empleados:\n");
        strb.append("CLASS: " + e.getClass().getName() + "\n");
        if(e instanceof Administrativo) {
            strb.append("Administrativos:\n");
        } else {
            strb.append("Operarios:\n");
        }
        for(int i=0; i<cantEmps; i++) {
            if( empsDir[i].getClass() == e.getClass()) {
                strb.append(empsDir[i].toString() + "\n");                
            }
        }
        strb.append("\n");
        return strb.toString();
    }

    // Busca la posicion de un Empleado buscando su clave
    // Busqueda secuencial sin importar el orden del arreglo.
    // El arreglo empsDir esta ordenado por clave de empleado.
    public int buscaEmpPos(int claveE) {
        int i, pos;
        pos = -1;   // Empleado inexistente
        i = 0;
        while((i < cantEmps) && (pos == -1)) {
            if( empsDir[i].getClaveEmpleado() == claveE ) {
                pos = i;    // Empleado encontrado
            } 
            i++;
        }
        return pos;
    }

    // Aumenta el sueldo base de un administrativo, si existe. 
    // El aumento se da en porcentaje.
    // 3)
    public boolean aumentoEmp(int claveE, double porc) {
        boolean bo = false;
        int pos;
        double aumento;
        pos = buscaEmpPos(claveE);
        if( pos != -1) {
            aumento = empsDir[pos].getSueldoBase()*(1+porc);
            empsDir[pos].setSueldoBase(aumento);
            bo = true;
        }
        return bo;
    }
    
    // Cambio de departamento de un empleado administrativo, si existe,
    // dada la clave y el nombre del departamento.
    // 4)
    public boolean cambioDepto(int claveE, String depto) {
        boolean bo = false;
        int pos;
        pos = buscaEmpPos(claveE);
        if( pos != -1) {
            if(empsDir[pos] instanceof Administrativo) {
                ((Administrativo)empsDir[pos]).setDepartamento(depto);
                bo = true;                
            }
            // A lo mejor es Operario
        }        
        return bo;
    }

    
    // Imprimir lo que cobrara un operario, si existe, dada la clave y los
    // datos necesario.
    // 5)
    public void impriCobra(int claveE, double prestac,
            double deduc, double precioHE) {
        String cade = "No existe el operario: " + claveE;
        int pos;
        double cobra;
        Operario oper;
        pos = buscaEmpPos(claveE);
        if( pos != -1) {
            if(empsDir[pos] instanceof Operario) {
                oper = (Operario)empsDir[pos];
                cobra = oper.calculaSalario(prestac, deduc, precioHE);
                cade = "El operario clave " + oper.toString() +
                        " cobrara " + cobra;
            }
        }
        System.out.println("\n" + cade + "\n");
    }
    
    // Generar un reporte de todos los operarios, que tienen un sueldo base
    // menor a cierta cantidad. Además incluir el total.
    // 6)
    public String reporteToOpera(double cantidad) {
        String cade = "";
        int comc = 0;
        Operario oper;
        for(int i = 0; i<cantEmps; i++) {
            if(empsDir[i] instanceof Operario) {
                oper = (Operario)empsDir[i];
                if( oper.getSueldoBase() < cantidad) {
                    cade = cade + oper.toString() + "\n";
                    comc++;
                }
            }

        }
        
        if( comc == 0) {
            cade = "\nNo hay ningun operario que gane menos que " + cantidad + "\n";
        } else {
            cade = "\n Hay " + comc + " operarios ganan menos que " + cantidad +
                    "\n" + cade;
        }        
        return cade;
    }

}
