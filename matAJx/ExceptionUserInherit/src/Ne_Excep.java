//

/**
 * Clase Excepcion derivada
 * @author EDg1
 */
public class Ne_Excep extends Exception {
    // Atributo
    private String causa;
    
    // Constructor
    public Ne_Excep(String causa) {
        this.causa = causa;
    }
    
    // Metodo
    @Override
    public String toString() {
        return "Ne_Excep " + causa;
    }
    
}
