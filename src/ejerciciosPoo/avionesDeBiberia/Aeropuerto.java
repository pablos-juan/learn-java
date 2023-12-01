package ejerciciosPoo.avionesDeBiberia;

public abstract class Aeropuerto implements IAeropuertos{
    private final String nombre;
    private final String ciudad;

    public Aeropuerto(String nombre, String ciudad) {
        this.nombre = nombre;
        this.ciudad = ciudad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    @Override
    public String getInfo() {
        return null;
    }
}
