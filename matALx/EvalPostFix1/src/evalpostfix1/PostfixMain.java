package evalpostfix1;
import java.util.Scanner;

/**
 *
 * @author EDg1
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
                System.out.println("Teclee una expresion postfix valida." +
                        "Un token a la vez.");
                System.out.println("Cada token es de un caracter: ");
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
        }

    }
    
}
