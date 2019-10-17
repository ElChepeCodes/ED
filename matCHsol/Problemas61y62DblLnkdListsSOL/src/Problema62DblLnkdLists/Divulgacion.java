
package Problema62DblLnkdLists;

public class Divulgacion extends Revista{
    
    private int tiraje;

    public Divulgacion() {
        super();
    }     

    public Divulgacion(int tiraje, String periodicidad, int anioFundacion,
            int clave, String nombre, double precio) {
        
        super(periodicidad, anioFundacion, clave, nombre, precio);
        this.tiraje = tiraje;
    }

    @Override
    public String toString() {
        
        return super.toString() + "\n    Tiraje> " + tiraje;
    }
    
    public int getTiraje(){
        
        return tiraje;
    }
}
