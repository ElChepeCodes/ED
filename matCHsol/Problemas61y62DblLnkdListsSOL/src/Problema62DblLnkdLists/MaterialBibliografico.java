
package Problema62DblLnkdLists;

public abstract class MaterialBibliografico
        implements Comparable<MaterialBibliografico>{
    
    private int clave;
    private String nombre;
    private double precio;

    public MaterialBibliografico() {
    }
    
    public MaterialBibliografico(int clave, String nombre, double precio) {
        
        this.clave = clave;
        this.nombre = nombre;
        this.precio = precio;
    }
    
    public double getPrecio(){
        
        return precio;
    }

    @Override
    public String toString() {
        
        return "\nMaterial Bibliográfico:\n" + "    Clave> " + clave
                + " - Nombre> " + nombre + " - Precio>" + precio ;
    }
    
    @Override
    public int compareTo(MaterialBibliografico otro){
        return this.clave - otro.clave;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final MaterialBibliografico other = (MaterialBibliografico) obj;
        if (this.clave != other.clave) {
            return false;
        }
        return true;
    }
}
