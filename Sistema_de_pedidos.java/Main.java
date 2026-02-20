package sistemapedidos;

public class Main {
    public static void main(String[] args) {
        Producto laptop = new Producto("P001", "Laptop Pro", 1200.50);
        Producto raton = new Producto("P002", "Ratón Inalámbrico", 25.00);
        Producto monitor = new Producto("P003", "Monitor 24 pulgadas", 150.75);

        Pedido pedido1 = new Pedido(101);
        pedido1.agregarProducto(laptop, 1);
        pedido1.agregarProducto(raton, 2); 

        Pedido pedido2 = new Pedido(102);
        pedido2.agregarProducto(monitor, 2);
        pedido2.agregarProducto(raton, 1);

        pedido1.mostrarFactura();
        pedido2.mostrarFactura();
    }
}