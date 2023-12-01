package arrays;

public class ArrayCopy {

    public static void main(String[] args) {
        int[] numeros = new int[10];
        int posicion = 5;

        System.out.println("original: ");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i + 1;
            System.out.println(numeros[i]);
        }

        System.arraycopy(numeros, posicion + 1, numeros, posicion, numeros.length - 1 - posicion);

        System.out.println("copy");
        for (int i: numeros){
            System.out.println(i);
        }
                
    }
}
