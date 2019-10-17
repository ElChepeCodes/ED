
//

/**
 * Manejo con la superclase Exception
 * @author EDg2
 */
public class ExcepB2Cmain {

    public static void main(String[] args) {
        System.out.println("\nPRUEBA 1");
        int en;
        System.out.print("De un dato entero: ");
        en = miscel.zint();
        en = en + 3;
        System.out.println("en= " + en + "\n");
        
        System.out.println("\nPRUEBA 2");
        boolean bo;
        System.out.print("De un dato booleano: ");
        bo = miscel.zboolean();
        bo = !bo;
        System.out.println("bo= " + bo + "\n");
        
        System.out.println("\nPRUEBA 3");
        String str;
        str = "-780";
        try {
            en = miscel.convInt(str);
        } catch (Exception e) {
            System.out.println("main()1, Exception e.toString(): " + e.toString());            
            en = -1000;
        }
        System.out.println("en(de String)= " + en + "\n");        

        System.out.println("\nPRUEBA 4");
        str = "1a36";
        try {
            en = miscel.convInt(str);
        } catch (Exception e) {
            System.out.println("main()2, Exception e.toString(): " + e.toString());            
            en = -2000;
        }        
        System.out.println("en(de String)= " + en + "\n");
        
        System.out.println("\n ADIOS");
    }
    
}
