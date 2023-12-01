//Crear una función que nos devuelva el factorial de un número entero.

package function;

public class Factorial {
    public static void main(String[] args) {
        int num=5;
        System.out.println(factorial(num));
        //rango limitado por la variable int
    }
    public static int factorial(int numero){
        if (numero<0){
            System.out.println("No se puede calcular el factorial de un número negativo.");
            return -1; //usar -1 como "código de error"
        } else if (numero==0 || numero==1) {
            return 1;
        }

        int resultado=numero; //inicializar la variable rasultado en el número
        for (int i=(numero-1);i>1;i--){ //reducir el número de uno en uno
            resultado *= i; //podría verse como: resultado=resultado*i
        }
        return resultado;
    }
}
