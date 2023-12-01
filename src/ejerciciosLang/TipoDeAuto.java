/*
Una empresa automotriz necesita un sistema para seleccionar el tipo de carro (auto, SUV o camioneta) lo cual debe de aparecer en un
menú, y el color (negro, blanco o rojo) en otro menú. Al final se necesita que despliegue la selección realizada. Nota.
Debe de anidarse una estructura de selección múltiple dentro de otra.
*/

/*
@author Juan Pablo Castaño Sanchez
*/


package ejerciciosLang;
import java.util.Scanner;

public class TipoDeAuto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcionAuto, opcionColor;
        String auto="";
        String color="";

        System.out.println("~TIPO DE VEHICULO~");
        do {

            System.out.println("Seleccione el tipo de vehiculo: ");
            System.out.println("1. SUV.");
            System.out.println("2. Auto.");
            System.out.println("3. Camioneta.");
            System.out.print("Opcion: ");

            opcionAuto = sc.nextInt();

            switch (opcionAuto) {
                case 1:
                    auto = "SUV";
                    break;
                case 2:
                    auto = "Auto";
                    break;
                case 3:
                    auto = "Camioneta";
                    break;
                default:
                    System.out.println("Opcion incorrecta.");
            }

        } while (opcionAuto<1 || opcionAuto>3);


        System.out.println("~COLOR DEL VEHICULO~");
        do {

            System.out.println("Seleccione el color de su " + auto + ": ");
            System.out.println("1. Negro.");
            System.out.println("2. Rojo.");
            System.out.println("3. Blanco.");
            System.out.print("Opcion: ");

            opcionColor=sc.nextInt();

            switch (opcionColor) {
                case 1:
                    color="Negro";
                    break;
                case 2:
                    color="Rojo";
                    break;
                case 3:
                    color="Blanco";
                    break;
                default:
                    System.out.println("Opcion incorrecta.");
            }


        } while (opcionColor<1 || opcionColor>3);

        System.out.println("");
        System.out.println("El tipo de vehiculo es: " + auto);
        System.out.println("El color se su " + auto + " es: " + color);
    }
}
