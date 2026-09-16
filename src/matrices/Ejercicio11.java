import java.util.Random;
import java.util.Scanner;
public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random random = new Random();

       System.out.println("Ingrese el numero de filas que desea en la matriz");
       int filas = teclado.nextInt();    
       System.out.println("Ingrese el numero de columnas que desea en la matriz");
        int columnas = teclado.nextInt(); 

        int[][] matriz = new int[filas][columnas];

        // Rellenar la matriz con números aleatorios entre 1 y 50
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = random.nextInt(50) + 1;
            }
        }

        // Imprimir la matriz generada
        System.out.println("--- Matriz Generada ---");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                // \t alinea las columnas
                System.out.print(matriz[i][j] + "\t"); 
            }
            System.out.println();
        }

        // Leer el numero a buscar
        System.out.print("\nIngrese el número entero que desea buscar: ");
        int numeroABuscar = teclado.nextInt();

        // Variables de control para la búsqueda
        boolean encontrado = false;
        int filaEncontrada = 0;
        int columnaEncontrada = 0;

        
        
        buscarNumero: 
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (matriz[i][j] == numeroABuscar) {
                    encontrado = true;
                    filaEncontrada = i+1;
                    columnaEncontrada = j+1;
                    break buscarNumero; // Detiene la búsqueda al hallar la primera ocurrencia
                }
            }
        }

        // Imprimir el resultado de la búsqueda
        System.out.println("\n--- Resultado de la Búsqueda ---");
        if (encontrado) {
            System.out.println("Número encontrado");
            System.out.println("El número " + numeroABuscar + " se encuentra en la posición: Fila " + filaEncontrada + ", Columna " + columnaEncontrada);
            
        } else {
            System.out.println("El número " + numeroABuscar + " no se encuentra en la matriz.");
        }

        teclado.close(); 
    }
}

        

