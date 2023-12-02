package projects.mercaRegala;

import java.util.Scanner;

public abstract class Carne extends Producto{
    Scanner sc = new Scanner(System.in);
    private String origen;

    public Carne(String nombre, double peso, double precioKg) {
        super(nombre, peso, precioKg);
        this.origen = agregarOrigen();
    }

    private boolean validarOrigen(String origen){
        return switch (origen) {
            case "vacuno", "avicola" -> true;
            default -> {
                System.out.println("Error. Origen inválido. ");
                yield false;
            }
        };
    }

    public String agregarOrigen(){
        System.out.println("Ingrese el tipo de producto: vacuno o avicola");
        origen = sc.nextLine();
        while (!validarOrigen(origen.toLowerCase())) origen = sc.nextLine();
        return origen;
    }

    public String getOrigen() {
        return origen;
    }

    @Override
    public double calcularPrecio() {
        return getPrecioKg() * getPeso();
    }
}
