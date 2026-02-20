//MainHerencia

package herencia;

public class MainHerencia {
    public static void main(String[] args) {
        System.out.println("--- PRUEBA EJERCICIO 1: VEHÍCULOS ---");
        // Instanciamos la clase hija directamente
        Motocicleta miMoto = new Motocicleta("Honda", "CB 125F", "125cc");
        // Llama al método sobrescrito que junta los datos del padre y del hijo
        miMoto.mostrarDetalles(); 

        System.out.println("\n--- PRUEBA EJERCICIO 2: EMPLEADOS ---");
        Empleado empleadoNormal = new Empleado("Carlos", 1500.0);
        empleadoNormal.trabajar();

        DesarrolladorJava dev = new DesarrolladorJava("Nicolas", 4500.0, "B2");
        dev.trabajar(); // Muestra el comportamiento específico del desarrollador
    }
}