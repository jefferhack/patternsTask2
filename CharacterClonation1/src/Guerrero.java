import java.util.List;

public class Guerrero extends Heroe {
    
    public Guerrero(String nombre, List<Habilidad> habilidades, int nivel, int puntosExperiencia, AspectoVisual aspectoVisual) {
        super(nombre, "Guerrero", habilidades, nivel, puntosExperiencia, aspectoVisual);
    }

    @Override
    public Guerrero clone(){
        return new Guerrero(getNombre(), getHabilidades(), getNivel(), getPuntosExperiencia(), getAspectoVisual());
    }
}