//hacer una funcion que enumere los números naturales debajo del número objetivo.
//Si uno de los número es multiplo de 3 o 5 sumar su valor. Por ejemplo: el número 10
//es el número objetivo. Sus múltiplos son 3, 5, 6, 9. La suma de ellos es 23.
//Si el número es negativo la función debe devolver un 0. 
package language.functions;

public class Multiplos {
    public static void main(String[] args) {
        int resultado = sumaMultiplos(10);
        System.out.println(resultado);
        
    }

    public static int sumaMultiplos(int max){
        int acum = 0;
        if(max > 0){
            for (int i=1; i<max; i++){
                if (i%3==0 || i%5==0){
                    acum += i;
                }
            }
            return acum;
        }
        return 0;
    }
}
