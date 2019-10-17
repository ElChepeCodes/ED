/*
 * Implementa funcionalidad básica de un rectángulo.
 */
package interfacesex;

/**
 * @author EDg2
 * 01 febrero 2019
 */
public class Rectangulo extends Posicion implements Figura {
  private double anchura;
  private double altura;
  
  //Constructores.
  public Rectangulo() {
    super();     //Rectángulo en (0,0), de 2x2.
    anchura= 2;
    altura= 2;
  }
  public Rectangulo(double anchura, double altura, int coordX, int coordY) {
    super(coordX, coordY);
    this.anchura = anchura;
    this.altura = altura;
  }
  
  //Definición de los métodos declarados en la interfaz Figura.
  public double calculaArea() {
    return anchura * altura;
  }
  
  public double calculaPerimetro() {
    return 2*anchura + 2*altura;
  }
  
  public void imprime() {
    System.out.println("Área= "+calculaArea()+
            ", Perímetro= "+calculaPerimetro()+'\n');
  }
  
  //toString
  public String toString() {
    StringBuilder sb= new StringBuilder();
    
    sb.append(super.toString());
    sb.append("Rectángulo: ancho= "+anchura+", altura= "+altura);
    return sb.toString();
  }
}
















