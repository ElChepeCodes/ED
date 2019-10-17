package Problema45xLnkStr;
import LinkedStructures.*;

/**
 * Problema 45, sobre Linked Structures
 * @author EDg1
 */
public class Problema45xLnkStrMain {
    public static void main(String[] args) {

        System.out.println("\n1)- Ambas LS con la misma cantidad de elementos");
        LinkedStruct<Integer> X = new LinkedStruct();
        X.add(11, 1);    X.add(14, 2);    X.add(16, 3);        
        LinkedStruct<Integer> Y = new LinkedStruct();
        Y.add(23, 1);    Y.add(25, 2);    Y.add(27, 3);

        int tnodos = X.mezclaNodos(Y);
        System.out.println( "X: " + X.size() + "    Y: " + Y.size() );
        System.out.println( "X: " + X.toString() + "    tnodos: " + tnodos);
        
        System.out.println("\n2)- otraLS tiene menos elementos ");
        X = new LinkedStruct();
        X.add(11, 1);    X.add(14, 2);    X.add(16, 3);    X.add(18, 4);        
        Y = new LinkedStruct();
        Y.add(23, 1);    Y.add(25, 2);

        tnodos = X.mezclaNodos(Y);
        System.out.println( "X: " + X.size() + "    Y: " + Y.size() );
        System.out.println( "X: " + X.toString() + "    tnodos: " + tnodos);

        System.out.println("\n3)- otraLS tiene mas elementos ");
        X = new LinkedStruct();
        X.add(11, 1);    X.add(14, 2);        
        Y = new LinkedStruct();
        Y.add(23, 1);    Y.add(25, 2);    Y.add(27, 3);    Y.add(29, 4);

        tnodos = X.mezclaNodos(Y);
        System.out.println( "X: " + X.size() + "    Y: " + Y.size() );
        System.out.println( "X: " + X.toString() + "    tnodos: " + tnodos);

    }
    
}
