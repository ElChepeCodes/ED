
package Problema62DblLnkdLists;


public class Revista extends MaterialBibliografico {
    
    private String periodicidad;
    private int anioFundacion;

    public Revista() {
        
        super();
    }
    
    public Revista(String periodicidad, int anioFundacion,
            int clave, String nombre, double precio) {
        
        super(clave, nombre, precio);
        this.periodicidad = periodicidad;
        this.anioFundacion = anioFundacion;
    }

    @Override
    public String toString() {
        
        return super.toString()+ "\n    Periodicidad> " +
                periodicidad + ", - Año de fundación> " + anioFundacion;
    }
}
