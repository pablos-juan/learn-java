//Crear una función que nos indique si un número es primo o no.

package language.functions;

public class Primos {
    public static void main(String[] args) {
        int num=75;
        System.out.println(esPrimo(num));
        listaDePrimos(num);
    }

    public static boolean esPrimo(int numero){
        if (numero<=1) return false;
        for (int i=(int) Math.sqrt(numero);i>1;i--){
            if (numero%i==0){
                return false;
            }
        }
        return true;
    }

    public static void listaDePrimos(int numero){
        if (numero<=1) {
            System.out.println("El número no es primo");
        } else {
            System.out.println("divisores: ");
            for (int i=numero-1; i>1; i--) {
                if (numero % i == 0){
                    System.out.println(i);
                }
            }
        }

    }
}
