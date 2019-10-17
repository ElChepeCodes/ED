/**
 * Implementa la jerarquía de clases e interfaces del ejercicio descrito
 * en el archivo InterfacesEx.docx.
 */
package interfacesex;

/**
 * Clase Principal
 * @author EDg2
 * 01 febrero 2019
 */
public class MainInEx {

  public static void main(String[] args) {
    Figura figs[]= new Figura[10];  //para guardar rectángulos y círculos.
    Rectangulo rec; Circulo circ; Posicion pos;
    
    //Creación y manejo de un rectángulo.
    figs[0]= new Rectangulo(10,20,15,15);
    System.out.println(figs[0].toString());
    figs[0].imprime();
    
    //Creación y manejo de un círculo.
    figs[1]= new Circulo(20,20,10);
    System.out.println(figs[1].toString());
    figs[1].imprime();
    
    //Creación de un segundo rectángulo.
    figs[2]= new Rectangulo(30,40,50,50);
    
    //Variantes que muestran qué se puede hacer con el polimorfismo.
    rec= new Rectangulo(80,90,100,100);
    figs[3] = rec;
    pos = rec;
    figs[3]= (Rectangulo)pos;
    
    circ = new Circulo(200,200,20);
    figs[4] = circ;
    pos = circ;
    figs[4]= (Circulo) pos;
    
    //No se puede hacer lo siguiente.
    //rec = (Rectangulo)circ;    //Error.
//    pos= new Posicion(300,300);   //Error
//    rec= (Rectangulo)pos;
//    rec.calculaArea();
    
    //Impresión de todas las figuras.
    System.out.println("Impresión de todas las figuras:");
    for (int i=0; i<=4; i++) {
//      if (figs[i].getClass()==Rectangulo.class)
//        System.out.println("Rectángulo:");
//      else System.out.println("Circulo:");

      if(figs[i] instanceof Rectangulo)
          System.out.println("Rectángulo:");
      else
          System.out.println("Círculo:");
      System.out.println(figs[i].toString());
      figs[i].imprime();
    }
  }
}














