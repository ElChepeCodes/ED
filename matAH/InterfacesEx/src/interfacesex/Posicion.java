/**
 * Especifica una coordenada de una figura geométrica.
 */
package interfacesex;

/**
 * @author EDg2
 * 01 febrero 2019
 */
public class Posicion {
  private int coordX;
  private int coordY;
  
  //Constructores.

  public Posicion() {
    coordX= 0;
    coordY= 0;
  }
  public Posicion(int coordX, int coordY) {
    this.coordX = coordX;
    this.coordY = coordY;
  }
  
  //toString.
  @Override
  public String toString() {
    return "Posicion{" + "coordX=" + coordX + ", coordY=" + coordY + '}';
  }
  
}
