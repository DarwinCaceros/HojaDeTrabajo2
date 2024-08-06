
package hojadetrabajo2;

/**
 *
 * @author Gio
 */
import java.util.Scanner;
public class Ejercicio2 {

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
        
        System.out.println("Ingrese el tercer numero entero: ");
        int num3 = scanner.nextInt();
        
        int respuesta;
                if(num1 >= num2 && num1 >= num3) {
                    respuesta = num1;
                }else if (num2 >= num1 && num2 >= num3){
                    respuesta = num2;
                }else {
                    respuesta = num3;
                }
                
                System.out.println("El mayor de los dos ingresados es:" +respuesta);
    }
    
}
