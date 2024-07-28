
// Decorador concreto para chocolate gourmet
public class ChocolateGourmet extends HabitacionDecorator {
    public ChocolateGourmet(Habitacion habitacion) {
        super(habitacion);
    }

    @Override
    public String getDescripcion() {
        return habitacion.getDescripcion() + ", Chocolate gourmet";
    }

    @Override
    public double getCosto() {
        return habitacion.getCosto() + 15.00;
    }

    @Override
    public String getpisoHabitacion() {
        return "";
    }
}