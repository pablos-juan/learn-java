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
import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temperatura;
        double[] temperaturas = new double[30];

        //for para llenar el arreglo
        for (int i=0; i<temperaturas.length; i++) {
            System.out.println("Ingrese la temperatura del día " + (i+1));
            temperaturas[i]=sc.nextDouble();
        }

        //Scanner para encontrar la temperatura que debe buuscarse
        System.out.print("Digite una temperatura para buscar: ");
        temperatura=sc.nextInt();

        //for para recorrer el arreglo
        for (int i=0; i<temperaturas.length; i++){
            if (temperatura==temperaturas[i]){
                System.out.println("Su temperatura fue igual en el día " + (i+1));
            }
        }
    }
}
