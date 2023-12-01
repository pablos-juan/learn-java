/*
Una frutería ofrece las manzanas con descuento según la siguiente tabla:
NUM. DE KILOS COMPRADOS		% DESCUENTO
	  0   -   2		  0%
	 2.01 -   5 		  10%
	 5.01 -   10		  15%
	10.01 en adelante	  20%
Determinar cuánto pagara una persona que compre manzanas es esa frutería.
*/

/*
@author Juan Pablo Castaño Sanchez
*/


package language;
import java.util.Scanner;

public class Fruteria {
    public static void main(String[] args) {

        //Definir la entrada de datos.
        Scanner sc = new Scanner(System.in);

        //Solicitar el numero de kilos y almacenarlo en la variable kilos (float).
        System.out.println("Kilos: ");
        double kilos=sc.nextFloat();

        //Solicitar el precio del kilo y almacenarlo en la variable precio.
        System.out.println("Precio por kilo: ");
        double precio=sc.nextInt();

        //Obtener el valorBruto multiplicando kilos*precio y agregando int para evadir errores.
        double valorBruto= precio * kilos;
        //Inicializar variable descuento para el caso donde no existe el descuento.
        double descuento = 0.0;

        //Asignar descuentos.
        if (kilos >= 10) {
            descuento = 0.2;
        } else if (kilos >= 5) {
            descuento = 0.15;
        } else if (kilos >= 2) {
            descuento = 0.1;
        }

        //Encontrar el valorDescuento y valorPago.
        double valorDescuento = valorBruto*descuento;
        double valorPago = valorBruto-valorDescuento;

        //Imprimir recibo.
        System.out.println("Kilos comprados: " + kilos);
        System.out.println("Precio por kilo: " + precio);
        System.out.println("Valor Bruto: " + valorBruto);
        System.out.println("Descuento de " + (descuento*100) + "%: " + valorDescuento);
        System.out.println("Valor Pago: " + valorPago);

    }
}
