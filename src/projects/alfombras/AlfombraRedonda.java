package projects.alfombras;

public class AlfombraRedonda extends Alfombra{
    private double radio;

    public AlfombraRedonda(double radio, String color, double precioMetro) {
        super(color, precioMetro);
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }
    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularSuperficie() {
        return 3.1416 * (radio * radio);
    }

    @Override
    public double calcularPrecio() {
        return calcularSuperficie() * getPrecioMetro();
    }
}
