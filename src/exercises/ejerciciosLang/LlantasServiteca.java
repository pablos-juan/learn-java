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
import java.util.Scanner;

public class LlantasServiteca {
    public static void main(String[] args) {

        //Entrada de datos.
        Scanner sc = new Scanner(System.in);
        //Definir variables.
        int llantas, vrUnidad, vrTotal;

        //Encontrar y almacenar el numero de llantas a comprar.
        System.out.println("Numero de llantas Pirilli: ");
        llantas=sc.nextInt();

        //Encontrar el valor dde cada llanta.
        if (llantas>10) {
          vrUnidad = 50;
        } else if (llantas>=5) {
            vrUnidad = 75;
        } else {
            vrUnidad = 100;
        }

        //Encontrar valor total de las llantas.
        vrTotal = vrUnidad*llantas;

        //Imprimir recibo.
        System.out.println("Llantas Pirilli: " + llantas);
        System.out.println("Valor Unidad: $" + vrUnidad);
        System.out.println("Valor Total: $" + vrTotal);

    }
}
