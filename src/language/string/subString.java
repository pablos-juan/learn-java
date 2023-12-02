//2. Dada una cadena, extraer la cuarta y quinta letra usando el método subString.
package language.string;

public class subString {
    public static void main(String[] args) {
        String palabra="metodo";
        System.out.println(palabra);

        String subcadena = palabra.substring(4, 5); //Puede tomar un valor de inicio y uno de fin
        System.out.println(subcadena);
        subcadena=palabra.substring(2); //Puede iniciar desde un valor
        System.out.println(subcadena);

    }
}
