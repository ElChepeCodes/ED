/*
 * Estructuras de datos
 * Autor: Jose Luis Gutierrez Espinosa
 */
package EjerciciosStacks;

import Sets.ArraySet;

/**
 *
 * @author jlgut
 */
public class Main {
    
    public static ArraySet<Alumno> regresaSoloIngles(Encuesta enc){
        ArraySet<Alumno> res=new ArraySet(), temp1=enc.getIngles(), temp2= new ArraySet();
        ArraySet<String> idTemp= new ArraySet();
        Alumno t;
        while(!temp1.isEmpty()){
            t=temp1.removeRandom();
            idTemp=t.getIdiomas();
            if (idTemp.size()==1)
                res.add(t);
            temp2.add(t);
        }//while
        while(!temp2.isEmpty())
            temp1.add(temp2.removeRandom());
        return res;
    }//method
    
    public static ArraySet<Alumno> regresaFrancesIngles(Encuesta enc){
       return (ArraySet<Alumno>)enc.getFrances().intersection(enc.getIngles());
    }//method
    
    public static ArraySet<Alumno> regresaTresIdiomas(Encuesta enc){
        ArraySet<Alumno> res=new ArraySet(), ing=enc.getIngles(), fran=enc.getFrances(), otr=enc.getOtros(), temp= new ArraySet();
        Alumno t;
            while (!ing.isEmpty()){
                t=ing.removeRandom();
                if (t.getIdiomas().size()>=3)
                    res.add(t);
                temp.add(t);
            }//while
            while(!temp.isEmpty())
                ing.add(temp.removeRandom());
            while (!fran.isEmpty()){
                t=fran.removeRandom();
                if (t.getIdiomas().size()>=3)
                    res.add(t);
                temp.add(t);
            }//while
            while(!temp.isEmpty())
                fran.add(temp.removeRandom());
            while (!otr.isEmpty()){
                t=otr.removeRandom();
                if (t.getIdiomas().size()>=3)
                    res.add(t);
                temp.add(t);
            }//while
            while(!temp.isEmpty())
                otr.add(temp.removeRandom());
        return res;
    }//method
    
    
    public static void main(String[] args){
        Encuesta enc=new Encuesta();
        String tituloDoc="Alumnos.txt";
        enc.leeDocumento(tituloDoc);
        
        System.out.println("Ingles: "+"\n"+enc.getIngles().toString());
        System.out.println("Frances: "+"\n"+enc.getFrances().toString());
        System.out.println("Otros: "+"\n"+enc.getOtros().toString());
        
        ArraySet<Alumno> soloIngles=regresaSoloIngles(enc), francesIngles=regresaFrancesIngles(enc), tresOMas=regresaTresIdiomas(enc);
        System.out.println("Alumnos que solo dominan ingles: ");
        while(!soloIngles.isEmpty())
            System.out.println(soloIngles.removeRandom().getNombre());
        System.out.println("Alumnos que dominan ingles y frances: ");
        while(!francesIngles.isEmpty())
            System.out.println(francesIngles.removeRandom().getNombre());
        System.out.println("Alumnos que dominan 3 idiomas: ");
        while(!tresOMas.isEmpty())
            System.out.println(tresOMas.removeRandom().getNombre());

    }//main
}//class
