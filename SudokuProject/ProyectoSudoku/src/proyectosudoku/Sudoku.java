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

/**
 *
 * @author jlgut
 */
public class Sudoku {
    int sudoku[][];

    /**
     *
     */
    public int arr[][][];         
    ArraySet<int[]>posicionesConValor;
    boolean indicadorTiempo = false;
    long start;
    long end;//

    /**
     *
     * @param arre
     */
    public Sudoku(int [][][] arre) {
        start = System.currentTimeMillis(); // Toma el tiempo actual del sistema
        end = start + 5 * 1000; // 5 seconds * 1000 ms/sec
        arr= arre;
        posicionesConValor=new ArraySet();//guarda las posiciones en las que se escribieron valores en el sudoku
        encuentraPosConValor();//se agregan las posiciones con valores al set
        if (arr[0][0][0]==0)//esta condicion cubre un caso de error en el programa si se trata de empezar con un 9 en el primer cuadro
        arr[0][0][0]=9;
        if (!verificaIndividual(0,0,0))
            arr[0][0][0]=0;
        try{
        resuelve1();
        }catch(Error e){
        clear();
        if (arre[0][0][0]==0)
        arr[0][0][0]=9;        
                if (!verificaIndividual(0,0,0))
            arr[0][0][0]=0;
        resuelve1();
        }
        
    }

    /**
     *
     * @return
     */
    public long getStart() {
        return start;
    }

    /**
     *
     * @return
     */
    public boolean isIndicadorTiempo() {
        return indicadorTiempo;
    }
    /*
    Este metodo verifica si el sector con el numero ingresado es valido
    @param s es el numero del sector que se quiere verificar
    @return regresa si el sector es valido o no
    */

    /**
     *
     * @param s
     * @return
     */

    public boolean verificaSector(int s){
        boolean res=true;
        ArraySet<Integer> set=new ArraySet();
        int i=0, j;
        while (res && i<3){
            j=0;
            while (res && j<3){
                if (set.contains(arr[s][i][j]) && arr[s][i][j]!=0)
                    res=false;
                else
                    set.add(arr[s][i][j]);
                j++;
            }//while
            i++;
        }//while
        return res;
    }//method
        /*
    Este metodo verifica si el renglon  con el numero ingresado es valido
    @param s es el numero del renglon que se quiere verificar
    @return regresa si el renglon es valido o no
    */

    /**
     *
     * @param r
     * @return
     */

    public boolean verificaRenglon(int r){
        boolean res=true;
        ArraySet<Integer> set=new ArraySet();
        int j=0, s=(r/3)*3, i=0;
        r%=3;
        while (res && i<3 && s<9){
            j=0;
            while (res && j<3){
                if (set.contains(arr[s][r][j]) && arr[s][r][j]!=0)
                    res=false;
                else
                    set.add(arr[s][r][j]);
                j++;
            }//while
            s++;
            i++;
        }//while
        return res;
    }//method
       /*
    Este metodo verifica si la columna con el numero ingresado es valido
    @param s es el numero de la columna que se quiere verificar
    @return regresa si la columna es valido o no
    */

    /**
     *
     * @param c
     * @return
     */

    public boolean verificaColumna(int c){
        boolean res=true;
        ArraySet<Integer> set=new ArraySet();
        int i=0, s=c/3;
        c%=3;
        while (res && c-s<3 && s<9){
            i=0;
            while (res && i<3){
                if (set.contains(arr[s][i][c]) && arr[s][i][c]!=0)
                    res=false;
                else
                    set.add(arr[s][i][c]);
                i++;
            }//while
            s+=3;
        }//while
        return res;
    }//method
    /*
    Este metodo regresa la validez de todo el sistema
    @return la validez de todo el sudoku
    */

    /**
     *
     * @return
     */

    public boolean verificaTodo(){
        boolean res=true;
        int i=0;
        while (res && i<9){
            res=this.verificaSector(i);
            i++;            
        }    
        i=0;
        while (res && i<9){
            res=this.verificaColumna(i);
            i++;
        } 
        i=0;
        while (res && i<9){
            res=this.verificaRenglon(i);
            i++;
        }
        return res;
    }
    /*
    Este metodo verifica la validez de una entrada dentro del sudoku
    @param s es el sector del valor, i es el renglon del valor, j es la columna del valor, tanto i y j dentro del sector
    @return la validez de ese valor en su sector, renglon y columna
    */

    /**
     *
     * @param s
     * @param i
     * @param j
     * @return
     */

    public boolean verificaIndividual(int s,int i,int j){
        int col=(s%3)*3+j, ren=(s/3)*3+i;
        return verificaSector(s) && verificaColumna(col) && verificaRenglon(ren);
    }//method
        /*
    Este metodo verifica si el sudoku ya esta resuelto
    @return el estado de resuelto del sudoku
    */

    /**
     *
     * @return
     */

    public boolean verificaResuelto(){
        boolean res=verificaTodo();//si los valores no son validos, regresa falso
        int s=0,i=0,j=0;
        while (res&& s<9){
            while(res && i<3){
                while(res && j<3){
                    if (arr[s][i][j]==0)
                        res=false;
                    j++;
                }//while
                i++;
            }//while
            s++;
        }//while
        return res;
    }
    
