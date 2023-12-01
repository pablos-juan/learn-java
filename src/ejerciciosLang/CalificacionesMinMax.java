/*
Programa que pide por teclado dos números, numNotas y numMinima:
- numNotas es el número de calificaciones que van posteriormente a pedir
- numMinima una nota mínima que se va a controlar luego.
Hacer un programa que pida todas la calificaciones, e indicar finalmente cuántas calificaciones han igualado o superado la nota mínima antes mencionada.
*/

/*
@author Juan Pablo Castaño Sanchez
*/

package ejerciciosLang;
import java.util.Scanner;

public class CalificacionesMinMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numMin, numNotas;
        double calificacion;
        int mayoresIguales=0;
        System.out.print("Escriba el número de notas: ");
        numNotas=sc.nextInt();

        System.out.print("Esriba la nota mínima: ");
        numMin=sc.nextInt();

        for (int i = 1; i <= numNotas; i++)  {
            System.out.println("Escriba la calificación "  + i + ": ");
            calificacion=sc.nextDouble();

            if (calificacion>=numMin) {
                mayoresIguales++;
            }
        }

        System.out.println("El número de calificación mayores o iguales a " + numMin + " es: " + mayoresIguales);

    }
}
