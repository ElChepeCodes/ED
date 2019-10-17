/*
 * Estructuras de datos
 * Autor: Jose Luis Gutierrez Espinosa
 */
package ejercicio10;
public class EmpresaMinera {
    
    private String nombreEmpresa;
    private Camion [] camiones;
    private int totCamion;
    private final int MAX_CAM=20;
    
    public EmpresaMinera(String nom){
        nombreEmpresa=nom;
        camiones=new Camion[MAX_CAM];
        totCamion=0;
    }//builder
    
    public boolean altaCamion(Camion c){
        boolean res= false;
        if (totCamion<MAX_CAM){
            camiones[totCamion]=c;
            res=true;
            totCamion++;
        }//if
        return res;
    }//Method
    
    
    public String reportePasajeros(){
        StringBuilder res=new StringBuilder ();
        for (int i=0; i<totCamion;i++){
            if (camiones[i] instanceof DePasajeros){
                res.append(((DePasajeros)camiones[i]).toString());
            }    
        }//for
        return res.toString();
    }//method
    
    public int buscaCamion(String placa){
        int i=0;
        while (i<totCamion && camiones[i].getPlacas()!=placa)
            i++;
        if (!camiones[i].getPlacas().equals(placa))
            i=-1;
        return i;
    }//method
    
    public boolean cambiaCapacidadDeVolteo(String placa, double cap){
        boolean res=false;
        int i=buscaCamion(placa);
        if (i>=0){
            if (camiones[i] instanceof DeVolteo){
                ((DeVolteo) camiones[i]).setCap(cap);
                res=true;
            }//if
        }//if
        return res;
    }//method
    
    public int cuentaPasajMarca(String marca){
        int res=0;
        for(int i=0;i<totCamion;i++){
            if (camiones[i] instanceof DePasajeros)
                if(camiones[i].getMarca().equals(marca))
                    res++;
        }//for
        return res;
    }//method
    
    public double calculaTotalTierra(){
        double res=0;
        for(int i=0;i<totCamion;i++){
            if (camiones[i] instanceof DeVolteo)
                    res+=((DeVolteo)camiones[i]).getCap();
        }//for
        return res;
    }//method
    
    public static void main(String[] args){
        System.out.println("Elaborado por Jose Luis Gutierrez Espinosa--C.U.: 179888"+"\n");
        EmpresaMinera empresa = new EmpresaMinera("Empresa");
        
        DePasajeros p1= new DePasajeros("marca1", "numero1", "placa1", 10);
        DePasajeros p2= new DePasajeros("marca1", "numero2", "placa2", 14);
        DePasajeros p3= new DePasajeros("marca2", "numero3", "placa3", 10);
        DePasajeros p4= new DePasajeros("marca2", "numero4", "placa4", 11);
        DePasajeros p5= new DePasajeros("marca3", "numero5", "placa5", 13);
        
        DeVolteo v1=new DeVolteo("marca1", "numero6", "placa6", 100);
        DeVolteo v2=new DeVolteo("marca2", "numero7", "placa7", 200);
        DeVolteo v3=new DeVolteo("marca2", "numero8", "placa8", 200);
        DeVolteo v4=new DeVolteo("marca3", "numero9", "placa9", 300);
        
        empresa.altaCamion(p1);
        empresa.altaCamion(p2);
        empresa.altaCamion(p3);
        empresa.altaCamion(p4);
        empresa.altaCamion(p5);
        empresa.altaCamion(v1);
        empresa.altaCamion(v2);
        empresa.altaCamion(v3);
        empresa.altaCamion(v4);
        
        System.out.println(empresa.reportePasajeros());//1)
        empresa.cambiaCapacidadDeVolteo("placa6", 1000);//2)
        System.out.println("\n"+empresa.cuentaPasajMarca("marca1"));//3)
        System.out.println("\n"+empresa.calculaTotalTierra());
        
    }//main
    
}//class
