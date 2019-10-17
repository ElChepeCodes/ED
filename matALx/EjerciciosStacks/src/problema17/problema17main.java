
package problema17;
import Stacks.*;

/**
 *
 * @author EDg1
 */
public class problema17main {
    
    
    public static <T> void quitaRepetidos(ArrayStack<T> st){
        ArrayStack<T>temp=new ArrayStack();
        if (!st.isEmpty()){
            
            temp.push(st.pop());
        while (!st.isEmpty()){
            
            if (temp.peek().equals(st.peek())){
            
                st.pop();
            }
        else
                temp.push(st.pop());
            
        }
        while(!temp.isEmpty())
            st.push(temp.pop());
            }    
    }//method

    public static void main(String[] args) {
        ArrayStack<Double> pilaDbl = new ArrayStack<Double>();


        pilaDbl.push(-50.0);    pilaDbl.push(-50.0);    pilaDbl.push(10.0);
        pilaDbl.push(-20.0);    pilaDbl.push(-20.0);
        pilaDbl.push(100.0);    pilaDbl.push(100.0);    pilaDbl.push(100.0);
        pilaDbl.push(40.0);

        System.out.println("\n---- PRUEBA 1 ----");
        System.out.println("pilaDbl: " + pilaDbl.toString());
        
        System.out.println("---- PRUEBA 2 ----");
        quitaRepetidos(pilaDbl);

        System.out.println("---- COMPROBACION ----");
        System.out.println("pilaDbl: " + pilaDbl.toString());
               
    }
    

}
