
package hojadetrabajo2;

/**
 *
 * @author Gio
 */
import java.util.Scanner;
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
           System.out.println("Ingresar un numero del 1 al 12 para decirle a que mes corresponde: ");
           int mesNum = scanner.nextInt();
           String mes;
           
           if (mesNum == 1) {
               mes = "Enero";
               
           }else if (mesNum == 2) {
               mes = "Febrero"; 
           }else if (mesNum == 3) {
               mes = "Marzo";
           }else if (mesNum == 4) {
               mes = "Abril";
           }else if (mesNum == 5) {
               mes = "Mayo";    
           }else if (mesNum == 6) {
               mes = "Junio"; 
           }else if (mesNum == 7) {
               mes = "Julio";
           }else if (mesNum == 8) {
               mes = "Agosto";       
           }else if (mesNum == 9) {
               mes = "Septiembre";
           }else if (mesNum == 10) {
               mes = "Octubre";
           }else if (mesNum == 11) {
               mes = "Noviembre";
           }else if (mesNum == 12) {
               mes = "Diciembre"; 
           }else {
               mes = "El numero ingresado es erroneo, no corresponde a ningun mes";       
    }
           
           System.out.println("El mes elegido es: "+mes);
           
           scanner.close();
}
}
