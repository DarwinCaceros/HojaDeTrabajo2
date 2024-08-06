
package hojadetrabajo2;

/**
 *
 * @author Gio
 */
import java.util.Scanner;
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
           System.out.println("Ingrese el numero para poder decirle si es negatvio o positivo");
           int num = scanner.nextInt();
           
           if (num >0) {
               System.out.println("El numero ingresado es positivo");
           }else if (num <0){
               System.out.println("El numero ingresado es negativo");
               
           }else {
               System.out.println("El numero que ingreso es 0");
           }
    }   
    }