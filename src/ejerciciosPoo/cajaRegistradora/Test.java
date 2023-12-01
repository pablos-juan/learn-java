package ejerciciosPoo.cajaRegistradora;
//@Author: JUAN PABLO CASTAÑO SANCHEZ. 20231213945.

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CajaRegistradora cajaRegistradora = new CajaRegistradora("Caja registradora.");
        int opcion = 0;
        int monedas = 0;

        while (opcion != 5) {
            System.out.println("1. Ingresar monedas");
            System.out.println("2. Listar contenido");
            System.out.println("3. Mostrar saldo");
            System.out.println("4. Extraer monedas");
            System.out.println("5. Salir");
            System.out.print("Elija una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el tipo de moneda: ");
                    double tipo = scanner.nextDouble();
                    System.out.println("número de monedas a ingresar: ");
                    int unidades = scanner.nextInt();
                    boolean exito = cajaRegistradora.meterMonedas(tipo, unidades);
                    if (exito) monedas += unidades;
                    break;
                case 2:
                    if (monedas == 0) {
                        System.out.println("no hay nomedas en la caja.");
                        break;
                    }
                    System.out.println("Monedas en la caja registradora: ");
                    cajaRegistradora.mostrar();
                    break;
                case 3:
                    double saldo = cajaRegistradora.getSaldo();
                    System.out.println("Saldo de actual: $" + saldo);
                    break;
                case 4:
                    System.out.println("Ingrese el tipo de moneda: ");
                    float tipe = scanner.nextFloat();
                    System.out.println("número de monedas a ingresar: ");
                    int cantidad = scanner.nextInt();
                    boolean sacarMonedas = cajaRegistradora.sacarMonedas(tipe, cantidad);
                    if (sacarMonedas) monedas -= cantidad;
                    break;
                case 5:
                    System.out.println("adios...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }
}
