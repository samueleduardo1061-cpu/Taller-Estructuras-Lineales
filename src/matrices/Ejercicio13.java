import java.util.Random;
import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Ingrese el tamaño de la matriz: ");
        int numero = teclado.nextInt();

        if (numero < 2) {
            System.out.println("Por favor ingrese un tamaño mayor o igual a 2");
            return;
        }

        int[][] matriz = new int[numero][numero];

        // Rellenar la matriz con números entre 1 y 5
        for (int i = 0; i < numero; i++) {
            for (int j = 0; j < numero; j++) {
                matriz[i][j] = random.nextInt(5) + 1; 
            }
        }

        // 3. Imprimir la matriz generada
        System.out.println("\n--- Matriz Generada ---");
        for (int i = 0; i < numero; i++) {
            for (int j = 0; j < numero; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        
        boolean esSimetrica = true;
        
        // El bucle de j empieza en i+1 para evaluar solo la mitad superior y no repetir comparaciones
        chequeo:
        for (int i = 0; i < numero; i++) {       
            for (int j = i + 1; j < numero; j++) {
                if (matriz[i][j] != matriz[j][i]) {
                    esSimetrica = false;
                    break chequeo; // Rompe el proceso en cuanto encuentra la primera desigualdad
                }
            }
        }

        // Imprimir si es simetrica o no
        System.out.println("\n--- Análisis de Simetría ---");
        if (esSimetrica) {
            System.out.println("La matriz SÍ es simétrica.");
        } else {
            System.out.println("La matriz NO es simétrica.");
        }

        // Imprimir las 4 esquinas
        System.out.println("\n--- Números de las Esquinas ---");
        System.out.println("Superior Izquierda:       " + matriz[0][0]);
        System.out.println("Superior Derecha:         " + matriz[0][numero - 1]);
        System.out.println("Inferior Izquierda        " + matriz[numero - 1][0]);
        System.out.println("Inferior Derecha          " + matriz[numero - 1][numero - 1]);

        teclado.close();
    }
}
