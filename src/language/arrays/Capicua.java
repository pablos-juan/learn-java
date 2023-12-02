//Dado un array de números, indicar si es capicua, es decir, si se lee igual tanto por delante como por detras.

package language.arrays;

import java.util.Arrays;

public class Capicua {
    public static void main(String[] args) {
        int[] numeros = {9,0,0,9};
        int[] aux = new int[numeros.length];

        System.out.println();
        for (int i=numeros.length-1, j=0; i>=0; i--, j++){
            aux[j]=numeros[i];
            System.out.println(aux[j]);
        }

        if (Arrays.equals(numeros, aux)){
            System.out.println("Es capicua.");
        } else {
            System.out.println("No es capicua.");
        }
    }
}
