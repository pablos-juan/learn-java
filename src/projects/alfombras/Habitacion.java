package projects.alfombras;

public class Habitacion {
    private String nombre;
    private final Alfombra[] alfombras = new Alfombra[5];

    public Habitacion(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean agregarAlfombra(Alfombra tipoAlfombra){
        for (int i=0; i<alfombras.length; i++){
            if (alfombras[i] == null){
                alfombras[i] = tipoAlfombra;
                return true;
            }
        }
        return false;
    }

    public double precioTotal(){ //precio de todas las alfombras de la habitación
        double total=0;
        for (Alfombra alfombra : alfombras) {
            if (alfombra != null) {
                total += alfombra.calcularPrecio();
            }
        }
        return total;
    }

    public double precioCuadradas(){ //precio total de todas las alfombras cuadradas
        double total=0;
        for(Alfombra alfombra: alfombras){
            if (alfombra instanceof AlfombraCuadrada){ //instanceof para comprobar si es una alfombra cuadrada
                total += alfombra.calcularPrecio();
            }
        }
        return total;
    }
}
