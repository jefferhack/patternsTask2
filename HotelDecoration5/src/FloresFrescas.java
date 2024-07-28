// Decorador concreto para flores frescas
public class FloresFrescas extends HabitacionDecorator {
    public FloresFrescas(Habitacion habitacion) {
        super(habitacion);
    }

    @Override
    public String getDescripcion() {
        return habitacion.getDescripcion() + ", Flores frescas";
    }

    @Override
    public double getCosto() {
        return habitacion.getCosto() + 20.00;
    }

    @Override
    public String getpisoHabitacion() {
        return "";
    }
}