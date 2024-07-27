import java.util.ArrayList;
import java.util.List;

public abstract class Heroe implements Prototype {
    private String nombre;
    private String clase;
    private List<Habilidad> habilidades;
    private int nivel;
    private int puntosExperiencia;
    private AspectoVisual aspectoVisual;

    public Heroe(String nombre, String clase, List<Habilidad> habilidades, int nivel, int puntosExperiencia, AspectoVisual aspectoVisual) {
        this.nombre = nombre;
        this.clase = clase;
        this.habilidades = new ArrayList<>(habilidades);
        this.nivel = nivel;
        this.puntosExperiencia = puntosExperiencia;
        this.aspectoVisual = aspectoVisual;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAspectoVisual(AspectoVisual aspectoVisual){
        this.aspectoVisual = aspectoVisual;
    }

    public AspectoVisual getAspectoVisual(){
        return aspectoVisual;
    }

    public String getClase() {
        return clase;
    }

    public List<Habilidad> getHabilidades() {
        return habilidades;
    }

    public int getNivel() {
        return nivel;
    }

    public int getPuntosExperiencia() {
        return puntosExperiencia;
    }

    @Override
    public abstract Heroe clone();

    @Override
    public String toString() {
        return "Heroe {" +
                "nombre= '" + nombre + '\'' +
                ", clase= '" + clase + '\'' +
                ", habilidades= " + habilidades +
                ", nivel= " + nivel +
                ", puntosExperiencia= " + puntosExperiencia +
                ", aspecto visual= " + aspectoVisual +
                '}';
    }
}