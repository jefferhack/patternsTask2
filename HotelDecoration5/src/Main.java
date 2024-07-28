public class Main {
    public static void main(String[] args) {
        System.out.println("Inicio de la Aplicación: Decoración de Habitaciones en un Hotel");

        HabitacionBasica H3 = new HabitacionBasica();
        System.out.println(H3.getDescripcion());
        System.out.println(H3.getCosto());
        System.out.println(H3.getpisoHabitacion());
        System.out.println(H3.getCategoria());

        FloresFrescas F1 = new FloresFrescas(H3);
        System.out.println(F1.getCosto());
        System.out.println("Con flores el valor que suma es de: " + F1.getCosto());
    }
}