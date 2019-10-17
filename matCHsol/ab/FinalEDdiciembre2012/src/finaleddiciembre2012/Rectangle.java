
package finaleddiciembre2012;

public class Rectangle implements Comparable {
    private double side1,side2;
    
    public Rectangle() {}
    
    public Rectangle(double side1,double side2) {
        this.side1=side1;
        this.side2=side2;
    }
    
    public boolean equals(Object rect) {
        boolean resp = false;
        if (rect.getClass().equals(this.getClass())){
            Rectangle r=(Rectangle) rect;
            resp = findArea()==r.findArea();
        }
        return resp;
    }
    
    public double findArea() {
        return side1*side2;
    }
    
    public int compareTo(Object rect) {
        Rectangle r=(Rectangle) rect;
        int resultado;

        if(findArea()<r.findArea())
            resultado=-1;
        else if(findArea()>r.findArea())
            resultado=1;
        else
            resultado=0;
        
        return resultado;
    }
    
    public String toString() {
        StringBuilder sb=new StringBuilder("");
        
        sb.append("\nRectangle with sides: "+side1+"x"+side2);
        
        return sb.toString();
    }
}
