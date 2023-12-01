package ejerciciosClasesObjetos.banco;

public class Cuenta {
    private static long ultimoNCuenta=100000;
    private long numeroCuenta;
    private long identificador;
    private double saldoActual;
    private double interes;

    public Cuenta(){
        this.numeroCuenta=ultimoNCuenta++;
        this.identificador=0;
        this.saldoActual=0;
        this.interes=0;
    }
    public Cuenta(long identificador, double saldoActual, double interes){
        this.numeroCuenta=++ultimoNCuenta;
        this.identificador= identificador;
        this.saldoActual= saldoActual;
        this.interes= interes;
    }

    public long getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public void actualizarSaldo(){
        double nuevoSaldo = getSaldoActual() + (getSaldoActual()*(getInteres()/365))/100;
        setSaldoActual(nuevoSaldo);
        System.out.println("Saldo actualizado.");
    }

    public void ingresar(double cantidad){
        if (cantidad>0){
            saldoActual+=cantidad;
            System.out.println("Ingreso exitoso. Su saldo es: ");
        } else {
            System.out.println("Imposible realizar operación.");
        }
    }

    public void retirar(double cantidad){
        if (cantidad>0 && cantidad<=saldoActual){
            saldoActual-=cantidad;
            System.out.println("Retiro exitoso. Su saldo es: " + saldoActual);
        } else {
            System.out.println("No es posible realizar el retiro.");
        }
    }

    public void mostrarDatos(){
        System.out.println("Numero de cuenta: " + numeroCuenta);
        System.out.println("Identificador de cliente: " + identificador);
        System.out.println("Saldo actual: " + saldoActual);
        System.out.println("Interés actual: " + interes + "%");
    }
}
