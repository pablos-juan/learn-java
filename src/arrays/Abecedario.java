//Crea un array que contenga las letras del abecedario (en mayusculas) y que nos permita ir
//cogiendo letras de sus posiciones hasta que insertemos un -1 (si no esta en el array se vuelve a pedir).
package arrays;
import java.util.Scanner;

public class Abecedario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] abecedario = new char[91-65];
        int letra=65;
        StringBuilder misNumeors= new StringBuilder();

        for (int i: abecedario){
            abecedario[i]=(char) letra;
            System.out.println(abecedario[i]);
            letra++;
        }

        System.out.println("Digite un número: ");
        int numero=sc.nextInt();

        while (numero!=-1){
            if (numero>=0 && numero<abecedario.length){
                misNumeors.append(abecedario[numero]);
            } else {
                System.out.println("Numero incorrecto. ");
            }
            numero=sc.nextInt();
        }
        System.out.println("Su cadena de texto es: " + misNumeors);
    }
}
