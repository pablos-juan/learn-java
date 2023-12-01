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

package ejerciciosLang;
import java.util.Scanner;

public class ConjeturaUllman {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;

        //Repetir la solicitud mientras el numero no sea mayor que uno.
        do {
            System.out.println("Digite un número mayor que 1 (uno) para empezar: ");
            numero=sc.nextInt();
        } while (numero<=1);

        //Imprimir el numero, una coma y un espacio.
        System.out.print(numero + ", ");

        //Repetir mientra que numero sea diferente de 1.
        while (numero != 1) {

            if (numero%2==0) {
                //Si es par dividir por 2.
                numero=numero/2;
            } else {
                //Si es impar multiplicar por 3 y sumar 1.
                numero=(numero*3)+1;
            }

            System.out.print(numero);

            if (numero != 1) {
                System.out.print(", ");
            }

        }
    }
}
