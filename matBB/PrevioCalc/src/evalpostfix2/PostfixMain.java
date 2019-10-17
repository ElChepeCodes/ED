/*
 * Probador del proceso de evaluacion Posfix.
 * Los Tokens OPERADORES son de un caracter.
 * Los Tokens OPERANDOS pueden ser de varios digitos.
 */

package evalpostfix2;
import java.util.Scanner;

/**
 * @author EDg2
 */
public class PostfixMain {

    public static void main(String[] args) {
        //Lee y evalua varias expresiones postfix
        String expre, again;
        double result;
        try {
            Scanner teclado = new Scanner(System.in);
            do {
                PostfixEvaluator eval = new PostfixEvaluator();
                System.out.println("La Expresion Postfix debe" +
                        "llevar un espacio entre sus Tokens.");
                System.out.print("Teclee una Expresion Postfix valida: ");
                expre = teclado.nextLine();
                System.out.println();
                result= eval.evaluate(expre);
                System.out.println("\nExpresion: " + expre +
                        "\nResultado= "+result);

                System.out.print("¿Evalua otra expresion[S/N]? ");
                again = teclado.nextLine();
                System.out.println();   
            }
            while(again.equalsIgnoreCase("s"));
        }
        catch(Exception objExp) {
            System.out.println(objExp.getMessage());
            objExp.printStackTrace();
        }

    }
    
}
