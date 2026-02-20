import java.util.ArrayList;
import java.util.List;

//Equipo de Baloncesto
class JugadorBaloncesto {
    private String nombre;

    public JugadorBaloncesto(String nombre) {
        this.nombre = nombre;
    }
}

class EquipoBaloncesto {
    private String nombreEquipo;
    private List<JugadorBaloncesto> plantilla;

    public EquipoBaloncesto(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
        this.plantilla = new ArrayList<>();
    }

    // Agregación: Recibimos al jugador ya instanciado
    public void ficharJugador(JugadorBaloncesto jugador) {
        plantilla.add(jugador);
    }
}