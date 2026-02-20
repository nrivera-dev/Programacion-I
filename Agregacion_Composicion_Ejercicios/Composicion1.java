//Una Motocicleta y su Motor
class MotorMoto {
    private String cilindraje;

    public MotorMoto(String cilindraje) {
        this.cilindraje = cilindraje;
    }
    public void arrancar() {
        System.out.println("Motor en marcha.");
    }
}

class Motocicleta {
    private String modelo;
    private MotorMoto motor; // Composición

    public Motocicleta(String modelo, String cilindraje) {
        this.modelo = modelo;
        // Composición: La motocicleta instancia su propio motor
        this.motor = new MotorMoto(cilindraje); 
    }

    public void encenderMoto() {
        motor.arrancar();
    }
}