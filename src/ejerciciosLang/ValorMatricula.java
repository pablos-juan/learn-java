/*
Una institución educativa estableció un programa para estimular a los alumnos con buen rendimiento académico y que consiste en lo siguiente:
    - Si el promedio es de 9.5 o más y el alumno es de tecnología, entonces este podrá cursar 55 créditos y se le hará un 25% de descuento.
    - Si el promedio es mayor o igual a 9 pero menor que 9.5 y el alumno es de tecnología, entonces este podrá cursar 50 créditos y se le hará un 10% de descuento.
    - Si el promedio es mayor que 7 y menor que 9 y el alumno es de tecnología, este podrá cursar 50 créditos y no tendrá ningún descuento.
    - Si el promedio es de 7 o menor, el número de materias reprobadas es de 0 a 3 y el alumno es de tecnología, entonces podrá cursar 45 créditos y no tendrá descuento.
    - Si el promedio es de 7 o menor, el número de materias reprobadas es de 4 o más y el alumno es de tecnología, entonces podrá cursar 40 créditos y no tendrá ningún descuento.
    - Si el promedio es mayor o igual a 9.5 y el alumno es de profesional, entonces podrá cursar 55 créditos y se le hará un 20% de descuento.
    - Si el promedio es menor de 9.5 y el alumno es de profesional, entonces podrá cursar 55 créditos y no tendrá descuento.
Obtener el total que tendrá que pagar un alumno si el valor de la matrícula para alumnos de profesional es de U$3000 por cada cinco créditos y para alumnos de tecnología es de U$1800 por cada cinco créditos.
*/

/*
@author Juan Pablo Castaño Sanchez
*/

package ejerciciosLang;
import java.util.Scanner;

public class ValorMatricula {
    public static void main(String[] args) {

        //Entrada de datos.
        Scanner sc = new Scanner(System.in);
        //Definir variables.
        int estudiante, perdidas, vrMatricula, vrPagar;
        double promedio;

        do {
            //Mostrar menu para definir que tipo de estudiante realiza la solicitud.
            System.out.println("Elija el tipo de estudiante: ");
            System.out.println("1. Tecnología. ");
            System.out.println("2. Profesional. ");
            System.out.print("Opcion: ");
            estudiante = sc.nextInt();

            //Verificar si la opcion es incorrecta y mostrar un mensaje.
            if (estudiante<1 || estudiante>2) {
                System.out.println("Opción incorrecta. Por favor, elija 1 para Tecnología o 2 para Profesional.");
            }

         //Ciclo para mostrar de nuevo menú de opciones.
        }while (estudiante<1 || estudiante>2);


        double descuento=0.0;
        int creditos=0;
        int tCreditos;

        //Definir los casos si el estudiante es de Tecnología o es Profesional.
        switch (estudiante) {

            //En caso de estudiante Tecnología.
            case 1:

                //Menú para agregar el promedio.
                System.out.println("~TECNOLOGIA~");
                System.out.println("Digite el promedio: ");
                promedio = sc.nextFloat();

                //Cicclo para encontrar el numero de créditos máximos y el descuento si lo hay.
                if (promedio >= 9.5) {
                    descuento=0.25;
                    tCreditos=55;
                    System.out.println("Sus créditos son: " + tCreditos);

                    //Ciclo cuando se exede el numero de creditos.
                    do {
                        System.out.print("Digite el número de créditos que desa inscribir: ");
                        creditos=sc.nextInt();

                        if (creditos<=55) {
                        } else {
                            System.out.println("Numero de créditos exedido. Sus creditos son: " + tCreditos);
                        }

                    } while (creditos>55);


                } else if (promedio >= 9) {
                    descuento = 0.1;
                    tCreditos=50;
                    System.out.println("Sus créditos son: " + tCreditos);

                    do {
                        System.out.print("Digite el número de créditos que desa inscribir: ");
                        creditos=sc.nextInt();

                        if (creditos<=50) {
                        } else {
                            System.out.println("Numero de créditos exedido. Sus creditos son: " + tCreditos);
                        }

                    } while (creditos>50);

                } else if (promedio > 7) {
                    tCreditos=50;
                    System.out.println("Sus créditos son: " + tCreditos);

                    do {
                        System.out.print("Digite el número de créditos que desa inscribir: ");
                        creditos=sc.nextInt();

                        if (creditos<=50) {
                        } else {
                            System.out.println("Numero de créditos exedido. Sus creditos son: " + tCreditos);
                        }

                    } while (creditos>50);

                } else {
                    System.out.println("Por favor digite el número de materias perdidas.");
                    perdidas = sc.nextInt();

                    if (perdidas >= 4) {
                        tCreditos=40;
                        System.out.println("Sus créditos son: " + tCreditos);

                        do {
                            System.out.print("Digite el número de créditos que desa inscribir: ");
                            creditos=sc.nextInt();

                            if (creditos<=40) {
                            } else {
                                System.out.println("Numero de créditos exedido. Sus creditos son: " + tCreditos);
                            }

                        } while (creditos>40);

                    } else {
                        tCreditos=45;
                        System.out.println("Sus créditos son: " + tCreditos);

                        do {
                            System.out.print("Digite el número de créditos que desa inscribir: ");
                            creditos=sc.nextInt();

                            if (creditos<=45) {
                            } else {
                                System.out.println("Numero de créditos exedido. Sus creditos son: " + tCreditos);
                            }

                        } while (creditos>45);

                    }
                }

                vrMatricula= (int) (creditos*360);
                vrPagar= (int) (vrMatricula-descuento);
                System.out.println("Numero de créditos: " + creditos);
                System.out.println("El valor de su matrícula es: $" + vrMatricula);
                System.out.println("Descuento: " + (descuento*100) + "%");
                System.out.println("Valor total: $" + vrPagar);
                break;

            //En caso de estudiante Profesional.
            case 2:

                System.out.println("~PROFESIONAL~");
                System.out.println("Digite el promedio: ");
                promedio = sc.nextFloat();

                if (promedio >= 9.5) {
                    descuento=0.2;
                    tCreditos=55;
                    System.out.println("Sus créditos son: " + tCreditos);

                    do {
                        System.out.print("Digite el número de créditos que desa inscribir: ");
                        creditos=sc.nextInt();

                        if (creditos<=55) {
                        } else {
                            System.out.println("Numero de créditos exedido. Sus creditos son: " + tCreditos);
                        }

                    } while (creditos>55);

                } else {
                    tCreditos=55;
                    System.out.println("Sus créditos son: " + tCreditos);

                    do {
                        System.out.print("Digite el número de créditos que desa inscribir: ");
                        creditos=sc.nextInt();

                        if (creditos<=55) {
                        } else {
                            System.out.println("Numero de créditos exedido. Sus creditos son: " + tCreditos);
                        }

                    } while (creditos>55);

                }

                vrMatricula= (int) (creditos*600);
                vrPagar= (int) (vrMatricula-descuento);
                System.out.println("Numero de créditos: " + creditos);
                System.out.println("El valor de su matrícula es: $" + vrMatricula);
                System.out.println("Descuento: " + (descuento*100) + "%");
                System.out.println("Valor total: $" + vrPagar);
                break;
        }
    }
}
