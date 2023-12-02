//Dada una frase que nos proporciona el usuario. Pasarlo a un array de char.

package language.arrays;

import java.util.Scanner;

public class Char {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n"); //Cortar cadena cuando digite enter

        System.out.print("Escriba una frase: ");
        String frase=sc.next();

        char[] letras = new char[frase.length()];

        //Recorrer una cadena caracter por caracter
        for (int i=0; i<frase.length(); i++){
            letras[i]=frase.charAt(i); //Caractere en la posición i y guardarlo en el arreglo de letras
            System.out.println(letras[i]);
        }

        System.out.println("Arreglo: ");
        for (char i : letras) {
            System.out.println(i);
        }
    }
}
