/*
Calcular la utilidad que un trabajador recibe en el reparto anual de ganancias si a este se le asigna un porcentaje de su salario mensual que depende de su antigüedad en la empresa de acuerdo con la siguiente tabla:
Menos de un año: utilidad=5% del salario.
1 año o más y menos de dos años: utilidad= 7% del salario.
2 año o más y menos de 5 años: utilidad= 10% del salario.
5 años o más y menos de 10 años: utilidad= 15% del salario.
10 años o más: 20% del salario.
*/

/*
@author Juan Pablo Castaño Sanchez
*/

package ejerciciosLang;
import java.util.Scanner;

public class CalculoUtilidad {

    public static void main(String[] args) {

        //Entrada de datos.
        Scanner sc = new Scanner(System.in);

        //Definir variables.
        double salarioMensual, utilidad;
        int antiguedad;

        //Solicitar el salario y la antiguedad del trabajador.
        System.out.print("Ingrese el salario mensual del trabajador: ");
        salarioMensual = sc.nextDouble();

        System.out.print("Ingrese la antiguedad en años del trabajador: ");
        antiguedad = sc.nextInt();

        //Encontrar la utilidad del trabajado.
        if (antiguedad >= 10 ) {
            utilidad=salarioMensual*0.20;
        } else if (antiguedad >= 5) {
            utilidad=salarioMensual*0.15;
        } else if (antiguedad >= 2) {
            utilidad=salarioMensual*0.10;
        } else if (antiguedad >= 1) {
            utilidad=salarioMensual*0.07;
        } else {
            utilidad=salarioMensual*0.05;
        }

        //Imprimir utilidad.
        System.out.println("La utilidad del trabajador es: $" + utilidad);
    }
}

