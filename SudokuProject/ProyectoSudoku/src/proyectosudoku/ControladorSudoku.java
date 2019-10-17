/*
 * Estructuras de datos
 * Autores: 
    Jose Luis Gutierrez Espinosa
    Andrés Navarrete
    Andrés Quevedo
    Bruno Vitte San Juan
    
 */
package proyectosudoku;

import Sets.ArraySet;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author jlgut
 */
public class ControladorSudoku extends VistaSudoku {
    Sudoku sud;
    int[][] mat;
    int [][][]arr;        
    ArraySet<int[]>posicionesConValor;

    /**
     *
     * @param t
     */
    public ControladorSudoku(String t) {
        super(t);

        resolver.addActionListener(new EscuchaResolver());
        nuevo.addActionListener(new EscuchaNuevo());
    }

    /**
     *
     */
    public class EscuchaResolver implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent ae) {
            mat = new int[9][9];
            boolean flag=true;
            arr = new int[9][3][3];
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    if (casillas[j][i].getText().equals("")) {
                        mat[j][i] = 0;
                    } else {
                        mat[j][i] = Integer.parseInt(casillas[j][i].getText());
                        if (mat [j][i]>9){
                            message.setText("Valores no validos");
                            flag=false;
                        }
                    }
                }
            }
            
            traduceArrTriD();
            System.out.println(imprimeMatriz());
            sud = new Sudoku(arr);
            arr=sud.getArr();
            System.out.println(imprimeMatriz());
            if (flag && sud.verificaTodo()) {
                
                if (sud.verificaResuelto()) {                    
                    traduceMatriz();
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
    
    /**
     *
     */
    public void traduceMatriz(){
        for(int s=0;s<9;s++)
            for(int i=0;i<3;i++)
                for(int j=0;j<3;j++){
                    switch(s){
                        case 0:{
                            mat[i][j]=arr[s][i][j];
                        };break;
                        case 1:{
                            mat[i][j+3]=arr[s][i][j];
                        };break;
                        case 2:{
                            mat[i][j+6]=arr[s][i][j];
                        };break;
                        case 3:{
                            mat[i+3][j]=arr[s][i][j];
                        };break;
                        case 4:{
                            mat[i+3][j+3]=arr[s][i][j];
                        };break;
                        case 5:{
                            mat[i+3][j+6]=arr[s][i][j];
                        };break;
                        case 6:{
                            mat[i+6][j]=arr[s][i][j];
                        };break;
                        case 7:{
                            mat[i+6][j+3]=arr[s][i][j];
                        };break;
                        case 8:{
                            mat[i+6][j+6]=arr[s][i][j];
                        };break;
                    }
                }
    }

    /**
     *
     */
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
    
    /**
     *
     * @return
     */
    public String imprimeMatriz(){
                    int s, i, j;
                    StringBuilder res= new StringBuilder();
            for (s=0; s<9;s++){
                for(i=0;i<3;i++){
                    for(j=0;j<3;j++){
                        res.append(arr[s][i][j]).append(" ");
                    }
                    res.append("\n");
                }
                res.append("\n");
            }
                return res.toString();
    }//method

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        ControladorSudoku cs = new ControladorSudoku("Test Controler");
    }
}
