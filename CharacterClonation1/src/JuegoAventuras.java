import java.util.ArrayList;
import java.util.List;

public class JuegoAventuras {
        public static void main(String[] args) {
        
        List<Habilidad> habilidadesGuerrero = new ArrayList<>();

        //Habilidades Guerrero
        habilidadesGuerrero.add(new Habilidad("Ataque Fuerte"));
        habilidadesGuerrero.add(new Habilidad("Defensa Rápida"));

        //Aspecto visual
        AspectoVisual aspectoVisual = new AspectoVisual();
        aspectoVisual.SetColorCabello("Azul");
        aspectoVisual.SetColorOjos("Negros");
        aspectoVisual.SetNumeroBrazos(2);

        Guerrero guerreroOriginal = new Guerrero("Thor", habilidadesGuerrero, 5, 1000, aspectoVisual);

        // Clonar el guerrero original
        Guerrero clonGuerrero = guerreroOriginal.clone();
        
        // Personalizar datos del clon
        clonGuerrero.setNombre("Clon de Thor");

        AspectoVisual aspectoVisualClon = new AspectoVisual();
        aspectoVisualClon.SetColorCabello("Verdes");
        aspectoVisualClon.SetColorOjos("Morados");
        aspectoVisualClon.SetNumeroBrazos(2);

        clonGuerrero.setAspectoVisual(aspectoVisualClon);
        clonGuerrero.getHabilidades().add(new Habilidad("Habilidad Especial"));

        System.out.println("Guerrero Original: " + guerreroOriginal);
        System.out.println("Clon Guerrero: " + clonGuerrero);
    }
}