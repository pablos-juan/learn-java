package ejerciciosClasesObjetos.banco;

public class Test {
    public static void main(String[] args) {
        Cuenta miCuenta = new Cuenta(1107975851, 100, 5);
        miCuenta.mostrarDatos();

        miCuenta.actualizarSaldo();
        System.out.println("Nuevo saldo: " + miCuenta.getSaldoActual());

        miCuenta.ingresar(300);
        System.out.println("Ingreso de $300. Nuevo saldo: " + miCuenta.getSaldoActual());

        miCuenta.retirar(230);
        System.out.println("Retiro de $230. Nuevo saldo: " + miCuenta.getSaldoActual());

        Cuenta otraCuenta = new Cuenta(1180329522, 0, 12);
        otraCuenta.mostrarDatos();
    }
}
