package projects.GarageDeVehiculos;
//@Author: JUAN PABLO CASTAÑO SANCHEZ. 20231213945.

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Garaje miGarage = new Garaje();
        int option;
        int espaciosOcupados = 0;
        int motos = 0;

        do {
            System.out.println("Bienvenido a la Gestión del Garaje");
            System.out.println("1. Alquilar un espacio");
            System.out.println("2. Retiro de alquiler");
            System.out.println("3. Consulta de ingresos mensuales");
            System.out.println("4. Consulta proporción autos/motos");
            System.out.println("5. Listado de matrículas, cuota mensual y tipo vehículo");
            System.out.println("6. Camiones en el garage");
            System.out.println("0. Salir");
            System.out.print("Ingrese una opción: ");

            option = scanner.nextInt();
            switch (option) {
                case 1:
                    //comprobar si el garage esta lleno, es caso de estarlo corta el switch
                    if (espaciosOcupados > Garaje.getNumEspacios() || motos >= Garaje.getNumEspacios() * 0.8){
                        System.out.println("no se puede alquilar ningún espacio.");
                        break;
                    }

                    //definir el tipo de vehículo
                    System.out.println("Tipo de vehículo: ");
                    System.out.println("1. Moto");
                    System.out.println("2. Auto");
                    System.out.println("3. Camion");
                    int tipo = scanner.nextInt();
                    if (tipo == 1) motos++;

                    miGarage.alquilarEspacio(tipo);
                    espaciosOcupados++;
                    break;
                case 2:
                    if (espaciosOcupados > 0){
                        System.out.println("ingrese la matricula del vehículo que se retira del alquiler: ");
                        String matricula = scanner.next();
                        boolean retirada = miGarage.retirarAlquiler(matricula);
                        if (retirada) espaciosOcupados--;
                        break;
                    }
                    System.out.println("el garage está vacío.");
                    break;
                case 3:
                    double ingresos = miGarage.calcularIngresos();
                    System.out.println("Los ingresos mensuales del garage son: $" + ingresos);
                    break;
                case 4:
                    if (espaciosOcupados == 0){
                        System.out.println("el garage está vacío.");
                        break;
                    }
                    int autos = miGarage.calcularOcupacionDeVehiculo(miGarage.autoVacio());
                    System.out.println("Hay una proporcion de " + motos + " moto(s) por cada " + autos + " auto(s)");
                    break;
                case 5:
                    if (espaciosOcupados == 0) {
                        System.out.println("el garage está vacío.");
                        break;
                    }
                    System.out.println("Vehículos en el garage: " + espaciosOcupados);
                    miGarage.showInfo();
                    break;
                case 6:
                    int camiones = miGarage.camionesEnGarage();
                    System.out.println("camiones en el garage: " + camiones);
                    System.out.println("espacios libres: " + (5 - camiones));
                    break;
                case 0:
                    System.out.println("Adios :)");
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
                    break;
            }
        } while (option != 0);
    }
}
