package Problemas00DblLists;
import DoubleLists.*;

/**
 * Clase Circle, con los los metodos equals y comparable requeridos en
 * listas ligadas ordenadas.
 * @author EDg2
 */
public class Circle implements Comparable {
    private double radius;
    
    public Circle() {}
    
    public Circle(double radius) {
        this.radius=radius;
    }

    public double findArea() {
        return radius*radius*Math.PI;
    }

    public boolean equals(Object circ) {
        boolean resp = false;
        if (circ.getClass().equals(this.getClass())){
           Circle c=(Circle) circ;
           resp = findArea()==c.findArea();
        }
        return resp;
    }
    
    public int compareTo(Object obj) {
        int resultado;
        Circle circ= (Circle)obj;
        
        if(findArea() < circ.findArea())
            resultado=-1;
        else
            if(findArea() > circ.findArea())
                resultado= 1;
            else
                resultado= 0;
        
        return resultado;
    }
        
    public String toString() {
        StringBuilder sb=new StringBuilder("");
        
        sb.append("\nCircle with radius: "+radius);
        
        return sb.toString();
    }    
}
