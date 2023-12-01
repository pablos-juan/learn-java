package poo;

public class BicicletaMontania extends Bicicleta{
    private int suspension;

    public BicicletaMontania(int suspension, int velocidadActual, 
                            int platoActual, int pinionActual){
        //'super' para acceder a los atributos heredados
        super(velocidadActual, platoActual, pinionActual);
    }

    //metodo propio
    public int cambiarSuspension(int suspension){
        return this.suspension = suspension;
    }

    public int acelelar(){
        return getVelocidadActual()*3;
    }


}
