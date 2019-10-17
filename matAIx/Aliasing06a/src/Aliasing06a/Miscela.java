
package Aliasing06a;

/**
 * Clase Miscelanea
 * @author EDg1
 */
public class Miscela {
    // Modificar un objeto Administrador
    public void modObjAdm(Administrativo adm) {
        adm.setDepartamento("unodos");
        adm.setTelefono("987-567");     
        System.out.println("modObjAdm - adm " + adm.toString()); 
    }    

    // Crear un nuevo Administrador identidad
    public Administrativo creaObjAdm() {
        Administrativo tres = new Administrativo("Te","1","One",1.0);
        System.out.println("creaObjAdm - tres " + tres.toString());
        return tres;
    }    
}
