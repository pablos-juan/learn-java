package projects.avionesDeBiberia;

public abstract class Avion {
    private final String nombre;
    private final String matricula;
    private final int autonomiaVuelo;
    private Pasajero[] passengers;

    public Avion(String nombre, String matricula, int autonomiaVuelo) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.autonomiaVuelo = autonomiaVuelo;
    }

    public String getInfo() {
        return "\n~nombre: " + getNombre() +
                "\n~matricula: " + getMatricula() +
                "\n~autonomía de vuelo: " + getAutonomiaVuelo() +
                "\n --------------------------";
    }

    public String getNombre() {
        return nombre;
    }

    public String getMatricula() {
        return matricula;
    }

    public int getAutonomiaVuelo() {
        return autonomiaVuelo;
    }


    public boolean noHayPasajeros(){
        return passengers[0] == null;
    }

    public void mostrarPasajeros(){
        if (noHayPasajeros()){
            System.out.println("no hay pasajeros");
        } else {
            System.out.println("~ PASAJEROS: ");
            for (Pasajero pasajero : passengers) {
                if (pasajero != null) {
                    System.out.println(pasajero.getInfo());
                }
            }
        }
    }

    public String buscarPasajero(String nombrePasajero){
        if (noHayPasajeros()){
            System.out.println("no hay pasajeros");
        }

        for (Pasajero pasajero: passengers) {
            if (pasajero.getNombre().equals(nombrePasajero)) {
                return "~BUSQUEDA: \n" +
                        pasajero.getInfo() + "\n" +
                        getInfo();
            }
        }
        return "no se encontró el pasajero :c";
    }

}
