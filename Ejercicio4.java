import java.util.Arrays;
import java.util.Random;
public class Ejercicio4 {
    public static void main(String[] args) {
        
        final int totalNumeros = 25;
        
        // Generar los numeros aleatorios
        int[] numerosAleatorios = generarNumerosEntreRango(totalNumeros, -50, 50);
        
        // Encontrar menor y mayor del arreglo
        int numeroMenor = buscarMenor(numerosAleatorios);
        int numeroMayor = buscarMayor(numerosAleatorios);
        
        // 3. Imprimir el arreglo completo y los resultados
        System.out.println("Arreglo generado: " + Arrays.toString(numerosAleatorios));
        System.out.println("El número menor del arreglo es: " + numeroMenor);
        System.out.println("El número mayor del arreglo es: " + numeroMayor);
    }

    //Arreglo numeros aleatorios entre -50 y 50
    public static int[] generarNumerosEntreRango(int cantidad, int minimo, int maximo) {
        Random random = new Random();
        int[] numeros = new int[cantidad];
        
        for (int i = 0; i < cantidad; i++) {
            numeros[i] = random.nextInt((maximo - minimo) + 1) + minimo;
        }
        return numeros;
    }

    //Encontrar el menor del arreglo
    public static int buscarMenor(int[] arreglo) {
        
        int menor = arreglo[0]; 
        
        for (int i = 1; i < arreglo.length; i++) {
            if (arreglo[i] < menor) {
                menor = arreglo[i]; // Actualiza si encuentra uno más pequeño
            }
        }
        return menor;
    }

    //Encontrar el mayor del arreglo
    public static int buscarMayor(int[] arreglo) {
        
        int mayor = arreglo[0]; 
        
        for (int i = 1; i < arreglo.length; i++) {
            if (arreglo[i] > mayor) {
                mayor = arreglo[i]; // Actualiza si encuentra uno más grande
            }
        }
        return mayor;
    }
}


