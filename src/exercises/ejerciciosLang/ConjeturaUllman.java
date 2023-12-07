/*
Realizar un programa que pida al usuario un número, positivo y mayor que 1. A continuación, el programa escribirá los números de
la serie Conjetura de Ullman (en honor al matemático S. Ullman). La conjetura consiste en lo siguiente:
1. Empieza con cualquier entero positivo (en nuestro caso, el número que el usuario ha indicado por teclado).
2. Si el numero es par, se divide entre 2; se imprime, y se vuelve al punto 2, ahora a procesar el nuevo numero obtenido
3. Si el numero es impar, se multiplica por 3 y se agrega le agrega 1. Se imprime, y se vuelve al punto 2, ahora a procesar el nuevo numero obtenido
4. Se continua hasta obtener el número 1, momento en el que acaba la serie.
La serie confirma que, sea cual sea el numero inicial elegido, al final se obtendrá el número 1.
Por ejemplo, cuando el entero inicial elegido por el usuario es 26, la secuencia que se ha de escribir
es esta:
26, 13, 40, 20, 10, 5, 16, 8, 4, 2, 1.
*/

/*
@author Juan Pablo Castaño Sanchez
*/

package exercises.ejerciciosLang;
import java.util.Scanner;

public class ConjeturaUllman {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        do {
            System.out.println("Digite un número mayor que 1: ");
            numero = obtenerNumero(sc);
        } while (numero<=1);

        System.out.print(numero + ", ");

        while (numero != 1) { //mientras que numero no sea 1
            //dividir entre 2 si es par, multiplicar por 3 y sumar 1 si es impar
            numero = numero % 2 == 0 ? numero/2 : (numero*3) + 1;

            imprimirNumero(numero);
        }
    }

    public static int obtenerNumero(Scanner scanner) {
        while (true) {
            try {
                return scanner.nextInt();
            } catch (IncompatibleClassChangeError e) {
                System.out.println("Error. Ingrese un número.");
                scanner.nextLine();
            }
        }
    }

    public static void imprimirNumero(int numero) {
        System.out.print(numero);
        if (numero > 1) System.out.print(", ");
    }
}
