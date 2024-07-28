// Decorador abstracto
public abstract class HabitacionDecorator implements Habitacion {
    protected Habitacion habitacion;

    public HabitacionDecorator(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

    @Override
    public String getDescripcion() {
        return habitacion.getDescripcion();
    }

    @Override
    public double getCosto() {
        return habitacion.getCosto();
    }

    @Override
    public double getCategoria() {
        return habitacion.getCategoria();
    }

 @Override
    public String getpisoHabitaciona() {
        return habitacion.getpisoHabitacion();
    }

}
