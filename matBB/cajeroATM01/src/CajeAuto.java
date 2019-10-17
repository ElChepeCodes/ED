/*
 * CajeAuto.java
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */
import javax.swing.*;
/**
 *
 * @author pmultiple
 */
public class CajeAuto {
    private Account cuenta;
    private char transac;
    private double money;
    private JTextArea myTextArea;
    
    /** Creates a new instance of CajeAuto */
    public CajeAuto(Account cta, JTextArea mta, char oper, double mon) {
        cuenta = cta;
        transac = oper;
        money = mon;
        myTextArea = mta;
    }
             
    public void runMain()
    {
        double saldo;

        switch(transac)
        {
           case 'B':
              libHilos.hacerTiem(1,1000);
              saldo = cuenta.getBalance();
              myTextArea.append("Balance: " + saldo + "\n");
              break;
           case 'D':
              libHilos.hacerTiem(1,1000);
              saldo = cuenta.deposit(money);
              myTextArea.append("Deposit: " + money + "\n");
              myTextArea.append("Balance: " + saldo + "\n");
              break;
           case 'W':
              libHilos.hacerTiem(1,1000);
              saldo = cuenta.withdraw(money);
              myTextArea.append("Withdraw: " + money + "\n");
              myTextArea.append("Balance: " + saldo + "\n");
              break;
           default:
              break;
        }
        myTextArea.append("CajeAuto.runMain() saliendo " + "\n");
        System.out.println("CajeAuto.runMain() saliendo ");
    }    
}
