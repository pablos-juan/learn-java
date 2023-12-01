package ejerciciosPoo.avionesDeBiberia;

public class AvionCarga extends Avion{
    private final double cargaKg;

    public AvionCarga(double cargaKg, String nombre, String matricula, int autonomiaVuelo) {
        super(nombre, matricula, autonomiaVuelo);
        this.cargaKg = cargaKg;
    }

    public double getCargaKg() {
        return cargaKg;
    }

    @Override
    public String getInfo(){
        return "Avion de carga: " +
                "\nnombre: " + getNombre() +
                "\nmatricula: " + getMatricula() +
                "\nautonomía de vuelo: " + getAutonomiaVuelo() +
                "\ncarga: " + getCargaKg() + "Kg" +
                "\n --------------------------";
    }
}
