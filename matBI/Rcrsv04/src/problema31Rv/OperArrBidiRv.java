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
        if (n-1<=0)
            sum=A[m][0];
        else
            sum=sumElemRenM2d(A, m, n-1)+A[m][n-1];
        
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
        if (m-1<=0)
            sum=A[0][n];
        else
            sum=sumElemColM2d(A, m-1, n)+A[m-1][n];
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
                if (n-1<=0)
            cade=""+A[m][0];
        else
            cade=toStringElemRenM2d(A, m, n-1)+";"+A[m][n-1];
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
        if (m-1<=0)
            sum=sumElemRenM2d(A,0,n);
        else
            sum=sumElemRenM2d(A, m-1, n)+sumRenM2d(A,m-1,n);
        
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
        if (n<=0)
            sum=0;
        else
            sum=sumElemColM2d(A, m, n-1)+sumColM2d(A,m,n-1);
        
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
        if (m<=0)
            cade="";
        else
            cade=toStringRenM2d(A,m-1,n)+"\n"+toStringElemRenM2d(A, m-1, n);
        
        
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
        if(mn-1<=0)
            sum=A[0][0];
        else
            sum=A[mn-1][mn-1]+sumDiagPrinM2d(A,mn-1);
        return sum;
    }    

    /* 
    5) sumaMatrices:
       Suma dos matrices y regresa la matriz resultado R=A+B.
       Matrices sumando A y B de la misma dimension "m"*"n".
       Recorrido por renglon.
       m - total de renglones; n - total de columnas
    */
public static double[][] sumaMatrizRenM2(double[][] matrizA, double[][] matrizB, int reng, int col) {
        
        if (matrizA.length!=matrizB.length || matrizA[0].length!=matrizB[0].length || matrizA == null || matrizB == null ||
            reng > matrizA.length || col > matrizA[0].length) {
            throw new ParamErrException("Parametros no validos");
        }
        
        double[][] matrizC;
        
        if (reng<1 && col<1) {
            matrizC = new double[matrizA.length][matrizA[0].length];
            matrizC[0][0] = matrizA[0][0] + matrizB[0][0];
        } else {
            if(col<0) {
                matrizC = sumaMatrizRenM2(matrizA, matrizB, reng-1, matrizA[0].length-1);
            } else {
                matrizC = sumaMatrizRenM2(matrizA, matrizB, reng, col-1);
                matrizC[reng][col] = matrizA[reng][col] + matrizB[reng][col];
            }
        }
        
        return matrizC;
    }
    /* 
    6) multiplicaMatrices:
       Multiplica dos matrices y regresa la matriz resultado.
       R(m,n) = A(m,p) * B(p,n)
       m - total de renglones de A y R, n - total de columnas de B y R, y
       p - total de columnas de A y total de renglones de B.
    */

     public double[][] multiMatriM2(double [][] A,double [][] B){
        if (A==null || B==null || A[0].length!=B.length)
            throw new ParamErrException("Parametros no validos");
       double[][] C= new double[A.length][B[0].length];
           multiplicacionMatriz(A, B, C, 0);

       return C;
     }//method
 
   private void multiplicacionMatriz(double [][] A,double [][] B,double [][]C,int i){
 
       if (i<A.length){
           multiplicacionMatriz(A,B,C,i,0);
           multiplicacionMatriz(A,B,C,i+1);
       }//if
   }//method

   private void multiplicacionMatriz(double [][]A,double [][]B,double [][]C,int i,int j){
       if (j<B[0].length){
           multiplicacionMatriz(A,B,C,i,j,0);
           multiplicacionMatriz(A,B,C,i,j+1);
       }//if
   }//method

   private void multiplicacionMatriz(double [][]A,double [][]B,double [][]C,int i,int j,int k){
       if (k<A[0].length){
           C[i][j] += A[i][k] * B[k][j];
           multiplicacionMatriz(A,B,C,i,j,k+1);
       }//if
   }//method
 
   
}//class
