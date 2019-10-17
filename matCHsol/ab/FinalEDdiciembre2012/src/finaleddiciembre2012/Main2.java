
package finaleddiciembre2012;

import java.util.*;

public class Main2 {
    public static void main(String args[]) {
        ListaDoblementeEnlazadaOrdenada<Circle> lista1=new ListaDoblementeEnlazadaOrdenada();
        Circle c1=new Circle(1.5);
        Circle c2=new Circle(2.5);
        Circle c3=new Circle(3.5);
        Circle c4=new Circle(0.5);
        Circle c5=new Circle(2.0);
        
        lista1.add(c1);
        lista1.add(c2);
        lista1.add(c3);
        lista1.add(c4);
        lista1.add(c5);

        // Debería imprimir 0.5, 1.5, 2.0, 2.5, 3.5, en ese orden:
        imprime(lista1);
        // Debería decir que SÍ se encuentra el dato:
        if(busca(lista1,c1)==true)
            System.out.println("SÍ se encuentra el dato buscado.");
        else
            System.out.println("NO se encuentra el dato buscado.");
        // Debería decir que SÍ se encuentra el dato (y sirve para verificar que no se
        // haya modificado el contenido de la lista al hacer la búsqueda anterior):
        if(busca(lista1,c1)==true)
            System.out.println("SÍ se encuentra el dato buscado.");
        else
            System.out.println("NO se encuentra el dato buscado.");
        // Debería decir que SÍ se encuentra el dato:
        if(busca(lista1,c3)==true)
            System.out.println("SÍ se encuentra el dato buscado.");
        else
            System.out.println("NO se encuentra el dato buscado.");
        // Debería decir que SÍ se encuentra el dato:
        if(busca(lista1,c4)==true)
            System.out.println("SÍ se encuentra el dato buscado.");
        else
            System.out.println("NO se encuentra el dato buscado.");
        // Debería decir que NO se encuentra el dato:
        if(busca(lista1,new Circle(7.5))==true)
            System.out.println("SÍ se encuentra el dato buscado.");
        else
            System.out.println("NO se encuentra el dato buscado.");
        
        ListaDoblementeEnlazadaOrdenada<Rectangle> lista2=new ListaDoblementeEnlazadaOrdenada();
        Rectangle r1=new Rectangle(1.0,1.5);
        Rectangle r2=new Rectangle(1.0,2.5);
        Rectangle r3=new Rectangle(1.0,3.5);
        Rectangle r4=new Rectangle(1.0,0.5);
        Rectangle r5=new Rectangle(1.0,2.0);
        
        lista2.add(r1);
        lista2.add(r2);
        lista2.add(r3);
        lista2.add(r4);
        lista2.add(r5);
        
        // Debería imprimir 1.0x0.5, 1.0x1.5, 1.0x2.0, 1.0x2.5, 1.0x3.5, en ese orden:
        imprime(lista2);
        lista2.remove(r2);
        lista2.remove(r4);
        // Debería imprimir 1.0x1.5, 1.0x2.0, 1.0x3.5, en ese orden:
        imprime(lista2);
    }
    
}
