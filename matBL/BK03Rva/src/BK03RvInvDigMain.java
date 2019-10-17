
/**
 * Ejercicios recursivos BK03.
 * InvDig (Invierte Digitos) de un numero entero
 * @author EDg2
 */
public class BK03RvInvDigMain {

    /**
     * Uso de los algoritmos InvDig
     * iterativo y recursivo
     */
    public static void main(String[] args) {
        int cifra, inver;

        cifra =456789;
        inver = InvDigIt( cifra );
        System.out.println(cifra + " - InvDigIt >> " + inver + "\n");        
        
        inver = InvDigRv( cifra);
        System.out.println(cifra + " - InvDigRv >> " + inver + "\n");        

        cifra = 0;        
        inver = InvDigIt( cifra );
        System.out.println(cifra + " - InvDigIt >> " + inver + "\n");        
        
        inver = InvDigRv( cifra);
        System.out.println(cifra + " - InvDigRv >> " + inver + "\n");  
    }

    /**
     * InvDig iterativo
     * Num
     * vc
     */
    public static int InvDigIt(int num)
    {  // Invirtiendo iterativamente, los digitos de un entero positivo
        if(num < 0) num = -num;
        int digito, inv;    

        inv = 0;
        while( num > 0) {
            digito = num % 10;
            inv =  inv*10 + digito;
            num = num /10;
            System.out.println("        InvDigIt: " + inv);
        }

        return inv;
    }
    
    public static int InvDigRv(int num){   // Invirtiendo, recursivamente, los digitos de un entero positivo
        int res;
        System.out.println(num);
        String t;
        if (num/10==0){
            res=num;
        }//if
        else{
            t=num+"";            
            res=(int) (InvDigRv(num/10)+(num%10)*Math.pow(10, t.length()-1));
        }//else
        return res;
    }
    
}
