package sumaRvBw;

/**
 * Sumatoria entera Recursiva Backwards
 * @author EDg1
 */
public class sumaRvMain {
    
    public static void main(String[] args) {
        int ne = 4;
        int total = sumaRvbi(ne);
        System.out.println("total: " + total + "\n");
    }    

    // Metodo sumatorio recursivo, Backwards, con enteros
    public static int sumaRvbi(int n) {
        int sum;
        if(n==1) {  // caso base, o no recursivo
            sum = 1;
        } else {  // caso recursivo, con n>1
            sum = sumaRvbi(n-1) + n;
        }
        System.out.println("    sumaRvbi, parcial: " + sum);
        return sum;
    }
        
}
