package ejerciciosPoo.GarageDeVehiculos;

public abstract class Vehiculo {
    private String matricula = null;
    private String marca;
    private double precio;
    private int cilindrada;
    private double impuestoCirculacion;
    private double cuotaMesGaraje;
    public static int CUOTA_MES_GARAGE = 100;

    public Vehiculo(String marca, double precio, int cilindrada){
        this.marca = marca;
        this.precio = precio;
        this.cilindrada = cilindrada;
        this.cuotaMesGaraje = CUOTA_MES_GARAGE;
        calcularImpuesto();
    }

    public String getMatricula() {
        return matricula;
    }

    public String getMarca() {
        return marca;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public double getImpuestoCirculacion() {
        return impuestoCirculacion;
    }

    public void setImpuestoCirculacion(double impuestoCirculacion){
        this.impuestoCirculacion = impuestoCirculacion;
    }
    public double getCuotaMesGaraje() {
        return cuotaMesGaraje;
    }

    public void setCuotaMesGaraje(double cuotaMesGaraje) {
        this.cuotaMesGaraje = cuotaMesGaraje;
    }

    public void calcularImpuesto(){
        this.impuestoCirculacion = precio * 0.02;
    }

    public void matricular(String matricula){
        if (matricula.length() == 7){
            this.matricula = matricula.toUpperCase();
        }
    }

    @Override
    public String toString(){
        return "\nMatricula: " + matricula +
                "\nMarca: " + marca +
                "\nPrecio: " + precio +
                "\nCilindrada: " + cilindrada +
                "\nImpuesto de circulación: " + impuestoCirculacion +
                "\nCuota de garage mensual: " + cuotaMesGaraje;
    }
}
