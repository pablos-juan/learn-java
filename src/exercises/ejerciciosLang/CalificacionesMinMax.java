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
        double calificacion;
        int mayoresIguales=0;

        System.out.print("Escriba el número de notas: ");
        while (true) {
            try {
                numNotas = sc.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Error. Ingrese un número.");
                sc.nextLine();
            }
        }

        System.out.print("Esriba la nota mínima: ");
        while (true) {
            try {
                numMin = sc.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Error. Ingrese un número.");
                sc.nextLine();
            }
        }

        for (int i = 1; i <= numNotas; i++)  {
            System.out.println("Escriba la calificación "  + i + ": ");
            while (true) {
                try {
                    calificacion = sc.nextDouble();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Error. Ingrese un número.");
                    sc.nextLine();
                }
            }
            if (calificacion >= numMin) {
                mayoresIguales++;
            }
        }

        System.out.println("El número de calificación mayores o iguales a " + numMin + " es: " + mayoresIguales);

    }
}
