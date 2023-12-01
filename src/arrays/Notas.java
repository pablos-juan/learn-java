package arrays;
import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] notas = new double[10];
        int aprobados = 0, reprobados = 0;
        double media, acum = 0;


        System.out.println("Ingrese las notas: ");
        for (int i = 0; i < notas.length; i++) {
            do {
                System.out.print("Nota " + (i+1) + ": ");
                notas[i]=sc.nextDouble();
                if (notas[i]<0 || notas[i]>5) {
                    System.out.println("Error. Ingrese un valor entre 0 y 5.");
                }
            }while (notas[i]<0 || notas[i]>5);
            acum += notas[i];

            if (notas[i] >= 3.0) {
                aprobados++;
            } else {
                reprobados++;
            }
        }

        double notaMayor = notas[0];
        for (int i = 1; i < notas.length; i++) {
            if (notaMayor < notas[i]) {
                notaMayor = notas[i];
            }
        }
        System.out.println("La nota mayor " + notaMayor);

        double notaMenor = notas[0];
        for (int i = 1; i < notas.length; i++) {
            if (notaMenor > notas[i]) {
                notaMenor = notas[i];
            }
        }
        System.out.println("La nota menor: " + notaMenor);

        media = acum / notas.length;
        System.out.println("Nota media es: " + media);

        System.out.println("Estudiantes aprobados: " + aprobados);
        System.out.println("Estudiantes reprobados: " + reprobados);

    }
}
