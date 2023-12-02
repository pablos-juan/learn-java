//Crea una función que nos devuelva el número ASCII de un carácter pasao por parámetro.
package language.functions;

public class ASCII {
    public static void main(String[] args) {
        char caracter ='b'; //Caracteres en comillas simples. Mas de un carácter es un String
        System.out.println("El caracter " + caracter + " tiene el código: " + conversor(caracter));
    }
    public static int conversor(char caracter){
        return caracter; //No es necesario castear el caracter para converit en un número.
    }
}
