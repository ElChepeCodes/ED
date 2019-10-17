
package DblLnkdListsExceptions;

/** ElementNotFoundException */
public class ElementNotFoundException extends RuntimeException {
    /**
     * This exception goes with a constant message.
     */
    public ElementNotFoundException() {
        super("ENotFoundEx: " +
                "element is not in this collection\n");
    }
    
    /**
     * Sets up this exception with an appropriate message.
     */
    public ElementNotFoundException(String collection) {
        super("ENotFoundEx:: " +
                "element is not in this " +  collection + "\n");
    }
    
}

