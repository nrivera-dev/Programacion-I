/**
 * Ejercicio 2: Clase CuentaBancaria
 * Conceptos: Visibilidad, Constructores sobrecargados y Protección de datos.
 */
public class CuentaBancaria {
    // Atributos privados: El saldo nunca debe ser modificado directamente desde fuera
    private String numeroCuenta;
    private double saldo;
    private String titular;

    // Constructor principal
    public CuentaBancaria(String numeroCuenta, String titular, double saldoInicial) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        if (saldoInicial >= 0) {
            this.saldo = saldoInicial;
        } else {
            this.saldo = 0;
            System.out.println("Aviso: Saldo inicial negativo ajustado a 0.");
        }
    }

    // Getters (Solo lectura para el número de cuenta, no queremos un setter para él)
    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    // En lugar de un setter simple para saldo, usamos métodos con lógica
    public void depositar(double monto) {
        if (monto > 0) {
            this.saldo += monto;
            System.out.println("Depósito exitoso. Nuevo saldo: " + this.saldo);
        }
    }

    public void retirar(double monto) {
        if (monto > 0 && monto <= this.saldo) {
            this.saldo -= monto;
            System.out.println("Retiro exitoso. Saldo restante: " + this.saldo);
        } else {
            System.out.println("Error: Fondos insuficientes o monto inválido.");
        }
    }
}