/*
En una serviteca se ha establecido una promoción de las llantas marca “Perilli”, dicha promoción consiste en lo siguiente:
    - Si se compran menos de cinco llantas el precio es de U$100 cada una.
    - El precio es U$75 si se compran de cinco a diez.
    - El precio de U$50 si se compran más de 10.
Obtener la cantidad de dinero que una persona tiene que pagar por cada una de las llantas que compra y la que tiene que pagar por el total de la compra.
*/

/*
@author Juan Pablo Castaño Sanchez
*/

package exercises.ejerciciosLang;
import java.util.InputMismatchException;
import java.util.Scanner;

public class LlantasServiteca {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int llantas, vrTotal;
        int valorUnidad = 100;

        System.out.print("Numero de llantas Pirilli: ");
        llantas = obtenerNumero(sc);

        if (llantas>10) {
            valorUnidad = 50;
        } else if (llantas>=5) valorUnidad = 75;

        vrTotal = valorUnidad * llantas;

        //imprimir recibo
        System.out.println("Llantas Pirilli: " + llantas);
        System.out.println("Valor Unidad: $" + valorUnidad);
        System.out.println("Valor Total: $" + vrTotal);
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
}
