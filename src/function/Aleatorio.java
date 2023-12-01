//Crea una función que devuelva un número aleatorio entre dos números enteros que nosotros le pasemos.
package function;

public class Aleatorio {
    public static void main(String[] args) {
        int min=2;
        int max=12;

        for (int i=0; i<5; i++) {
            System.out.println(aleatorio(min, max));
        }
    }

    public static int aleatorio(int minimo, int maximo){
        return (int) (Math.random()*(minimo-(maximo+1))+(maximo+1));
    }

}
