package projects.GarageDeVehiculos;

public class Auto extends Vehiculo{
    private final boolean tieneRadio;
    private final boolean tieneNavegador;

    public Auto(String marca, double precio, int cilindrada, boolean tieneRadio, boolean tieneNavegador) {
        super(marca, precio, cilindrada);
        this.tieneRadio = tieneRadio;
        this.tieneNavegador = tieneNavegador;
        calcularImpuesto();
        calcularCuota();
    }

    public boolean isTieneRadio() {
        return tieneRadio;
    }

    public boolean isTieneNavegador() {
        return tieneNavegador;
    }

    @Override
    public void calcularImpuesto(){
        if (tieneRadio){
            setImpuestoCirculacion(getImpuestoCirculacion() * 1.01);
        }
        if (tieneNavegador){
            setImpuestoCirculacion(getImpuestoCirculacion() * 1.02);
        }
    }

    public void calcularCuota(){
        if (getCilindrada() > 2999){
            setCuotaMesGaraje(CUOTA_MES_GARAGE * 1.2);
        }
    }

    @Override
    public String toString(){
        return "AUTO " +
                super.toString() +
                "\nTiene radio: " + tieneRadio +
                "\nTiene navegador: " + tieneNavegador +
                "\n  -----------------------";
    }
}
