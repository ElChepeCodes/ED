/*
 * Estructuras de datos
 * Autor: Jose Luis Gutierrez Espinosa
 */
package ProbleSets33y34y35;

import Queues.CircularArrayQueue;
import java.time.LocalDate;
import java.time.Month;
import static java.time.Month.of;

/**
 *
 * @author jlgut
 */
public class Prob37 {
    private CircularArrayQueue<Persona> cola=new CircularArrayQueue();
    
    public Prob37 (){
        
    }
    
    public void nuevaPersona(Persona p){
        cola.enqueue(p);
    }//method
    
    public void salePersona(){
        cola.dequeue();
    }//method
    

    
    public void ordenaFechaNac(){
        CircularArrayQueue<Persona> qAux1 = new CircularArrayQueue(), qAux2= new CircularArrayQueue();
        Persona pAux1, pAux2;
        if (!cola.isEmpty()){
            pAux1=cola.dequeue();
            
            while (!cola.isEmpty()){
                pAux2=cola.dequeue();
                if (pAux2.getFechaNac().compareTo(pAux1.getFechaNac())>0){
                    qAux1.enqueue(pAux2);
                }//if
                else{
                    qAux1.enqueue(pAux1);
                    pAux1=pAux2;
                }//else
            }//while
            cola.enqueue(pAux1);
            while (!qAux1.isEmpty() || !qAux2.isEmpty()){
                if (!qAux1.isEmpty()){
                    pAux1=qAux1.dequeue();
                while (!qAux1.isEmpty()){
                    pAux2=qAux1.dequeue();
                    if (pAux2.getFechaNac().compareTo(pAux1.getFechaNac())>0){
                        qAux2.enqueue(pAux2);
                    }//if
                    else{
                        qAux2.enqueue(pAux1);
                        pAux1=pAux2;
                    }//else
                }//while
                cola.enqueue(pAux1);
                }//if    
                if (!qAux2.isEmpty()){
                    pAux1=qAux2.dequeue();
                while (!qAux2.isEmpty()){
                    pAux2=qAux2.dequeue();
                    if (pAux2.getFechaNac().compareTo(pAux1.getFechaNac())>0){
                        qAux1.enqueue(pAux2);
                    }//if
                    else{
                        qAux1.enqueue(pAux1);
                        pAux1=pAux2;
                    }//else
                }//while
                cola.enqueue(pAux1);
                }//if
            }//while
        }//if
    }//method
    
    public static void main(String []args){
        //para localDate of se usan ints en el orden: anio, mes, dia
        Persona p1=new Persona("p1",2000, 3, 10), p2=new Persona("p2", 2001,2,4), p3=new Persona("p3",1999, 5,19), p4=new Persona("p4",1989, 5,19),
                p5=new Persona("p5",1999, 10,19);
        Prob37 p= new Prob37();
        p.nuevaPersona(p1); p.nuevaPersona(p2); p.nuevaPersona(p3); p.nuevaPersona(p4); p.nuevaPersona(p5);
        System.out.println(p.cola.toString());
        p.ordenaFechaNac();
        System.out.println(p.cola.toString());
    }//main
}//class
