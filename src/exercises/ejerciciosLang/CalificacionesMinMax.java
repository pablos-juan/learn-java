/*
Programa que pide por teclado dos números, numNotas y numMinima:
- numNotas es el número de calificaciones que van posteriormente a pedir
- numMinima una nota mínima que se va a controlar luego.
Hacer un programa que pida todas la calificaciones, e indicar finalmente cuántas calificaciones han igualado o superado la nota mínima antes mencionada.
*/

/*
@author Juan Pablo Castaño Sanchez
*/

package exercises.ejerciciosLang;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CalificacionesMinMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numMin, numNotas;
        int mayoresIguales=0;
        double calificacion;

        System.out.print("Escriba el número de notas: ");
        numNotas = obtenerNumero(sc);

        System.out.print("Esriba la nota mínima: ");
        numMin = obtenerNumero(sc);

        for (int i = 1; i <= numNotas; i++)  {
            System.out.print("Calificación "  + i + ": ");
            calificacion = obtenerCalificacion(sc);

            if (calificacion >= numMin) mayoresIguales++;
        }

        System.out.println("El número de calificación mayores o iguales a " + numMin + " es: " + mayoresIguales);
    }

    public static int obtenerNumero(Scanner scanner) {
        while (true) {
            try {
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Error. Ingrese un número.");
                scanner.nextLine();
            }
        }
    }

    public static double obtenerCalificacion(Scanner scanner) {
        while (true) {
            try {
                return scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Error. Ingrese un número.");
                scanner.nextLine();
            }
        }
    }
}
