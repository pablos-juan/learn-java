/*
Se requiere un programa que solicite una número por teclado, y nos dice si es primo o no lo es
(ayuda: un primo se puede definir como un número que tiene algún divisor además de 1 y de si mismo).
*/

/*
@author Juan Pablo Castaño Sanchez
*/

package exercises.ejerciciosLang;
import java.util.InputMismatchException;
import java.util.Scanner;

public class NumeroPrimio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        boolean primo=true;

        System.out.print("Ingrese un numero: ");
        while (true) {
            try {
                numero = sc.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Error. Ingrese un número.");
                sc.nextLine();
            }
        }

        if (numero<=1) {
            primo=false;
        }

        for (int i = 2; i <= numero / 2; i++) {
            if (numero % i == 0) {
                primo = false;
                break;
            }
        }

        if (primo) {
            System.out.println(numero + " Es un numero primo.");
        } else {
            System.out.println(numero + " No es un numero primo.");
        }

    }
}
