/*
En una tabla de 4 filas y 4 columnas se guardan las notas de cuatro estudiantes. Cada fila corresponde a las notas y el
promedio de cada alumno. Cree un programa que permita a un profesor cargar, en las 3 posiciones (columnas) de cada fila,
las notas de cada alumno y que en la última columna se calculen los promedios. Luego debe mostrar las 3 notas de cada
alumno y el promedio correspondiente recorriendo la matriz.
*/
package matrices;
import java.util.Scanner;

public class Matrices {
    public static void main(String[] args) {
        double[][] matriz = new double[4][4];
        Scanner sc = new Scanner(System.in);
        double sumaNotas=0.0;

        //for para cargar
        for (int f=0; f< matriz.length; f++){
            System.out.println("Ingrese las calificaciones del alumno " + (f+1) + ": ");
            for (int c=0; c<(matriz[f].length-1); c++){
                System.out.print("Calificación " + (c+1) + ": ");
                matriz[f][c] = sc.nextDouble();
                sumaNotas+=matriz[f][c];
            }
            matriz[f][3]=sumaNotas/(matriz[f].length-1);
            sumaNotas=0.0;
        }

        //for para recorrer
        for (int f=0; f< matriz.length; f++) {
            System.out.println("Las notas del alumno " + (f+1) + " son: ");
            for (int c = 0; c < (matriz[f].length-1); c++) {
                System.out.println(matriz[f][c]);
            }
            System.out.println("El promedio es: " + matriz[f][3]);
            System.out.println(" ");
        }
    }
}
