/*
 * Estructuras de datos
 * Autores: 
    Jose Luis Gutierrez Espinosa
    Andrés Navarrete
    Andrés Quevedo
    Bruno Vitte San Juan
    
 */
package proyectocalculadora;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorCalculadora extends VistaCalculadora{
    private static final long serialVersionUID = 1L;
    
    public ControladorCalculadora(String t) {
        super(t);
        Bt0.addActionListener(new escuchadorBt0());
        Bt1.addActionListener(new escuchadorBt1());
        Bt2.addActionListener(new escuchadorBt2());
        Bt3.addActionListener(new escuchadorBt3());
        Bt4.addActionListener(new escuchadorBt4());
        Bt5.addActionListener(new escuchadorBt5());
        Bt6.addActionListener(new escuchadorBt6());
        Bt7.addActionListener(new escuchadorBt7());
        Bt8.addActionListener(new escuchadorBt8());
        Bt9.addActionListener(new escuchadorBt9());
        BtC.addActionListener(new escuchadorBtC());
        BtCE.addActionListener(new escuchadorBtCE());
        BtSum.addActionListener(new escuchadorBtSum());
        BtPunto.addActionListener(new escuchadorBtPunto());
        BtIgual.addActionListener(new escuchadorBtIgual());
        BtResta.addActionListener(new escuchadorBtResta());
        BtMult.addActionListener(new escuchadorBtMult());
        BtDiv.addActionListener(new escuchadorBtDiv());
        BtAbreP.addActionListener(new escuchadorBtAbreP());
        BtCierraP.addActionListener(new escuchadorBtCierraP());
    }//builder

    private class escuchadorBtCE implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            expre="";
        Display.setText(expre);
        }
    }

    private class escuchadorBt0 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            expre=Display.getText();
        if (expre.equals("0.0"))
          expre="0";
      else
      expre+="0";
      Display.setText(expre);
        }
    }

    private class escuchadorBt1 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            expre=Display.getText();
        if (expre.equals("0.0"))
          expre="1";
      else
        expre+="1";
        Display.setText(expre);
        }
    }

    private class escuchadorBt2 implements ActionListener {


        @Override
        public void actionPerformed(ActionEvent e) {
           expre=Display.getText();
        if (expre.equals("0.0"))
          expre="2";
      else
        expre+="2";
        Display.setText(expre);
        }
    }

    private class escuchadorBt3 implements ActionListener {

   
        @Override
        public void actionPerformed(ActionEvent e) {
          expre=Display.getText();
        if (expre.equals("0.0"))
          expre="3";
      else
            expre+="3";
        Display.setText(expre);
        }
    }

    private class escuchadorBt4 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            expre=Display.getText();
        if (expre.equals("0.0"))
          expre="4";
      else
        expre+="4";
        Display.setText(expre);
        }
    }

    private  class escuchadorBt5 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
           expre=Display.getText();
        if (expre.equals("0.0"))
          expre="5";
      else
        expre+="5";
        Display.setText(expre);
        }
    }

    private class escuchadorBt6 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
             expre=Display.getText();
        if (expre.equals("0.0"))
          expre="6";
      else
        expre+="6";
        Display.setText(expre);
        }
    }

    private class escuchadorBt7 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            expre=Display.getText();
        if (expre.equals("0.0"))
          expre="7";
      else
        expre+="7";
        Display.setText(expre);
        }
    }

    private class escuchadorBt8 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
             expre=Display.getText();
        if (expre.equals("0.0"))
          expre="8";
      else
        expre+="8";
        Display.setText(expre);
        }
    }

    private class escuchadorBt9 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            expre=Display.getText();
        if (expre.equals("0.0"))
          expre="9";
      else
        expre+="9";
        Display.setText(expre);
        }
    }

    private class escuchadorBtC implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            expre=Display.getText();
            if (expre!=null){
        expre=expre.substring(0, expre.length()-1);
        Display.setText(expre);
            }
        }
    }

    private class escuchadorBtSum implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
           expre=Display.getText();
        if (expre.equals("0.0"))
          expre="+";
      else
        expre+="+";
        Display.setText(expre);
        }
    }

    private class escuchadorBtPunto implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
          expre=Display.getText();
        if (expre.equals("0.0"))
          expre=".";
      else
        expre+=".";
        Display.setText(expre);
        }
    }

    private class escuchadorBtIgual implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
         expre=Display.getText();
            try{
        if (Expresion.verificaExpresion(expre)){
            String postfix = Expresion.traducePostfix(expre);
            expre=""+Expresion.resuelvePostfix(postfix);
            Display.setText(expre);
        }//if
        else
            Display.setText("Error");
            }catch(Exception p){
                expre="Error";
                Display.setText(expre);
            }//catch
        }
    }

    private class escuchadorBtResta implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            expre=Display.getText();
        expre+="-";
        Display.setText(expre);
        }
    }

    private class escuchadorBtMult implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
           expre=Display.getText();
        expre+="*";
        Display.setText(expre);
        }
    }

    private class escuchadorBtDiv implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
             expre=Display.getText();
        expre+="/";
        Display.setText(expre);
        }
    }

    private class escuchadorBtAbreP implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            expre=Display.getText();
        expre+="(";
        Display.setText(expre);
        }
    }

    private class escuchadorBtCierraP implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
           expre=Display.getText();
        if (expre.equals("0.0"))
          expre=")";
      else
        expre+=")";
        Display.setText(expre);
        }
    }
    
    public static void main(String [] args){
        new ControladorCalculadora("");
    }
    
    
}//class
