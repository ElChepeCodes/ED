
package Problema62DblLnkdLists;

public class Libro extends MaterialBibliografico {
    
    private String autor;

    public Libro() {
        
        super();
    }

    public Libro(String autor, int clave, String nombre, double precio) {
        
        super(clave, nombre, precio);
        this.autor = autor;
    }
}
