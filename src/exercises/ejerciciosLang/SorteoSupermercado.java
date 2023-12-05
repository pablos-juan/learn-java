/*
Un supermercado realiza una tómbola con todos los clientes. En el sorteo deben sacar dos balotas.
La primera balota, la sacan de canasta que tiene tres colores: amarillo, azul y rojo. Después de sacar el color,
deben sacar una balota de otra canasta, que tiene marcado un numero entre 1 y 5.
*/

/*
@author Juan Pablo Castaño Sanchez
*/

package exercises.ejerciciosLang;
import java.util.InputMismatchException;
import java.util.Scanner;
public class SorteoSupermercado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String premio;
        String color="";
        int opcionColor;
        int numero;
        double descuento = 0;

        do {
            System.out.println("Color de la bola: ");
            System.out.println("1. Amarillo.");
            System.out.println("2. Azul.");
            System.out.println("3. Rojo.");
            while (true) {
                try {
                    opcionColor = sc.nextInt();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Error. Ingrese un número.");
                    sc.nextLine();
                }
            }
        } while (opcionColor<1 || opcionColor>3);

        color = switch (opcionColor) {
            case 1 -> "Amarillo";
            case 2 -> "Azul";
            case 3 -> "Rojo";
            default -> color;
        };

        do {
            System.out.print("Número de la bola: ");
            while (true) {
                try {
                    numero = sc.nextInt();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Error. Ingrese un número.");
                    sc.nextLine();
                }
            }
        } while (numero<1 || numero>5);

        switch (numero) {
            case 1:
                System.out.println("Su bola " + color + " tiene un descuento de " + (descuento*100));
                break;
            case 2:
                premio = switch (opcionColor) {
                    case 1 -> "Gaseosa";
                    case 2 -> "Cerveza";
                    case 3 -> "Bebida hidratante";
                    default -> "Sin premio";
                };
                System.out.println("Su bola " + color + " tiene un premio de " + premio);
                break;
            case 3:
                premio = switch (opcionColor) {
                    case 1 -> "Desodorante";
                    case 2 -> "Crema dental";
                    case 3 -> "Crema facial";
                    default -> "Sin premio";
                };
                System.out.println("Su bola " + color + " tiene un premio de " + premio);
                break;
            case 4:
                premio = switch (opcionColor) {
                    case 1 -> "Salchichas";
                    case 2 -> "Jamón";
                    case 3 -> "Mortadela";
                    default -> "Sin premio";
                };
                System.out.println("Su bola " + color + " tiene un premio de " + premio);
                break;
            case 5:
                premio = switch (opcionColor) {
                    case 1 -> "Camiseta";
                    case 2 -> "Pantaloneta";
                    case 3 -> "Gorra";
                    default -> "Sin premio";
                };
                System.out.println("Su bola " + color + " tiene un premio de " + premio);
                break;
        }
    }
}
