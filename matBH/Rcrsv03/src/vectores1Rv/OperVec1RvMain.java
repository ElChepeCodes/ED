package vectores1Rv;

/**
 * Operaciones Vectoriales, con Matrices de una dimension.
 * @author EDg1
 */
public class OperVec1RvMain {

    public static void main(String[] args) {
        OperVec1Rv uno = new OperVec1Rv();
        double [] F = {3., 4., 5.};
        double sumaElem = uno.sumElemVec1(F, F.length);
        System.out.println("sumaElem: " + sumaElem + "\n");
        
        double [] G = {6., -9., 5.};
        double [] R = new double[3];
        uno.suma2Vec1(F, G, R.length, R);

        String litxt = uno.toStringVec1(R, R.length);
        System.out.println(litxt+"\n");    }
    
}
