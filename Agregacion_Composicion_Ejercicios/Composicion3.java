import java.util.ArrayList;
import java.util.List;

//Una Cuenta Bancaria y su Historial de Transacciones
class Transaccion {
    private double monto;

    public Transaccion(double monto) {
        this.monto = monto;
    }
}

class CuentaBancaria {
    private String numeroCuenta;
    private List<Transaccion> historial; // Composición

    public CuentaBancaria(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
        // Composición: El historial nace junto con la cuenta
        this.historial = new ArrayList<>(); 
    }

    public void registrarMovimiento(double cantidad) {
        // La cuenta crea la transacción internamente
        historial.add(new Transaccion(cantidad));
    }
}