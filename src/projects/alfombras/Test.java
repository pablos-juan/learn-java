package projects.alfombras;
//@Author: JUAN PABLO CASTAÑO SANCHEZ. 20231213945.

public class Test {
    public static void main(String[] args) {
        //Alfombra_cuadrada
        System.out.println("alfombra cuadrada: ");
        Alfombra cuadro = new AlfombraCuadrada(12, "verde", 1200);
        System.out.println("superficie: " + cuadro.calcularSuperficie()); //calcular la superficie
        System.out.println("precio: $" + cuadro.calcularPrecio()); //calcular el precio

        //Alfombra_redonda
        System.out.println("alfombra redonda: ");
        Alfombra redonda = new AlfombraRedonda(3, "rojo", 200);
        System.out.println("superficie: " + redonda.calcularSuperficie()); //calcular la superficie
        System.out.println("precio: $" + redonda.calcularPrecio()); //calcular precio

        //Habitacion
        System.out.println("Habitacion: ");
        Habitacion miHabitacion = new Habitacion("primera habitacion: ");
        //agregar alfombras
        miHabitacion.agregarAlfombra(cuadro);
        miHabitacion.agregarAlfombra(redonda);
        System.out.println("precio total alfombras abitacion " + miHabitacion.getNombre()
                            + ": $" + miHabitacion.precioTotal()); //precio total de las alfombras
        System.out.println("precio total alfombras cuadradas: $" +
                miHabitacion.precioCuadradas()); //precio de las alfombras cuadradas
        //instanciar otra habitacion
        Habitacion otraHabitacion = new Habitacion("segunda habitacion");
        System.out.println("agregar otra alfombra: " + otraHabitacion.agregarAlfombra(redonda));

        //Mansion
        Mansion miMansion = new Mansion();
        //agregar habitaciones a la mansion
        miMansion.agregarHabitacion(miHabitacion);
        miMansion.agregarHabitacion(otraHabitacion);
        //precio total de todas las alfombras de la mansion
        System.out.println("precio total de las alfombras: $" + miMansion.precioMansion());
        //precio alfombras cuadradas
        System.out.println("precio total de las alfombras cuadradas: $" + miMansion.precioCuadradas());

    }
}
