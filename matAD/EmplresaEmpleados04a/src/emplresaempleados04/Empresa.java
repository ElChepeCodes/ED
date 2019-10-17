
package emplresaempleados04;

/**
 * 23 enero 2019
 * @author EDg2
 */
public class Empresa {
    //Atributos.
    private String nombre;
    private String direccion;
    private String dueño;
    private Administrativo adminsDir[];
    private Operario opersDir[];
    private int cantAdmins=0, cantOpers=0;
    private final int MAX=10;
    
    // Constructor
    public Empresa(String nombre, String direccion, String dueño) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.dueño = dueño;
        this.adminsDir = new Administrativo[MAX];
        this.opersDir = new Operario[MAX];
    }    
    
    //Alta de un administrativo.
    public boolean altaAdmin(Administrativo a) {
        boolean resp = false;
        // Da de alta si hay espacio en el arreglo
        if( cantAdmins < MAX) {
            adminsDir[cantAdmins] = a;
            cantAdmins++;
            resp = true;
        }
        return resp;
    }
    
    //Alta de un operario.
    public boolean altaOper(Operario a) {
        boolean resp = false;
        // Da de alta si hay espacio en el arreglo
        if( cantOpers < MAX) {
            opersDir[cantOpers] = a;
            cantOpers++;
            resp = true;
        }
        return resp;
    }
       
    //Genera un reporte con el nombre y sueldo base de los administrativos.
    public String reporteAdmins() {
        StringBuilder strb;
        strb = new StringBuilder();
        strb.append(nombre + "\n");

        return strb.toString();
    }

    // Busca la posicion de un Administrativo buscando su clave
    public int buscaAdminPos(int claveE) {
        int i, pos;
        i = 0;
        pos = -1;   // Administrativo inexistente
        while((i<cantAdmins) && (pos == -1)) {
            if( adminsDir[i].getClaveEmpleado() == claveE) {
                pos = i;
            }
            i++;
        }
        return pos;
    }

    // Aumenta el sueldo base de un administrativo, si existe. 
    // El aumento se da en porcentaje.
    public boolean aumentoAdmin(int claveE, double porc) {
        boolean bo = false;
        int pos;
        double aumento;

        return bo;
    }



}
