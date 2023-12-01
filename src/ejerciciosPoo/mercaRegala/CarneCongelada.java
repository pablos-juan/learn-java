package ejerciciosPoo.mercaRegala;

public abstract class CarneCongelada extends Carne{
    private final String empDistribuidora;
    public CarneCongelada(String nombre, double peso, double precioKg, String empDistribuidora) {
        super(nombre, peso, precioKg);
        this.empDistribuidora = empDistribuidora;
    }

    public String getEmpDistribuidora() {
        return empDistribuidora;
    }

}