    /*
    Este metodo comienza el proceso recursivo desde el primer valor (el de la esquina superior izquierda)
    Al terminar el proceso recursivo,asigna los valores que se encontraron a los cuadros de texto
    */
    private void resuelve1(){
        try{
        resuelve(0,0,0);
       }catch(Error e){
           System.out.println("No se porque pero funciona");
           
            clear();
            reinsertaValores();
            resuelve(0,0,0);           
          
    }
    }
        /*
    Este metodo llama al metodo recursivo resuelve(int,int,int) hasta que el sudoku se encuentra resuelto
    */
    private void resuelve() {
        
       try{
        resuelve(0,0,0);
       }catch(Error e){//puede que la recursividad provoque un StackOverflow Error, dejando la solucion hecha parcialmente
           int c=0;
           while(!verificaResuelto() && c<5000){//este ciclo continua hasta que quede resuelto el sudoku pero por algun motivo sin el contador, el ciclo sigue infinitamente
            clear();
            reinsertaValores();
            resuelve(0,0,0);           
            c++;
           }
       }
    }//method
    /*
    Este metodo recorre los cuadros de texto. Si encuentra que ya tiene un valor asignado que es valido, se recorre al siguiente, sino, lo manda al siguiente metodo recursivo
    */
    private void resuelve(int s, int i, int j) {
        int[] element={s,i,j,arr[s][i][j]};
        if (posicionesConValor.contains(element) || (arr[s][i][j]!=0 && verificaIndividual(s,i,j)) ){
            if (j<2)
                resuelve(s,i,j+1);
            else{
                if (i<2)
                    resuelve(s,i+1,0);
                else
                    if (s<8)
                        resuelve(s+1,0,0);
            }//else
        }//if
        else{
            int[]pos={s,i,j, arr[s][i][j]};
            if (arr[s][i][j]!=0 && !posicionesConValor.contains(pos)){
                if (j>0)
                    resuelve(s,i,j-1,arr[s][i][j-1]+1);
                else
                    if (i>0)
                        resuelve(s,i-1,2, arr[s][i-1][2]+1);
                else
                        if (s>0)
                            resuelve(s-1, 2, 2, arr[s-1][2][2]+1);
                
            }//if
            
            else{
                if (!posicionesConValor.contains(pos)){
                    arr[s][i][j]=1;
                    if (verificaIndividual(s,i,j)){
                    if (j<2)
                        resuelve(s,i,j+1);
                    else
                        if (i<2)
                            resuelve(s,i+1,0);
                        else
                            if (s<8)
                                resuelve(s+1,0,0);
                    }//if
                
                    else{
                        resuelve(s,i,j,2);
                    }//else
                }//if
                else{
                    if (j>0)
                    resuelve(s,i,j-1,arr[s][i][j-1]+1);
                else
                    if (i>0)
                        resuelve(s,i-1,2, arr[s][i-1][2]+1);
                else
                        if (s>0)
                            resuelve(s-1, 2, 2, arr[s-1][2][2]+1);
                }//else
            }//else
        }//else
    }//method
    /*
    Este metodo encuentra el valor adecuado para la posicion en la que se encuentra, si no es posible con la forma en que esta el sudoku, reestablece el valor a 0 y regresa a cambiar el valor de la posicion anterior
    */
    private void resuelve(int s, int i, int j, int val) {
        arr[s][i][j]=val;
        if (verificaTodo() && val<=9){
            if (j<2)
                resuelve(s,i,j+1);
            else
                if (i<2)
                    resuelve(s,i+1,0);
                else
                    if (s<8)
                        resuelve(s+1,0,0);
        }
        else
            if (val<9)
                resuelve(s,i,j,val+1);
            else{
                arr[s][i][j]=0;
                if (j>0)
                    resuelve(s,i,j-1,arr[s][i][j-1]+1);
                else
                    if (i>0)
                        resuelve(s,i-1,2, arr[s][i-1][2]+1);
                else
                        if (s>0)
                            resuelve(s-1, 2, 2, arr[s-1][2][2]+1);
            }//else
                
    }//method
    /*
    
    */

    /**
     *
     */

    public void reinsertaValores(){
        ArraySet<int[]>temp=new ArraySet();
        int[] aux=new int[4];
        while (!posicionesConValor.isEmpty()){
            aux=posicionesConValor.removeRandom();
            arr[aux[0]][aux[1]][aux[2]]=aux[3];
            temp.add(aux);
        }//while
        while (!temp.isEmpty())
            posicionesConValor.add(temp.removeRandom());
    }//method
    /*
    Este metodo solo se utilizo durante las pruebas, no lo ve el ususario. Sin embargo, se utiliza para imprimir los sectores del sudoku por separado.
    */

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
    /*
    Este metodo reinicia la matriz a tener ceros en todas sus casillas
    */

    /**
     *
     */

    public void clear(){
        for(int s=0;s<9;s++)
            for(int i=0;i<3;i++)
                for(int j=0;j<3;j++)
                    arr[s][i][j]=0;
    }
    
    /**
     *
     * @return
     */
    public int[][][] getArr(){
        return arr;
    }
    /*
    Este metodo ingresa las posiciones de las casillas que tenian un valor en la matriz antes de empezar el proceso de resolucion al set
    */

    /**
     *
     */

    public void encuentraPosConValor(){
        for(int s=0;s<9;s++)
            for(int i=0;i<3;i++)
                for(int j=0;j<3;j++)
                    if (arr[s][i][j]!=0){
                        int [] pos={s,i,j,arr[s][i][j]};
                        posicionesConValor.add(pos);
                    }
    }//method
    
    
}