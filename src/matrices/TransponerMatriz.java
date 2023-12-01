//Utilizando dos matrices de tamaño 5x9 y 9x5, cargar la primera y transponerla a la segunda.
package matrices;

public class TransponerMatriz {
    public static void imprimirMatriz(int[][] matriz) { //Método para imprimir una matriz
        for (int[] ints : matriz) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] matrizOriginal = new int[5][9];
        int[][] matrizTranspuesta = new int[9][5];

        System.out.println("Matriz original: ");
        for (int i=0; i<matrizOriginal.length; i++){
            for (int j=0; j<matrizOriginal[i].length; j++){
                matrizOriginal[i][j]=(int) (Math.random()*90+10);
                System.out.print(matrizOriginal[i][j] + "  ");
            }
            System.out.println();
        }


        for (int i=0; i<5; i++){
            for (int j=0; j<9; j++){
                matrizTranspuesta[j][i]=matrizOriginal[i][j];
            }
        }

        System.out.println("Matriz transpuesta: ");
        for (int[] ints: matrizTranspuesta){
            for (int j=0; j<matrizTranspuesta[0].length; j++){
                System.out.print(ints[j] + "  ");
            }
            System.out.println();
        }
    }
}
