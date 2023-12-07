/*
El Seguro Social requiere clasificar a las personas que se jubilaran en el año 2024.
Existen tres tipos de jubilaciones: por edad, por antigüedad joven y por antigüedad adulta.
Las personas adscritas a la jubilación por edad deben tener 60 años o más y una antigüedad en su empleo mínima de 20.
Las personas adscritas a la jubilación por antigüedad joven deben tener menos de 60 años y una antigüedad en su empleo de 25 años o más.
Las personas adscritas a la jubilación por antigüedad adulta deben tener 60 años o más y una antigüedad en su empleo de 25 años o más.
*/

/*
@author Juan Pablo Castaño Sanchez
*/

package exercises.ejerciciosLang;
import java.util.InputMismatchException;
import java.util.Scanner;

public class JubilacionClasificacion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int edad, antiguedad;

        System.out.print("Ingrese la edad de la persona: ");
        edad = obtenerNumero(sc);

        System.out.print("Ingrese la antigüedad en su empleo (en años): ");
        antiguedad = obtenerNumero(sc);

        String noJubilacionMessage = "La persona no cumple los requisitos para jubilarse en 2024.";
        if (edad >= 60) {
            if (antiguedad >= 25) {
                System.out.println("La persona se jubilará por antigüedad adulta.");
            } else if (antiguedad >= 20) {
                System.out.println("La persona se jubilará por edad.");
            } else System.out.println(noJubilacionMessage);
        } else if (antiguedad >= 25) {
            System.out.println("La persona se jubilará por antigüedad adulta.");
        } else System.out.println(noJubilacionMessage);
    }

    public static int obtenerNumero(Scanner scanner) {
        while (true) {
            try {
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Error. Ingrese un número.");
                scanner.nextLine();
            }
        }
    }
}

