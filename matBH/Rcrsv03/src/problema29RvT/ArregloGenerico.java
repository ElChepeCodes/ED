
package problema29RvT;

/**
 * Ejercicio 29 de Recursividad, sobre arreglo generico.
 * @author EDg1
 */
public class ArregloGenerico <T> {
    /**
     * 1): Busca secuencial y recursivamente un dato en un arreglo generico.
     * Regresa la posicion en que esta o -1, si no existe en el arreglo.
     * n tiene el total de elementos a recorrer.
     * El arreglo "ag", puede o no estar ordenado.
     */
    public static<T> int buscaSecRv(T ag[], int n, T dato) {    
        int res=-1;
        if (ag[n].equals(dato))
            res=n;
        if (res<0 && n>0){                
            res=buscaSecRv(ag, n-1, dato);
        }//if
        return res;
    }
    
    /**
     * 2): Búsqueda binaria: recibe un dato y regresa la posicion en la
     * que esta o el negativo de la posicion +1 en la que deberia estar.
     * Inicialmente, "izq" tendra 0 y "der" el valor ag.length-1.
     * El arreglo "ag" deberá estar ordenado de manera ascendente.
     */
    public static <T extends Comparable <T>> int buscaBinRv(T arre[], int izq, int der, T dato) {    	
        if (arre==null || dato==null || izq<0 || der>arre.length-1)
            throw new ParamErrException("<<nulo o fuera de rango>>");
        int cen=(izq+der)/2, pos;
        if (izq>der){
            if (der<=0)
                pos=-1;
            else
                pos=-1*(cen+1);            
        }//if
        else{
            if (arre[cen].equals(dato))
                pos=cen;
            else
                if(arre[cen].compareTo(dato)>0)
                    pos=buscaBinRv(arre, izq, cen-1, dato);
                else
                    pos=buscaBinRv(arre, cen+1, der, dato);
                        
                    
                
        }//else
        return pos;
    }//method
    
   
    /**
     * 3): Recorre secuencial y recursivamente un dato en un arreglo generico.
     * Regresa contenido del arreglo en forma de cadena.
     * vc tiene el total de elementos a recorrer.
     */
    public static<T> String toStringAg(T [] arr, int longi){   // Impresion ascendente (Backwards), en un String, Ejer23a
        if (arr==null || longi>arr.length)
            throw new ParamErrException("Los paramaetros no son validos");
        StringBuilder res= new StringBuilder();        
        if (longi>1){            
            res.append(toStringAg(arr, longi-1)+", "+arr[longi-1]);
        }//if
        else
            res.append(arr[0]);
            
        return res.toString();
    }
    
    /**
     * 4): Encuentra el valor mayor del arreglo y regresa su posicion.
     * El parametro "posMay" guarda la posicion del valor maximo que se va 
     * encontrando.
     * n tiene el total de elementos a recorrer menos 1.
     */    
    public static<T> int posMayArrRv(T ar[], int n, int posMay) {
        Comparable<T> temp;

        if ( ar==null || n<0 || n>ar.length-1 ) {
            throw new ParamErrException("<<nulo o fuera de rango>>");
        }
        
        if (n <= 0) {
            //Caso base.
            System.out.println("    --posMayArr, CASO BASE-- ");
        } else {
            // n > 0
            temp= (Comparable<T>) ar[n];
            if (temp.compareTo(ar[posMay]) > 0) {
                posMay = n;
            }
            // Caso Recursivo:  
            posMay = posMayArrRv(ar, n-1, posMay);
        }
        return posMay;
    }
    
    /**
     * 5): Eliminacion de todas la ocurrencias de un objeto de un arreglo.
     * Decide que parametros se necesitan y que tipo de resultado se requiere. 
     * n tiene el total de elementos a recorrer.
     */    
    
    private static<T> void eliminaOcurrencias(T[] arre, int n, T dato){
        if (n<0 || arre==null || dato==null)
            throw new ParamErrException("Parametros no validos");
        if (arre[n].equals(dato))
            arre[n]=null;
        if (n>=1)
        eliminaOcurrencias(arre,n-1,dato);
    }//method
    
    /**
     * 6): Ordenacion ascendente por seleccion directa.
     * Decide que parametros se necesitan y que tipo de resultado se requiere. 
     * Emplearemos dos metodos recursivos, substituyendo los dos ciclos
     * del algoritmo iterativo.
     */
    // Regresa el índice del minimo elemento
    // i y j son indices de los elementos del arreglo
    private static<T> int indMinRv(T arr[], int i, int j) {
        Comparable<T> temp;
        int min, tmin;

        if(i == j) {
            min = i;
        } else {
            // Rv. Encuentra el minimo entre el resto de los elementos
            tmin = indMinRv(arr, i+1, j);
            
            temp = (Comparable<T>) arr[tmin];
            if( temp.compareTo(arr[i]) < 0 ) {
                min = tmin;
            } else {
                min = i;
            }            
        }
        return min;       
    }
    
    // Seleccion directa recursiva
    // n es el tamaño del arreglo arr
    // ii es el indice del que usted considere el indice inicial
    public static<T> void selecDirRv(T arr[], int n, int ii) {
        int tmin = 0;
        T aux;

        if ( arr==null || n<0 || n>arr.length || ii<0) {
            throw new ParamErrException("<<nulo o fuera de rango>>");
        }

        if(ii >= n-1) {
            // Inidice inicial y tamaño son iguales
        } else {
            // Rv. Calculo del indice minimo
            tmin = indMinRv(arr, ii, n-1);  // n-1
        
            // Solo intercambia si son indices diferentes
            if( tmin != ii) {
                aux = arr[tmin];
                arr[tmin] = arr[ii];
                arr[ii] = aux;
                System.out.println("++Intercambio: " +tmin+ " <-->"+ii);
            }

            // Rv. Seleccion directa.
            selecDirRv(arr, n, ii+1);
        }
    }
    
}
