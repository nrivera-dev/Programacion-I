import java.util.ArrayList;
import java.util.List;

//Un Gimnasio y sus Miembros
class Atleta {
    private String nombre;

    public Atleta(String nombre) {
        this.nombre = nombre;
    }
}

class Gimnasio {
    private String sucursal;
    private List<Atleta> miembros;

    public Gimnasio(String sucursal) {
        this.sucursal = sucursal;
        this.miembros = new ArrayList<>();
    }

    public void inscribirMiembro(Atleta atleta) {
        miembros.add(atleta);
    }
}