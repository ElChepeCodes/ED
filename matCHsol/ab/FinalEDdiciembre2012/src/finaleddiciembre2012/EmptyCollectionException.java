package finaleddiciembre2012;

/**
 * Clase para manejo de excepciones. Se usará en las clases que
 * implementen colecciones.
 * @author Silvia Guardati
 * 18-12-2012
 */
public class EmptyCollectionException extends RuntimeException{

    public EmptyCollectionException(){
        super("Colección vacía");
    }

    public EmptyCollectionException(String mensaje){
        super(mensaje);
    }

}
