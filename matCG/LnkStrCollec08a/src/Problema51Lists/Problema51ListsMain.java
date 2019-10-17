package Problema51Lists;
import Lists.LinkedOrderedList;

/**
 * Problema 51, aplicacion de Listas Ordenadas
 * @author EDg1
 */
public class Problema51ListsMain {

    public static void main(String[] args) {
        
        // Los archivos Norte.txt, Centro.txt y Sur.txt contniendo
        // la lista de paises de la respectiva zona se encuentran en
        // el folder raiz del proyecto.
        
        // Lista de zonas de paises y continente americano
        LinkedOrderedList<Pais> Norte= new LinkedOrderedList();
        LinkedOrderedList<Pais> Centro= new LinkedOrderedList();
        LinkedOrderedList<Pais> Sur= new LinkedOrderedList();
        LinkedOrderedList<Pais> America;

        // Instanciando objeto de Paises de America
        PaisesDeAmerica pda = new PaisesDeAmerica();
        
        //Lee los datos de cada país y los agrega a su lista.
        pda.leePaisesZo("Norte.txt", Norte);
        pda.leePaisesZo("Centro.txt", Centro);
        pda.leePaisesZo("Sur.txt", Sur);

        //Toma los países de cada lista y los agrega a America.
        pda.agregaPaisesAm(Norte);
        pda.agregaPaisesAm(Centro);
        pda.agregaPaisesAm(Sur);
        America = pda.getListaPaisesAmericanos();

        //Imprime las listas.
        System.out.println("Norte: " + Norte.toString());
        System.out.println("Centro: " + Centro.toString());
        System.out.println("Sur: " + Sur.toString());
        System.out.println("America: " + America.toString());        
    }
    
}
