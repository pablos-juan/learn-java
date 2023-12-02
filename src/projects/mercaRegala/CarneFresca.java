package projects.mercaRegala;

public class CarneFresca extends Carne{
    private final int diasCaducidad;
    public CarneFresca(String nombre, double peso, double precioKg, int diasCaducidad) {
        super(nombre, peso, precioKg);
        this.diasCaducidad = diasCaducidad;
    }

    public int getDiasCaducidad() {
        return diasCaducidad;
    }

    @Override
    public String getInfo() {
        return "CARNE FRESCA: " + getNombre() +
                "\nPeso: " + getPeso() + "kg" +
                "\nPrecio por kilo: $" + getPrecioKg() +
                "\nPrecio: $" + getPrecio() +
                "\nOrigen: " + getOrigen() +
                "\nDias de caducidad: " + getDiasCaducidad() +
                "\n  --------------------------";
    }
}
