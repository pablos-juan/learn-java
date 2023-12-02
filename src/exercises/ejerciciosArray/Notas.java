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
import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] notas = new double[50];
        int opcion;
        int contador=0;

        do {
            System.out.println("1. Introducir nota");
            System.out.println("2. Mostrar nota media");
            System.out.println("3. Mostrar notas extremas");
            System.out.println("4. Mostrar nostas");
            System.out.println("5. Eliminar nota");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese una nueva nota: ");
                    notas[contador]=sc.nextDouble();
                    contador++;
                    break;
                case 2:
                    double acum =0;
                    for (double nota : notas) {
                        acum+=nota;
                    }
                    System.out.println("La nota media es: " + (acum/contador));
                    break;
                case 3:
                    if (contador>0){
                        double notaMenor=notas[0];
                        double notaMayor=notas[0];

                        for (int i=1; i<contador; i++){
                            if (notaMenor>notas[i]){
                                notaMenor=notas[i];
                            }
                            if (notaMayor<notas[i]){
                                notaMayor=notas[i];
                            }
                        }

                        System.out.println("Nota menor: " + notaMenor);
                        System.out.println("Nota mayor: " + notaMayor);
                    } else {
                        System.out.println("No hay notas.");
                    }
                    break;
                case 4:
                    if (contador>0) {
                        System.out.println("Notas introducidas: ");
                        for (int i = 0; i < contador; i++) {
                            System.out.println(notas[i]);
                        }
                    } else {
                        System.out.println("No hay notas");
                    }
                    break;
                case 5:
                    System.out.print("Ingrese la posicion de la nota que desea eliminar: ");
                    int posicion=sc.nextInt();
                    for (int i=(posicion-1); i<contador; i++){
                        notas[i]=notas[i+1];
                    }
                    contador--;
                    System.out.println("Nota eliminada.");
                    break;
                case 0:
                    System.out.println("Adios :) ");
                    break;
            }
        } while (opcion!=0);
    }
}
