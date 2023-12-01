//3. Dada una frase, separarlo en palabras.
package metodosString;
import java.util.Scanner;

public class Separar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n"); //userDelimiter para cortar la cadena cuando presione, por ejemplo, enter

        System.out.println("Escriba una frase");
        String frase=sc.next();

        //Pone las palabras en una arreglo. Diferencia cada palabra, por ejemplo, con un espacio
        String[] palabras = frase.split(" ");
        //Mostrar el arreglo
        for (String its: palabras){
            System.out.println(its);
        }
    }
}
