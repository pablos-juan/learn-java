package language.exceptions;

import javax.swing.*;
import java.io.*;

public class conceptoExcepciones {
    //declarar excepciones
    //excepcion verficada en java.io -> java.io.FileNotFoundException
    public static void leer() throws FileNotFoundException, IOException { //declarar posibles excepciones
        File archivo = new File("/home/pablo/Descargas/leer.txt");
        FileReader fileReader = new FileReader(archivo);
        BufferedReader bf = new BufferedReader(fileReader);
        String line;

        while ((line = bf.readLine()) != null){
            System.out.println(line);
        }
    }

    //usar try-catch para capturar excepciones
    public static void leerArchivo() {
        try{ //intenta ejecutar el método
            leer();
        } catch (FileNotFoundException e){ //dado un error, captura la excepcion correspondiente y ejecuta la logica
            JOptionPane.showMessageDialog(null, "No se encuentra el archivo.");
        } catch (IOException e){
            JOptionPane.showMessageDialog(null, "Ha ocurrido una excepcion verificada.");
        } finally { //independiente del resultado del programa 'finally' muestra un mensaje
            System.out.println("fin del programa.");
        }

        /*
        en caso de querer mostrar la misma logica para cualquier tipo de excepcion
            try{
                logica del programa...
            } catch (Exception e){
                logica en caso de excepcion...
            }
        */
    }

    public static void main(String[] args) {
        leerArchivo();
    }
}
