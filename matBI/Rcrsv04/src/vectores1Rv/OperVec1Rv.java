/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vectores1Rv;

/**
 *
 * @author JRIOSS
 */
public class OperVec1Rv {
    /**
     * Suma de los elementos de un arreglo double.
     * Decide que parametros se necesitan y que tipo de resultado se requiere. 
     * vc tiene el total de la dimension de los elementos.
     */      
    public double sumElemVec1(double [] Vi, int vc) {
        double sum;
        if(Vi==null || vc<0 || vc>Vi.length)
            throw new ParamErrException("<nulo o fuera de rango>");
        
        if( vc-1 <= 0 ) {    //o vc <= 1
            // Caso o casos base
            System.out.println("-- CASO BASE sumElemM1d-- ");
            sum = Vi[0];
        } else {
            // Caso o casos recursivos, vc >= 0
            sum = sumElemVec1(Vi, vc-1) + Vi[vc-1];
        }
        return sum;
    }
    
    /**
     * Suma matricial de dos arreglos double.
     * Decide que parametros se necesitan y que tipo de resultado se requiere. 
     * n tiene el total de la dimension de los elementos.
     */    
    public void suma2Vec1(double [] A, double [] B, int n, double [] C) {
        // Suma matricial de dos vectores
        if( A==null || B==null || C==null || n<0 || n>C.length)
            throw new ParamErrException("<nulo o fuera de rango>");
        
        if( n-1 <= 0 ) {
            System.out.println("    -- CASO BASE sumMat1D-- ");
            C[0] = A[0] + B[0];
        } else {
            // Caso recursivo n >= 0
            C[n-1] = A[n-1] + B[n-1];
            suma2Vec1(A, B, n-1, C);
        }
    }        

    /**
     * Regresa en cadena los n elementos de un arreglo int.
     */
    public String toStringVec1(int [] Vec, int n) {
        String cade;
        
        if(Vec==null || n<0 || n>Vec.length) {
            throw new ParamErrException("<nulo o fuera de rango >");
        }
        
        if( n-1 <= 0 ) {
            // Caso base
            System.out.println("    --toStringM1, CASO BASE-- ");
            cade = "" + Vec[n-1];
        } else {
            // Caso recursivo, vc > 0, o vc >= 1
            cade = toStringVec1(Vec, n-1) + " " + Vec[n-1];
        }
        return cade;
    }
    
    /**
     * Regresa en cadena los n elementos de un arreglo double. Sobrecarga.
     */
    public String toStringVec1(double [] Vec, int n) {
        String cade;
        
        if(Vec==null || n<0 || n>Vec.length) {
            throw new ParamErrException("<nulo o fuera de rango>");
        }
        
        if( n-1 <= 0 ) {
            // Caso base
            System.out.println("    --toStringM1, CASO BASE-- ");
            cade = "" + Vec[n-1];
        } else {
            // Caso recursivo, vc > 0, o vc >= 1
            cade = toStringVec1(Vec, n-1) + " " + Vec[n-1];
        }
        return cade;
    }    
}
