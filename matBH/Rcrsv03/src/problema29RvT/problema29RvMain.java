
package problema29RvT;

/**
 * 7) Aplicacion para probar los metodos del ejercicio 24
 * @author EDg1
 */
public class problema29RvMain {

    public static void main(String[] args) {
        // Prueba de los métodos del prob. 24.
        ArregloGenerico<Double> agD= new ArregloGenerico();
        Double ar[]= new Double[10];
        ar[0]= 200.0; ar[1]= 50.0; ar[2]= -15.0;
        ar[3]= 300.0; ar[4]= -60.0; 
        int cantValD= 5;
    
        // 1) Busqueda secuencial.
        System.out.println("\n1) Busqueda secuencial");
        double datoD= 200.0;
        int pos = agD.buscaSecRv(ar, cantValD-1, datoD);
        System.out.println("Bs. El dato: "+datoD+", está en la posicion: "+pos +"\n");

        datoD=  -15.0;
        pos = agD.buscaSecRv(ar, cantValD-1, datoD);
        System.out.println("Bs. El dato: "+datoD+", está en la posicion: "+pos+"\n");

        datoD=  16.0;
        pos = agD.buscaSecRv(ar, cantValD-1, datoD);
        System.out.println("Bs. El dato: "+datoD+", está en la posicion: "+pos+"\n");

        datoD= -60.0;
        pos = agD.buscaSecRv(ar, cantValD-1, datoD);
        System.out.println("Bs. El dato: "+datoD+", está en la posicion: "+pos+"\n");
        
        // 2) Busqueda binaria.
        System.out.println("\n2) Busqueda binaria");
        ArregloGenerico<Integer> agI= new ArregloGenerico();
        Integer ai[]= new Integer[10];
        ai[0]= -200; ai[1]=-50; ai[2]= 15;
        ai[3]= 60; ai[4]= 300;
        int cantValI = 5;
        int datoI = 60;
        pos = agI.buscaBinRv(ai, 0, cantValI-1, datoI);
        System.out.println("Bb. El dato: "+datoI+", está en la posicion: "+pos+"\n");

        datoI = -200;
        pos = agI.buscaBinRv(ai, 0, cantValI-1, datoI);
        System.out.println("Bb. El dato: "+datoI+", está en la posicion: "+pos+"\n");

        datoI = 300;
        pos = agI.buscaBinRv(ai, 0, cantValI-1, datoI);
        System.out.println("Bb. El dato: "+datoI+", está en la posicion: "+pos+"\n");

        datoI = -400;
        pos = agI.buscaBinRv(ai, 0, cantValI-1, datoI);
        System.out.println("Bb. El dato: "+datoI+", está en la posicion: "+pos+"\n");

        datoI = 670;
        pos = agI.buscaBinRv(ai, 0, cantValI-1, datoI);
        System.out.println("Bb. El dato: "+datoI+", está en la posicion: "+pos+"\n");

        // 3) Imprimir arreglo como String
        System.out.println("\n3) Imprimir arreglo como String");
        String ca = agD.toStringAg(ar, cantValD-1);
        System.out.println("tS. Los elementos de ar:\n" + ca + "\n");

        ca = agI.toStringAg(ai, cantValI-1);
        System.out.println("tS. Los elementos de ar:\n" + ca + "\n");
        
        // 4) Posición del mayor valor.
        System.out.println("\n4) Posición del mayor valor");
        pos = agD.posMayArrRv(ar, cantValD-1, 0);
        System.out.println("pM. El valor mayor " + ar[pos] +
                " está en la posicion: " + pos + "\n");

        pos = agD.posMayArrRv(ar, cantValD-1, 0);
        System.out.println("pM. El valor mayor " + ar[pos] +
                " está en la posicion: " + pos + "\n");

        // 5) Eliminacion de todas las ocurrencias de un objeto en un arreglo.
        System.out.println("\n5) Eliminacion de todas las ocurrencias de un objeto en un arreglo");
        
        // 6) Ordenamiento ascendente Seleccion Directa
        System.out.println("\n6) Ordenamiento ascendente Seleccion Directa");
        String cb = agD.toStringAg(ar, cantValD-1);
        System.out.println("tS. Los elementos de ar: " + cb);
        agD.selecDirRv(ar, cantValD, 0);
        cb = agD.toStringAg(ar, cantValD-1);
        System.out.println("tS. Los elementos de ar: " + cb + "\n");
        
        cb = agI.toStringAg(ai, cantValI-1);
        System.out.println("tS. Los elementos de ai: " + cb);
        agI.selecDirRv(ai, cantValI, 0);
        cb = agI.toStringAg(ai, cantValI-1);
        System.out.println("tS. Los elementos de ai: " + cb + "\n");
    }
    
}
