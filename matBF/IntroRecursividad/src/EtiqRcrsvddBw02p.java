public class EtiqRcrsvddBw02p
{
    public static void main(String args[]) {
        // Ejercicios de impresiones.
        int ne = 3;
        String letrero = "            SALUDOS";
        // Rutina con metodo recursivo, backwards
        System.out.println("---Impresion recursiva de etiquetas (backwards)");
        impNEtiq2(letrero, ne);
        System.out.println("Fin main");
    } // main
    
    public static void impNEtiq2(String etiqueta, int n)
    // Imprimir n etiquetas recursivamente (backwards).
    /*   F("SALUDOS",n)
    *       F("SALUDOS",n-1)
    *           F("SALUDOS",n-2)
    *               . . .
    *                            F("SALUDOS",1)
    *                                SALUDOS::1
    *                            SALUDOS::2
    *               . . .
    *           SALUDOS::n-1
    *       SALUDOS::n
    */
    {
        System.out.println("\nIN-impNetiq3: n=" + n);
        if(n<=1) {
            // caso base, detener de invocarse, con n<=1
            System.out.println("    La base: n=" + n);
        } else {
            // caso recursivo, con n>1
            impNEtiq2(etiqueta, n-1);
        }

        // Tarea
        System.out.println(etiqueta + "::" + n);

        System.out.println("\nOUT-impNetiq3: n=" + n);
    } // impNEtiq2
} // class