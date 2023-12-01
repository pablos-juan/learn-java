package parciales;

import java.util.Scanner;

// Juan Pablo Castaño Sanchez. 20231213945
public class SuperRapido {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double vrKilo = 0, transporte, vrFlete = 0, vrBruto, vrIva, seguro = 0, costo;
        int internacionales = 0, nFilas;

        do {
            System.out.println("Ingrese el número de envíos: ");
            nFilas = sc.nextInt();
            validarTamaño(nFilas); //funcion que valida el tamaño
        } while (nFilas<1 || nFilas>100);

        //definir matriz
        double[][] matriz = new double[nFilas][7];

        for (int i=0; i<nFilas; i++){
            //Tipo de servicio:
            System.out.println("Elija un tipo de servicio: ");
            System.out.println("1. Nacional");
            System.out.println("2. Internacional");
            int servicio=sc.nextInt();
            matriz[i][0]=servicio;
            if (servicio==2) internacionales++;

            //Peso:
            System.out.println("Digite el peso del envío en kilos: ");
            double kilos=sc.nextInt();
            matriz[i][2]=kilos;

            //Tipo de producto:
            System.out.println("Digite el tipo de producto: ");
            System.out.println("1. Normal. ");
            System.out.println("2. Rápido. ");
            System.out.print("Opcion: ");
            int opcion=sc.nextInt();
            matriz[i][1]=opcion;

            //determinar el valor del kilo
            switch (opcion){
                case 1:
                    if (kilos>8){
                        vrKilo=3900;
                    } else {
                        vrKilo=3600;
                    }
                    break;
                case 2:
                    if (kilos>8){
                        vrKilo=4500;
                    } else {
                        vrKilo=4200;
                    }
                    break;
            }

            //Valor del transporte:
            transporte=vrKilo*kilos;

            //Flete internacional:
            if (servicio==2) {
                seguro=4;
                vrFlete=(transporte*10)/100;
                matriz[i][3]=vrFlete;
            }
            if (servicio==1) seguro=2;

            //Valor seguro
            seguro=(transporte*seguro)/100;
            matriz[i][4]=seguro;

            //Valor bruto:
            vrBruto=transporte+vrFlete+seguro;

            //vrIva
            vrIva=(vrBruto*19)/100;
            matriz[i][5]=vrIva;

            //Costo servicio:
            costo=vrBruto+vrIva;
            matriz[i][6]=costo;
        }

        //imprimir matriz
        System.out.println("Srvc  Prdcto  Kilos  Flete    Seguro    IVA     Costo");
        for (double[] doubles : matriz) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(doubles[j] + "    ");
            }
            System.out.println();
        }

        System.out.println("TIPO DE PRODUCTO");
        System.out.println("Enviós normales: ");
        for (int i=0; i<matriz.length; i++){
            if (matriz[i][1] == 1){
                System.out.println("Envío número " + (i+1) + " con valor de: $" + matriz[i][6]);
            }
        }
        System.out.println("Envíos rápidos: ");
        for (int i=0; i<matriz.length; i++){
            if (matriz[i][1] == 2){
                System.out.println("Envío número " + (i+1) + " con valor de: $" + matriz[i][6]);
            }
        }
        System.out.println();

        System.out.println("CANTIDAD Y COSTO DE PAQUETES A NIVEL INTERNACIONAL");
        System.out.println(internacionales + " envíos internacionales. " );
        for (int i=0; i<matriz.length; i++){
            if (matriz[i][0] == 2){
                System.out.println("Envío número " + (i+1) + " con valor de: $" + matriz[i][6]);
            }
        }
        System.out.println();

        System.out.println("VALOR DEL IVA DE LOS ENVIOS NACIONALES");
        for (int i=0; i<matriz.length; i++){
            if (matriz[i][0] == 1){
                System.out.println("Envío número " + (i+1) + " tiene un IVA de: $" + matriz[i][5]);
            }
        }
        System.out.println();

        System.out.println("CANTIDAD DE ENVIOS Y COSTO DEL SEGURO POR CADA TIPO DE SERVICIO");
        System.out.println("Número de paquetes: " + nFilas);
        System.out.println("Servicios nacionales: ");
        for (int i=0; i<matriz.length; i++){
            if (matriz[i][0] == 1){
                System.out.println("Envío número " + (i+1) + " tiene un seguro de: $" + matriz[i][4]);
            }
        }
        System.out.println();
        System.out.println("Servicios internacionales: ");
        for (int i=0; i<matriz.length; i++){
            if (matriz[i][0] == 2){
                System.out.println("Envío número " + (i+1) + " tiene un seguro de: $" + matriz[i][4]);
            }
        }

    }

    //podría cambiarse por try cath y agregar excepciones. Revisar
    public static void validarTamaño(int nFilas){
        if (nFilas<0){
            System.out.println("Error. Ingrese un valor entre 1 y 100.");
        }
        if (nFilas>100){
            System.out.println("Límite de envíos excedido.");
        }
    }
}
