/*
Se dispone de un estacionamiento con espacios en forma de matriz, de 3 filas y 4 columnas. Se solicita crear un programa
que permita añadir autos al parking (un 0 es un espacio libre, un 1 un espacio ocupado), y que con un menú ofrece al
usuario estas opciones:
1. Añadir un auto aleatoriamente: El programa selecciona una fila y columna al azar y coloca en esa posición un auto,
    siempre que el espacio este libre, si no, elige nuevamente posiciones hasta que encuentre algún espacio libre. Si el
    parking esta lleno, debe avisar antes y no efectuar esta operación.
2. Añadir un auto pidiendo al usuario por teclado la fila y columna donde desea almacenarlo: El programa añade el auto
    al parking en esa posición siempre que la plaza este libre, si no, avisa al usuario y acaba la operación.
3. Listar todos los espacios que estén ocupados
4. Indicar si el parking está lleno.
*/

/*
@Author Juan Pablo Castaño Sanchez
*/

package exercises.ejerciciosArray;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Estacionamiento {
    public static void main(String[] args) {
        int[][] parking = new int[3][4];
        Scanner sc = new Scanner(System.in);
        int opcion;
        int totalEspacios = 3*4;
        int espaciosOcupados = 0;

        System.out.println("~PARKING~");

        do {
            do {
                System.out.println("""
                        1. añadir auto en una posición aleatoria
                        2. añadir auto en una posición específica
                        3. mostrar espacios ocupados
                        4. parking lleno
                        5. salir""");
                System.out.print("Opción: ");
                opcion = obtenerNumero(sc);
            } while (opcion<1 || opcion>5);

            int fila, columna;
            switch (opcion) {
                case 1://añadir auto en posicion aleatoria
                    if (parqueaderoLleno(espaciosOcupados, totalEspacios)) break;

                    do { //encontrar un espacio libre aleatorio
                        fila = (int) (Math.random()*3);
                        columna = (int) (Math.random()*4);
                    } while (parking[fila][columna] == 1);

                    //asignar parqueadero
                    parking[fila][columna] = 1;
                    espaciosOcupados++;
                    System.out.println("añadido en: " + (fila+1) + ", " + (columna+1));
                    break;
                case 2: //añadir auto en posicion específica
                    if (parqueaderoLleno(espaciosOcupados, totalEspacios)) break;
                    System.out.println("Ingrese la posición del parking:");
                    System.out.print("Fila: ");
                    fila = obtenerNumero(sc) - 1;
                    System.out.print("Columna: ");
                    columna = obtenerNumero(sc) - 1;

                    if (parking[fila][columna]==0){
                        parking[fila][columna]=1;
                        espaciosOcupados++;
                        System.out.println("Parking asignado");
                    } else System.out.println("Posición ocupada");
                    break;
                case 3: //listar espacios ocupados
                    if (espaciosOcupados>0) {
                        System.out.println("Espacios ocupados: " + espaciosOcupados);
                        printParqueadero(parking);
                    } else System.out.println("El parqueadero está vacío.");
                    break;
                case 4: //comprobar si el parking está lleno
                    if (parqueaderoLleno(espaciosOcupados, totalEspacios)){
                        System.out.println("Parqueadero lleno.");
                    } else System.out.println("Espacios disponibles.");
                    break;
                case 5: //salir
                    System.out.println("Adios :) ");
                    break;
            }
        }while (opcion!=5);
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

    public static boolean parqueaderoLleno(int espaciosOcupados, int totalEspacios) {
        boolean parqueaderoLleno = espaciosOcupados >= totalEspacios;
        if (parqueaderoLleno) System.out.println("Imposible. Parqueadero lleno.");

        return parqueaderoLleno;
    }

    public static void printParqueadero(int[][] matriz) {
        for (int[] ints : matriz) {
            for (int anInt : ints) {
                System.out.print(anInt + "\t");
            }
            System.out.println();
        }
    }
}
