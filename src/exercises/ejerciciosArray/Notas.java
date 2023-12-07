/*
Hacer un programa que muestre un menú de este tipo:
1.- Introducir nota
2.- Mostrar nota media
3.- Mostrar notas extremas
4.- Mostrar notas
5.- Eliminar nota
0.- Salir
De modo que si se opta por:
* la opción 1 pide por teclado una nueva nota, y se guarda en un array
* la opción 2 muestra la nota media de todas las introducidas hasta ese momento
* la opción 3 muestra la menor y la mayor de todas las notas introducidas hasta ese momento
* la opción 4 muestra todas las notas introducidas hasta ese momento
* la opción 5 pedirá un número, y eliminará la nota que tenga en el array ese número como índice
la opción 0 acaba el programa
*/

/*
@Author Juan Pablo Castaño Sanchez
*/

package exercises.ejerciciosArray;
import java.util.*;

public class Notas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Double> notas = new ArrayList<>();
        int opcion;
        int totalNotas = 0;

        do {
            System.out.println("""
                                1. introducir nota
                                2. mostrar nota media
                                3. mostrar notas extremas
                                4. mostrar nostas
                                5. eliminar nota
                                0. salir""");
            System.out.print("Opción: ");
            opcion = obtenerNumero(sc);

            switch (opcion) {
                case 1: //introducir nota
                    System.out.print("Ingrese una nueva nota: ");
                    notas.add(obtenerNota(sc));
                    totalNotas++;
                    break;
                case 2: //mostrar nota media
                    double acumulado = 0;
                    for (double nota : notas) acumulado += nota;

                    System.out.println("La nota media es: " + (acumulado / totalNotas));
                    break;
                case 3: //mostrar notas extremas
                    if (sinNotas(totalNotas)) break;

                    System.out.println("Nota menor: " + notaBaja(notas)
                                    + "\nNota mayor: " + notaAlta(notas));
                    break;
                case 4: //mostrar notas
                    if (sinNotas(totalNotas)) break;

                    System.out.println("Notas introducidas: ");
                    notas.forEach(System.out::println);
                    break;
                case 5: //eliminar nota
                    if (sinNotas(totalNotas)) break;
                    System.out.print("Ingrese la nota que desea eliminar: ");
                    int notaEliminar = obtenerNumero(sc);

                    eliminarNota(notas, notaEliminar);
                    totalNotas--;
                    break;
                case 0: //eliminar nota
                    System.out.println("Adios :) ");
                    break;
                default:
                    System.out.println("Error. Elija una de las opciones");
                    break;
            }
        } while (opcion!=0);
    }

    public static double notaAlta(List<Double> notas) {
        return notas.stream().max(Double::compare).orElseThrow();
    }

    public static double notaBaja(List<Double> notas) {
        return notas.stream().min(Double::compare).orElseThrow();
    }

    public static void eliminarNota(List<Double> notas, double notaEliminar) {
        while (notas.contains(notaEliminar)) {
            notas.remove(notaEliminar);
            System.out.println("nota eliminada!");
        }
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

    public static double obtenerNota(Scanner scanner) {
        while (true) {
            try {
                return scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Error. Ingrese un número.");
                scanner.nextLine();
            }
        }
    }

    public static boolean sinNotas(int totalNotas) {
        boolean sinNotas = totalNotas > 0;
        if (sinNotas) {
            System.out.println("Sin notas");
            return true;
        }
        return false;
    }

}
