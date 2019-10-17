package finaleddiciembre2012;

/**
 *  * @Silvia Guardati
 *
 * @version 2.1 - 18-12-2012
 */
 
import java.util.Iterator;


public interface ConjuntoADT <T> extends Iterable <T>{
        //Agrega un elemento al conjunto. Si ya está no lo agrega.
        public boolean agrega(T otro);
        //Quita aleatoriamente un elemento del conjunto
	public T removeRandom();
        // Removes and returns the specified element from this set (or null if it is not found):
        public T remove (T element);
	public boolean estáVacío();  //Determina si el conjunto  est� vac�o
        //Regresa el número de elementos guardados en el conjunto
	public int getCardinalidad();
        //Regresa true si el conjunto contiene un elemento igual a elemento
	public boolean contiene(T elemento); 
	//public ConjuntoADT<T> unión(ConjuntoADT<T> otro);
	//public ConjuntoADT<T> intersección(ConjuntoADT<T> otro);
	//public ConjuntoADT<T> diferencia(ConjuntoADT<T> otro);
        // Returns true if this set and the parameter contain exactly the same elements:
        //public boolean equals (ConjuntoADT <T> set);
	public Iterator<T> iterator(); //Regresa un iterador para los elementos del conjunto  
}


