//Crear dos language.arrays, rellenar uno con números y copiarlo al otro usando CopyOf de Arrays
package language.arrays.metodos;

import java.util.Arrays;

public class CopyOf {
    public static void main(String[] args) {
        int[] array1 = new int[10];

        Arrays.fill(array1, 2); //Llenar array con '2'
        int[] array2=Arrays.copyOf(array1, 12); //13 es la nueva longitud. Las posiciones restantes son 0
        //Copia desde una posición hasta otra
        int[] array3=Arrays.copyOfRange(array1, 2, 9); //El número de posiciones es |from-to|

        for (int i: array2){
            System.out.println(i);
        }

        for (int i: array3){
            System.out.println("Array 3: " + i);
        }

    }
}
