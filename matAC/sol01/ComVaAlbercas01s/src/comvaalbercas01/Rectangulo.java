/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comvaalbercas01;

/**
 *
 * @author estructuras00
 */
public class Rectangulo {
    // Atributos
    private double lado1;
    private double lado2;
    
    // CONSTRUCTORES
    public Rectangulo(double lado1, double lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public Rectangulo() {
        lado1 = -1000;
        lado2 = -2000;
    }

    // SETTERS
    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }
    
    // GETTERS
    public double getLado1() {
        return lado1;    // this.lado1
    }

    public double getLado2() {
        return lado2;
    }
    
    // CALCULOS de area y perimetro
    public double calculaArea() {
        return lado1 * lado2;
    }
    
    public double calculaPerimetro() {
        return (lado1 + lado2) * 2;
    }
    
    // Metodos a SOBRESCRIBIR
    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    // Comparacion por igualdad con otro objeto rectangulo; ya sea porque
    // es el mismo objeto o porque los lados 1 y 2 son iguales respectivamente.
    public boolean equals(Object otroobj) {
        boolean b1, b2, br;
        br = false;
        if (otroobj != null) {    // Objeto existente?
            if (getClass() == otroobj.getClass()) {    // Objeto Rectangulo?
                br = true;
                if (this != otroobj) {    // No es el mismo objeto?
                    Rectangulo otroRec = (Rectangulo) otroobj;
                    b1 = (lado1 == otroRec.getLado1());
                    b2 = (lado1 == otroRec.getLado2());
                    br = b1 && b2;
                }                    
            }
        }
        return br;
    }

    @Override
    public String toString() {
        return "Rectangulo{" + "lado1=" + lado1 + ", lado2=" + lado2 + '}';
    }
    
}
