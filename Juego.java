import java.util.Scanner;

public class Main { // Si tu archivo se llama Triqui.java, cambia "Main" por "Triqui"

    public static void main(String[] args) {
        // 1. Inicializar variables
        char[][] tablero = new char[3][3];
        inicializarTablero(tablero);
        
        Scanner scanner = new Scanner(System.in);
        char jugadorActual = 'X';
        boolean juegoTerminado = false;
        int jugadas = 0;

        System.out.println("--- TRIQUI EN JAVA ---");
        System.out.println("Instrucciones: Ingresa fila (0-2) y columna (0-2). Ej: 1 1 para el centro.");

        // 2. Ciclo del juego
        while (!juegoTerminado) {
            imprimirTablero(tablero);
            
            System.out.println("Turno del jugador " + jugadorActual);
            int fila = -1;
            int columna = -1;

            // Validación de entrada para evitar errores si meten letras
            try {
                System.out.print("Ingresa fila y columna: ");
                fila = scanner.nextInt();
                columna = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("¡Error! Debes ingresar solo números.");
                scanner.nextLine(); // Limpiar el buffer
                continue; // Reiniciar el ciclo
            }

            // 3. Validar movimiento
            if (fila >= 0 && fila < 3 && columna >= 0 && columna < 3 && tablero[fila][columna] == ' ') {
                tablero[fila][columna] = jugadorActual;
                jugadas++;

                // 4. Verificar victoria o empate
                if (verificarGanador(tablero, jugadorActual)) {
                    imprimirTablero(tablero);
                    System.out.println("¡Felicidades! El jugador " + jugadorActual + " ha ganado.");
                    juegoTerminado = true;
                } else if (jugadas == 9) {
                    imprimirTablero(tablero);
                    System.out.println("¡Empate! Tablero lleno.");
                    juegoTerminado = true;
                } else {
                    jugadorActual = (jugadorActual == 'X') ? 'O' : 'X';
                }
            } else {
                System.out.println("Movimiento inválido (Casilla ocupada o fuera de rango). Intenta de nuevo.");
            }
        }
        scanner.close();
    }

    public static void inicializarTablero(char[][] tablero) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tablero[i][j] = ' ';
            }
        }
    }

    public static void imprimirTablero(char[][] tablero) {
        System.out.println("\n  0   1   2");
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print(i + "| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(tablero[i][j] + " | ");
            }
            System.out.println("\n-------------");
        }
    }

    public static boolean verificarGanador(char[][] tablero, char jugador) {
        for (int i = 0; i < 3; i++) {
            if (tablero[i][0] == jugador && tablero[i][1] == jugador && tablero[i][2] == jugador) return true;
            if (tablero[0][i] == jugador && tablero[1][i] == jugador && tablero[2][i] == jugador) return true;
        }
        if (tablero[0][0] == jugador && tablero[1][1] == jugador && tablero[2][2] == jugador) return true;
        if (tablero[0][2] == jugador && tablero[1][1] == jugador && tablero[2][0] == jugador) return true;
        return false;
    }
}