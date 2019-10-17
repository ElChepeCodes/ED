package Problema51Lists;
import Lists.*;
import java.util.*;
import java.io.*;

/**
 * Problema 51, aplicación de Listas Ordenadas
 * @author EDg1
 */
public class PaisesDeAmerica {

    private LinkedOrderedList<Pais> PaisesAmericanos= new LinkedOrderedList();

    // Getter
    public LinkedOrderedList<Pais> getListaPaisesAmericanos() {
        return PaisesAmericanos;
    }

    /**
    * Lee los países de cada zona.
    * @param nomArch Recibe el nombre del archivo de datos.
    * @param lista Aquí guarda los paises leidos.
    */
    public void leePaisesZo(String nomArch, LinkedOrderedList<Pais> lista) {
        File arch = new File(nomArch);
        Scanner ent;
        String nombre;

        //Lectura del nombre de los países de una zona.
        try {
            ent= new Scanner(arch);   //Abre el archivo.
            while( ent.hasNext() ) {
                nombre = ent.next();     //Lectura del nombre y guardar el país                               
                lista.add(new Pais(nombre));
            }
            ent.close();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
  
    /**
    * Metodo que toma una lista como parametro y agrega sus elementos a la
 lista de PaisesAmericanos.
    * @param lista países a agregar a Amerioa.
    */
    public void agregaPaisesAm(LinkedOrderedList<Pais> lista) {
        Iterator<Pais> it=lista.iterator();
        Pais nuevo;
        while(it.hasNext()){
            nuevo=it.next();
            if (PaisesAmericanos.isEmpty())
                PaisesAmericanos.add(nuevo);
            else
                if (!PaisesAmericanos.contains(nuevo))
                    PaisesAmericanos.add(nuevo);
            
        }//while
        // ??
    }
    
}
