/*
 * Estructuras de datos
 * Autor: Jose Luis Gutierrez Espinosa
 */
package EjerciciosStacks;

import Sets.ArraySet;
import java.io.File;
import java.util.Scanner;

/**
 *
 * @author jlgut
 */
public class Encuesta {
    private ArraySet<Alumno> ingles;
    private ArraySet<Alumno> frances;
    private ArraySet<Alumno> otros;
    
    
    
    public Encuesta(){
        ingles= new ArraySet();
        frances=new ArraySet();
        otros=new ArraySet();
    }//builder
    
    public ArraySet<Alumno> getIngles(){
        return ingles;
    }//getter
    
    public ArraySet<Alumno> getFrances(){
        return frances;
    }//getter
    
    public ArraySet<Alumno> getOtros(){
        return otros;
    }//getter
    
    public boolean leeDocumento(String tituloDoc){
        boolean res;
        try{
            File encDoc= new File(tituloDoc);
            Scanner leeArch= new Scanner(encDoc);
            int i=3;
            String next, nom ;
            int cu, cantMat, cantId, j;
            ArraySet<String>materias, idiomas;
            Alumno temp;
            while (leeArch.hasNext()){             
                cu=leeArch.nextInt();
                nom=leeArch.nextLine();
                cantMat=leeArch.nextInt();
                materias=new ArraySet();
                for(j=0;j<cantMat;j++)
                    materias.add(leeArch.next());
                cantId=leeArch.nextInt();
                idiomas=new ArraySet();
                for(j=0;j<cantId;j++)
                    idiomas.add(leeArch.next());
                temp= new Alumno(nom, cu, idiomas, materias);
                
                if (idiomas.contains("ingles"))
                    ingles.add(temp);
                if(idiomas.contains("frances"))
                    frances.add(temp);
                ArraySet<String> t= new ArraySet();
                t.add("ingles");
                t.add("frances");
                if (idiomas.difference(t).size()>0)
                    otros.add(temp);
                
                
            }//while
            
            
            leeArch.close();
            res=true;
        }//try
        catch(Exception e){
            System.out.println(e.toString());
            res= false;
        }//catch
        
        return res;
    }//method
    
    
    
}//class
