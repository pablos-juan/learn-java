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
        int llantas, vrUnidad, vrTotal;

        //encontrar y almacenar el numero de llantas a comprar
        System.out.print("Numero de llantas Pirilli: ");
        while (true) {
            try {
                llantas = sc.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Error. Ingrese un número.");
                sc.nextLine();
            }
        }

        //encontrar el valor de cada llanta
        if (llantas>10) {
          vrUnidad = 50;
        } else if (llantas>=5) {
            vrUnidad = 75;
        } else {
            vrUnidad = 100;
        }

        //encontrar valor total de las llantas
        vrTotal = vrUnidad * llantas;

        //imprimir recibo
        System.out.println("Llantas Pirilli: " + llantas);
        System.out.println("Valor Unidad: $" + vrUnidad);
        System.out.println("Valor Total: $" + vrTotal);

    }
}
