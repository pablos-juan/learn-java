//Ordenar un array de cadenas con el metodo Quicksort

package arrays;

public class QuickSortCadena {
    public static void main(String[] args) {
        String[] cadenas={"Fernando", "Pepe", "Alejandro", "Alfredo", "Emilia"};
        quickSort(cadenas, 0, cadenas.length-1);

        System.out.println("Orden alfabetico: ");
        for (String cadena : cadenas) {
            System.out.println(cadena);
        }
    }

    public static void quickSort(String[] arreglo, int izquierda, int derecha){
        int i=izquierda;
        int j=derecha;
        int pivote=(j+i)/2;

        do {
            while (arreglo[i].compareToIgnoreCase(arreglo[pivote])<0){
                i++;
            }
            while (arreglo[j].compareToIgnoreCase(arreglo[pivote])>0){
                j--;
            }
            if (i<=j){
                String aux=arreglo[i];
                arreglo[i]=arreglo[j];
                arreglo[j]=aux;
                i++;
                j--;
            }
        } while (i<=j);

        if (izquierda<j){
            quickSort(arreglo, izquierda, j);
        }
        if (i<derecha){
            quickSort(arreglo, i, derecha);
        }
    }
}
