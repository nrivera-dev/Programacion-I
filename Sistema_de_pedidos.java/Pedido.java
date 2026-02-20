package sistemapedidos;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {
    private int numeroPedido;
    private Date fecha;
    private List<DetallePedido> detalles;

    public Pedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
        this.fecha = new Date();
        this.detalles = new ArrayList<>();
    }

    public void agregarProducto(Producto producto, int cantidad) {
        DetallePedido nuevoDetalle = new DetallePedido(producto, cantidad);
        detalles.add(nuevoDetalle);
    }

    public double calcularTotal() {
        double total = 0;
        for (DetallePedido detalle : detalles) {
            total += detalle.calcularSubtotal();
        }
        return total;
    }

    public void mostrarFactura() {
        System.out.println("=================================");
        System.out.println("PEDIDO N°: " + numeroPedido);
        System.out.println("FECHA: " + fecha);
        System.out.println("---------------------------------");
        for (DetallePedido detalle : detalles) {
            System.out.println(detalle.toString());
        }
        System.out.println("---------------------------------");
        System.out.println("TOTAL A PAGAR: $" + calcularTotal());
        System.out.println("=================================\n");
    }
}