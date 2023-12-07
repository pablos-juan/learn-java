/*
Desarrolle un programa que simula la extracción de dinero de un cajero. Pide dos números enteros por teclado:
- la cantidad de dinero que hay inicialmente en el cajero
- la cantidad que se desea extraer
Luego hace estos controles y emite estos mensajes:
•Si la cantidad a extraer no es múltiplo de 10, avisa "No es cantidad correcta".
•Si la cantidad que pide es mayor que la que hay en el cajero, dice "No hay dinero suficiente"
•Si la cantidad que se pide es negativa, dice "No es cantidad correcta".
•Si no ocurre ninguno de los errores anteriores, nos indica que cantidad queda en el cajero tras la extracción.
*/

/*
@author Juan Pablo Castaño Sanchez
*/

package exercises.ejerciciosLang;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ConsultaCajero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int disponible, retirar;

        System.out.print("Digite la cantidad de dinero que tiene el cajero: ");
        disponible = obtenerCantidad(sc);

        System.out.print("Digite la cantidad que desea retirar: ");
        retirar = obtenerCantidad(sc);

        if (retirar %10!=0 || retirar <0) {
            System.out.println("Cantidad incorrecta.");
        } else if (retirar > disponible) {
            System.out.println("Dinero insuficiente.");
        } else {
            disponible -= retirar;
            System.out.println("Extraccion exitosa! Saldo del cajero: $" + disponible);
        }
    }

    public static int obtenerCantidad(Scanner scanner) {
        while (true) {
            try {
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Error. Ingrese un número.");
                scanner.nextLine();
            }
        }
    }
}
