/*
 * Autor: Jos� Luis Guti�rrez Espinosa
 */
package ejerciciosenclase;

public class Empresa {
    private String nombre, direccion, dueno;
    private final int MAX=20;
    private Empleado [] empleados;
    private int cantAdmins, cantOpers, cantEmpl;
    
    public Empresa(String nom, String dir, String due){
        nombre=nom;
        direccion=dir;
        dueno=due;
        empleados= new Empleado[MAX];
        cantAdmins=0;
        cantOpers=0;
    }//builder
    
    public boolean altaAdmin(String nom, double salario, String depa, String tele){
        boolean res = false;
        if (cantEmpl<MAX){
            empleados[cantEmpl]=new Administrativo(nom, salario, depa, tele);
            cantAdmins++;
            cantEmpl++;
            res=true;
        }//if
        return res;
    }//method
    
    public boolean altaOper(String nom, double sueldo, int horas){
        boolean res = false;
        if (cantEmpl<MAX){
            empleados[cantEmpl]=new Operario(nom, sueldo, horas);
            cantOpers++;
            cantEmpl++;
            res=true;
        }//if
        return res;
    }//method
    
    public String reporteAdmins(){
        StringBuilder res= new StringBuilder();
        if (cantAdmins>0 && cantEmpl>0){
            for(int i=0;i<cantEmpl;i++)
                if(empleados[i].getClass().getSimpleName().equals("Administrativo"))
                res.append(empleados[i].toString()).append("\n");
        }//if
        return res.toString();
    }//method
    
    public boolean aumentoAdmin(int clave, double aumento){
        boolean res = false;
        if (cantAdmins>0){    
            int i=0;
            Administrativo otro = new Administrativo(clave);
            while(i<cantEmpl && !empleados[i].equals(otro))
                i++;
            if (i<cantEmpl){
                res=true;
                empleados[i].aumentoSueldo(aumento);
            }//if
        }//if
        return res;
    }//method
    
    
    public boolean cambiaDepartamento(int clave, String departamento){
        boolean res=false;
        int i=0;
        Administrativo otro = new Administrativo(clave);
        while(i<cantEmpl && !empleados[i].equals(otro))
            i++;
        if (i<cantEmpl){
            
            if (empleados[i] instanceof Administrativo){
                res=true;
                ((Administrativo)empleados[i]).cambiaDepartamento(departamento);
            }//if
        }//if
        return res;
    }//method
    

    
    
    public String reporteOperariosMenor(double cant){
        StringBuilder res= new StringBuilder();
        int tot=0;
        for (int i=0;i<cantOpers;i++){
            if (empleados[i].getSueldoBase()<cant && empleados[i] instanceof Operario){
                tot++;
                res.append(empleados[i].getNombreEmpleado()).append("\n");
            }
        }//for
        return res.toString()+"\nTotal de empleados con un sueldo menor a "+cant+": "+tot;
    }//method
    
    public String salarioAdminsNominaEmp(double prest, double ded){
        StringBuilder res= new StringBuilder();
        double temp, tot=0;
        for (int i=0;i<cantEmpl;i++){
            if (empleados[i] instanceof Administrativo){
                temp=empleados[i].calculaSalario(prest, ded);
                tot+=temp;
               res.append(empleados[i].getNombreEmpleado()+"-"+empleados[i].getClave() +"-salario: "+temp);
            }//if
        }//for
        res.append("Nomina total de administrativos: "+tot);
        return res.toString();
    }//method
    
}//class
