package projects.mercaRegala;

public class CongeladaPiezaTrozada extends CarneCongelada{
    private final int mediaPiezas;

    public CongeladaPiezaTrozada(String nombre, double peso, double precioKg, String empDistribuidora, int mediaPiezas) {
        super(nombre, peso, precioKg, empDistribuidora);
        this.mediaPiezas = mediaPiezas;
    }

    public int getMediaPiezas() {
        return mediaPiezas;
    }

    @Override
    public String getInfo() {
        return "CARNE CONGELADA DE PIEZA TROZADA: " + getNombre() +
                "\nPeso: " + getPeso() + "kg" +
                "\nPrecio por kilo: $" + getPrecioKg() +
                "\nPrecio: $" + getPrecio() +
                "\nOrigen: " + getOrigen() +
                "\nEmpresas de caducidad: " + getEmpDistribuidora() +
                "\nMedia de piezas:" + getMediaPiezas() +
                "\n  --------------------------";
    }
}
