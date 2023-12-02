package projects.mercaRegala;

public class Pescado extends Producto{

    public Pescado(String nombre, double peso, double precioKg) {
        super(nombre, peso, precioKg);
    }

    @Override
    public double calcularPrecio() {
        return getPrecioKg() * getPeso();
    }

    @Override
    public String getInfo(){
        return "PESCADO: " +
                "\nTipo de pescdo: " + getNombre() +
                "\nPeso: " + getPeso() + "kg" +
                "\nPrecio por kilo: $" + getPrecioKg() +
                "\nPrecio del " + getNombre() + ": $" + calcularPrecio() +
                "\n  --------------------------";
    }
}
