package exercises.ejerciciosClasesObjetos.complejos;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Complejo[] arreglo = new Complejo[10];
        String opcion;
        double a=0, b=0, c=0, d=0;
        Complejo suma;
        Complejo resta;
        Complejo producto;
        Complejo division;
        Complejo numero1, numero2;
        int i=0;

        System.out.println("/operar");
        do {
            System.out.println("/salir");
            System.out.println("/ayuda");
            System.out.print("> ");
            opcion=sc.next();

            if (opcion.equals("/operar")) {
                System.out.print("real> ");
                a = sc.nextDouble();
                System.out.print("imaginaria> ");
                b = sc.nextDouble();

                //operacion que desea realizar
                System.out.print("> ");
                opcion=sc.next();

                System.out.print("real> ");
                c = sc.nextDouble();
                System.out.print("imaginaria> ");
                d = sc.nextDouble();
            }

            //asignar a los complejos valores
            numero1 = new Complejo(a, b);
            numero2 = new Complejo(c, d);

            switch (opcion.toLowerCase()){
                case "/sumar":
                    //sumar complejos, mostrar resultado
                    suma = numero1.suma(numero2);
                    System.out.println("= " + suma);
                    arreglo[i]=suma;
                    i++;
                    break;
                case "/restar":
                    resta = numero1.resta(numero2);
                    System.out.println("= " + resta);
                    arreglo[i]=resta;
                    i++;
                    break;
                case "/producto":
                    producto = numero1.multiplicar(numero2);
                    System.out.println("= " + producto);
                    arreglo[i]=producto;
                    i++;
                    break;
                case "/dividir":
                    division = numero1.dividir(numero2);
                    System.out.println("= " + division);
                    arreglo[i]=division;
                    i++;
                    break;
                case "/historial":
                    System.out.println("\n\tHistorial:");
                    for (int f=0; f<i; f++){
                        System.out.println(arreglo[f]);
                    }
                    break;
                case "/salir":
                    System.out.println("Adios :)");
                    break;
                case "/ayuda":
                    System.out.println("\tcomandos:");
                    System.out.println("/sumar");
                    System.out.println("/restar");
                    System.out.println("/producto");
                    System.out.println("/dividir");
                    System.out.println("/historial");
                    System.out.println("/salir");
                    System.out.println("/help\n");
                    break;
                default:
                    System.out.println("Error. Seleccione una de las opciones");
                    break;
            }

        } while(!opcion.equals("/salir"));
    }
}
