//Dada una frase, determinar la posición de la primera 'a' y de la siguiente.
package metodosString;

import java.util.Scanner;

public class Posicion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");

        System.out.println("Escriba una frase: ");
        String frase=sc.next();

        //indexOf puede buscar un caracter. Devuelve una posicion (int).
        int posicion = frase.indexOf('a');
        System.out.println(posicion);

        //Puede indicarse el caracter que se busca y la posicion desde donde empieza la busqueda.
        posicion=frase.indexOf('a', posicion+1);
        System.out.println(posicion);
    }
}
