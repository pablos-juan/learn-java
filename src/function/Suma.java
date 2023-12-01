package function;

public class Suma {
    public static void main(String[] args) {
        int num1 =5;
        int num2 =7;
        int resultado;

        resultado=suma(num1, num2);
        System.out.println("Resultado " + resultado);
        //Otra forma de mostrar el resultado puede ser:
        //System.out.println(suma(num1, num2));
    }
    public static int suma(int a, int b){
        return a+b;
    }
}
