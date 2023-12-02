package projects.alfombras;

public abstract class Alfombra implements IAlfombras{
    private String color;
    private double precioMetro;

    public Alfombra(String color, double precioMetro){
        this.color = color;
        this.precioMetro = precioMetro;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public double getPrecioMetro() {
        return precioMetro;
    }
    public void setPrecioMetro(double precioMetro) {
        this.precioMetro = precioMetro;
    }

}
