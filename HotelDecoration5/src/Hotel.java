// Uso del patrón
public class Hotel {
    public static void main(String[] args) {
        Habitacion habitacion = new HabitacionBasica();
        System.out.println(habitacion.getDescripcion() + " cuesta " + habitacion.getCosto());

        habitacion = new FloresFrescas(habitacion);
        System.out.println(habitacion.getDescripcion() + " cuesta " + habitacion.getCosto());

        habitacion = new ChocolateGourmet(habitacion);
        System.out.println(habitacion.getDescripcion() + " cuesta " + habitacion.getCosto());
    }
}       