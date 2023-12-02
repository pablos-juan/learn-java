package projects.alfombras;

public class Mansion {
    private final Habitacion[] arrayHabitaciones = new Habitacion[10];

    public boolean agregarHabitacion(Habitacion nombreHabitacion){
        for (int i=0; i<arrayHabitaciones.length; i++){
            if (arrayHabitaciones[i] == null){
                arrayHabitaciones[i] = nombreHabitacion;
                return true;
            }
        }
        return false;
    }

    public double precioMansion(){
        double total=0;
        for (Habitacion habitacion: arrayHabitaciones){
            if (habitacion != null){
                total = habitacion.precioTotal();
            }
        }
        return total;
    }

    public double precioCuadradas(){
        double total=0;
        for (Habitacion habitacion: arrayHabitaciones){
            if (habitacion != null){
                total += habitacion.precioCuadradas();
            }
        }
        return total;
    }
}
