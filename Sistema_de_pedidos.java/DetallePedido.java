package sistemapedidos;

public class DetallePedido {
    private Producto producto;
    private int cantidad;

    public DetallePedido(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public double calcularSubtotal() {
        return producto.getPrecio() * cantidad;
    }

    @Override
    public String toString() {
        return cantidad + "x " + producto.getNombre() + " - Subtotal: $" + calcularSubtotal();
    }
}