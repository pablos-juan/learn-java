package language.arrays;
public class BusquedaBinaria {
    public static void main(String[] args) {
        int[] numeros = new int[100];
    
        //llenar arreglo con número aleatorios
        for(int i=0; i<numeros.length; i++){
            numeros[i] = (int) (Math.random()*100)+1;
            System.out.println(numeros[i]);
        }

        //ordenar arreglo
        ordenarArreglo(numeros);
        System.out.println("arreglo ordenado:");
        for(int num: numeros){
            System.out.println(num);
        }

        //busqueda binaria simple
        int posicion = busquedaBinaria(numeros, 3);
        System.out.println("posicion: " + posicion);

        //busqueda binaria recursiva
        int indice = busquedaBinariaRecursiva(numeros, 5, 0, numeros.length-1);
        System.out.println("indice: " + indice);

    }

    public static int busquedaBinariaRecursiva(int[] array, int busqueda, int left, int right){
        if (left <= right){
            int mitad = right - left / 2;
            
            if (array[mitad] == busqueda){
                return mitad;
            } else if (array[mitad] < busqueda){
                return busquedaBinariaRecursiva(array, busqueda, mitad + 1, right);
            } else {
                return busquedaBinariaRecursiva(array, busqueda, left, mitad -1);
            }
        }
        return -1;
    }

    public static int busquedaBinaria(int[] arregloOrdenado, int numero){
        int left = 0;
        int right = arregloOrdenado.length - 1;
    
        while(left <= right){
            int mitad = right - left / 2;

            if(arregloOrdenado[mitad] == numero){
                return mitad; //retorna la posicion
            } else if(arregloOrdenado[mitad]<numero){
                left=mitad+1;
                //busquedaBinaria(arregloOrdenado, numero);
            } else {
                right=mitad-1;
                //busquedaBinaria(arregloOrdenado, numero);
            } 
        }
        //si no encuentra nada retorna error -1
        return -1;
        
    }

    public static void ordenarArreglo(int[] arreglo){
        int intercambios=0;
        boolean ordenado=false;

        while(!ordenado){
            //recorrer arreglo
            for(int i=0; i<arreglo.length-1; i++){
                //cambiar la posicion
                if(arreglo[i]>arreglo[i+1]){
                    int aux = arreglo[i];
                    arreglo[i] = arreglo[i+1];
                    arreglo[i+1] = aux;
                    intercambios++;
                }
            }
            //si no hay intercambios esta arreglado
            if(intercambios==0){
                ordenado=true;
            }
            //reiniciar intercambios 
            intercambios=0;
        }
    }
}