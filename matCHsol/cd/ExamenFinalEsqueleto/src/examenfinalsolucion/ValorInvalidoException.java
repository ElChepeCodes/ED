/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package examenfinalsolucion;

/**
 *
 * @author agomezdg
 */
public class ValorInvalidoException extends RuntimeException {
    public ValorInvalidoException() {
        super("No puede ser un valor negativo.");
    }
}
