package ejercicioCalcularArea;

import java.util.ArrayList;
import java.util.Scanner;

public class Programa {

    static ArrayList<Poligono> poligono = new ArrayList<Poligono>();
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        llenarPoligono();
        mostrarResultados();
        
    }

    public static void llenarPoligono() {

        int opcion;
        char respuesta;

        do {

            do {

                System.out.println("Digite que poligono desea");
                System.out.println("1. Triangulo");
                System.out.println("2. Rectangulo");
                System.out.println("Opcion: ");
                opcion = entrada.nextInt();

            }while(opcion < 1 || opcion > 2);

            switch (opcion) {
                case 1: llenarTriangulo();
                    break;
                case 2: llenarRectangulo();
                    break;
            }

            System.out.println("Desea introducir otro poligono (s/n)");
            respuesta = entrada.next().charAt(0);
            System.out.println("");

        }while(respuesta == 's' || respuesta == 'S');

    }

    public static void llenarTriangulo() {

        double lado1, lado2, lado3;

        System.out.println("Digite el lado 1 del triangulo: ");
        lado1 = entrada.nextDouble();
        System.out.println("Digite el lado 2 del triangulo: ");
        lado2 = entrada.nextDouble();
        System.out.println("Digite el lado 3 del triangulo:     ");
        lado3 = entrada.nextDouble();

        Triangulo triangulo = new Triangulo(lado1, lado2, lado3);

        //Guardar triangulos dentro array poligono
        poligono.add(triangulo);

    }

    public static void llenarRectangulo() {

        double lado1, lado2;

        System.out.println("Digite lado 1 del rectangulo: ");
        lado1 = entrada.nextDouble();
        System.out.println("Digite lado 2 del rectangulo: ");
        lado2 = entrada.nextDouble();

        Rectangulo rectangulo = new Rectangulo(lado1, lado2);

        //Guardar rectangulo dentro array poligono
        poligono.add(rectangulo);

    }

    public static void mostrarResultados() {

        for(Poligono poligonos: poligono) {
            System.out.println(poligonos.toString());
            System.out.println("Area es:" + poligonos.area());
            System.out.println("");
        }

    }
}
