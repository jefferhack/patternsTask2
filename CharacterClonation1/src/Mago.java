import java.util.List;

public class Mago extends Heroe {
    public Mago(String nombre, List<Habilidad> habilidades, int nivel, int puntosExperiencia, AspectoVisual aspectoVisual) {
        super(nombre, "Mago", habilidades, nivel, puntosExperiencia, aspectoVisual);
    }

    @Override
    public Mago clone(){
        return new Mago(getNombre(), getHabilidades(), getNivel(), getPuntosExperiencia(), getAspectoVisual());
    }
}