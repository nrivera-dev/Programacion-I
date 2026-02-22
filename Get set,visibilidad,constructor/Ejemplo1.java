/**
 * Ejercicio 1: Clase Producto
 * Conceptos: Visibilidad privada, Constructor y Validación en Setters.
 */
public class Producto {
    // Atributos privados para cumplir con el encapsulamiento
    private String nombre;
    private double precio;

    // Constructor: Define el estado inicial del objeto
    public Producto(String nombre, double precioInicial) {
        this.nombre = nombre;
        // Usamos el setter para asegurar que el precio inicial también sea validado
        setPrecio(precioInicial);
    }

    // Método Getter para obtener el nombre
    public String getNombre() {
        return nombre;
    }

    // Método Setter para modificar el nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Método Getter para obtener el precio
    public double getPrecio() {
        return precio;
    }

    // Método Setter con validación de visibilidad
    public void setPrecio(double nuevoPrecio) {
        if (nuevoPrecio >= 0) {
            this.precio = nuevoPrecio;
        } else {
            System.out.println("Error: El precio no puede ser negativo.");
        }
    }

    public void mostrarDetalles() {
        System.out.println("Producto: " + nombre + " | Precio: $" + precio);
    }
}