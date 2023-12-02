package projects.mercaRegala;
//@Author: JUAN PABLO CASTAÑO SANCHEZ. 20231213945.

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Almacen miAlmacen = new Almacen();

        int opcion;
        do {
            System.out.println("Menú:");
            System.out.println("1. Añadir producto");
            System.out.println("2. Listar productos");
            System.out.println("3. Productos en peligro");
            System.out.println("4. Cálculo precio medio");
            System.out.println("5. Eliminar bandejas");
            System.out.println("6. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Elija el tipo de producto: ");
                    System.out.println("1. Carne fresca");
                    System.out.println("2. Carne congelada de pieza entera");
                    System.out.println("3. Carne congelada de pieza troceada");
                    System.out.println("4. Pescado");
                    System.out.print("opcion: ");
                    int tipo = scanner.nextInt();

                    //agregar producto
                    miAlmacen.agregarProducto(tipo);
                    break;
                case 2:
                    miAlmacen.mostrarAlmacen();
                    break;
                case 3:
                    miAlmacen.productosEnPeligro();
                    break;
                case 4:
                    miAlmacen.precioMedio();
                    break;
                case 5:
                    miAlmacen.eliminarVandejas();
                    break;
                case 6:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        } while (opcion != 6);
    }

}
