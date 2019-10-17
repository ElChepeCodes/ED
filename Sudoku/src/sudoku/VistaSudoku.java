/*
 * Estructuras de datos
 * Autores: 
    Jose Luis Gutierrez Espinosa
    Andrés Navarrete
    Andrés Quevedo
    Bruno Vitte San Juan
    
 */
package sudoku;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.KeyListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

public class VistaSudoku extends JFrame {
    private static final long serialVersionUID = 1L;
    private JPanel p;
    protected JLabel mainText, message;
    protected JTextField[][] casillas;
    protected JButton resolver, nuevo;
    Font f = new Font("Comic Sans MS", 1, 24);

    public VistaSudoku(String t) {
        super(t);

        p = new JPanel();
        p.setLayout(new GridBagLayout());
        Border b = BorderFactory.createEmptyBorder(15, 20, 15, 20);
        p.setBorder(b);
        p.setBackground(new Color(34, 34, 34));

        GridBagConstraints consT = new GridBagConstraints();
        // Modificamos las posiciones
        consT.gridx = 0;
        consT.gridy = 0;
        consT.gridwidth = 9;
        consT.gridheight = 1;
        consT.weightx = 0.5;
        consT.weighty = 1.0;
        consT.anchor = GridBagConstraints.CENTER;
        consT.fill = GridBagConstraints.BOTH;

        mainText = new JLabel("Play Sudoku!");
        mainText.setFont(new Font("Comic Sans MS", 1, 28));
        mainText.setForeground(new Color(255, 255, 255));
        p.add(mainText, consT);

        consT.gridwidth = 4;
        consT.fill = GridBagConstraints.BOTH;

        casillas = new JTextField[9][9];

        for (int i = 0; i < 9; i++) {
            for (int j = 1; j < 10; j++) {
                casillas[i][j - 1] = new JTextField(1);
                casillas[i][j - 1].setFont(f);
                casillas[i][j - 1].setHorizontalAlignment(SwingConstants.CENTER);
                consT.gridx = i;
                consT.gridy = j;
                consT.gridheight = 1;
                consT.gridwidth = 1;
                if (i % 3 == 0 && i != 0) {
                    if (j % 3 == 0 && j != 0) {
                        Border border = BorderFactory.createMatteBorder(1, 4, 4, 1, Color.BLACK);
                        casillas[i][j - 1].setBorder(border);
                    } else {
                        Border border = BorderFactory.createMatteBorder(1, 4, 1, 1, Color.BLACK);
                        casillas[i][j - 1].setBorder(border);
                    }
                } else if (j % 3 == 0 && j != 0) {
                    Border border = BorderFactory.createMatteBorder(1, 1, 4, 1, Color.BLACK);
                    casillas[i][j - 1].setBorder(border);
                } else {
                    Border border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK);
                    casillas[i][j - 1].setBorder(border);
                }

                p.add(casillas[i][j - 1], consT);
            }
        }

        message = new JLabel("Inserte los números a evaluar.");
        message.setFont(new Font("Comic Sans MS", 1, 28));
        message.setForeground(new Color(255, 255, 255));
        consT.gridx = 0;
        consT.gridy = 10;
        consT.gridwidth = 9;
        consT.gridheight = 1;
        p.add(message, consT);

        resolver = new JButton("Resolver");
        resolver.setFont(new Font("Comic Sans MS", 1, 16));
        resolver.setBackground(new Color(51, 57, 59));
        resolver.setForeground(Color.WHITE);
        consT.gridx = 0;
        consT.gridy = 11;
        consT.gridwidth = 5;
        consT.gridheight = 1;
        consT.fill = GridBagConstraints.CENTER;
        consT.anchor = GridBagConstraints.LINE_START;
        p.add(resolver, consT);

        nuevo = new JButton("Nuevo");
        nuevo.setFont(new Font("Comic Sans MS", 1, 16));
        nuevo.setBackground(new Color(51, 57, 59));
        nuevo.setForeground(Color.WHITE);
        consT.gridx = 5;
        consT.gridy = 11;
        consT.gridwidth = 4;
        consT.gridheight = 1;
        p.add(nuevo, consT);

        this.add(p);
        this.setBounds(455, 20, 600, 700);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
