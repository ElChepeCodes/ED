/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema31Rv;

/**
 * Aplicacion del problema 31.
 * @author EDg1
 */
public class Problema31RvMain {

    public static void main(String[] args) {
        OperArrBidiRv oma = new OperArrBidiRv();
        double A[][]= new double[3][3];
        double C[][];
        double suma1, suma2, suma3;
        String cade1, cade2;
        int tren=3, tcol=3;
    
        A[0][0]= 1.; A[0][1]= 2.; A[0][2]= 3.; 
        A[1][0]= 4.; A[1][1]= 5.; A[1][2]= 6.; 
        A[2][0]= 7.; A[2][1]= 8.; A[2][2]= 9.;
        
        double B[][]= { {11., 12., 13.},
                        {14., 15., 16.},
                        {17., 18., 19.} };
         
        suma1 = oma.sumElemRenM2d(A, 1, tcol);
        System.out.println("Suma renglon 1 de A: " + suma1);
         
        suma2 = oma.sumElemRenM2d(B, 2, tcol);
        System.out.println("\nSuma renglon 2 de B: " + suma2);
        
        suma3 = oma.sumElemColM2d(B, tren, 1);
        System.out.println("\nSuma columna 1 de B: " + suma3);

        cade1 = oma.toStringElemRenM2d(B, 1, tcol);
        System.out.println("\nCadena renglon 1 de B: {" + cade1 + "}");
        
        System.out.println("\n31.1) Suma por renglones de matriz");
        suma1 = oma.sumRenM2d(A, tren, tcol);
        System.out.println("Suma total de A, por renglones: " + suma1);

        System.out.println("\n31.2) Suma por columnas de matriz");
        suma2 = oma.sumColM2d(B, tren, tcol);
        System.out.println("Suma total de B, por columnas: " + suma2);

        System.out.println("\n31.3) Cadena de los elementos de una matriz");
        cade2 = oma.toStringRenM2d(B, tren, tcol);
        System.out.println("Cadena total de B: { " + cade2 + "}");
        
        System.out.println("\n31.4) Suma de la diag prin de una matriz");
        suma3 = oma.sumDiagPrinM2d(A, tren);    // matriz cuadrada
        System.out.println("Suma de la diagonal principal de A: " + suma3);

        System.out.println("\n31.5) Suma matricial de dos matrices");
        System.out.println("Matriz A: \n" + oma.toStringRenM2d(A, tren, tcol));
        System.out.println("Matriz B: \n" + oma.toStringRenM2d(B, tren, tcol));
        C = oma.sumaMatriRenM2(A, B, tren, tcol);
        System.out.println("C= A * B: \n" + oma.toStringRenM2d(C, tren, tcol));

        System.out.println("\n31.6) Multiplicacion matricial");
        double [][] X = { {0.0, 1.0},    // (3,2)
                          {10.0, 11.0},
                          {20.0, 21.0}};
        
        double [][] Y = { {0.0, 1.0, 2.0, 3.0},    // (2,4)
                          {10.0, 11.0, 12.0, 13.0} };
        
        double [][] Z, W;  
        
        System.out.println("Matriz X: \n" + oma.toStringRenM2d(X, 3, 2));
        System.out.println("Matriz Y: \n" + oma.toStringRenM2d(Y, 2, 4));
        Z = oma.multiMatriM2(X, Y, 3, 4);
        System.out.println("Z= X * Y: \n" + oma.toStringRenM2d(Z, 3, 4));
        
    }
    
}
