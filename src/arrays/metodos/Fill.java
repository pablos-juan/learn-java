//Rellenar un array de numeros (int) usando el metodo fill de Arrays.

package arrays.metodos;

import java.util.Arrays;

public class Fill {
    public static void main(String[] args) {
        int[] numeros = new int[10];

        Arrays.fill(numeros, 20);
        Arrays.fill(numeros, 3, 5, -1); //El índice final está excluído
        // Arrays.fill(numeros, 3, numeros.length, -1);

        for (int i: numeros){
            System.out.println(i);
        }

    }
}
