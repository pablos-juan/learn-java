//Ordenar un array de numeros con el metodo de la burbuja

package language.arrays;

public class Burbuja {
    public static void main(String[] args) {
        int[] numeros = new int[20];

        System.out.println("Arreglo sin ordenar: ");
        for (int i=0; i<numeros.length; i++){
            numeros[i]=(int) (Math.random()*9+1);
            System.out.println(numeros[i]);
        }

        System.out.println("Arreglo ordenado: ");
        ordenacionBurbuja(numeros);
        for (int i: numeros){
            System.out.println(i);
        }
    }

    public static void ordenacionBurbuja(int[] arreglo){
        int intercambios =0;
        for (boolean ordenado=false; !ordenado;){
            for (int i=0; i<arreglo.length-1; i++){
                //Cambiar la orientación del condicional para ordenar de mayor a menor
                if (arreglo[i]>arreglo[i+1]){
                    //Si el arreglo en la posicion i es mayor que i+1 cambia las posiciones
                    int aux=arreglo[i]; //Variable auxiliar para no perder el valor de la primera posición
                    arreglo[i]=arreglo[i+1];
                    arreglo[i+1]=aux;
                    intercambios++;
                }
            }
            if (intercambios == 0){ //Si no hubo ningún intercambio el array está ordenado
                ordenado = true; //Salir del bucle
            }
            intercambios = 0; //Si hubieron intercambios regresar la variable a 0
        }
    }
}
