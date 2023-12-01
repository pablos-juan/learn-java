package ejerciciosPoo.GarageDeVehiculos;

public interface IGarage {
    double calcularIngresos(); //suma de los ingresos mensuales de todos los vehiculos en el garage
    int calcularOcupacionDeVehiculo(Vehiculo vehiculo); //cuantos vehículos hay del tipo indicado
}
