import java.util.Random;
import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // 1. Cargar m (filas) y n (columnas) por teclado
        System.out.print("Ingrese el número de filas: ");
        int filas = scanner.nextInt();

        System.out.print("Ingrese el número de columnas:  ");
        int columnas = scanner.nextInt();

        // Validación: Necesitamos al menos 2 filas para poder intercambiar la primera con la segunda
        if (filas < 2) {
            System.out.println("Error: La matriz debe tener al menos 2 filas para realizar el intercambio.");
            scanner.close();
            return;
        }

        int[][] matriz = new int[filas][columnas];

        // 2. Rellenar con números aleatorios entre 1 y 50
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = random.nextInt(50) + 1;
            }
        }

        // 3. Imprimir la matriz original
        System.out.println("\n--- Matriz Original ---");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        // 4. Intercambiar la primera fila (índice 0) con la segunda (índice 1)
        // Usamos un arreglo temporal 'int[]' para guardar la referencia de la primera fila
        int[] filaTemporal = matriz[0]; 
        matriz[0] = matriz[1];          // La primera fila ahora apunta a la segunda
        matriz[1] = filaTemporal;       // La segunda fila ahora apunta a lo que era la primera

        //Imprimir matriz con el cambio de filas
        System.out.println("\n-==Matriz con Filas Intercambiadas==-");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        scanner.close();
    }
}
