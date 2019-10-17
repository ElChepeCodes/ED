package interfacesex;

/*
 * Clase Círculo que es derivada de Posición y que, además, implementa
 * los métodos definidos en la interfaz.
 */
public class Circulo extends Posicion implements Figura {
  private double radio;

  //Constructores.
  public Circulo() {
    super();
    radio= 2;
  }
  Circulo(int x, int y, double r) {
    super(x, y);
    radio= r;
  }

  //Métodos declarados en la interfaz Figura.
  public double calculaArea() {
    return Math.PI*radio*radio;
  }
  public double calculaPerimetro() {
    return (Math.PI*2*radio);
  }
  
  //Imprime el área y el perímetro.
  public void imprime() {
    System.out.println("Área= " + calculaArea() + ", Perímetro= " +
            calculaPerimetro() + '\n');
  }

  //Método toString.
  public String toString() {
    StringBuilder sb= new StringBuilder();
    
    sb.append(super.toString());
    sb.append("Círculo: radio= " + radio);
    return sb.toString();
  }

}
