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
                System.out.println("1. Añadir auto en una posición aleatoria.");
                System.out.println("2. Añadir auto en una posición específica.");
                System.out.println("3. Mostrar espacios ocupados.");
                System.out.println("4. Parking lleno.");
                System.out.println("5. Salir.");
                System.out.print("Opción: ");
                opcion = sc.nextInt();
            } while (opcion<1 || opcion>5);

            //Guardar los valores de filas y columnas
            int fila, columna;
            switch (opcion) {
                case 1:
                    if (espaciosOcupados<totalEspacios) {
                        //Encontrar un espacio aleatrio
                        do {
                            fila = (int) (Math.random()*3);
                            columna = (int) (Math.random()*4);
                        } while (parking[fila][columna] == 1); //Repetir mientras ese espacio esté ocupado

                        parking[fila][columna] = 1;
                        espaciosOcupados++;
                        System.out.println(fila+1);
                        System.out.println(columna+1);
                    } else {
                        System.out.println("El parqueadero esta lleno.");
                    }
                    break;
                case 2:
                    if (espaciosOcupados<totalEspacios) {
                        System.out.println("Ingrese la posición del parking:");
                        System.out.print("Fila: ");
                        fila=(sc.nextInt()-1);
                        System.out.print("Columna: ");
                        columna=(sc.nextInt()-1);

                        if (parking[fila][columna]==0){
                            parking[fila][columna]=1;
                            espaciosOcupados++;
                            System.out.println("Parking asignado");
                        } else {
                            System.out.println("Posición ocupada");
                        }
                    }
                    break;
                case 3:
                    if (espaciosOcupados>0) {
                        System.out.println("Espacios ocupados: " + espaciosOcupados);
                        for (int f = 0; f < parking.length; f++) {
                            for (int c = 0; c < parking[f].length; c++) {
                                if (parking[f][c] == 1) {
                                    System.out.println("Fila: " + f + ". Columna: " + c);
                                }
                            }
                        }
                    } else {
                        System.out.println("El parqueadero está vacío.");
                    }
                    break;
                case 4:
                    if (espaciosOcupados>totalEspacios){
                        System.out.println("El parqueadero está lleno.");
                    } else {
                        System.out.println("El parqueadero está vacío.");
                    }
                    break;
                case 5:
                    System.out.println("Adios :) ");
                    break;
            }
        }while (opcion!=5);
    }
}
