package projects.GarageDeVehiculos;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Garaje implements IGarage{
    private static final int NUM_ESPACIOS = 10;
    private static int CAMIONES_MAS_DE_DOS_EJES = 0;
    private final Vehiculo[] vehiculos = new Vehiculo[NUM_ESPACIOS];

    public Garaje(){
    }

    public static int getNumEspacios() {
        return NUM_ESPACIOS;
    }

    //agregar un vehículo al arreglo de vehículos
    public void alquilarEspacio(int tipo){
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");

        //reunir parámetros
        System.out.println("Matricula: ");
        String matricula = scanner.next();
        //validar que la longitud de la matricuala sea = 7
        while (matricula.length() != 7) matricula = scanner.next();
        System.out.println("Marca: ");
        String marca = scanner.next();
        System.out.println("Precio: ");
        double precio = scanner.nextDouble();
        System.out.println("Cilindrada: ");
        int cilindrada = scanner.nextInt();

        switch (tipo){
            case 1:
                System.out.println("Tiene Sidecar: ");
                boolean tieneSidecar = scanner.nextBoolean();

                //instanciar producto y agregarlo al arreglo
                Moto moto = new Moto(marca, precio, cilindrada, tieneSidecar);
                moto.matricular(matricula);
                agregarVehiculo(moto);
                break;
            case 2:
                System.out.println("Tiene radio: ");
                boolean tieneRadio = scanner.nextBoolean();
                System.out.println("Tiene navegación: ");
                boolean tieneNavegador = scanner.nextBoolean();

                //instanciar producto y agregarlo al arreglo
                Auto auto =  new Auto(marca, precio, cilindrada, tieneRadio, tieneNavegador);
                auto.matricular(matricula);
                agregarVehiculo(auto);
                break;
            case 3:
                System.out.println("Numero de ejes: ");
                int numeroEjes = scanner.nextInt();
                System.out.println("Capacidad de carga en toneladas: ");
                double cargaToneladas = scanner.nextDouble();

                //instanciar camion
                Camion camion = new Camion(marca, precio, cilindrada, numeroEjes, cargaToneladas);
                camion.matricular(matricula);
                boolean agregado = agregarVehiculo(camion);
                if (!agregado) System.out.println("No es posible añadir el camion.");
                break;
            }
    }

    private boolean agregarVehiculo(Vehiculo miVehiculo){
        if (miVehiculo.getCuotaMesGaraje() == 200) CAMIONES_MAS_DE_DOS_EJES++;
        for (int i=0; i<vehiculos.length; i++){
            if (miVehiculo instanceof Camion && camionesEnGarage() < 6 && vehiculos[i] == null){
                if (miVehiculo.getCuotaMesGaraje() == 200 && CAMIONES_MAS_DE_DOS_EJES > 2) return false;
                vehiculos[i] = miVehiculo;
                return true;
            }
            if (i > 5 && vehiculos[i] == null) {
                vehiculos[i] = miVehiculo;
                return true;
            }
        }
        return false;
    }

    public int camionesEnGarage(){
        int count = 0;
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo instanceof Camion) {
                count++;
            }
        }
        return count;
    }

    //retirar un espacio de alquiler
    public boolean retirarAlquiler(String matricula){
        int posicion = search(matricula.toUpperCase());
        if (posicion < 0) {
            System.out.println("el vehículo no se encuentra en ningún espacio del garage.");
            return false;
        }

        System.arraycopy(vehiculos, posicion + 1, vehiculos, posicion, vehiculos.length - 1 - posicion);
        System.out.println("El vehículo con matrícula: " + matricula + "fué retirado.");
        return true;
    }

    private int search(String matricula){
        for (int i=0; i<vehiculos.length; i++){
            if (vehiculos[i] != null && vehiculos[i].getMatricula().equals(matricula)){
                return i;
            }
        }
        return -1;
    }

    @Override
    public double calcularIngresos() {
        return Arrays.stream(vehiculos)
                .filter(Objects::nonNull)
                .mapToDouble(Vehiculo::getCuotaMesGaraje)
                .sum();
    }

    public int calcularOcupacionDeVehiculo(Vehiculo miVehiculo) {
        return (int) Arrays.stream(vehiculos)
                .filter(vehiculo -> vehiculo instanceof Moto ||
                        vehiculo instanceof Auto ||
                        vehiculo instanceof  Camion)
                .count();
    }

    public void showInfo(){
        for (Vehiculo vehiculo: vehiculos){
            if (vehiculo != null){
                System.out.println(vehiculo.getClass().getSimpleName().toUpperCase());
                System.out.println("matricula: " + vehiculo.getMatricula());
                System.out.println("cuota mensual: $" + vehiculo.getCuotaMesGaraje());
                System.out.println("  -----------------------");
            }
        }
    }

    public Auto autoVacio(){
        return new Auto("null", 0, 0, false, false);
    }


}
