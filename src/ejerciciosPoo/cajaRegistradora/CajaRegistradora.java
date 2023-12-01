package ejerciciosPoo.cajaRegistradora;

import java.util.Arrays;

public class CajaRegistradora implements ICajaRegistradora {
    private final String nombre;
    private double saldo;
    private int numTipoMonedas;
    private double[] monedas = new double[50];

    public CajaRegistradora(String nombre){
        this.nombre = nombre;
        this.saldo = 0;
        this.numTipoMonedas = 0;
    }


    public String getNombre() {
        return nombre;
    }

    public int getNumTipoMonedas() {
        return this.numTipoMonedas;
    }

    public int getUnidadesTipoMoneda(double tipo) {
        if (!monedaValida(tipo)) return -1;
        int unidades = 0;
        for (double moneda: monedas){
            if (moneda == tipo) unidades++;
        }
        return unidades;
    }

    public boolean meterMonedas(double tipo, int unidades) {
        if (!monedaValida(tipo) && unidades >= monedas.length) return false;
        if (getUnidadesTipoMoneda(tipo) == 0) numTipoMonedas++;
        for (int i = 0; i < monedas.length && unidades > 0; i++) {
            if (monedas[i] == 0) {
                monedas[i] = tipo;
                unidades--;
            }
        }
        if (unidades > 0) System.out.println("no se agregaron " + unidades + " moneda(s).");
        return true;
    }

    public boolean monedaValida(double tipo) {
        return tipo == 100 || tipo == 200 || tipo == 300 || tipo == 500 || tipo ==1000;
    }

    public boolean sacarMonedas(float tipo, int unidades) {
        int posicion = busqueda(tipo, monedas);
        if (getUnidadesTipoMoneda(tipo) < unidades || posicion == -1) {
            return false;
        }
        //mover las monedas hacia la izquierda
        for (int i = posicion; i < monedas.length - unidades; i++){
            monedas[i] = monedas[i + unidades];
        }
        //establecer en 0 las últimas posiciones eliminadas
        for (int i = monedas.length - unidades; i < monedas.length; i++){
            monedas[i] = 0;
        }
        if (getUnidadesTipoMoneda(tipo) == 0) numTipoMonedas--;
        return true;
    }

    private int busqueda(double tipo, double[] arreglo){
        for (int i=0; i<arreglo.length; i++){
            if (arreglo[i] == tipo) return i;
        }
        return -1;
    }

    public void vaciarCajaRegistradora() {
        Arrays.fill(monedas, 0);
    }

    public double[] getTiposDeMoneda() {
        //crear un arreglo que almacene los tipos de monedas
        double[] tiposMonedas = new double[numTipoMonedas];
        //el bucle recorre el arreglo de monedas
        for (double moneda : monedas) {
            //si una de las monedas del bucle no está en el arreglo de 'tiposMoneda'...
            if (busqueda(moneda, tiposMonedas) == -1) {
                //este bucle pone esa moneda en la primera posicion vacía
                for (int j = 0; j < tiposMonedas.length; j++) {
                    if (tiposMonedas[j] == 0) {
                        tiposMonedas[j] = moneda;
                        break; //cuando asigna la moneda en una posicion se detiene el segundo bucle
                    }
                }
            }
        }
        //reotrna el arreglo de con los tipos de moneda
        return tiposMonedas;
    }

    public double getSaldo() {
        saldo = 0;
        for (double moneda: monedas){
            saldo += moneda;
        }
        return saldo;
    }

    public void mostrar(){
        for (double moneda: monedas){
            if (moneda != 0) System.out.println(moneda);
        }
    }
}
