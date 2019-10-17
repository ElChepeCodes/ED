public class EtiqRcrsvddFw03p
{
    public static void main(String args[]) {
        // Ejercicios de impresiones.
        int ne = 3;
        String letrero = "            SALUDOS";
        // Rutina con metodo recursivo, forwards
        System.out.println("---Impresion recursiva de etiquetas (forwards)");
        impNEtiq3(letrero, 1, ne);
        System.out.println("Fin main");
    } // main
    

    public static void impNEtiq3(String etiqueta, int i, int n)
    // Imprimir n etiquetas recursivamente (forwards).
    /*   F("SALUDOS",1,n)
     *       SALUDOS::1
     *       F("SALUDOS",2,n)
     *           SALUDOS::2
     *           F("SALUDOS",3,n)
     *            . . .
     *                            SALUDOS::n-1
     *                            F("SALUDOS",n,n)
     *                                SALUDOS::n
     */
    {
        System.out.println("\nIN-impNetiq2: i="+i+",  n="+n);

        // Tarea
        System.out.println(etiqueta + "::" + i);

        if(i>=n) {
            // caso base, detener de invocarse, con i>=n
            System.out.println("    La base: i=" + i + ": n=" + n);
        } else {
            // caso recursivo, con i<n
            impNEtiq3(etiqueta, i+1, n);
        }
        System.out.println("\nOUT-impNetiq2: i="+i+",  n="+n);
    } // impNEtiq3
} // class
