package finaleddiciembre2012;

/**
 * 
 * @Silvia Guardati
 * @version 2.1 18-12-2012
 */

import java.util.*; //Para la clase Random

public class ConjuntoArreglo <T> implements ConjuntoADT <T >  {
	private T colec[];
	private int cardinalidad;
	private final int CAPACIDAD = 20;
	
	private static Random rand = new Random();

    public ConjuntoArreglo() {
    	colec = (T[])(new Object[CAPACIDAD]);
    	cardinalidad = 0;
    }
    
     public ConjuntoArreglo(int cantidad) {
    	colec = (T[])(new Object[cantidad]);
    	cardinalidad = 0;
    }
    
    public String toString(){
    	StringBuilder cad = new StringBuilder();
    	Iterator<T> it = iterator();
    	
    	while (it.hasNext())
    		cad.append(it.next() + " ");
    
    	return cad.toString();
    }
    
    public int getCardinalidad(){
    	return cardinalidad;
    }
        
    private void expande(){
    	T masGrande[] = (T[]) (new Object[colec.length * 2]);
    	int i;
    	
    	for (i= 0; i < colec.length; i++)
    		masGrande[i] = colec[i];
    	colec = masGrande;
    }
    
    //Si elemento ya está en el arreglo no lo inserta.
   public boolean agrega(T elemento){
   	    boolean resultado;
   	    
   	    resultado = false;
   	    if (!contiene(elemento)){
   	    	if (cardinalidad == colec.length)
    			expande();
    		colec[cardinalidad] = elemento;
    		cardinalidad++;
    		resultado = true;
   	    }
    	return resultado;
    }
    
    public boolean estáVacío(){
    	return cardinalidad == 0;
    }

    public T remove(T dato){
        if (estáVacío())
    		throw new EmptyCollectionException("Conjunto vacío");

        T eliminado = null;
        int posición= 0;
        while (posición < cardinalidad && !colec[posición].equals(dato))
            posición++;
        if (posición < cardinalidad){
            eliminado = colec[posición];
            colec[posición] = colec[cardinalidad - 1];
            colec[cardinalidad - 1] = null;
            cardinalidad--;
        }
        return eliminado;
    }
    
    public T removeRandom() {
    	if (estáVacío())
    		throw new EmptyCollectionException("Conjunto vacío");
    	int elegido = rand.nextInt(cardinalidad); //Se elige una posici�n
    	T resultado = colec[elegido]; 
    	colec[elegido] = colec[cardinalidad - 1]; //Se reemplaza el valor quitado
    	colec[cardinalidad -1] = null;   
    	cardinalidad--;    //Queda un elemento menos en el conjunto
    	return resultado;
    } 
    	// Determina si elemento está o no en el arreglo.
    	public boolean contiene(T elemento){
    		boolean resp;
    		
    		resp = false;
        	Iterator <T> it = iterator();
    		T x;
    		while (it.hasNext() && !resp){
    			x = it.next();
    			resp = elemento.equals(x);
    		}    		
    		return resp;
    	}
           	
    public Iterator<T> iterator() {
    	return new IteradorArreglo<T> (colec, cardinalidad);
    }
}

   