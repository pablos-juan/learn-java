//Indica si dos arrays creados por ti son iguales con Equals de Arrays.

package arrays.metodos;

import java.util.Arrays;

public class Equals {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        int[] copia;

        Arrays.fill(numeros, 3);
        copia=Arrays.copyOf(numeros, 10);
        //copia=Arrays.copyOfRange(numeros, 3, 10); --> para que los arrasys no sean iguales

        System.out.println("Arreglo 1: ");
        for (int i: numeros){
            System.out.print(i + " ");
        }

        System.out.println("\nArreglo 2: ");
        for (int i: copia){
            System.out.print(i + " ");
        }

        System.out.println();
        if (Arrays.equals(numeros, copia)){
            System.out.println("Los arreglos son iguales. ");
        } else {
            System.out.println("Los arreglos no son iguales. ");
        }

    }
}
