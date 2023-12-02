package projects.bicicletas;

public class Test {
    public static void main(String[] args) {
        Bicicleta miBicicleta = new Bicicleta(12, 2, 5);
        Bicicleta tuBicicleta = new Bicicleta();

        System.out.println("frenar: " + miBicicleta.acelelar());
        System.out.println("cambiar piñon: " + miBicicleta.cambiarPinion());
        System.out.println("frenar: " + miBicicleta.frenar());

        tuBicicleta.cambiarPinion(9);
        System.out.println(tuBicicleta.getPinionActual());
        tuBicicleta.acelelar();
        System.out.println(tuBicicleta.getVelocidadActual());

        BicicletaMontania trek = new BicicletaMontania(3,23, 1, 8);
        System.out.println(trek.getPinionActual()); 
        System.out.println(trek.acelelar());

        BicicletaTamdem tamdem = new BicicletaTamdem(2, 10, 1, 5);
        System.out.println(tamdem.acelelar());

        //polimorfismo
        Bicicleta[] bicis = {new Bicicleta(12, 3, 7),
                            new BicicletaMontania(3, 45, 12, 5),
                            new BicicletaTamdem(5, 11, 3, 4)};
        //ligadura dinámica 
        for(int i=0; i<bicis.length; i++){
            bicis[i].acelelar();
            bicis[i].mostrarDatos();
        }

    }
}
