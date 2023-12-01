//Crear una matriz "marco" de tamaño 5x5: todos sus elementos deben Separar 0 salvo los del borde que deben Separar 1.

package matrices;

import java.util.Scanner;

public class MatrizMarco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite el tamaño de la matriz");
        System.out.print("Filas: ");
        int nFilas =sc.nextInt();
        System.out.print("Columnas: ");
        int nColumnas =sc.nextInt();
        int[][] matriz = new int[nFilas][nColumnas];

        //Rellenar matriz
        for (int i=0; i< matriz.length; i++){
            for (int j=0; j<matriz[i].length; j++){
                if (i==0 || i==matriz.length-1){
                    matriz[i][j]=1;
                } else if (j==0 || j==matriz.length-1) {
                    matriz[i][j]=1;
                } else {
                    matriz[i][j]=0;
                }
            }
        }

        //Imprimir la matriz
        System.out.println("Su matriz es: ");
        for (int[] filas: matriz){
            for (int ints : filas){
                System.out.print(ints + "  ");
            }
            System.out.println();
        }
    }

}
