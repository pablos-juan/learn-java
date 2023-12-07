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
        int minimumQualification, qualificationsNumber;
        int greaterThan = 0;
        double qualification;

        System.out.print("Enter number of qualification: ");
        qualificationsNumber = getNumber(sc);

        System.out.print("Write the minimum qualification: ");
        minimumQualification = getNumber(sc);

        for (int i = 1; i <= qualificationsNumber; i++)  {
            System.out.print("Qualification "  + i + ": ");
            qualification = obtenerCalificacion(sc);

            if (qualification >= minimumQualification) greaterThan++;
        }

        System.out.println("The number of qualifications equal of or greater than "
                            + minimumQualification + " are: " + greaterThan);
    }

    public static int getNumber(Scanner scanner) {
        while (true) {
            try {
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Error. Enter a number.");
                scanner.nextLine();
            }
        }
    }

    public static double obtenerCalificacion(Scanner scanner) {
        while (true) {
            try {
                return scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Error. Enter a number.");
                scanner.nextLine();
            }
        }
    }
}
