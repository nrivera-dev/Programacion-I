//Vehiculo

package herencia;

public class Vehiculo {
    // Usamos 'protected' para que las clases hijas puedan acceder a estas variables
    protected String marca;
    protected String modelo;

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public void mostrarDetalles() {
        System.out.println("Vehículo: " + marca + " " + modelo);
    }
}