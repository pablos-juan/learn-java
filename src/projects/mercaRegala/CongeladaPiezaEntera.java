package projects.mercaRegala;

public class CongeladaPiezaEntera extends CarneCongelada{
    private final boolean vieneEnBandeja;

    public CongeladaPiezaEntera(String nombre, double peso, double precioKg, String empDistribuidora, boolean vieneEnBandeja) {
        super(nombre, peso, precioKg, empDistribuidora);
        this.vieneEnBandeja = vieneEnBandeja;
    }

    public boolean getVieneEnVandeja(){
        return vieneEnBandeja;
    }

    @Override
    public String getInfo() {
        return "CARNE CONGELADA DE PIEZA ENTERA: " + getNombre() +
                "\nPeso: " + getPeso() + "kg" +
                "\nPrecio por kilo: $" + getPrecioKg() +
                "\nPrecio: $" + getPrecio() +
                "\nOrigen: " + getOrigen() +
                "\nEmpresas de caducidad: " + getEmpDistribuidora() +
                "\nViene en bandeja:" + getVieneEnVandeja() +
                "\n  --------------------------";
    }
}
