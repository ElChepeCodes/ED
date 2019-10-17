/*
 * Autor: Jos� Luis Guti�rrez Espinosa
 */
package ejerciciosenclase;

public class Escuela {
    private final int MAX_ALUM=50;
    private int totalAlum;
    private String nombre, direccion;
    private Alumno[] alumnos;
    
    public Escuela(String nom, String dir){
        nombre=nom; direccion=dir;
        alumnos= new Alumno[MAX_ALUM];
        totalAlum=0;
    }//builder
    
    public boolean altaAlum(String nombre){
        boolean res= false;
        if (totalAlum<MAX_ALUM){
           alumnos[totalAlum]=new Alumno(nombre); 
           res=true;
           totalAlum++;
        }//if
        return res;
    }//method
    
    public boolean altaCalificacion(int clave, double calif){
        boolean res=false;
        if (totalAlum>0){
            int i=0;
            while (i<totalAlum && alumnos[i].getClave()!=clave)
                i++;
            if (i<totalAlum)
                res=alumnos[i].altaCalificacion(calif);
        }//if   
            return res;
    }//method
    
    public String reporteAlumno(int clave){
        String res;
        if (totalAlum>0){
            int i=0;
            while (i<totalAlum && alumnos[i].getClave()!=clave)
                i++;
            if (i<totalAlum)
                res=alumnos[i].toString();
            else
                res="No se encontro un alumno con esa clave unica";
        }//if
        else
            res="No hay alumnos dados de alta";
        return res;
        
    }//method
    
    public String promedios(){
        StringBuilder res = new StringBuilder();
        for (int i=0;i<totalAlum;i++){
            res.append(alumnos[i].getNombre()+"----"+alumnos[i].calculaPromedio()).append("\n");
        }//for
        return res.toString();
    }//method
    
    public String masAprovadas(){
        int masAprov=0;
        Alumno aprov=null;
        if (totalAlum>0)
        for (int i=0;i<totalAlum;i++){
            if (alumnos[i].cuentaAprovadas()>masAprov){
                masAprov=alumnos[i].cuentaAprovadas();
                aprov=alumnos[i];
            }//if
        }//for
        return aprov.getNombre();
    }//method
    
   /* public static void main(String [] args){
        Escuela esc= new Escuela("escuela","direccion");
        esc.altaAlum("Juan");
        esc.altaCalificacion(100, 10);
        esc.altaCalificacion(100, 5);
        esc.altaCalificacion(100, 10);
        esc.altaCalificacion(100, 5);
        esc.altaCalificacion(100, 10);
        esc.altaCalificacion(100, 5);
        System.out.println(esc.reporteAlumno(100));
        esc.altaAlum("Roberto");
        esc.altaCalificacion(101, 10);
        esc.altaCalificacion(101, 5);
        esc.altaCalificacion(101, 10);
        esc.altaCalificacion(101, 5);
        esc.altaCalificacion(101, 10);
        esc.altaCalificacion(101, 7);
        System.out.println(esc.reporteAlumno(101));
        System.out.println("Alumno con mas materias aprovadas: "+ esc.masAprovadas());
        System.out.println("Promedios:"+"\n"+esc.promedios());
    }//main*/
}//class
