package arrays;

public class AleatoriosNoRepetidos {
    public static void main(String[] args) {
        int minimo = 1;
        int maximo = 100;
        int longitud = 90;
        int[] numeros = new int[longitud];

        //si el número de digitos posibles es menor a la longitud: error -1
        if (maximo - minimo < longitud){
            System.out.println(-1);
        } else{
            //llenar arreglo
            for (int i=0; i<longitud; i++){
                int aux = 0; //auxiliar para guardar un valor aleatorio
                do {
                    //asignar un valor aleatorio a la variable auxiliar
                    aux = generarAleatorio(minimo, maximo);
                } while(repetido(numeros, aux)); //repetir mientras el número esté repetido 
                numeros[i] = aux;
                System.out.println(numeros[i]);
            }
        }         

        //ordenar arreglo
        booble(numeros);
        //mostrar arreglo ordenado
        System.out.println("arreglo ordenado: ");
        for (int i: numeros){
            System.out.println(i);
        }

        //buscar un número específico
        System.out.println(binario(numeros, 18));
        
    }
    
    //generar número aleatorio con un rango determinado
    public static int generarAleatorio(int minimo, int maximo){
        return (int) (Math.random() * (minimo - (maximo+1)) + (maximo+1));
    }

    //validar si el número está repetido
    public static boolean repetido(int[] arreglo, int busqueda){
        for (int i=0; i<arreglo.length; i++){
            if(arreglo[i] == busqueda) return true;
        }
        return false;
    }

    //busca un número específico
    public static boolean binario(int[] arreglo, int busqueda){
        int derecha = arreglo.length-1;
        int izquierda = 0; 

        //si en cuentra el número retorna true
        while (derecha >= izquierda){
            int m = (derecha + izquierda) / 2; //define la mitad
            //si el número en la mitad del arreglo es el que estamos buscando retorna la posicion
            if (arreglo[m] == busqueda) return true; 
            //si el número buscado es mayor que la mitad 
            if (arreglo[m] < busqueda){
                izquierda = m + 1; //define la izquierda como la mitad + 1
            } else{ //si no es mayor, es menor
                derecha = m - 1; //define la derecha como la mitad - 1
            }
        }
        return false;
    }
    
    public static void booble(int[] arreglo){
        //contador 
        int intercambios; 
        //el ciclo debe ejecutarse al menos una vez
        do { 
            intercambios = 0; //cuando el bucle terminar devuelve la variable 'intercambios' a 0
            //recorre el arrelgo
            for (int i=0; i<arreglo.length-1; i++){
                //compara dos indices del arreglo
                if (arreglo[i] > arreglo[i+1]){ //si el arreglo en i es mayor que en i+1
                    //cambia sus posiciones
                    int aux = arreglo[i];
                    arreglo[i] = arreglo[i+1];
                    arreglo[i+1] = aux;
                    intercambios++; //cada vez que hay un cambio de posicion aumenta el contador                
                }
                //si no hubieron 'intercambios' el contador se queda en 0
            }
        } while (intercambios != 0); //repetir mientras hayan 'intercambios'
    }

    
}
