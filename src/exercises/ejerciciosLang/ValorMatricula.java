/*
Una institución educativa estableció un programa para estimular a los alumnos con buen rendimiento académico y que consiste en lo siguiente:
    - Si el promedio es de 9.5 o más y el alumno es de tecnología, entonces este podrá cursar 55 créditos y se le hará un 25% de descuento.
    - Si el promedio es mayor o igual a 9 pero menor que 9.5 y el alumno es de tecnología, entonces este podrá cursar 50 créditos y se le hará un 10% de descuento.
    - Si el promedio es mayor que 7 y menor que 9 y el alumno es de tecnología, este podrá cursar 50 créditos y no tendrá ningún descuento.
    - Si el promedio es de 7 o menor, el número de materias reprobadas es de 0 a 3 y el alumno es de tecnología, entonces podrá cursar 45 créditos y no tendrá descuento.
    - Si el promedio es de 7 o menor, el número de materias reprobadas es de 4 o más y el alumno es de tecnología, entonces podrá cursar 40 créditos y no tendrá ningún descuento.
    - Si el promedio es mayor o igual a 9.5 y el alumno es de profesional, entonces podrá cursar 55 créditos y se le hará un 20% de descuento.
    - Si el promedio es menor de 9.5 y el alumno es de profesional, entonces podrá cursar 55 créditos y no tendrá descuento.
Obtener el total que tendrá que pagar un alumno si el valor de la matrícula para alumnos de profesional es de U$3000 por cada cinco créditos y para alumnos de tecnología es de U$1800 por cada cinco créditos.
*/

/*
@author Juan Pablo Castaño Sanchez
*/

package exercises.ejerciciosLang;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ValorMatricula {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int estudiante, perdidas, vrPagar;
        int vrMatricula = 0;
        double promedio;

        do {
            System.out.println("Elija el tipo de estudiante: ");
            System.out.println("1. Tecnología. ");
            System.out.println("2. Profesional. ");
            System.out.print("Opcion: ");
            while (true) {
                try {
                    estudiante = sc.nextInt();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Error. Ingrese un número.");
                    sc.nextLine();
                }
            }

        }while (!validarOpcion(estudiante));

        double descuento = 0.0;
        int creditosInscritos = 0;
        int totalCreditos;

        switch (estudiante) {
            case 1: //estudiante tecnología
                System.out.println("~TECNOLOGIA~");
                promedio = obtenerPromedio(sc);

                if (promedio>=9.5) {
                    descuento = 0.25;
                    totalCreditos = 55;
                } else if (promedio >= 9) {
                    descuento = 0.1;
                    totalCreditos =50;
                } else if (promedio > 7) {
                    totalCreditos =50;
                } else {
                    System.out.println("Número de materias perdidas.");
                    while (true) {
                        try {
                            perdidas = sc.nextInt();
                            break;
                        } catch (InputMismatchException e) {
                            System.out.println("Error. Ingrese un número.");
                            sc.nextLine();
                        }
                    }
                    totalCreditos = perdidas >= 4 ? 40 : 45;
                }

                System.out.println("Sus créditos son: " + totalCreditos);
                creditosInscritos = inscribirCreditos(totalCreditos, sc);
                vrMatricula = creditosInscritos *360;
                break;
            case 2: //estudiante profesional
                System.out.println("~PROFESIONAL~");
                promedio = obtenerPromedio(sc);

                descuento = promedio >= 9.5 ? 0.2 : 0;
                totalCreditos = 55;

                System.out.println("Sus créditos son: " + totalCreditos);
                creditosInscritos = inscribirCreditos(totalCreditos, sc);
                vrMatricula = creditosInscritos *600;
                break;
        }

        //imprimir recibo
        vrPagar = (int) (vrMatricula-descuento);
        System.out.println("Créditos: " + creditosInscritos);
        System.out.println("Valor matrícula: $" + vrMatricula);
        System.out.println("Descuento: " + (descuento*100) + "%");
        System.out.println("Valor total: $" + vrPagar);
    }

    public static double obtenerPromedio(Scanner scanner) {
        System.out.print("Digite el promedio: ");
        while (true) {
            try {
                return scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Error. Ingrese un número.");
                scanner.nextLine();
            }
        }
    }

    public static boolean validarOpcion(int opcion) {
        if (opcion<1 || opcion>2) {
            System.out.println("Error. Opción incorrecta.");
            return false;
        }
        return true;
    }

    public static int inscribirCreditos(int totalCreditos, Scanner scanner) {
        int creditosInscritos;
        do {
            System.out.print("Digite el número de créditos que desea inscribir: ");
            while (true) {
                try {
                    creditosInscritos = scanner.nextInt();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Error. Ingrese un número.");
                    scanner.nextLine();
                }
            }
        } while (!validarCreditos(creditosInscritos, totalCreditos));
        return creditosInscritos;
    }

    private static boolean validarCreditos(int misCreditos, int totalCreditos) {
        if (misCreditos > totalCreditos) {
            System.out.println("número de creditos exedido. Sus créditos son: " + totalCreditos);
            return false;
        }
        return true;
    }
}
