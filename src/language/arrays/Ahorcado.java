// Vamos a crear el juego del ahorcado por consola.
// Al inicio del programa, pedirá los nombres de los dos jugadores. El primer turno será para el jugador 1.
// Uno escribe una palabra y el otro la adivina, si este la adivina obtendrá un punto y escribirá una palabra, 
// sino lo acierta el jugador actual suma un punto y escribe de nuevo otra palabra.
// Cuando el jugador inserte su palabra también deberá añadir una pequeña pista, por ejemplo si la palabra es 
// Madrid, la pista puede ser "Ciudad".
// El jugador que tenga que acertar la palabra tendrá seis oportunidades (cabeza, cuerpo, brazos y piernas). 
// No es necesario dibujar nada por pantalla, solo mostrar el número de oportunidades restantes.
// Deberá mostrase los caracteres que el usuario inserta para esa palabra, para evitar que las repita, en caso 
// de que lo haga, avisarle y no contar como error.
// Cada vez que acierte o no la palabra, deberá mostrar la puntuación de ambos.
// El primero que llegue a 3 puntos gana.

package language.arrays;

import java.util.Scanner;

public class Ahorcado { //reestruccturar con excepciones
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //arreglo para guardar jugadores 
        String players[] = new String[2];
        //puntuacion
        int[] puntos = new int[2];
        int turno = 0;
        //puntuacion maxima
        final int puntuacionMax = 3;
        String palabraElegida;
        String palabraAdivinar;
        String pista;
        char abecedario[] = generarCaracteres();
        int errores=6;

        //llenar arreglo de jugadores
        for(int i=0; i<players.length; i++){
            players[i] = pedirString(sc, "nombre player " + (i+1) + ": ");
        }
        
        while (fin(puntos, puntuacionMax)){
            do{
            palabraElegida = pedirString(sc, "escriba una palabra jugador " + players[turno]).toLowerCase();
            //en caso de error mostrar mensaje
            if (validarPalabra(palabraElegida)){
                System.out.println("palabra invalida");
            }
            //agregar una pista
            pista = pedirString(sc, "escribe una pista " + players[turno]).toLowerCase();
            //validar pista
            if (validarPalabra(pista)) System.out.println("palabra inválida");
            } while(validarPalabra(palabraElegida) && validarPalabra(pista)); //mientras que las pabras sean validas
            
            espacios();
            palabraAdivinar = rellenar(palabraElegida);
            //empezar adivinar
            while (!palabraCorrecta(palabraAdivinar, palabraElegida) && errores > 0){
                System.out.println("pista: " + pista);
                mostrarPalabra(palabraAdivinar);
            }
            errores = 6;    


        }
    }

    public static String pedirString(Scanner scanner, String mensaje){
        System.out.println(mensaje);
        return scanner.nextLine();
    }

    //pedir y guardar los nombres de los jugadores en un arreglo
    // public static String[] jugadores(String[] arrayJugadores, Scanner scanner){
    //     for (int i=0; i<arrayJugadores.length; i++){
    //         System.out.print("Ingrese el nombre del jugador " + (i+1) + ": ");
    //         arrayJugadores[i] = scanner.nextLine();
    //     }
    //     return arrayJugadores;
    // }

    public static boolean validarPalabra(String cadena){
        char caracter; 
        for (int i=0; i<cadena.length(); i++){
            caracter = cadena.charAt(i);
            if (!Character.isAlphabetic(caracter)) return false;
        }
        return true;
    }

    public static char[] generarCaracteres(){
        char[] abecedario = new char[26];
        for (int i=0, j=97; i<abecedario.length; i++, j++){
            abecedario[i] = (char) j;
        }
        return abecedario;
    }

    public static boolean fin (int[] puntos, int puntuacionMax){
        for (int i=0; i<puntos.length; i++){
            if (puntos[i] >= puntuacionMax) return true;
        }
        return false;
    }

    public static void espacios(){
        for (int i=0; i<30; i++){
            System.out.println(" ");
        }
    }

    public static String rellenar(String cadena){
        String palabra = "";
        for (int i=0; i<palabra.length(); i++){
            palabra += "_";
        } 
        return palabra;
    }

    public static void mostrarPalabra(String cadena){
        for (int i=0; i<cadena.length(); i++){
            System.out.println(cadena.charAt(i) + " ");
        }
        System.out.println();
    }

    public static boolean palabraCorrecta(String original, String usuario){
        return original.equals(usuario);
    }
}
