package projects.avionesDeBiberia;

public class AeropuertoMilitar extends Aeropuerto{
    private final String nombreClave;
    private final Avion[] aviones = new Avion[15];

    public AeropuertoMilitar(String nombreClave, String nombre, String ciudad) {
        super(nombre, ciudad);
        this.nombreClave = nombreClave;
    }

    public String getNombreClave() {
        return nombreClave;
    }

    @Override
    public String getInfo(){
        return " Aeropuerto militar: " +
                "\n~nombre: " + getNombre() +
                "\n~ciudad: " + getCiudad() +
                "\n~nombre en clave: " + getNombreClave() +
                "\n --------------------------";
    }

    @Override
    public boolean agregarAvion(Avion avion) {
        for (int i=0; i<aviones.length; i++){
            if (aviones[i] == null){
                aviones[i] = avion;
                return true;
            }
        }
        return false;    }

    @Override
    public String mostrarAviones() {
        String cadena = "";
        for (Avion avion: aviones){
            if(avion != null){
                cadena += avion.getNombre() + "\n";
            }
        }
        if (cadena.isEmpty()) return "no hay aviones :c"; //isEmpty devuelve true si la longitud de la cadena es 0
        return "Aviones: \n" + cadena;    }

    @Override
    public void mostrarPasajeros() {
        for (Avion avion: aviones){
            if (avion instanceof AvionPasajeros || avion instanceof Avioneta){
                avion.mostrarPasajeros();
            }
        }
    }

    @Override
    public String buscarPasajero(String name) {
        for (Avion avion: aviones){
            if (avion instanceof AvionPasajeros || avion instanceof Avioneta){
                if (avion.buscarPasajero(name) != null){
                    return avion.buscarPasajero(name) + "\n" + getInfo();
                }
            }
        }
        return "no se encontró el pasajero";
    }
}
