
package evalpostfix1;
import Stacks.*;

/**
 *
 * @author EDg1
 */
public class PostfixEvaluator {
  // Constantes para definir los operadores aritmeticos basicos.
  private final char ADD = '+';
  private final char SUBTRACT = '-';
  private final char MULTIPLY = '*';
  private final char DIVIDE = '/';
  
  // Pila o Stack de evaluacion
  private ArrayStack<Double> stack;
  
  //Constructor.
  public PostfixEvaluator() {
    stack = new ArrayStack<Double>();
  }

  /**
   * Evalua la operacion sufija especificada. Si se encuentra un operando,
   * se guarda en la pila. Si se encuentra un operador, se obtienen
   * los dos operandos del tope, se evalua la operacion y el resultado
   * se vuelve a guardar en la pila.
   * Regresa el valor (real) de la expresion (que es el unico que esta¡ 
   * en la pila).
   */
  public double evaluate (String exp) {
    double op1, op2, result = 0;
    int i= 0;
    char car;

    // Parsing
    for (i=0; i<exp.length(); i++) {
      car = exp.charAt(i);

      if (isOperator(car)) {
        op2 = stack.pop();
        op1 = stack.pop();
        result = evaluateSingleOperator (car, op1, op2);
        stack.push(result);
      }
      else {
          stack.push(new Double(Double.parseDouble(""+car)));
      }
        //stack.push(new Double(String.valueOf(car)));
    }
    result= stack.pop();
    return result;
  }
  
  /**
   * Determina si el caracter especificado es un operador.
   * Regresa verdadero, si lo es; falso, en caso contrario.
   */
  private boolean isOperator (char car) {
    return (car == ADD) || (car == SUBTRACT) ||
           (car == MULTIPLY) || (car == DIVIDE);
  }

  /**
   * Realiza una evaluacion sobre una expresion simple consistente
   * del operador especificado y dos operandos.
   * op1 es el primer operando y op2 el segundo.
   * Regresa el valor (real) de la expresion.
   */
  private double evaluateSingleOperator (char operation, double op1, double op2) {
    double result = 0;

    switch (operation) {
      case ADD:
        result = op1 + op2;
        break;
      case SUBTRACT:
        result = op1 - op2;
        break;
      case MULTIPLY:
        result = op1 * op2;
        break;
      case DIVIDE:
        result = op1 / op2;
    }
    return result;    
  }
    
}
