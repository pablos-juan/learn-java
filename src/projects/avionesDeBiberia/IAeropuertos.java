package projects.avionesDeBiberia;

public interface IAeropuertos {
    String getInfo();
    boolean agregarAvion(Avion avion);
    String mostrarAviones();
    void mostrarPasajeros();
    String buscarPasajero(String name);
}
