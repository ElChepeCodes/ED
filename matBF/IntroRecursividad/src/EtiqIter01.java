public class EtiqIter01
{
    public static void main(String args[])
    {
        // Ejercicios de impresiones.
        int ne = 3;
        String letrero = "            SALUDOS";
        // Rutina con metodo iterativo
        System.out.println("---Impresion iterativa de etiquetas");
        impNEtiq1(letrero, ne);
        System.out.println("Fin main");
    } // main
    
    public static void impNEtiq1(String etiqueta, int n)
    // Imprimir n etiquetas iterativa o ciclicamente.
    /*     F("SALUDOS",n)
    *         ciclo i=1 -> SALUDOS::1
    *         ciclo i=2 -> SALUDOS::2
    *         . . .
    *         ciclo i=n -> SALUDOS::n
    */
    {
        System.out.println("\nIN-impNEtiq1: n=" + n);
        int i;
        for(i=1; i<=n; i=i+1) {
            // Tarea
            System.out.println(etiqueta + "::" + i);
        }
        System.out.println("\nOUT-impNetiq1: n="+n+",  i="+i);
    } // impNEtiq1
} // class
