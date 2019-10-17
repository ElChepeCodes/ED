/*
 * Estructuras de datos
 * Autores: 
    Jose Luis Gutierrez Espinosa-179888
    Andrés Navarrete-
    Andrés Quevedo-
    Bruno Vitte San Juan-179524
    
 */
package proyectocalculadora;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class VistaCalculadora extends JFrame{
    protected String expre;
    private static final long serialVersionUID = 1L;
    private JPanel p;
    
    protected JButton Bt0, Bt1, Bt2, Bt3, Bt4, Bt5, Bt6, Bt7, Bt8, Bt9, BtCE, BtC, BtSum, BtPunto, BtIgual, BtResta, BtMult, BtDiv, BtAbreP, BtCierraP;
    protected JTextField Display;
    Font f = new Font("Arial", 1, 14);
    
    public VistaCalculadora(String t){
        super(t);

        p = new JPanel();
        p.setLayout(new GridBagLayout());
        Border b = BorderFactory.createEmptyBorder(10, 15, 10, 15);
        p.setBorder(b);
        p.setBackground(new Color(34, 34, 34));

        GridBagConstraints constraints = new GridBagConstraints();
       

        Display = new JTextField();
        Display.setFont(f);
        //Modificamos las posiciones
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridwidth = 4;
        constraints.gridheight = 2;
        constraints.weightx = 1.0;
        constraints.weighty = 1.0;
        constraints.anchor = GridBagConstraints.CENTER;
        constraints.fill = GridBagConstraints.BOTH;
        p.add(Display, constraints);


        constraints.insets = new Insets(10, 4, 10, 4);


        Bt1 = new JButton("1");
        Bt1.setFont(f);
        Bt1.setBackground(new Color(51, 57, 59));
        Bt1.setForeground(Color.WHITE);
        constraints.ipadx = 3;
        //Modificamos las posiciones
        constraints.gridx = 0;
        constraints.gridy = 2;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        p.add(Bt1, constraints);

        Bt2 = new JButton("2");
        Bt2.setFont(f);
        Bt2.setBackground(new Color(51, 57, 59));
        Bt2.setForeground(Color.WHITE);
        constraints.ipadx = 3;
        //Modificamos las posicioness
        constraints.gridx = 1;
        constraints.gridy = 2;
        p.add(Bt2, constraints);

        Bt3 = new JButton("3");
        Bt3.setFont(f);
        Bt3.setBackground(new Color(51, 57, 59));
        Bt3.setForeground(Color.WHITE);
        //Modificamos las posiciones
        constraints.gridx = 2;
        constraints.gridy = 2;
        p.add(Bt3, constraints);

        BtCE = new JButton("CE");
        BtCE.setFont(f);
        BtCE.setBackground(new Color(51, 57, 59));
        BtCE.setForeground(Color.WHITE);
        //Modificamos las posiciones
        constraints.gridx = 3;
        constraints.gridy = 2;
        p.add(BtCE, constraints);

        Bt4 = new JButton("4");
        Bt4.setFont(f);
        Bt4.setBackground(new Color(51, 57, 59));
        Bt4.setForeground(Color.WHITE);
        //Modificamos las posiciones
        constraints.gridx = 0;
        constraints.gridy = 3;
        p.add(Bt4, constraints);

        Bt5 = new JButton("5");
        Bt5.setFont(f);
        Bt5.setBackground(new Color(51, 57, 59));
        Bt5.setForeground(Color.WHITE);
        //Modificamos las posiciones
        constraints.gridx = 1;
        constraints.gridy = 3;
        p.add(Bt5, constraints);

        Bt6 = new JButton("6");
        Bt6.setFont(f);
        Bt6.setBackground(new Color(51, 57, 59));
        Bt6.setForeground(Color.WHITE);
        //Modificamos las posiciones
        constraints.gridx = 2;
        constraints.gridy = 3;
        p.add(Bt6, constraints);

        BtC = new JButton("C");
        BtC.setFont(f);
        BtC.setBackground(new Color(51, 57, 59));
        BtC.setForeground(Color.WHITE);
        //Modificamos las posiciones
        constraints.gridx = 3;
        constraints.gridy = 3;
        p.add(BtC, constraints);

        Bt7 = new JButton("7");
        Bt7.setFont(f);
        Bt7.setBackground(new Color(51, 57, 59));
        Bt7.setForeground(Color.WHITE);
        //Modificamos las posiciones
        constraints.gridx = 0;
        constraints.gridy = 4;
        p.add(Bt7, constraints);

        Bt8 = new JButton("8");
        Bt8.setFont(f);
        Bt8.setBackground(new Color(51, 57, 59));
        Bt8.setForeground(Color.WHITE);
        //Modificamos las posiciones
        constraints.gridx = 1;
        constraints.gridy = 4;
        p.add(Bt8, constraints);

        Bt9 = new JButton("9");
        Bt9.setFont(f);
        Bt9.setBackground(new Color(51, 57, 59));
        Bt9.setForeground(Color.WHITE);
        //Modificamos las posiciones
        constraints.gridx = 2;
        constraints.gridy = 4;
        p.add(Bt9, constraints);

        BtSum = new JButton("+");
        BtSum.setFont(f);
        BtSum.setBackground(new Color(51, 57, 59));
        BtSum.setForeground(Color.WHITE);
        //Modificamos las posiciones
        constraints.gridx = 3;
        constraints.gridy = 4;
        p.add(BtSum, constraints);

        BtPunto = new JButton(".");
        BtPunto.setFont(f);
        BtPunto.setBackground(new Color(51, 57, 59));
        BtPunto.setForeground(Color.WHITE);
        //Modificamos las posiciones
        constraints.gridx = 0;
        constraints.gridy = 5;
        p.add(BtPunto, constraints);

        Bt0 = new JButton("0");
        Bt0.setFont(f);
        Bt0.setBackground(new Color(51, 57, 59));
        Bt0.setForeground(Color.WHITE);
        //Modificamos las posiciones
        constraints.gridx = 1;
        constraints.gridy = 5;
        p.add(Bt0, constraints);

        BtIgual = new JButton("=");
        BtIgual.setFont(f);
        BtIgual.setBackground(new Color(51, 57, 59));
        BtIgual.setForeground(Color.WHITE);
        //Modificamos las posiciones
        constraints.gridx = 2;
        constraints.gridy = 5;
        p.add(BtIgual, constraints);

        BtResta = new JButton("-");
        BtResta.setFont(f);
        BtResta.setBackground(new Color(51, 57, 59));
        BtResta.setForeground(Color.WHITE);
        //Modificamos las posiciones
        constraints.gridx = 3;
        constraints.gridy = 5;
        p.add(BtResta, constraints);

        BtMult = new JButton("*");
        BtMult.setFont(f);
        BtMult.setBackground(new Color(51, 57, 59));
        BtMult.setForeground(Color.WHITE);
        //Modificamos las posiciones
        constraints.gridx = 0;
        constraints.gridy = 6;
        p.add(BtMult, constraints);

        BtDiv = new JButton("/");
        BtDiv.setFont(f);
        BtDiv.setBackground(new Color(51, 57, 59));
        BtDiv.setForeground(Color.WHITE);
        //Modificamos las posiciones
        constraints.gridx = 1;
        constraints.gridy = 6;
        p.add(BtDiv, constraints);

        BtAbreP = new JButton("(");
        BtAbreP.setFont(f);
        BtAbreP.setBackground(new Color(51, 57, 59));
        BtAbreP.setForeground(Color.WHITE);
        //Modificamos las posiciones
        constraints.gridx = 2;
        constraints.gridy = 6;
        p.add(BtAbreP, constraints);

        BtCierraP = new JButton(")");
        BtCierraP.setFont(f);
        BtCierraP.setBackground(new Color(51, 57, 59));
        BtCierraP.setForeground(Color.WHITE);
        //Modificamos las posiciones
        constraints.gridx = 3;
        constraints.gridy = 6;
        p.add(BtCierraP, constraints);


        this.add(p);
        this.setBounds(400, 100, 400, 550);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args){
        VistaCalculadora v = new VistaCalculadora("pruebas");
    }
}
