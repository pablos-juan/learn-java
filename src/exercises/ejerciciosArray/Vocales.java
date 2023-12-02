/*
Escribir un programa que genere 50 números enteros aleatorios entre el 97 y el 123 que representarán las letras
minúsculas del alfabeto (exceptuando la ñ), los almacene en un array de char, y cuente cuántas vocales se han generado.
Mostrar todas las letras generadas en una línea y el número de vocales en la siguiente
Nota: para pasar de un número entero a un char, se puede utilizar:
char c = (char) numero
*/

/*
@Author Juan Pablo Castaño Sanchez
*/

package exercises.ejerciciosArray;

public class Vocales {
    public static void main(String[] args) {
        char[] enteros = new char[50];
        int vocales=0;

        //for para llenar arreglo
        for (int i=0; i< enteros.length; i++){
            enteros[i]= (char)(Math.random()*(123-97)+97);
            System.out.print(enteros[i] + " ");

            //switch para encontrar vocales
            switch (enteros[i]){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    vocales++;
                    break;
            }
        }

        System.out.println();
        System.out.println("Vocales: " + vocales);

    }
}
