package ejerciciosClasesObjetos.cafeteria;

public class Caferetia {
    private int capacidadMaxima;
    private int cantidadActual;

    public Caferetia(){
        this.capacidadMaxima=1000;
        this.cantidadActual=0;
    }

    public Caferetia(int capacidadMaxima){
        this.capacidadMaxima=capacidadMaxima;
        cantidadActual=capacidadMaxima;
    }

    public Caferetia(int capacidadMaxima, int cantidadActual){
        this.capacidadMaxima=capacidadMaxima;
        if (cantidadActual>capacidadMaxima){
            this.cantidadActual=capacidadMaxima;
        }
        this.cantidadActual=cantidadActual;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual){
        this.cantidadActual=cantidadActual;
        if (this.cantidadActual>capacidadMaxima){
            cantidadActual=capacidadMaxima;
        }
    }

    public void llenarCafetera(){
        cantidadActual=capacidadMaxima;
        System.out.println("Cafetería llena");
    }

    public void servirTaza(int taza){
        if (taza < cantidadActual){
            cantidadActual-=taza;
            System.out.println("Taza de " + taza);
        } else {
            System.out.println("No alcanza. Taza de: " + cantidadActual);
        }
    }

    public void vaciarCafeteria(){
        cantidadActual=0;
        System.out.println("Cafetería vacía.");
    }

    public void agregarCafe(int cafe){
        cantidadActual+=cafe;
        if (cantidadActual>capacidadMaxima){
            cantidadActual=capacidadMaxima;
        }
    }

}
