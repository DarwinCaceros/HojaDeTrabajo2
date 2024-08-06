
package hojadetrabajo2;

/**
 *
 * @author Gio
 */
import java.util.Scanner;
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int mayor =18;
        
        System.out.println("Ingrese su edad para saber si es mayor de edad o no: ");
        int edad = scanner.nextInt();
        
       
        
       
                if(edad >= mayor) {
                   System.out.println("Segun la edad ingresada usted es mayor de edad");
                }else {
                    System.out.println("Segun la edad ingresada usted NO es mayor de edad");
                }
                
               
    }
    
}
