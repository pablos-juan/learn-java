/*
Rellenar TODA la matriz de números.
Suma de una fila que se pedirá al usuario
Suma de una columna que se pedirá al usuario
Sumar la diagonal principal
Sumar la diagonal inversa
La media de todos los valores de la matriz
*/

package language.matrices;

import java.util.Scanner;

public class SumarDiagonales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[4][4];
        int columna, fila;
        llenarMatriz(matriz);

        do {
            System.out.println("Elija una fila: ");
            fila=sc.nextInt();
        } while (!(fila>=0 && fila<matriz.length));

        do {
            System.out.println("Elija una columna: ");
            columna=sc.nextInt();
        } while (!(columna>=0 && columna<matriz.length));


        System.out.println("Suma filas: " + sumaFila(matriz, fila));
        System.out.println("Suma columnas: " + sumaColumna(matriz, columna));
        System.out.println("Suma diagonal principal: " + sumaDiagonal(matriz));
        System.out.println("Suma diagonal inversa: " + diagonalInversa(matriz));
        System.out.println("Media: " + media(matriz));
    }

    public static void llenarMatriz(int[][] matriz){
        for (int i=0; i<matriz.length; i++){
            for (int j=0; j<matriz[0].length; j++){
                matriz[i][j]=(int)(Math.random()*9+1);
                //System.out.println("Matriz[" + i + "][" + j + "]: " + matriz[i][j]);
                System.out.print(matriz[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public static int sumaFila(int[][] matriz, int fila){
        int suma=0;
        for (int j=0; j<matriz.length; j++){
            suma+=matriz[fila][j];
        }
        return suma;
    }

    public static int sumaColumna(int[][] matrz, int columna){
        int suma=0;
         for (int[] ints : matrz) {
            suma += ints[columna];
        }
        return  suma;
    }

    public static int sumaDiagonal(int[][] matriz){
        int suma=0;
        for (int i=0, j=0; i<matriz.length; i++, j++){
            suma+=matriz[i][j];
        }
        return suma;
    }

    public static int diagonalInversa(int[][] matriz){
        int suma=0;
        for (int i=0, j=3; i<matriz.length; i++, j--){
            suma+=matriz[i][j];
        }
        return suma;
    }

    public static double media(int[][] matriz){
        double suma=0, media;
        for (int[] filas : matriz){
            for (int ints : filas){
                suma+= ints;
            }
        }
        media=suma/(matriz.length*matriz.length);
        return media;
    }
}
