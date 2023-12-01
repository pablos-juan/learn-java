package ejerciciosPoo.GarageDeVehiculos;

public class Moto extends Vehiculo{
    private final boolean tieneSidecar;

    public Moto(String marca, double precio, int cilindrada, boolean tieneSidecar) {
        super(marca, precio, cilindrada);
        this.tieneSidecar = tieneSidecar;
        calcularImpuesto();
        calcularCuota();
    }

    public boolean isTieneSidecar() {
        return tieneSidecar;
    }

    @Override
    public void calcularImpuesto(){
        if (tieneSidecar){
            setImpuestoCirculacion(getPrecio() * 0.022);
        } else {
            setImpuestoCirculacion(getPrecio() * 0.02);
        }
    }

    public void calcularCuota(){
        if (tieneSidecar){
            setCuotaMesGaraje(CUOTA_MES_GARAGE * 1.5);
        }
    }

    @Override
    public String toString(){
        return "MOTO: " +
                super.toString() +
                "\nTiene Sidecar: " + tieneSidecar +
                "\n  -----------------------";
    }
}
