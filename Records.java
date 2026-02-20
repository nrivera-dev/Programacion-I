// 1. Definición del Record (Equivale a una clase con constructor, getters y toString)
record Estudiante(String nombre, int edad, double notaFinal) {}

public class Main {
    public static void main(String[] args) {
        // 2. Creación del arreglo de tipo Estudiante (usando el Record)
        Estudiante[] listaEstudiantes = new Estudiante[3];

        // 3. Inicialización de los datos
        listaEstudiantes[0] = new Estudiante("Nicolas", 19, 4.8);
        listaEstudiantes[1] = new Estudiante("Valentina", 18, 4.5);
        listaEstudiantes[2] = new Estudiante("Andrés", 20, 3.9);

        System.out.println("=== LISTA DE ESTUDIANTES (Usando Java Records) ===");
        
        // 4. Recorrido del arreglo para mostrar la información
        double sumaNotas = 0;
        
        for (Estudiante est : listaEstudiantes) {
            // Nota: En los records no se usa .getNombre(), sino .nombre()
            System.out.println("Nombre: " + est.nombre() + 
                               " | Edad: " + est.edad() + 
                               " | Nota: " + est.notaFinal());
            
            sumaNotas += est.notaFinal();
        }

        // 5. Cálculo extra (Promedio) para que la tarea quede más completa
        double promedio = sumaNotas / listaEstudiantes.length;
        System.out.println("-------------------------------------------------");
        System.out.printf("Promedio general del grupo: %.2f%n", promedio);
    }
}