package projects.avionesDeBiberia;

public class AvionPasajeros extends Avion{
    private final int numPasajeros;
    private final Pasajero[] pasajeros;

    public AvionPasajeros(int numPasajeros, String nombre, String matricula, int autonomiaVuelo) {
        super(nombre, matricula, autonomiaVuelo);
        this.numPasajeros = numPasajeros;
        this.pasajeros = new Pasajero[numPasajeros];
    }

    public int getNumPasajeros() {
        return numPasajeros;
    }

    @Override
    public String getInfo(){
        return " Avion de pasajeros: " +
                "\n~nombre: " + getNombre() +
                "\n~matricula: " + getMatricula() +
                "\n~autonomía de vuelo: " + getAutonomiaVuelo() +
                "\n~numero de pasajeros: " + getNumPasajeros() +
                "\n --------------------------";
    }

    public void agregarPasajero(Pasajero pasajero){
        for (int i=0; i<pasajeros.length; i++){
            if (pasajeros[i] == null){ //recorrer el arreglo en busca de un campo vacío para agregar un pasajero
                pasajeros[i] = pasajero;
                //pasajero.setInfo(getInfo());
                System.out.println("el pasajero " + pasajero.getNombre() + " fué agregado al avión!");
                return;
            }
        }
        System.out.println("No es posible añadir pasajeros. Avion de pasajeros lleno.");
    }

    @Override
    public void mostrarPasajeros(){
        if (pasajeros[0] != null){
            System.out.println("\tPASAJEROS: AVION DE PASAJEROS");
            for (Pasajero pasajero: pasajeros){
                if (pasajero != null){
                    System.out.println(pasajero.getInfo());
                }
            }
        } else {
            System.out.println("no hay pasajeros");
        }
    }

    @Override
    public String buscarPasajero(String nombrePasajero){
        for (Pasajero pasajero : pasajeros) {
            if (pasajero != null && pasajero.getNombre().equals(nombrePasajero.toLowerCase())) {
                return pasajero.getInfo() + "\n" + getInfo();
            }
        }
        return null;
    }
}
