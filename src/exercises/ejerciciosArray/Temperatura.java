/*
Temperaturas. Se piden por teclado la temperatura de cada uno de los 30 días de un mes y se almacenan en un arreglo
de 30 elementos. Se pide por teclado luego una nueva temperatura, y se compara con las leídas anteriormente para decir
si tal nueva temperatura se dio en algún día del mes  (si tal nueva temperatura existe en el arreglo de temperaturas del
mes). En caso de que la temperatura exista en el arreglo, debe informar en que día o días se dio dicha temperatura.
*/

/*
@Author Juan Pablo Castaño Sanchez
*/

package exercises.ejerciciosArray;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double temperatura;
        List<Double> temperaturas = new ArrayList<>();
        //double[] temperaturas = new double[30];

        //for para llenar el arreglo
        for (int i=0; i<3; i++) {
            System.out.println("Ingrese la temperatura del día " + (i+1));
            temperaturas.add(i, obtenerNumero(sc));
        }

        //Scanner para encontrar la temperatura que debe buuscarse
        System.out.print("Digite una temperatura para buscar: ");
        temperatura = obtenerNumero(sc);

        //for para recorrer el arreglo
        for (int i=0; i<3; i++){
            if (temperatura == temperaturas.get(i)){
                System.out.println("Su temperatura fue igual en el día " + (i+1));
            }
        }
    }

    public static double obtenerNumero(Scanner scanner) {
        while (true) {
            try {
                return scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Error. Ingrese un número.");
                scanner.nextLine();
            }
        }
    }
}
