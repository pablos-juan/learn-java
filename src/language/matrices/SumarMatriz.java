package language.matrices;

import javax.swing.*;
import java.util.Scanner;

public class SumarMatriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz;
        int nFilas, nColumnas;


        nFilas=Integer.parseInt(JOptionPane.showInputDialog("Digite el número de filas: "));
        nColumnas=Integer.parseInt(JOptionPane.showInputDialog("Digite el número de columnas. "));

        matriz = new int[nFilas][nColumnas];

        System.out.println("Digite la matriz");
        for (int i=0; i< nFilas; i++){
            for (int j=0; j<nColumnas; j++){
                System.out.print("Matriz[" + i + "][" + j + "]: ");
                matriz[i][j]=sc.nextInt();
            }
        }

        System.out.println("\nLa mmatriz es: ");
        for (int[] filas : matriz) {
            for (int columnas : filas) {
                System.out.print(columnas + " ");
            }
            System.out.println();
        }

        //Sumar las filas
        for (int i=0; i<matriz.length; i++){
            int acumulado=0;
            for (int j=0; j<matriz[i].length; j++){
                acumulado+=matriz[i][j];
            }
            System.out.println("\nLa suma de la fila " + (i+1) + "  es: " + acumulado);
        }

        //Suma columnas
        for (int j=0; j<nColumnas; j++){
            int acumulado=0;
            for (int i=0; i<nFilas; i++){
                acumulado+=matriz[i][j];
            }
            System.out.println("La suma de las columna " + (j+1) + " es: " + acumulado);
        }
    }
}
