import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        // Leer los numeros a generar
        System.out.print("Ingrese la cantidad de números a generar (n): ");
        int n = teclado.nextInt();
        
        // generar los numeros aleatorios (de 0 a 10)
        int[] numerosIniciales = generarNumerosAleatorios(n);
        
        // calcular los factoriales de los numeros generados
        double[] factorialesResultados = calcularFactoriales(numerosIniciales);
        
        // Imprimir los resultados
        System.out.println("Arreglo de números iniciales: " + Arrays.toString(numerosIniciales));
        System.out.println("Arreglo de factoriales:       " + Arrays.toString(factorialesResultados));
        
        teclado.close();
    }


    //genera los numeros aleatorios
    public static int[] generarNumerosAleatorios(int n) {
        Random random = new Random();
        int[] numeros = new int[n];
        for (int i = 0; i < n; i++) {
           
            numeros[i] = random.nextInt(11); // Genera numeros entre 0 y 10
        }
        return numeros;
    }

    //calcula los factoriales de los numeros generados y los pone en un arreglo distinto
    public static double[] calcularFactoriales(int[] numeros) {
        double[] factoriales = new double[numeros.length];
        for (int i = 0; i < numeros.length; i++) {
            factoriales[i] = obtenerFactorial(numeros[i]);
        }
        return factoriales;
    }

    //metodo calcular factorial
    private static double obtenerFactorial(int numero) {
    double resultado = 1; 
    
    // multiplica de 1 hasta el numero
    for (int i = 1; i <= numero; i++) {
        resultado = resultado * i;
    }
    
    return resultado;
}

}


