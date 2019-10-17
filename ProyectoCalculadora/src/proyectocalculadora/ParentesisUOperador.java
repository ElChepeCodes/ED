/*
 * Estructuras de datos
 * Autores: 
    Jose Luis Gutierrez Espinosa
    Andrés Navarrete
    Andrés Quevedo
    Bruno Vitte San Juan
    
 */
package proyectocalculadora;

public class ParentesisUOperador implements Caracter{
 public char c;
 
 public ParentesisUOperador(char ch){
     c=ch;
 }//builder
 
 public String toString(){
     return ""+c;
 }
}//class
