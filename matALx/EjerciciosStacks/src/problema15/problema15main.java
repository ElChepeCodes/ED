package problema15;
import Stacks.*;

/**
 *
 * @author EDg1
 */
public class problema15main {
    
    public static<T> boolean contienePila(ArrayStack<T> st1, ArrayStack<T> st2){
        boolean res=false;
        if (st2.size()<=st1.size()){
            ArrayStack<T> temp1= new ArrayStack();
            ArrayStack<T> temp2= new ArrayStack();
            res=true;
            temp1=st1;
            temp2=st2;
            int cont=0;
            while (!temp2.isEmpty() && res==true){
                System.out.println("While1");
                while(!temp1.isEmpty() && !temp1.peek().equals(temp2.peek()) ){
                    temp1.pop();
                    System.out.println("While2");
                }//while
                if (!temp1.isEmpty() && temp1.peek().equals(temp2.peek())){
                System.out.println("If1");
                    temp1.pop();
                    temp2.pop();
                }//if
                else
                    res=false;
                temp1=st1;
                
            }//while
        }//if
        return res;
    }//method

   /* public static void main(String[] args) {
        ArrayStack<Integer> pilaInt1 = new ArrayStack<Integer>();
        ArrayStack<Integer> pilaInt2 = new ArrayStack<Integer>();

        pilaInt1.push(10);    pilaInt1.push(-20);
        pilaInt1.push(100);   pilaInt1.push(40);
        
        pilaInt2.push(40);    pilaInt2.push(-20);
        
        System.out.println("\n---- PRUEBA 1 ----");
        System.out.print("pilaInt1: " + pilaInt1.toString());
        System.out.println(" ---- pilaInt2: " + pilaInt2.toString());
        
        System.out.println("---- PRUEBA 2 ----");
        System.out.println("¿pilaInt1 contiene a pilanInt2: " + 
                contienePila(pilaInt1, pilaInt2) );

        System.out.println("---- COMPROBACION ----");
        System.out.print("pilaInt1: " + pilaInt1.toString());
        System.out.println(" ---- pilaInt2: " + pilaInt2.toString());
        
        pilaInt2.push(-10);    pilaInt2.push(100);        

        System.out.println("\n---- PRUEBA 3 ----");
        System.out.print("pilaInt1: " + pilaInt1.toString());
        System.out.println(" ---- pilaInt2: " + pilaInt2.toString());
        
        System.out.println("---- PRUEBA 4 ----");
        System.out.println("¿pilaInt1 contiene a pilanInt2: " + 
                contienePila(pilaInt1, pilaInt2) );

        System.out.println("---- COMPROBACION ----");
        System.out.print("pilaInt1: " + pilaInt1.toString());
        System.out.println(" ---- pilaInt2: " + pilaInt2.toString());
    }
    
    // Problema 15, esta la pila2 contenida en pila2?
    public static <T> boolean pilaEnPila(ArrayStack<T> pila1,
            ArrayStack<T> pila2) {

        
        return false;
    }
 */   
}
