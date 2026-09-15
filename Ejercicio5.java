import java.util.Arrays;
import java.util.Random;
public class Ejercicio5 {

    public static void main(String[] args) {
        
        final int TotalNumeros = 20;
        
        //inicializar el arreglo con numeros aleatorios 
        int[] numerosIniciales = generarNumerosAleatorios(TotalNumeros);
        
        //Invertir cada numero del arreglo y guardarlo en un nuevo arreglo
        int[] numerosInvertidos = invertirArregloCompleto(numerosIniciales);
        
        //Imprimir arreglos
        System.out.println("Arreglo Inicial:    " + Arrays.toString(numerosIniciales));
        System.out.println("Arreglo Invertido:  " + Arrays.toString(numerosInvertidos));
    }

    //arreglo de numeros aleatorios entre 10 y 999
    public static int[] generarNumerosAleatorios(int cantidad) {
        Random random = new Random();
        int[] numeros = new int[cantidad];
        for (int i = 0; i < cantidad; i++) {
            // Genera números entre 10 y 999
            numeros[i] = random.nextInt(990) + 10; 
        }
        return numeros;
    }

    //Recorre el arreglo original e invierte cada numero, guardandolo en un nuevo arreglo
    public static int[] invertirArregloCompleto(int[] arregloOriginal) {
        int[] invertidos = new int[arregloOriginal.length];
        for (int i = 0; i < arregloOriginal.length; i++) {
            invertidos[i] = invertirNumero(arregloOriginal[i]);
        }
        return invertidos;
    }

    //Invierte un numero entero
    private static int invertirNumero(int numero) {
        int numeroInvertido = 0;
        int remanente = numero;
        
        while (remanente > 0) {
            int ultimoDigito = remanente % 10; // Extrae ultimo digito
            numeroInvertido = (numeroInvertido * 10) + ultimoDigito; 
            remanente = remanente / 10; 
            //Ese es el proceso para darle la vuelta al numero, por eso está en while
        }
        
        return numeroInvertido;
    }
}


