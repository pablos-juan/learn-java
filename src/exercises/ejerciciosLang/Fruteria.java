package exercises.ejerciciosLang;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Fruteria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double kilos, precio;

        System.out.print("Kilos: ");
        kilos = obtenerDouble(sc);

        System.out.println("Precio por kilo: ");
        precio = obtenerDouble(sc);

        double valorBruto = precio * kilos;
        double descuento = 0.0;

        //asignar descuentos
        if (kilos >= 10) {
            descuento = 0.2;
        } else if (kilos >= 5) {
            descuento = 0.15;
        } else if (kilos >= 2) {
            descuento = 0.1;
        }

        double valorDescuento = valorBruto * descuento;
        double valorPago = valorBruto - valorDescuento;

        //imprimir recibo
        System.out.println("Kilos comprados: " + kilos);
        System.out.println("Precio por kilo: " + precio);
        System.out.println("Valor Bruto: " + valorBruto);
        System.out.println("Descuento de " + (descuento*100) + "%: " + valorDescuento);
        System.out.println("Valor total: " + valorPago);
    }

    public static double obtenerDouble(Scanner scanner) {
        while (true) {
            try {
                return scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Error. Ingrese un número.");
                scanner.nextLine();
            }
        }
    }
}
