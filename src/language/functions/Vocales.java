//Realizar una función que nos indique cuantas vocales tiene una frase.

package language.functions;

import java.util.Scanner;

public class Vocales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //sc.useDelimiter("\n");

        System.out.println("escriba una frase: ");
        String frase=sc.nextLine();

        int vocales=vocales(frase);
        System.out.println("vocales: " + vocales);
    }
    public static int vocales(String texto){
        char caracterActual;
        int contador=0;

        for (int i=0; i<texto.length(); i++){
            caracterActual=texto.charAt(i);
            switch (caracterActual){ //podría usar un arreglo con vocales pero esto parece mas práctico
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    contador++;
                    break;
            }
        }
        return contador;
    }
}
