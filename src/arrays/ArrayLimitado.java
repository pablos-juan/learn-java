//Crear un array de una longitud que determine el usuario y que le permita insertar numeros entre 0 y 10.
package arrays;

import java.util.Scanner;

public class ArrayLimitado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.print("Ingrese la longitud del arreglo: ");
        int longitud=sc.nextInt();

        int[] numeros = new int[longitud];

        System.out.println("Ingrese un número entre 0 y 10:");
        for (int i=0; i<numeros.length; i++){
            do {
                System.out.print("Número " + (i+1) + ": ");
                numero=sc.nextInt();
                if (numero<0 || numero>10){
                    System.out.println("Número incorrecto");
                }
            } while (numero<0 || numero>10);
            numeros[i]=numero;
        }

        System.out.println("Mostrar números: ");
        for (int i: numeros){
            System.out.println(i);
        }

        //Crea un array insertando numeros aleatorios entre 0 y 10. Muestralos por pantalla.
        int[] aleatorios = new int[longitud];

        for (int i: aleatorios){
            aleatorios[i]=(int) (Math.random()*11);
            System.out.println("Aleatorio: " + aleatorios[i]);
        }
    }
}
