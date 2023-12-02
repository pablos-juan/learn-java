package exercises.ejerciciosClasesObjetos.hora;

public class Test {
    public static void main(String[] args) {
        Hora newHora = new Hora(21, 18, 9);
        //mostrar los valores del constructor 
        newHora.print();
        //cambiar la hora
        newHora.leer();
        //mostrar segundos desde la hora 
        System.out.println(newHora.aSegundos());
        //cambiar hora en funcion de los segundos
        newHora.deSegundos();
        newHora.print();
        //segundos desde una hora a otra
        Hora otHora = new Hora(12, 2, 44);
        System.out.println(newHora.segundosDesde(otHora)); //mostrar hora
        //agregar un segundo
        newHora.siguiente();
        newHora.anterior();
        //iguales, mayor y menor
        System.out.println(newHora.igualQue(otHora));
        System.out.println(newHora.mayorQue(otHora));
        System.out.println(newHora.menorQue(otHora));
    }
}
