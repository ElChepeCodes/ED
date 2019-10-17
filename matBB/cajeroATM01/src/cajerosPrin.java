/*
 * cajerosPrin.java
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

/**
 *
 * @author pmultiple
 */
public class cajerosPrin {
    
    /** Creates a new instance of cajerosPrin */
    public cajerosPrin() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Account myAccount = new Account("J. & J. Zorro", 10000.0);
        int mFam = 7;

        myAccount.print();
	myAccount.deposit(1000.00);
	myAccount.print();

        Teller myTeller1 = new Teller("frmATM - 1", myAccount);

        System.out.println("\n main(): ADIOS");
    }
    
}
