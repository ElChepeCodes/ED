
package problema29RvT;

/**
 * Ejercicio 29 de Recursividad, sobre arreglo generico.
 * @author EDg1
 */
public class ArregloGenerico <T> {
    /**
     * 1): Busca secuencial y recursivamente un dato en un arreglo generico.
     * Regresa la posicion en que esta o -1, si no existe en el arreglo.
     * n tiene el total de elementos a recorrer -1.
     * El arreglo "ag", puede o no estar ordenado.
     */
    public int buscaSecRv(T ag[], int n, T dato) {    
        int pos;
        
        if (ag==null || n<-1 || n>ag.length-1) {
            throw new ParamErrException("<<nulo o fuera de rango>>");
        }
        
        if (n<0) {  //<=0
            pos = -1;   //Caso base 1: el dato no existe.
            System.out.println("    -- buscaSec, CASO BASE 1-- ");
        } else {    // n>=0
            if (ag[n].equals(dato)) {
                pos = n;   //Caso base 2: se regresa la posicion del dato.
                System.out.println("    -- buscaSec, CASO BASE 2-- ");
            } else {      
                pos = buscaSecRv(ag, n-1, dato);  //Caso recursivo. Todavia falta.
            }
        }
        return pos;
    }
    
    /**
     * 2): Búsqueda binaria: recibe un dato y regresa la posicion en la
     * que esta o el negativo de la posicion +1 en la que deberia estar.
     * Inicialmente, "izq" tendra 0 y "der" el valor ag.length-1.
     * El arreglo "ag" deberá estar ordenado de manera ascendente.
     */
    public int buscaBinRv(T ag[], int izq, int der, T dato) {    
        Comparable<T> temp;
        int cen, pos;
        
        if ( ag==null || dato==null || izq<0 || der>ag.length-1 ) {
            throw new ParamErrException("<nulo o fuera de rango>");
        }
        
        cen = (izq+der)/2;
        if (izq > der) {   //Caso bases 1 y 2: el dato no existe.
            if( der <= 0 ) {
                pos = -1;
                System.out.println("    -- buscaBin, CASO BASE 1-- ");
            } else {
                pos = -(cen+1);
                System.out.println("    -- buscaBin, CASO BASE 2-- ");
            }
        } else {    // izq <= der
            if( ag[cen].equals(dato)) {
                pos = cen;   //Caso base 3: el dato existe.
                System.out.println("    -- buscaBin, CASO BASE 3-- ");
            } else {
                // No se ha encontrado el dato
                temp= (Comparable<T>) ag[cen];
                if (temp.compareTo(dato) < 0) {
                    izq = cen + 1;   //Caso base 2: se regresa la posicion del dato.
                } else {
                    der = cen - 1;
                }
                //Caso recursivo. Todavia falta.
                pos  = buscaBinRv(ag, izq, der, dato);                    
            }
        }
        return pos;
    }
   
    /**
     * 3): Recorre secuencial y recursivamente un dato en un arreglo generico.
     * Regresa contenido del arreglo en forma de cadena.
     * vc tiene el total de elementos a recorrer - 1.
     */
    public String toStringAg(T [] Vi, int vc) {
        if( Vi==null || vc<0 || vc>Vi.length-1 ) {
            throw new ParamErrException("<<nulo o fuera de rango>>");
        }

        String cade;
                
        if( vc < 1 ) {
            // Caso base
            System.out.println("    --toStringAg, CASO BASE-- ");
            cade = "" + Vi[0] + " ";
        } else {
            // Caso recursivo, vc >=0, o vc >= 1
            cade = toStringAg(Vi, vc-1) + " " + Vi[vc];
        }
        return cade;
    }
    
    /**
     * 4): Encuentra el valor mayor del arreglo y regresa su posicion.
     * El parametro "posMay" guarda la posicion del valor maximo que se va 
     * encontrando.
     * n tiene el total de elementos a recorrer menos 1.
     */   
    public int posMayArrRv(T ar[], int n) {
        if ( ar==null || n<0 || n>ar.length-1 ) {
            throw new ParamErrException("<<nulo o fuera de rango>>");
        }
        int posMay;
        if (n <= 0) {
            //Caso base. El del mayor dado inicialmente.
            System.out.println("    --posMayArr, CASO BASE-- ");
            posMay = 0;
        } else {  // n > 0
            // Caso Recursivo:  
            posMay = posMayArrRv(ar, n-1);
            Comparable<T> temp;
            temp= (Comparable<T>) ar[n];
            if (temp.compareTo(ar[posMay]) > 0) {
                posMay = n;
            }
        }
        return posMay;
    }
    
    /**
     * 5): Eliminacion de todas la ocurrencias de un objeto de un arreglo.
     * Decide que parametros se necesitan y que tipo de resultado se requiere. 
     * n tiene el total de elementos a recorrer menos 1.
     */
    public int elimObjArrRv( T ar[], int n, T obj) {
        if ( ar==null || obj==null || n<-1 || n>ar.length-1 ) {
            throw new ParamErrException("<<nulo o fuera de rango>>");
        }
        int ocur;
        if( n < 0 ) {
            System.out.println("Caso Base");  // Caso Base
            ocur = 0;
        } else {
            ocur = elimObjArrRv(ar, n-1, obj);
            if( ar[n].equals(obj) ) {
                ar[n] = null;
                ocur = ocur + 1;
            }
        }
        return ocur;
    }
    
    /**
     * 6): Ordenacion ascendente por seleccion directa.
     * Decide que parametros se necesitan y que tipo de resultado se requiere. 
     * Emplearemos dos metodos recursivos, substituyendo los dos ciclos
     * del algoritmo iterativo.
     */
    // Regresa el índice del minimo elemento
    // i y j son indices de los elementos del arreglo
    private int indMinRv(T arr[], int i, int j) {
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
    public void selecDirRv(T arr[], int n, int ii) {
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
