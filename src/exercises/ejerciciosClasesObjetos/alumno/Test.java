package exercises.ejerciciosClasesObjetos.alumno;

public class Test {
    public static void main(String[] args) {
        Alumno newAlumno = new Alumno("samuel");

        //poner una nota en una posicion del arreglo
        newAlumno.ponerNota(1, 6.7);
        newAlumno.ponerNota(3, 4.9);
        newAlumno.ponerNota(2, 8.2);
        newAlumno.mostrarNotas();
        System.out.println();
        
        //mostrar el número de notas 
        System.out.println("número de notas: " + newAlumno.numeroNotas());

        //mostrar nota máxima
        System.out.println("nota máxima: " + newAlumno.notaMaxima());

        //quitar nota
        System.out.println("nota eliminada: " + newAlumno.quitarNota(3));

        //método get 
        System.out.println("nota en la posicion 3: " + newAlumno.getNota(3));
        newAlumno.mostrarNotas();
    }
}
