//Ordena un array de números con Sort de Arrays.

package language.arrays.metodos;

import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int[] numeros = new int[10];

        for (int i=0; i<numeros.length; i++){
            numeros[i]=(int) (Math.random()*9+1);
            System.out.println(numeros[i]);
        }

        Arrays.sort(numeros); //Ordena el array ascedente
        System.out.println("Numeros ordenados: ");
        for (int numero : numeros) {
            System.out.println(numero);
        }
    }
}
