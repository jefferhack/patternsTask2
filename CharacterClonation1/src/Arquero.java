import java.util.List;

public class Arquero extends Heroe{
    public Arquero(String nombre, List<Habilidad> habilidades, int nivel, int puntosExperiencia, AspectoVisual aspectoVisual) {
        super(nombre, "Arquero", habilidades, nivel, puntosExperiencia, aspectoVisual);
    }

    @Override
    public Arquero clone(){
        return new Arquero(getNombre(), getHabilidades(), getNivel(), getPuntosExperiencia(), getAspectoVisual());
    }
}