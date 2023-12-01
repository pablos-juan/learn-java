package ejerciciosPoo.avionesDeBiberia;

import java.util.Arrays;
import java.util.Objects;
import java.util.stream.IntStream;

public class AvionesBiberia {
    private final Aeropuerto[] aeropuertos = new Aeropuerto[3];

    public void getInfo(){
        /*
        public void getInfo(){
        System.out.println("Aviones de Biberia");
        Arrays.stream(aeropuertos)
                .filter(Objects::nonNull)
                .toString();
        }
        */
        System.out.println("Aviones de Biberia");
        Arrays.stream(aeropuertos)
                .filter(Objects::nonNull)
                .forEach(aeropuerto -> System.out.println(aeropuerto.getInfo()));
    }

    public void agregarAeropuerto(Aeropuerto name){

        for (int i=0; i<aeropuertos.length; i++){
            if (aeropuertos[i] == null) {
                aeropuertos[i] = name;
                return;
            }
        }

    }

    public void mostrarAeropuertos(){
        System.out.println("Aeropuertos: ");
        for (Aeropuerto aeropuerto: aeropuertos){
            if (aeropuerto != null){
                System.out.println(aeropuerto.getNombre());
            }
        }
    }

    public String findPassenger(String name){
        System.out.println("Buscando a " + name);
        for (Aeropuerto aeropuerto: aeropuertos){
            return aeropuerto.buscarPasajero(name);
        }
        return "el pasajero no está en ningun aeropuerto :c";
    }

}
