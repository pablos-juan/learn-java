package language.arrays;

public class Quicksort {
    public static void main(String[] args) {
        int[] numeros = {2, 5, 6, 1, 9, 7, 9};
        quickSort(numeros, 0, numeros.length-1);

        for (int i : numeros) {
            System.out.println(i);
        }
    }

    public static void quickSort(int[] arreglo, int izquierda, int derecha){
        int i=izquierda; //i realiza la búsqueda por la izquierda
        int j=derecha; //j realiza la búsqueda por la derecha
        int pivote=arreglo[izquierda]; //Primer elemento como pivote

        while (i<=j) { //Mientras las búsquedas no se crucen
            while (arreglo[i]<pivote){ //Busca el elemento menor que el pivote
                i++;
            }
            while (arreglo[j]>pivote){ //Busca el elemento mayor que el pivote
                j--;
            }
            if (i<=j){ //Si no se han cruzado
                int aux=arreglo[i]; //Intercambia las posiciones
                arreglo[i]=arreglo[j];
                arreglo[j]=aux;
                i++;
                j--;
            }
        }

        if (izquierda <j){
            quickSort(arreglo, izquierda, j); //Sub array izquierdo
        }
        if (i< derecha){
            quickSort(arreglo, i, derecha); //Sub array derecho
        }
    }
}


