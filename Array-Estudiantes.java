class Estudiante {
    String nombre;
    int edad;
    double notaFinal;

    // Constructor: sirve para "crear" al estudiante con sus datos
    public Estudiante(String nombre, int edad, double notaFinal) {
        this.nombre = nombre;
        this.edad = edad;
        this.notaFinal = notaFinal;
    }

    // Método para mostrar los datos del estudiante
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + " | Edad: " + edad + " | Nota: " + notaFinal);
    }
}