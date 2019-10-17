package problema31Rv;

/**
 * Clase para Operaciones sobre Arreglos Bidimensionales o Matrices,
 * implementadas por los métodos recursivos de mas abajo.
 * Problema 31.
 * @author EDg1
 */
public class OperArrBidiRv {
    // Metodos de operaciones con matrices, por renglon o columna
    /**
     * Suma todos los elementos, de un renglon, de una matriz double.
     * m - renglon a sumar; n - total de columnas.
     */      
    public double sumElemRenM2d(double A[][], int m, int n) {
        
        if(A==null || m<0 || m>A.length-1 || n<0 || n>A[0].length)
            throw new ParamErrException("<nulo o fuera de rango>");
        double sum;
        
        if( n-1 <= 0 ) {    //o n<=1
            sum = A[m][0];   // Caso base
        } else {        // Caso recursivo, n>1
            sum = sumElemRenM2d(A, m, n-1) + A[m][n-1];
        }
        return sum;
    }

    /**
     * Suma todos los elementos, de una columna, de una matriz double.
     * m - total de renglones; n - columna a sumar.
     */      
    public double sumElemColM2d(double A[][], int m, int n) {
        
        if(A==null || m<0 || m>A.length|| n<0 || n>A[0].length-1)
            throw new ParamErrException("<nulo o fuera de rango>");
        double sum;
        
        if( m-1 <= 0 ) {    //o m<=1
            sum = A[0][n];   // Caso base
        } else {        // Caso recursivo, m>1
            sum = sumElemColM2d(A, m-1, n) + A[m-1][n];
        }
        return sum;
    }
    
    /**
     * Regresa una cadena con los elementos del renglon "m" de una
     * matriz A.
     * m - renglon a concatenar; n - total de columnas
     */
    public String toStringElemRenM2d(double A[][], int m, int n) {
        
        if(A==null || m<0 || m>A.length-1 || n<0 || n>A[0].length)
            throw new ParamErrException("<nulo o fuera de rango>");
        String cade;

        if( n-1 <= 0 ) {    //o n<=1
            cade = "" + A[m][0];   // Caso base
        } else {        // Caso recursivo, n>1
            cade = toStringElemRenM2d(A, m, n-1) + " " + A[m][n-1];
        }                
        return cade;
    }    

    // Metodos del problema 31
    /**
    1) sumaPorRenglon:
       Suma por renglon todos los elementos del arreglo bidimensional,
       regresando la suma total obtenida de toda la matriz.
       m - total de renglones; n - total de columnas
    */
    public double sumRenM2d(double A[][], int m, int n) {
        
        if(A==null || m<0 || m>A.length || n<0 || n>A[0].length)
            throw new ParamErrException("<nulo o fuera de rango>");
        double sum;
        
        if( m <= 0 ) {
            sum = 0;   // Caso base
        } else {        // Caso recursivo, m>0
            sum = sumElemRenM2d(A, m-1, n);
            sum = sumRenM2d(A, m-1, n) + sum;
        }
        return sum;
    }    

    /**
    2) sumaPorColumna:
       Suma por columna todos los elementos del arreglo bidimensional,
       regresando la suma obtenida de toda la matriz.
       m - total de renglones; n - total de columnas
    */
    public double sumColM2d(double A[][], int m, int n) {
        
        if(A==null || m<0 || m>A.length || n<0 || n>A[0].length)
            throw new ParamErrException("<nulo o fuera de rango>");
        double sum;
        
        if( n <= 0 ) {
            sum = 0;   // Caso base
        } else {        // Caso recursivo, n>0
            sum = sumElemColM2d(A, m, n-1);
            sum = sumColM2d(A, m, n-1) + sum;
        }
        return sum;
    }
    
    /* 
    3) toString():
       Regresa el contenido de la matriz en forma de cadena,
       con recorrido por renglones.
       m - total de renglones; n - total de columnas
    */    
    public String toStringRenM2d(double A[][], int m, int n) {
        
        if(A==null || m<0 || m>A.length || n<0 || n>A[0].length)
            throw new ParamErrException("<nulo o fuera de rango>");
        String cade;
        
        if( m <= 0 ) {
            cade = "";   // Caso base
        } else {        // Caso recursivo, m>0
            cade = toStringElemRenM2d(A, m-1, n);
            cade = toStringRenM2d(A, m-1, n) + "{" + cade + "} \n";
        }
        return cade;
    }

