package exercises.ejerciciosLang;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Fruteria {
    public static void main(String[] args) {

        //Definir la entrada de datos.
        Scanner sc = new Scanner(System.in);
        double kilos;
        double precio;

        //Solicitar el numero de kilos y almacenarlo en la variable kilos (float).
        System.out.print("Kilos: ");
        while (true) {
            try {
                kilos = sc.nextFloat();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Error. Ingrese un número.");
                sc.nextLine();
            }
        }

        //Solicitar el precio del kilo y almacenarlo en la variable precio.
        System.out.println("Precio por kilo: ");
        while (true) {
            try {
                precio = sc.nextDouble();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Error. Ingrese un número.");
                sc.nextLine();
            }
        }

        //Obtener el valorBruto multiplicando kilos*precio y agregando int para evadir errores.
        double valorBruto= precio * kilos;
        //Inicializar variable descuento para el caso donde no existe el descuento.
        double descuento = 0.0;

        //Asignar descuentos.
        if (kilos >= 10) {
            descuento = 0.2;
        } else if (kilos >= 5) {
            descuento = 0.15;
        } else if (kilos >= 2) {
            descuento = 0.1;
        }

        //Encontrar el valorDescuento y valorPago.
        double valorDescuento = valorBruto * descuento;
        double valorPago = valorBruto - valorDescuento;

        //Imprimir recibo.
        System.out.println("Kilos comprados: " + kilos);
        System.out.println("Precio por kilo: " + precio);
        System.out.println("Valor Bruto: " + valorBruto);
        System.out.println("Descuento de " + (descuento*100) + "%: " + valorDescuento);
        System.out.println("Valor Pago: " + valorPago);

    }
}
