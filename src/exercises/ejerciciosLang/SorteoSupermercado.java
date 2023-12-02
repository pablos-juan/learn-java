/*
Un supermercado realiza una tómbola con todos los clientes. En el sorteo deben sacar dos balotas.
La primera balota, la sacan de canasta que tiene tres colores: amarillo, azul y rojo. Después de sacar el color,
deben sacar una balota de otra canasta, que tiene marcado un numero entre 1 y 5.
*/

/*
@author Juan Pablo Castaño Sanchez
*/

package exercises.ejerciciosLang;
import java.util.Scanner;
public class SorteoSupermercado {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String premio="";
        String color="";
        int opcionColor=0;
        int numero;
        double descuento = 0;

        do {
            System.out.println("Color de la bola: ");
            System.out.println("1. Amarillo.");
            System.out.println("2. Azul.");
            System.out.println("3. Rojo.");
            opcionColor = sc.nextInt();
        } while (opcionColor<1 || opcionColor>3);

        switch (opcionColor) {
            case 1:
                color="Amarillo";
                break;
            case 2:
                color="Azul";
                break;
            case 3:
                color="Rojo";
                break;
        }

        do {
            System.out.print("Númeor de la bola: ");
            numero = sc.nextInt();
        } while (numero<1 || numero>5);

        switch (numero) {
            case 1:
                System.out.println("Su bola " + color + " tiene un descuento de " + (descuento*100));
                descuento=0.1;
                break;
            case 2:
                if (opcionColor==1) {
                    premio="Gaseosa";
                } else if (opcionColor==2) {
                    premio="Cerveza";
                } else if (opcionColor==3) {
                    premio="Bebida hidratante";
                }
                System.out.println("Su bola " + color + " tiene un premio de " + premio);
                break;
            case 3:
                if (opcionColor==1) {
                    premio="Desodorante";
                } else if (opcionColor==2) {
                    premio="Crema dental";
                } else if (opcionColor==3) {
                    premio="Crema facial";
                }
                System.out.println("Su bola " + color + " tiene un premio de " + premio);
                break;
            case 4:
                if (opcionColor==1) {
                    premio="Salchichas";
                } else if (opcionColor==2) {
                    premio="Jamón";
                } else if (opcionColor==3) {
                    premio="Mortadela";
                }
                System.out.println("Su bola " + color + " tiene un premio de " + premio);
                break;
            case 5:
                if (opcionColor==1) {
                    premio="Camiseta";
                } else if (opcionColor==2) {
                    premio="Pantaloneta";
                } else if (opcionColor==3) {
                    premio="Gorra";
                }
                System.out.println("Su bola " + color + " tiene un premio de " + premio);
                break;
        }
    }
}
