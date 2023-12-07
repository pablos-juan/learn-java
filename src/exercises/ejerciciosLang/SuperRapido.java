package exercises.ejerciciosLang;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SuperRapido {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double transporte, costo, valorBruto, valorIVA;
        double valorKilo = 0;
        double valorFlete = 0;
        double seguro = 0;
        int numeroFilas;
        int internacionales = 0;

        do {
            System.out.println("Ingrese el número de envíos: ");
            numeroFilas = obtenerNumero(sc);
        } while (numeroFilas < 0 || numeroFilas > 10);

        double[][] matriz = new double[numeroFilas][7];

        for (int i = 0; i< numeroFilas; i++){
            System.out.println("TIPO DE SERVICIO: ");
            System.out.println("1. Nacional");
            System.out.println("2. Internacional");
            int tipoServicio = obtenerNumero(sc);

            matriz[i][0]= tipoServicio;
            if (tipoServicio ==2) internacionales++;

            System.out.println("PESO DEL ENVIO (KILOS): ");
            double kilos = obtenerNumero(sc);
            matriz[i][2]=kilos;

            System.out.println("TIPO DE PRODUCTO: ");
            System.out.println("1. Normal. ");
            System.out.println("2. Rápido. ");
            System.out.print("Opcion: ");
            int opcionProducto = obtenerNumero(sc);
            matriz[i][1]=opcionProducto;

            //determinar el valor del kilo
            valorKilo = switch (opcionProducto) {
                case 1 -> (kilos > 8) ? 3900 : 3600;
                case 2 -> (kilos > 8) ? 4500 : 4200;
                default -> valorKilo;
            };

            //asignar valor de transporte
            transporte = valorKilo *kilos;

            //flete internacional
            switch (tipoServicio) {
                case 1 -> seguro = 2;
                case 2 -> {
                    seguro = 4;
                    valorFlete = (transporte*10)/100;
                    matriz[i][3] = valorFlete;
                }
            }

            //asignar valor de seguro
            seguro = (transporte*seguro)/100;
            matriz[i][4] = seguro;

            //asignar valor bruto
            valorBruto = transporte + valorFlete + seguro;

            //asignar valor IVA
            valorIVA =(valorBruto *19)/100;
            matriz[i][5]= valorIVA;

            //asignar costo del servicio
            costo= valorBruto + valorIVA;
            matriz[i][6]=costo;
        }

        //imprimir matriz
        mostrarMatriz(matriz);

        System.out.println("TIPO DE PRODUCTO");
        System.out.println("Enviós normales: ");
        obtenerProducto(1, matriz);
        System.out.println("Envíos rápidos: ");
        obtenerProducto(2, matriz);

        System.out.println("CANTIDAD Y COSTO DE PAQUETES A NIVEL INTERNACIONAL");
        System.out.println(internacionales + " envíos internacionales." );
        for (int i=0; i<matriz.length; i++){
            if (matriz[i][0] == 2){
                System.out.println("Envío número " + (i+1) + " con valor de: $" + matriz[i][6]);
            }
        }

        System.out.println("VALOR DEL IVA DE LOS ENVIOS NACIONALES");
        for (int i=0; i<matriz.length; i++){
            if (matriz[i][0] == 1){
                System.out.println("Envío número " + (i+1) + " tiene un IVA de: $" + matriz[i][5]);
            }
        }

        System.out.println("CANTIDAD DE ENVIOS Y COSTO DEL SEGURO POR CADA TIPO DE SERVICIO");
        System.out.println("Número de paquetes: " + numeroFilas);
        System.out.println("Servicios nacionales: ");
        obtenerSeguro(1, matriz);
        System.out.println("Servicios internacionales: ");
        obtenerSeguro(2, matriz);
    }

    public static void mostrarMatriz(double[][] matriz) {
        //mejorar la forma de mostrar una tabla
        for (double[] doubles : matriz) {
            for (double aDouble : doubles) {
                System.out.print(aDouble + "\t");
            }
            System.out.println();
        }
    }

    public static void obtenerProducto(int fila, double[][] matriz) {
        for (int i=0; i<matriz.length; i++) {
            if (matriz[i][1] == fila) {
                System.out.println("Envío número " + (i+1) + " con valor de: $" + matriz[i][6]);
            }
        }
    }

    public static void obtenerSeguro(int fila, double[][] matriz) {
        for (int i=0; i<matriz.length; i++) {
            if (matriz[i][0] == fila) {
                System.out.println("Envío número " + (i+1) + " tiene un seguro de: $" + matriz[i][4]);
            }
        }
    }

    public static int obtenerNumero(Scanner scanner) {
        while (true) {
            try {
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Error. Ingrese un número.");
                scanner.nextLine();
            }
        }
    }
}
