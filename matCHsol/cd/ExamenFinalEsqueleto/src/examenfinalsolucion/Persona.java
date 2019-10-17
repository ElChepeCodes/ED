/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenfinalsolucion;

/**
 *
 * @author ZVIX0
 */
public class Persona {
    private String nombre;
    private int edad;
    
    public Persona(String n,int e) {
        nombre=n;
        if(edad<0)
            throw new ValorInvalidoException();
        edad=e;
    }
    
    public String toString() {
        StringBuilder sb=new StringBuilder("");
        sb.append(nombre);
        return sb.toString();
    }
}
