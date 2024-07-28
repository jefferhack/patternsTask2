// Implementación concreta de la habitación básica
public class HabitacionBasica implements Habitacion {
    @Override
    public String getDescripcion() {
        return "Habitación básica";
    }

    @Override
    public double getCosto() {
        return 100.00;
    }

     @Override
    public String getpisoHabitacion() {
        return "Piso 10";
    }

 @Override
    public double getCategoria() {
        return 1.00;
    }

    @Override
    public String getpisoHabitaciona() {
        return "";
    }

}