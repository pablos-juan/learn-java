package ejerciciosPoo.avionesDeBiberia;
//@Author: JUAN PABLO CASTAÑO SANCHEZ. 20231213945.

public class Test {
    public static void main(String[] args) {
        System.out.println("AGREGAR PASAJERO: ");
        //instanciar 3 pasajeros
        Pasajero pasajero = new Pasajero("pablo", 121291029, 18);
        Pasajero pasajero1 = new Pasajero("samuel", 9218981, 15);
        Pasajero pasajero2 = new Pasajero("adriana", 898321029, 19);
        String infoPass = pasajero.getInfo(); //metodo para obtener informacion
        System.out.println(infoPass); //mostrar informacion del pasajero

        System.out.println("AGREGAR AVION: ");
        AvionPasajeros avionPasajeros = new AvionPasajeros(12, "avion_1", "A111", 12);
        //agregar pasajeros:
        avionPasajeros.agregarPasajero(pasajero);
        avionPasajeros.agregarPasajero(pasajero1);
        avionPasajeros.agregarPasajero(pasajero2);
        //listar pasajeros
        avionPasajeros.mostrarPasajeros();
        //buscar un pasajero
        String search = avionPasajeros.buscarPasajero("pablo");
        System.out.println(search);

        //agregar avioneta
        System.out.println("AVIONETA: ");
        Avioneta avioneta = new Avioneta(14, "avioneta_1", "A112", 4);
        String info1 = avioneta.getInfo();
        System.out.println(info1);
        //agregar pasajero a la avioneta
        avioneta.agregarPasajero(pasajero2);
        avioneta.mostrarPasajeros();
        //buscar pasajero en la avioneta
        System.out.println("busqueda: ");
        String search1 = avioneta.buscarPasajero("ADRIANa");
        System.out.println(search1);

        //agregar avion de carga
        System.out.println("AVION DE CARGA: ");
        AvionCarga avionCarga = new AvionCarga(122, "avion_carga_1", "a113", 19);
        String info3 = avionCarga.getInfo();
        System.out.println(info3);

        //instanciar aeropuerto
        System.out.println("AEROPUERTO");
        Aeropuerto aeropuertoMilitar = new AeropuertoMilitar("clave", "aeropuerto militar", "palmira");
        //mostrar informacion
        String info2 = aeropuertoMilitar.getInfo();
        System.out.println(info2);
        //agregar aviones
        aeropuertoMilitar.agregarAvion(avioneta);
        aeropuertoMilitar.agregarAvion(avionPasajeros);
        //mostrar aviones
        String mostrar = aeropuertoMilitar.mostrarAviones();
        System.out.println(mostrar );
        //mostrar pasajeros
        aeropuertoMilitar.mostrarAviones();
        //buscar pasajero
        String serach2 = aeropuertoMilitar.buscarPasajero("gg");
        System.out.println(serach2);

        //agregar aeropuerto
        AvionesBiberia principal = new AvionesBiberia();
        principal.agregarAeropuerto(aeropuertoMilitar);
        principal.mostrarAeropuertos();
        //buscar pasajero
        String find = principal.findPassenger("pablo");
        System.out.println(find);
    }
}
