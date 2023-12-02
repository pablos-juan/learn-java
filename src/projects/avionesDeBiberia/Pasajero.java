package projects.avionesDeBiberia;

public class Pasajero {
    private final String nombre;
    private final int id;
    private final int edad;
    private final String info;

    public Pasajero(String nombre, int id, int edad) {
        this.nombre = nombre;
        this.id = id;
        this.edad = edad;
        this.info = "nombre: " + getNombre() +
                "\nID: " + getId() +
                "\nedad: " + getEdad() +
                "\n ---------------------------";;
    }

    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }

    public int getEdad() {
        return edad;
    }

    public String getInfo() {
        return info;
    }
}
