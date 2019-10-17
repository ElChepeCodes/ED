
package interface08y09;

/**
 *
 * @author EDg1
 */
public class Aplica09 {

    //Atributos
    private FigGeometrica [] arrFigG;
    private final int MAX = 20;
    private int contFigG;
    
    // Constructor
    // 1) Define un arreglo polimorfico de figuras geometricas.
    public Aplica09() {
        contFigG = 0;
        arrFigG = new FigGeometrica[MAX];
    }
    
    // 2) Dar de alta figuras geometricas, si caben.
    public boolean altaFigF(FigGeometrica fg) {
        boolean bo = false;
        if(contFigG < MAX) {
            arrFigG[contFigG] = fg;
            contFigG++;
            bo = true;
        }
        return bo;
    }
    
    // 3) Calcula e Imprime el Area de todas las figuras almacenadas.
    public String ceiAreaFigG() {
        String cade = "";
        for (int i = 0; i < contFigG; i++) {
            cade = cade + arrFigG[i].toString() +
                    ", area=" + arrFigG[i].calculaArea() +
                    "\n";
        }
        if (contFigG <= 1) {
            cade ="No hay ninguna figura geometrica.\n";
        }
        return cade;
    } 
    
    // 4) Encuentra e imprime los datos del circulo mas grande, por radio.
    public String eeiMayCirculo() {
        String cade = "";
        boolean bo = false;
        int mayCirc = 0;
        Circulo cirm, cir;
        // Busqueda del primer circulo
        int ind = 0;
        while( (ind < contFigG) && (!bo) ) {
            if(arrFigG[ind] instanceof Circulo) {
                mayCirc = ind;
                bo = true;
            }
            ind++;
        }
        
        // Comparacion del primer circulo (radio) contra los siguientes
        while( ind < contFigG ) {
            if(arrFigG[ind] instanceof Circulo) {
                if( ((Circulo)arrFigG[ind]).getRadio() > 
                       ((Circulo)arrFigG[mayCirc]).getRadio() ) {
                    mayCirc = ind;        // Mayor que el mayor             
                }
            }
            ind++;            
        }
        
        if( mayCirc == 0) {
            cade = "no se encontro ningun circulo.\n";
        } else {
            cade = arrFigG[mayCirc].toString() + " \n";
        }
        
        return cade;
    }
    
    // 5) Calcula e imprime el total de cuadrados.
    public String ceiTotCuadra() {
        String cade = "";
        int conCua = 0;
        for (int ind = 0; ind < contFigG; ind++) {
            if(arrFigG[ind] instanceof Cuadrado) {
                conCua++;
            }
        }
        if (conCua == 0) {
            cade = "0 Cuadrados.\n";
        } else {
            cade = " " + conCua + " Cuadrados.\n"; 
        }
        return cade;        
    }

}
