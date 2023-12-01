//Pedir dos palabras por teclado, indicar si son iguales
package metodosString;
import java.util.Scanner;

public class Comparar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Escribe la palabra 1: ");
        String palabra1=sc.next();

        System.out.print("Escriba la palabra 2: ");
        String palabra2=sc.next();

        if (palabra1.equals(palabra2)){ //usar equal equalsIgnoreCase para ignorar las mayúsculas
            System.out.println("Las palabras son iguales. ");
        } else {
            System.out.println("Las palabras no son iguales. ");
        }
    }
}
