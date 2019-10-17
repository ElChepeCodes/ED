/*
 * Estructuras de datos
 * Autor: Jose Luis Gutierrez Espinosa
 */
package EjerciciosStacks;

import Sets.ArraySet;
import java.util.Iterator;

/**
 *
 * @author jlgut
 */
public class Escuela {
    private String nombre, direccion;
    private ArraySet<Alumno> ing, lic;
    
    
    public Escuela(String nom, String dir){
        nombre=nom;direccion=dir;
        ing=new ArraySet();
        lic=new ArraySet();
    }//builder
    
    public void altaAlumno(Alumno a){
        Iterator it=a.getCarreras().iterator();
        while(it.hasNext()){
            if (it.next().toString().contains("ing"))
                ing.add(a);
            
            if(it.next().toString().contains("lic"))
                lic.add(a);
        }//while
    }//method
    
    public boolean bajaAlumno(int cu){
        boolean res=false;
        ArraySet<Alumno> temp=new ArraySet();
        Alumno aTemp;
        while (!ing.isEmpty())
            temp.add(ing.removeRandom());
        while(!temp.isEmpty()){
            aTemp=temp.removeRandom();
            if (aTemp.getCU()!=cu)
                ing.add(aTemp);
            else
                res=true;
        }//while
        if(res=false){
            while (!lic.isEmpty())
            temp.add(lic.removeRandom());
        while(!temp.isEmpty()){
            aTemp=temp.removeRandom();
            if (aTemp.getCU()!=cu)
                lic.add(aTemp);
            else
                res=true;
        }//while
        }//if
        return res;
    }//method
    
    public String regresaTodos(){
        ArraySet<Alumno> todos=new ArraySet();
        todos.addAll(ing);
        todos.addAll(lic);
        StringBuilder res= new StringBuilder();
        Iterator it=todos.iterator();
        while(it.hasNext())
            res.append(it.next());
        return res.toString();
    }//method
    
    public String regresaAmbas(){
        ArraySet<Alumno> inte= (ArraySet<Alumno>)ing.intersection(lic);
        Iterator it = inte.iterator();
        StringBuilder res= new StringBuilder();
        while(it.hasNext())
            res.append(it.next());
        return res.toString();
    }//method
    
        public String regresaUnaSola(){
        ArraySet<Alumno> dif1= (ArraySet<Alumno>)ing.difference(lic), dif2=(ArraySet<Alumno>)lic.difference(ing),
        difTot=new ArraySet();
        difTot.addAll(dif2);difTot.addAll(dif1);
        Iterator it = difTot.iterator();
        StringBuilder res= new StringBuilder();
        while(it.hasNext())
            res.append(it.next());
        return res.toString();
    }//method
        
    public int cuentaMayores(int ref){
         ArraySet<Alumno> temp=new ArraySet();
        Alumno aTemp;
        int cont=0;
        while (!lic.isEmpty())
            temp.add(lic.removeRandom());
        while(!temp.isEmpty()){
            aTemp=temp.removeRandom();
            if (aTemp.getEdad()>ref)
                cont++;
            lic.add(aTemp);
            
        }//while
        return cont;
    }//method
    
    
    
    public ArraySet<Alumno> getIng(){
        return ing;
    }
    
    public ArraySet<Alumno> getLic(){
        return lic;
    }
    
    public static void main (String [] args){
        
       Escuela e= new Escuela("","");
       Alumno a1=new Alumno("nombre1", 19, 8.5);
       a1.altaCarrera("ing 1");
       a1.altaCarrera("ing 2");
       
       Alumno a2=new Alumno("nombre2", 20, 9);
       a2.altaCarrera("lic 1");
       a2.altaCarrera("lic 2");
       
       System.out.println("carrera a1:" +a1.getCarreras()+a1.toString()); 
       System.out.println("carrera a2:" +a2.getCarreras()+ a2.toString());
       e.altaAlumno(a1);
       e.altaAlumno(a2);
       Iterator<Alumno> it=e.getIng().iterator();
       while(it.hasNext())
        System.out.println(it.next());
        //System.out.println(e.getLic().iterator());

            
    }
}//class
