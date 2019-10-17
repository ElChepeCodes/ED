/**
 * ParamErrException: representa la situacion en la cual
 el parametro o los parametros no aplican a la operacion.
 */

package vectores1Rv;

public class ParamErrException extends RuntimeException {
   public ParamErrException (String s) {
      super ("\nEl(los) parametro(s) es(son) erroneo(s): \n" + s + "\n");
   }
}
