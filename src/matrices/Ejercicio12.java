import java.util.Random;
import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Tamaño de la matriz
        System.out.print("Ingrese el numero del tamaño de la matriz: ");
        int numero = scanner.nextInt();

        int[][] matriz = new int[numero][numero];
        int sumatoriaDiagonalOpuesta = 0;

        // rellenar matriz
        for (int i = 0; i < numero; i++) {
            for (int j = 0; j < numero; j++) {
                // rango de -50 a 50
                matriz[i][j] = random.nextInt(101) - 50;
            }
        }

        // Imprimir matriz
        System.out.println("\n--- Matriz Generada ---");
        for (int i = 0; i < numero; i++) {
            for (int j = 0; j < numero; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        // Sumatoria de la diagonal opuesta
        System.out.print("\nElementos de la diagonal opuesta: ");
        for (int i = 0; i < numero; i++) {
            int columnaOpuesta = numero - 1 - i;
            int valor = matriz[i][columnaOpuesta];
            
            System.out.print(valor + ", ");
            sumatoriaDiagonalOpuesta += valor;
        }

        // 5. Imprimir el resultado final
        System.out.println("\n===Resultado===");
        System.out.println("La sumatoria de la diagonal opuesta es: " + sumatoriaDiagonalOpuesta);

        scanner.close();
    }
}
