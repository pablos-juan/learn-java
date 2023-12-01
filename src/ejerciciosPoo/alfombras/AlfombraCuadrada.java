package ejerciciosPoo.alfombras;

public class AlfombraCuadrada extends Alfombra {
    private double lado;
    public AlfombraCuadrada(double lado, String color, double precioMetro) {
        super(color, precioMetro);
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }
    public void setLado(double lado) {
        this.lado = lado;
    }

    //aplicacion de métodos
    @Override
    public double calcularSuperficie() {
        return lado * lado;
    }
    @Override
    public double calcularPrecio() {
        return calcularSuperficie() * getPrecioMetro();
    }
}
