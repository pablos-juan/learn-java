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
        //Entrada de datos
        Scanner sc = new Scanner(System.in);
        int edad, antiguedad;

        System.out.print("Ingrese la edad de la persona: ");
        while (true) {
            try {
                edad = sc.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Error. Ingrese un número.");
                sc.nextLine();
            }
        }

        System.out.print("Ingrese la antigüedad en su empleo (en años): ");
        while (true) {
            try {
                antiguedad = sc.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Error. Ingrese un número.");
                sc.nextLine();
            }
        }

        if (edad >= 60 && antiguedad >= 25) {
            System.out.println("La persona se jubilará por antigüedad adulta.");
        } else if (edad >= 60 && antiguedad >= 20) {
            System.out.println("La persona se jubilará por edad.");
        } else if (edad < 60 && antiguedad >= 25) {
            System.out.println("La persona se jubilará por antigüedad adulta.");
        } else {
            System.out.println("La persona no cumple los requisitos para jubilarse en 2024.");
        }

    }
}

