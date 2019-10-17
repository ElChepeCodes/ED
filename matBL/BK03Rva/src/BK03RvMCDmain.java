
/**
 * Ejercicios recursivos BK03.
 * MCD de dos numeros enteros
 * @author EDg2
 */
public class BK03RvMCDmain {

    /**
     * Uso de los algoritmos MCD
     * iterativos y recursivos
     */
    public static void main(String[] args) {
        System.out.println("\nMCD ITERATIVOS.\n");
        int i, j, k, a, b, c, d, e, f;

        a=8;    b=4;
        i=MCDit(a,b);
        System.out.println("MCDit("+a+","+b+"): " + i +"\n");

        c=24;    d=30;
        j=MCDit(c,d);
        System.out.println("MCDit("+c+","+d+"): " + j +"\n");

        e=35;    f=33;
        k=MCDit(e,f);
        System.out.println("MCDit("+e+","+f+"): " + k +"\n");
        

        System.out.println("\n=====================================");
        System.out.println("\nMCD RECURSIVOS.\n");
        
        a=8;    b=4;
        i=MCDrv(a,b);
        System.out.println("MCDrv("+a+","+b+"): " + i +"\n");

        c=24;    d=30;
        j=MCDrv(c,d);
        System.out.println("MCDrv("+c+","+d+"): " + j +"\n");

        e=35;    f=33;
        k=MCDrv(e,f);
        System.out.println("MCDrv("+e+","+f+"): " + k +"\n");

        
    }
    
    /**
     * MCD iterativo
     * Parametros ma y nb deben ser enteros positivos.
     */
    public static int MCDit(int ma, int nb)
    {
        // Ajustando a positivos.
        if( ma < 0 )    ma = -ma;
        if( nb < 0 )    nb = -nb;

        int nbx;
        System.out.println("    sig MCDit("+ma+", "+nb+")");

        while ( nb != 0 )
        {
            if( ma < nb) {
                // ma < nb; hace MCD(ma, nb) >> MCD(nb, ma)
                nbx = nb;
                nb = ma;
                ma = nbx;  // volviendo a MCD(ma,nb)
            } else {
                // ma >= nb; hace MCD(ma, nb) >> MCD(nb, ma mod nb)
                nbx = nb;
                nb = ma % nb;
                ma = nbx;  // volviendo a MCD(ma,nb)
            }
            System.out.println("    sig MCDid("+ma+", "+nb+")");
        }
        return ma;
    }

    /**
     * MCD recursivo
     * Parametros ma y nb deben ser enteros positivos.
     */
        
    public static int MCDrv(int a, int b){
        int res;
        if (a<0)a*=-1;
        if(b<0)b*=-1;
        if(b==0)
            res=a;
        else
            if (a<b)
                res=MCDrv(b,a);
            else
                res=MCDrv(b,a%b);
        
        return res;
    }
        
}
