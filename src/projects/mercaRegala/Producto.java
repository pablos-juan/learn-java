package projects.mercaRegala;

public abstract class Producto implements IProducto{
    private final String nombre;
    private final double peso;
    private final double precioKg;
    private final double precio;

    public Producto(String nombre, double peso, double precioKg){
        this.nombre = nombre;
        this.peso = peso;
        this.precioKg = precioKg;
        this.precio = calcularPrecio();
    }

    public String getNombre() {
        return nombre;
    }

    public double getPeso() {
        return peso;
    }

    public double getPrecioKg() {
        return precioKg;
    }

    public double getPrecio() {
        return precio;
    }

    public String getInfo(){
        return null;
    }
}
