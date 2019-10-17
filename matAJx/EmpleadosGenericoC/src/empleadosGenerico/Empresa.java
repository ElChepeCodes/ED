
package empleadosGenerico;

/**
 * 11 febrero 2019
 * @author EDg1
 */
public class Empresa {
    //Atributos.
    private String nombre;
    private String direccion;
    private String dueño;
    private Empleado empsDir[];
    private int cantEmps = 0;
    private final int MAX = 10;
    
    // Constructor
    public Empresa(String nombre, String direccion, String dueño) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.dueño = dueño;
        this.empsDir = new Empleado[MAX];
    }    
    
    //Alta de un Empleado, sea Administrativo u operario.
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
    
    //Genera un reporte
    public String reporteEmps(Empleado e) {
        StringBuilder strb;
        strb = new StringBuilder();
        strb.append("CLASS: " + e.getClass().getName() + "\n");

        for(int i=0; i<cantEmps; i++) {
            if( empsDir[i].getClass() == e.getClass()) {
                strb.append(empsDir[i].toString() + "\n");                
            }
        }
        strb.append("\n");
        return strb.toString();
    }
    
    // Copia la lista de empleados, previamente ordenada por clave
    private Empleado [] copiEmps() {
        Empleado [] copiaEmps = new Empleado[MAX];
        // Copia empsDir[] en copiaEmps[]
        for(int i = 0; i < cantEmps; i++) {
            copiaEmps[i] = empsDir[i]; 
        }        
        return copiaEmps;
    }

}
