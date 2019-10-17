/*
 * Estructuras de datos
 * Autores: 
    Jose Luis Gutierrez Espinosa
    Andrés Navarrete
    Andrés Quevedo
    Bruno Vitte San Juan
    
 */
package sudoku;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorSudoku extends VistaSudoku {
    Sudoku sud;
    int[][] mat;
    int [][][]arr;

    public ControladorSudoku(String t) {
        super(t);

        resolver.addActionListener(new EscuchaResolver());
        nuevo.addActionListener(new EscuchaNuevo());
    }

    public class EscuchaResolver implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent ae) {
            mat = new int[9][9];
            arr = new int[9][3][3];
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    if (casillas[j][i].getText().equals("")) {
                        mat[j][i] = 0;
                    } else {
                        mat[j][i] = Integer.parseInt(casillas[j][i].getText());
                    }
                }
            }
            
            
            sud = new Sudoku(mat);
            if (sud.revisionInicial()) {
                if (sud.resuelv()) {
                    mat = sud.getMat();
                    for (int i = 0; i < 9; i++) {
                        for (int j = 0; j < 9; j++) {
                            casillas[i][j].setText("" + mat[i][j]);
                        }
                    }
                    message.setText("Resuelto con éxito en: " + ((System.currentTimeMillis() - sud.getStart()) / 1000.0)
                            + " segundos");
                } else {
                    message.setText("No se puede resolver, favor de cambiar valores.");
                }
            } else {
                message.setText("No se puede resolver, favor de cambiar valores.");
            }
        }
    }
    
    private void traduceArrTriD(){
        for (int i=0;i<9;i++)
            for(int j=0;j<9;j++){
                if (i<3){
                    if(j<3){
                        arr[0][i][j]=mat[i][j];
                    }
                    else{
                        if(j<6){
                            arr[1][i][j-3]=mat[i][j];
                        }
                        else{
                            arr[2][i][j-6]=mat[i][j];
                        }
                    }
                }
                else{
                    if (i<6){
                        if(j<3){
                        arr[3][i-3][j]=mat[i][j];
                    }
                    else{
                        if(j<6){
                            arr[4][i-3][j-3]=mat[i][j];
                        }
                        else{
                            arr[5][i-3][j-6]=mat[i][j];
                        }
                    }
                    }
                    else{
                        if(j<3){
                        arr[6][i-6][j]=mat[i][j];
                    }
                    else{
                        if(j<6){
                            arr[7][i-6][j-3]=mat[i][j];
                        }
                        else{
                            arr[8][i-6][j-6]=mat[i][j];
                        }
                    }
                    }
                }
            }
    } 

    public class EscuchaNuevo implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent ae) {
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    casillas[i][j].setText("");
                }
            }
            message.setText("Introduce los nuevos valores.");
        }
    }

    public static void main(String[] args) {
        ControladorSudoku cs = new ControladorSudoku("Test Controler");
    }
}