    /* 
    4) sumaDiagonalPrincipal:
       Regresa la suma de los elementos de la diagonal principal.
       La matriz debe ser cuadrada.
       mn - total de renglones, y total de columnas
    */
    public double sumDiagPrinM2d(double A[][], int mn) {
        
        if(A==null || mn<0 || mn>A.length || mn>A[0].length)
            throw new ParamErrException("<nulo o fuera de rango>");
        double sum;
        
        if( mn-1 <= 0 ) {
            sum = A[0][0];   // Caso base
        } else {        // Caso recursivo, mn>0
            sum = sumDiagPrinM2d(A, mn-1) + A[mn-1][mn-1];
        }
        return sum;
    }    

    /* 
    5) sumaMatrices:
       Suma dos matrices y regresa la matriz resultado Su=A+B.
       Matrices sumando A y B de la misma dimension "m"*"n".
       Recorrido por renglon.
       m - total de renglones; n - total de columnas
    */
    public double [][] sumaMatriRenM2(double A[][], double B[][],
            int m, int n ) {
        
        if(A==null || B == null ||
                m<0 || m>A.length || n<0 || n>A[0].length)
            throw new ParamErrException("<nulo o fuera de rango >");

        int vm, vn;
        double Su[][] = null;   // Matiz suma resultante
        
        if( (m-1 < 1) && (n-1 < 1) ) {    // Caso o casos base
            // m-1=0,    n-1=0;
            Su = new double[A.length][A[0].length];
        } else {    // Caso o casos recursivos, m-1>=1,  n-1>=1
            // Ahora ¿cambia de columna o de renglon?
            if( n-1 > 0 ) {
                vm = m;    vn = n-1;    // Cambio de columna "n-1"
            } else {    // n-1<=0
                vm = m-1;    vn = A[0].length;    // Cambio de renglon "m-1"
            }
            Su = sumaMatriRenM2(A, B, vm, vn);
        }
        Su[m-1][n-1] = A[m-1][n-1] + B[m-1][n-1];

        return Su;
    }

    /* 
    6) multiplicaMatrices:
       Multiplica dos matrices y regresa la matriz resultado.
       Pro(m,n) = A(m,p) * B(p,n)
       m - total de renglones de A y R, n - total de columnas de B y R, y
       p - total de columnas de A y total de renglones de B.
    */
    public double [][] multiMatriM2(double A[][], double B[][],
            int m, int n ) {
        
        if(A==null || B == null ||
                m<0 || m>A.length || n<0 || n>B[0].length ||
                A[0].length != B.length)
            throw new ParamErrException("<nulo o fuera de rango >");

        int vm, vn, p;
        double Pro[][] = null;    // Matriz producto        

        if( (m-1 < 1) && (n-1 < 1) ) {    // Caso base
            // m-1=0,    n-1=0;
            Pro = new double[A.length][B[0].length];
        } else {    // Caso o casos recursivos, m-1>=1,  n-1>=1
            // Ahora ¿cambia de columna o de renglon?
            if( n-1 > 0 ) {
                vm = m;    vn = n-1;    // Cambio de columna "n-1"
            } else {    // n-1<=0
                vm = m-1;    vn = B[0].length;    // Cambio de renglon "m-1"
            }
            Pro = multiMatriM2(A, B, vm, vn);
        }
        p = B.length;    // o, =A[0].length, columnas A = renglones B
        // "m" y "n" actuan como indice de renglon y numero de columna
        Pro[m-1][n-1] = sumaMultRenxColM2(A, B, m, n, p);
        
        return Pro;
    }

    /**
     * Ejercicio 31, 6): usada por multiMatriM2
       Regresa la suma de los terminos resultantes de multiplicar,
       * cada elemento del renglon "ma", de A, por cada elemnto de
       * la columna "nb", de B
       ma- indice de renglon de A
       nb- indice de columnas de B
       k- indice, de columnas de A y renglones de B
     */
    private double sumaMultRenxColM2(double [][] A, double [][] B,
        int ma, int nb, int k) {
        
        if(k<0 || k>B.length)
            throw new ParamErrException("<Fuera de rango>");

        double acum=0;
                
        if( k-1 <= 0 ) {    // Caso o casos base
            acum = A[ma-1][k-1]*B[k-1][nb-1];
        } else {        // Caso recursivo, k-1 > 0
            acum = sumaMultRenxColM2(A, B, ma, nb, k-1) + A[ma-1][k-1]*B[k-1][nb-1];
        }
        
        return acum;    
    }
    
}
