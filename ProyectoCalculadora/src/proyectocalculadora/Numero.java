/*
 * Estructuras de datos
 * Autores: 
    Jose Luis Gutierrez Espinosa
    Andrés Navarrete
    Andrés Quevedo
    Bruno Vitte San Juan
    
 */
package proyectocalculadora;

//Esta clase se utiliza para poder agrupar numeros y operadores dentro del stack
public class Numero implements Caracter{
    public double num;
    public Numero(double n){
        num=n;
    }//builder
    
    public String toString(){
        return ""+num;
    }
    public double getNum(){
        return num;
    }
}//class
