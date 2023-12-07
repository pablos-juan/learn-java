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

package exercises.ejerciciosLang;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculoUtilidad {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salarioMensual = obtenerSalarioMensual(sc);
        int antiguedad = obtenerAntiguedad(sc);
        double utilidad = obtenerUtilidad(salarioMensual, antiguedad);

        System.out.println("La utilidad del trabajador es: $" + utilidad);
    }

    //refactoring code
    private static double obtenerSalarioMensual(Scanner scanner) {
        while (true) {
            System.out.print("Ingrese el salario mensual: ");
            try {
                return scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Error. Ingrese un número.");
                scanner.nextLine();
            }
        }
    }

    private static int obtenerAntiguedad(Scanner scanner) {
        while (true) {
            System.out.print("Ingrese la antiguedad en años: ");
            try {
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Error. Ingrese un número.");
                scanner.nextLine();
            }
        }
    }

    private static double obtenerUtilidad(double salarioMensual, int antiguedad) {
        if (antiguedad >= 10) {
            return salarioMensual * 0.20;
        } else if (antiguedad >= 5) {
            return salarioMensual * 0.15;
        } else if (antiguedad >= 2) {
            return salarioMensual * 0.10;
        } else if (antiguedad == 1) {
            return salarioMensual * 0.07;
        } else {
            return salarioMensual * 0.05;
        }
    }
}

