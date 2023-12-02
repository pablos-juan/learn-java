package projects.bicicletas;

public class BicicletaTamdem extends Bicicleta {
    private int numeroAsientos;

    public BicicletaTamdem(int numeroAsientos, int velocidadActual, 
                            int platoActual, int pinionActual){
        super(velocidadActual, platoActual, pinionActual);
        this.numeroAsientos= numeroAsientos;
    }

    public int acelelar(){
        return super.acelelar(); //usar el método de la clase padre
    }

    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.println("asientos: " + numeroAsientos);
    }
}
