
package Problema62DblLnkdLists;

public class Cientifica extends Revista {
    
    private String editor;

    public Cientifica() {
        
        super();
    }

    public Cientifica(String editor, String periodicidad, int anioFundacion,
            int clave, String nombre, double precio) {
        
        super(periodicidad, anioFundacion, clave, nombre, precio);
        this.editor = editor;
    }
}
