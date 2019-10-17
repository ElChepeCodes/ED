package ProbleQueues37;
import java.util.Calendar;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * Problema 37
 * @author EDg1
 */
public class Persona37 {
    private int dia, mes, anio;
    private String nombre;
    
    public Persona37() {
        this(1,1,3000,"vacio");
    }
    
    public Persona37(int d, int m, int a, String nom) {
        dia = d;    mes = m;    anio = a;
        nombre = nom;
    }
    
    // Calcula la edad al 31 de diciembre del año actual
    public int edad31dicAct() {
        int edad;
        try {
            // Obtencion del anhio actual
            Calendar cal = Calendar.getInstance();
            int anioAct = cal.get(Calendar.YEAR);
            // Fecha al 31 de diciembre del anio actual
            String fecha31dic = "" + anioAct + "-12-31";
            // Mes y dia a dos caracteres
            String cadmes = (mes<10)? "0"+mes : ""+mes;
            String caddia = (dia<10)? "0"+mes : ""+mes;
            String fechaNac = "" + anio + "-" + cadmes + "-" + caddia;
            LocalDate ld31dic = LocalDate.parse(fecha31dic);
            LocalDate ldNac = LocalDate.parse(fechaNac);
            long diasEntre = ChronoUnit.DAYS.between(ldNac, ld31dic);
            edad = (int)diasEntre/365;    // 365 dias por anhio
        } catch (Exception ex) {
            System.out.println( ex.toString() );
            edad = -999;
        }
        return edad;
    }
    
    public String toString() {
        String cade;
        cade = "[ Nombre: " + nombre +
                ", Nac: " + dia + "-" + mes + "-" + anio +
                ", Edad: " + edad31dicAct() + " ]";
        return cade;
    }
}
