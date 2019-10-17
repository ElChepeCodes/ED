
package Problema62DblLnkdLists;
import java.util.Iterator;
import DblLnkdListsExceptions.*;

/**
 * @author EDg1
 */
public class Problema62Main {

    public static void main(String[] args) {
        
        // PRIMER EJEMPLO de uso y prueba
        // INSTANCIAS DE MaterialBibliografico        
        /* Divulgacion(int tiraje, String periodicidad, int anioFundacion,
              int clave, String nombre, double precio)*/
        Divulgacion div1 = new Divulgacion(110, "mensual", 2007,
                                164, "Dv. Redes Sociales: LIKE", 250);
        Divulgacion div2 = new Divulgacion(350, "bimestral", 2010,
                                278, "Dv. Efectos del Azucar", 470);
        Divulgacion div3 = new Divulgacion(230, "trimestral", 2009,
                                325, "Dv. Impactos del Estres", 200);
        Divulgacion div4 = new Divulgacion(240, "cuatrimestral", 2008,
                                320, "Dv. Ejercicio vital", 240);
        
        /* Cientifica(String editor, String periodicidad, int anioFundacion,
            int clave, String nombre, double precio)*/
        Cientifica cie = new Cientifica("AmnScientific", "semestral", 2008,
                             301, "Cf. Nanotecnologia", 579);

        // Libro(String autor, int clave, String nombre, double precio)
        Libro lib = new Libro("Ana", 170, "Lb. Hilanderas de la Luna", 410);        
        // INSTANCIA de una lista listmatbi de MaterialBibliografico
        DoublyLinkedOrderedList<MaterialBibliografico> listmatbi =
                new DoublyLinkedOrderedList();
        
        // AGREGACION de elementos a la listamb
        listmatbi.add(div1);      listmatbi.add(div2);
        listmatbi.add(div3);      listmatbi.add(div4);
        listmatbi.add(lib);      listmatbi.add(cie);

        // Contenido listmatbi de MaterialBibliografico
        System.out.println("1) Contenido listmatbi: \n" + listmatbi.toString());
        
        // INSTANCIA de lista de Divulagcion listdiv
        DoublyLinkedOrderedList<Divulgacion> listdiv;

        // OBTENCION DE LA LISTA DE REVISTAS DE DIVULGACION
        int total;        double valprecio;
        total = 200;        valprecio = 300;
        listdiv = obtieneListaRevistas(listmatbi, total, valprecio);
        
        // PRUEBA DE EXCEPCIONES
        try {

            // Contenido listdiv resultante de Divulgacion
            System.out.println("2) Contenido listdiv: \n" + listdiv.toString());
            
            listmatbi = new DoublyLinkedOrderedList();
            listdiv = obtieneListaRevistas(listmatbi, total, valprecio);            
        }
        catch (Exception e) {
            System.out.println(e.toString());      
        }
        
        System.out.println("HASTA LUEGO 62.");
    }
    
    /**
     * Problema 62. Obtencion de la lista de Revistas de
     * Divulgacion con "tiraje mayor a total" y "un precio menor a valprecio".
     * Recursivo.
     */
    public static DoublyLinkedOrderedList<Divulgacion> obtieneListaRevistas
        (DoublyLinkedOrderedList<MaterialBibliografico> material,
                int total, double valprecio){
                        
        return null;
    }


}
