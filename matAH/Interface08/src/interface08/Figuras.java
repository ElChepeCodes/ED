/*
 * Estructuras de datos
 * Autor: Jose Luis Gutierrez Espinosa
 */
package interface08;

public class Figuras {
    private FigGeometrica[] figuras;
    private int numFig, numCua;
    private final int MAX_FIG=15;
    
    
    public Figuras(){
        figuras=new FigGeometrica[MAX_FIG];
        numFig=0; numCua=0;
    }//builder
    
    public boolean altaCirculo(double rad){
        boolean res= false;
        if (numFig<MAX_FIG){
            figuras[numFig]=new Circulo(rad);
            res= true;
            numFig++;
        }//if     
        return res;
    }//method
    
    public boolean altaTriangulo(double l1, double l2, double l3){
        boolean res= false;
        if (numFig<MAX_FIG){
            figuras[numFig]=new Triangulo(l1, l2, l3);
            res= true;
            numFig++;
        }//if     
        return res;
    }//method
    
    public boolean altaRectangulo(double l1, double l2){
        boolean res= false;
        if (numFig<MAX_FIG){
            figuras[numFig]=new Rectangulo(l1, l2);
            res= true;
            numFig++;
        }//if     
        return res;
    }//method
    
    public boolean altaCuadrado(double lado){
        boolean res= false;
        if (numFig<MAX_FIG){
            figuras[numFig]=new Cuadrado(lado);
            res= true;
            numFig++;
            numCua++;
        }//if     
        return res;
    }//method
    
    public double calculaAreaTodos(){
        double tot=0;
        
        for (int i=0;i<numFig;i++){
            if (figuras[i] instanceof Circulo){
                tot+=((Circulo) figuras[i]).calculaArea();
            }//if
            else
                if (figuras[i] instanceof Cuadrado){
                    tot+=((Cuadrado) figuras[i]).calculaArea();
                }//if
                else
                    if (figuras[i] instanceof Triangulo){
                        tot+=((Triangulo) figuras[i]).calculaArea();
                    }//if
                    else{
                        tot+=((Rectangulo) figuras[i]).calculaArea();
                    }//else
        }//for
        
        return tot;
    }//method
    
    public String reporteTodos(){
        StringBuilder res=new StringBuilder();
            for(int i=0;i<numFig;i++)
                res.append("\n"+figuras[i].getClass()+ "--Area: "+figuras[i].calculaArea()+"---Perimetro: "+figuras[i].calculaPerim());
        return res.toString();
    }//method
    
    public Circulo circuloMasGrande(){
        Circulo res=new Circulo(-1);
        for (int i=0;i<numFig;i++){
            if (figuras[i] instanceof Circulo)
                if (((Circulo)figuras[i]).getRadio()>res.getRadio())
                    res=(Circulo)figuras[i];
        }//for
        return res;
    }//method
    
    public void recorreIzq(int pos){
        if (figuras[pos] instanceof Cuadrado)
            numCua--;
        for(int i=pos;i<numFig-1;i++){
            figuras[i]=figuras[i+1];
        }//for
        numFig--;
    }//method
    
    public void eliminaDesord(int pos){
        if (figuras[pos] instanceof Cuadrado)
            numCua--;
        figuras[pos]=figuras[numFig];
        numFig--;
    }//method
    
    public void eliminaEquilateros(){
        int i=0;
        while(i<numFig){
            if (figuras[i] instanceof Triangulo && ((Triangulo)figuras[i]).determinaEquilatero())
                eliminaDesord(i);
            else
            i++;
        }//while
    }//method
    
}//class
