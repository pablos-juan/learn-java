//ado un array de números (podemos declarar los valores de forma inmediata), invertir los valores.
//El primero en el final, el final en el primero, y asi con todos.

package arrays;

public class ArrayInvertido {
    public static void main(String[] args) {
        int[] arreglo = new int[10];

        //Mostrar arreglo
        for (int ints=0; ints<arreglo.length; ints++){
            arreglo[ints]=(int) (Math.random()*9+1);
            System.out.println(arreglo[ints] + " ");
        }

        System.out.println();

        //Mostrar arreglo invertido
        for (int i = arreglo.length-1; i >= 0; i--) {
            System.out.println(arreglo[i] + " ");
        }

        //Arreglo invertido
        int[] aux = new int[arreglo.length];
        for (int i=arreglo.length-1, j=0; i>=0; i--, j++){
            aux[j]=arreglo[i];
            System.out.print(aux[j] + "  ");
        }

    }
}
