package projects.bicicletas;

public class Bicicleta {
    private int velocidadActual;
    private int platoActual;
    private int pinionActual;

    //constructor vacío, todos los valores int dentro de el son = 0
    public Bicicleta(){
        this.velocidadActual=0;
        this.platoActual=1;
        this.pinionActual=1;
    }

    //constructor Bicicleta
    public Bicicleta(int velocidadActual, int platoActual, int pinionActual){
        this.velocidadActual= velocidadActual;
        this.platoActual= platoActual;
        this.pinionActual= pinionActual;
    }

    //get y set, permiten acceder a variables privadas
    public int getVelocidadActual() {
        return velocidadActual;
    }

    public void setVelocidadActual(int velocidadActual) {
        this.velocidadActual = velocidadActual;
    }

    public int getPlatoActual(){
        return platoActual;
    }

    public void setPlatoActual(int platoActual){
        this.platoActual = platoActual;
    }

    public int getPinionActual(){
        return pinionActual;
    }

    public void setPinionActual(int pinionActual){
        this.pinionActual = pinionActual;
    }

    //métodos
    public int acelelar(){
        return velocidadActual*=2;
    }

    public int frenar(){
        return velocidadActual/=2;
    }

    //metodo con argumentos
    public int cambiarPlato(int plato){
        return platoActual = plato;
    }

    public int cambiarPlato(){ //método sobrecargado
        return platoActual = 1;
    }

    //método con argumentos
    public int cambiarPinion(int pinion){
        return pinionActual = pinion; 
    }

    public int cambiarPinion(){ //método sobrecargado
        return pinionActual = 1;
    }

    public void mostrarDatos(){
        System.out.println("velocidad: " + velocidadActual + " plato: " + platoActual +
                            " piñon: " + pinionActual);
    }
}

