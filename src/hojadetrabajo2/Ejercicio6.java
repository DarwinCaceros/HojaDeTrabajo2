
package hojadetrabajo2;

/**
 *
 * @author Gio
 */
import java.util.Scanner;
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
           System.out.println("Ingresar el anio para saber si es bisiesto o no: ");
           int year = scanner.nextInt();
           
           boolean bisiesto;
           
           if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
               bisiesto = true;
               
           }else {
               bisiesto = false;
           }
           
           if (bisiesto){
               System.out.println(year + " El anio ingresado es bisiesto.");
           }else {
               System.out.println(year +" El anio ingresado no es bisiesto.");
           }
           
           scanner.close();
 }
}