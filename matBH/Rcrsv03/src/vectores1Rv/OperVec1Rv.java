
package vectores1Rv;

/**
 *
 * @author JRIOSS
 */
public class OperVec1Rv {
    /**
     * Suma de los elementos de un vector double.
     * Decide que parametros se necesitan y que tipo de resultado se requiere. 
     * vc tiene el total de la dimension de los elementos.
     */      
    public double sumElemVec1(double [] Vi, int vc)
    {   // Impresion ascendente (Backwards), Ejer 22
        double sum;
        if (vc<=1)
            sum=Vi[0];
        else
            sum=sumElemVec1(Vi, vc-1)+Vi[vc-1];
        return sum;
    }
    
    /**
     * Suma matricial de dos arreglos double.
     * Decide que parametros se necesitan y que tipo de resultado se requiere. 
     * n tiene el total de la dimension de los elementos.
     */    
    public void suma2Vec1(double [] A, double [] B, int n, double [] C){   // Suma matricial de dos vectores
        if (A==null || B==null || !(A.length==B.length && A.length==C.length))
        throw new ParamErrException("Parametros no validos");
    }        

    /**
     * Regresa en cadena los n elementos de un arreglo int.
     */
    public String toStringVec1(int [] Vec, int n)
    {   // Impresion ascendente (Backwards), en un String, Ejer23a

        return "vacio";
    }
    
    /**
     * Regresa en cadena los n elementos de un arreglo double.
     */
    public String toStringVec1(double [] Vec, int n)
    {   // Impresion ascendente (Backwards), en un String, Ejer23a

        return "vacio";
    }    
}
