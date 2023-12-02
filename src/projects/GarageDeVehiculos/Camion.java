package projects.GarageDeVehiculos;

public class Camion extends Vehiculo {
    private int numeroEjes;
    private double toneladasCarga;

    public Camion(String marca, double precio, int cilindrada, int numeroEjes, double toneladasCarga) {
        super(marca, precio, cilindrada);
        this.numeroEjes = numeroEjes;
        this.toneladasCarga = toneladasCarga;
        calcularImpuesto();
        calcularCuota();
    }

    public int getNumeroEjes() {
        return numeroEjes;
    }

    @Override
    public void calcularImpuesto() {
        setImpuestoCirculacion(getPrecio() * 0.5);
    }

    public void calcularCuota() {
        if (numeroEjes > 2) {
            setCuotaMesGaraje(CUOTA_MES_GARAGE * 2);
        } else setCuotaMesGaraje(CUOTA_MES_GARAGE * 1.75);
    }

    @Override
    public String toString(){
        return "AUTO" +
                super.toString() +
                "\nnumero de ejes: " + numeroEjes +
                "\nCapacidad de carga en toneladas: " + toneladasCarga;
    }
}
