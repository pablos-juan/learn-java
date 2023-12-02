//Crea una función que indique si un número es mayor o menor que cero.
package language.functions;

public class MayorMenor {
    public static void main(String[] args){
        int num=5;
        if (mayorQueCero(num)){
            System.out.println("El número " + num + " es mayor que cero");
        } else {
            System.out.println("El número " + num + " es menor o igual que cero");
        }
    }
    public static boolean mayorQueCero(int numero){
        return numero>0;
        //Podría usar if para comparar el valor, pero ésto es mas eficiente
    }
}
