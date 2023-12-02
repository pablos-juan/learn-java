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
import java.util.Scanner;

public class ConsultaCajero {
    public static void main(String[] args) {

        //Entrada de datos.
        Scanner sc = new Scanner(System.in);

        //Declarar variables.
        int dDisponible, dRetirar;

        //Encontrar la cantidad de dinero que tiene el cajero y el monto que desea retirar.
        System.out.print("Digite la cantidad de dinero que tiene el cajero: ");
        dDisponible=sc.nextInt();
        System.out.print("Digite la cantidad que desea retirar: ");
        dRetirar=sc.nextInt();

        //Condicionales.
        if (dRetirar%10!=0) {
            System.out.println("No es cantidad correcta.");
        } else if (dRetirar>dDisponible) {
            System.out.println("No hay dinero suficiente.");
        } else if (dRetirar<0) {
            System.out.println("No es cantidad correcta");
        } else {
            dDisponible -= dRetirar;
            //Imprimir saldo del cajero.
            System.out.println("Extraccion exitosa, el saldo del cajero es: " + dDisponible );
        }

    }
}
