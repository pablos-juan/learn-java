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
        double monthlySalary = obtenerSalarioMensual(sc);
        int tenure = getAntique(sc);
        double utility = getUtility(monthlySalary, tenure);

        System.out.println("Worker utility: $" + utility);
    }

    public static double obtenerSalarioMensual(Scanner scanner) {
        while (true) {
            System.out.print("Enter monthly salary: ");
            try {
                return scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Error. Enter a number.");
                scanner.nextLine();
            }
        }
    }

    public static int getAntique(Scanner scanner) {
        while (true) {
            System.out.print("Enter years of service: ");
            try {
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Error. Enter a number.");
                scanner.nextLine();
            }
        }
    }

    private static double getUtility(double monthlySalary, int tenure) {
        if (tenure >= 10) {
            return monthlySalary * 0.20;
        } else if (tenure >= 5) {
            return monthlySalary * 0.15;
        } else if (tenure >= 2) {
            return monthlySalary * 0.10;
        } else if (tenure == 1) {
            return monthlySalary * 0.07;
        } else {
            return monthlySalary * 0.05;
        }
    }
}

