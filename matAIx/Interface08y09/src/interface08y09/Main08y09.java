
package interface08y09;

/**
 * Clase principal del ejercicio 08 sobre Interface
 * @author EDg2
 * 01 febrero 2019
 */
public class Main08y09 {

    public static void main(String[] args) {
        Triangulo tri;
        Circulo cir;
        Cuadrado cua;
        Rectangulo rec;
        
        System.out.println("\n ---- Pruebas08 1 ----");
        tri = new Triangulo(6, 5, 7);
        System.out.println("\nPerimetro y Area de un Triangulo:\n"
                + tri.calculaPerim() + ",  " + tri.calculaArea());
        System.out.println("\nInfo del Triangulo: " + tri);
        
        cir = new Circulo(10);
        System.out.println("\nPerimetro y Area de un Circulo:\n"
                + cir.calculaPerim() + ",  " + cir.calculaArea());
        System.out.println("\nInfo del Circulo: " + cir);        

        System.out.println("\n ---- Pruebas08 2 ----");
        cua = new Cuadrado(10.0);
        System.out.println("\nPerimetro y Area de un Cuadrado:\n"
                + cua.calculaPerim() + ",  " + cua.calculaArea());
        System.out.println("\nInfo del Cuadrado: " + cua);
        
        rec = new Rectangulo(10.0, 10.0);
        System.out.println("\nPerimetro y Area de un Rectangulo:\n"
                + rec.calculaPerim() + ",  " + rec.calculaArea());
        System.out.println("\nInfo del Rectangulo: " + rec);
        
        System.out.println("\n ---- Pruebas09 3, 1) y 2) ----");
        // 1)
        Aplica09 afigg = new Aplica09();
        
        // 2)
        afigg.altaFigF(tri);
        afigg.altaFigF(cir);
        afigg.altaFigF(cua);
        afigg.altaFigF(rec);
        Triangulo tri1 = new Triangulo(11.0, 11.0, 11.0);
        afigg.altaFigF(tri1);        
        Circulo cir1 = new Circulo(20.0);
        afigg.altaFigF(cir1); 
        
        // 3)
        System.out.println("\n ---- Pruebas09 4, 3) ----");
        System.out.println("\n" + afigg.ceiAreaFigG());

        // 4)
        System.out.println("\n ---- Pruebas09 5, 4) ----");
        System.out.println("\nMayor Circulo: " + afigg.eeiMayCirculo());

        // 5)
        System.out.println("\n ---- Pruebas09 6, 5) ----");
        System.out.println("\nTotal de Cuadrados: " + afigg.ceiTotCuadra());
        
        System.out.println("ADIOS");
        
    }
    
    private static void menu(Aplica09 afg) {
        int sel = -1;
        while( sel != 7 ) {
            System.out.print(
                "\nSeleccione un numero de inciso (3 a 7)\n" +
                "3) Calcular e imprimir el area de todas las figuras almacenadas.\n" +
                "4) Encontrar e imprimir los datos del círculo más grande.\n" +
                "5) Calcular e imprimir el total de cuadrados.\n" +
                "6) Eliminar todos los triangulos equilateros.\n" +
                "7) SALIR DEL MENU.\n" +
                "Teclee un numero de inciso: "
            );
            sel = (sel == -1)? 3 : 7;    // Sale en la segunda iteracion
            System.out.println("<<sel : " + sel + ">>\n");
        }
    }
    
}
