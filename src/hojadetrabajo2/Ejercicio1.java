
package hojadetrabajo2;

/**
 *
 * @author Gio
 */
import java.util.Scanner;
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("El siguiente programa compara dos numeros enteros ingresados por el usuario y responde con el mayor");
        
        System.out.println("Ingrese el primer numero entero: ");
        int num1 = scanner.nextInt();
        
        System.out.println("Ingrese el segundo numero entero: ");
        int num2 = scanner.nextInt();
        
        int respuesta;
                if(num1 > num2) {
                    respuesta = num1;
                }else {
                    respuesta = num2;
                }
                System.out.println("El mayor de los dos ingresados es:" +respuesta);
    }
    
}
