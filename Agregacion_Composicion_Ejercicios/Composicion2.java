import java.util.ArrayList;
import java.util.List;

//Una Universidad y sus Facultades
class Facultad {
    private String especialidad;

    public Facultad(String especialidad) {
        this.especialidad = especialidad;
    }
}

class Universidad {
    private String nombre;
    private List<Facultad> facultades; // Composición

    public Universidad(String nombre) {
        this.nombre = nombre;
        this.facultades = new ArrayList<>();
        
        // Composición: La universidad crea sus facultades al nacer
        this.facultades.add(new Facultad("Ingeniería de Software"));
        this.facultades.add(new Facultad("Ciencias Básicas"));
    }
}