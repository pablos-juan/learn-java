//4. Dada una frase, reemplazar las 'a' por 'e' y las 'i' por 'o'.
package metodosString;

import java.util.Scanner;

public class Reemplazar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");

        System.out.println("Escriba una frase");
        String frase1=sc.next();

        //Metodo replace para reemplazar un char por otro
        frase1=frase1.replace('a', 'e');
        frase1=frase1.replace('i', 'o');
        System.out.println(frase1);
    }
}
