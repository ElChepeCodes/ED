//

/**
 * Clase para usar la excepcion
 * @author EDg1
 */
public class ObSu {
    // Atributos
   private int su;

   // Constructor
   public ObSu(int i, int j) {  
       su = i + j;
   }   // Constructor ObSu.

   // Metodos
   public int getSu()
   {
      return su;
   }   // Metodo Tomar.

   // Checa por "su" negativo
   public void CheNe() throws Ne_Excep
   {
      if( su < 0 )
      {
         Ne_Excep problema = new Ne_Excep("Valor Negativo: " + su);
         throw problema;
      }
      System.out.println("CheNe: Saliendo.");
   }   // Metodo CheNe.
    
}
