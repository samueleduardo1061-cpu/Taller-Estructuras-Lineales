import java.util.ArrayList;
import java.util.Random;
public class Ejercicio8 {

    public static void main(String[] args) {
        final int TotalElmentos = 100;
        final int RangoMaximo = 20;

        //Generar el arrayList con 100 numeros entre 1 y 20
        ArrayList<Integer> listaNumeros = generarAleatorios(TotalElmentos, RangoMaximo);

        //Calcular la frecuencia de cada numero
        int[] frecuencias = calcularFrecuencias(listaNumeros, RangoMaximo);

        //Tabla de frecuencias
        imprimirTablaFrecuencias(frecuencias);

        // Identificar e imprimir el numero que más se repite
        mostrarMasRepetido(frecuencias);
    }

    //ArrayList de 100 numeros aleatorios entre 1 y 20
    public static ArrayList<Integer> generarAleatorios(int cantidad, int rangoMaximo) {
        ArrayList<Integer> lista = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < cantidad; i++) {
            
            lista.add(random.nextInt(rangoMaximo) + 1);
        }
        return lista;
    }

    //Calcula la frecuencia de cada numero en el ArrayList
    public static int[] calcularFrecuencias(ArrayList<Integer> lista, int rangoMaximo) {
        
        int[] contadores = new int[rangoMaximo + 1];
        
        for (int numero : lista) {
            // Si sale el número 5, se suma +1 en la posición contadores[5]
            contadores[numero]++;
        }
        return contadores;
    }

    //tabla
    public static void imprimirTablaFrecuencias(int[] frecuencias) {
        System.out.println("\nTABLA DE FRECUENCIAS");
        System.out.println("----------------------");
        System.out.printf("| %-8s | %-10s |\n", "Número", "Frecuencia");
        System.out.println("----------------------");
        
        // Empezamos desde 1 ya que el 0 no forma parte de nuestro rango aleatorio
        for (int i = 1; i < frecuencias.length; i++) {
            System.out.printf("| %-8d | %-10d |\n", i, frecuencias[i]);
        }
        System.out.println("----------------------");
    }

    //Busca cual acumuló mayor valor
    public static void mostrarMasRepetido(int[] frecuencias) {
        int maxFrecuencia = -1;
        int numeroMasRepetido = -1;

        for (int i = 1; i < frecuencias.length; i++) {
            if (frecuencias[i] > maxFrecuencia) {
                maxFrecuencia = frecuencias[i];
                numeroMasRepetido = i;
            }
        }

        System.out.println(" RESULTADO FINAL:");
        System.out.println("El número que se repite con mayor frecuencia es el: " 
                + numeroMasRepetido +  " (aparece " + maxFrecuencia + " veces).");
    }
}


