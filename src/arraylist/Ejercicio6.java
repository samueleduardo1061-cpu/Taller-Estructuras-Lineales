import java.util.ArrayList;
import java.util.Random;
public class Ejercicio6 {

    public static void main(String[] args) {
        // Generar y almacenar los numeros
        ArrayList<Integer> numerosLeados = recolectarNumerosHastaDiez();
        
        // Suma de los elemenntos
        int sumaTotal = calcularSuma(numerosLeados);
        
        // Promedio de los elementos
        double mediaPorcentaje = calcularMedia(sumaTotal, numerosLeados.size());
        
        // Imprimir resultados
        System.out.println("Números leídos en orden: " + numerosLeados);
        System.out.println("Cantidad total de números leídos: " + numerosLeados.size());
        System.out.println("Suma total de los números: " + sumaTotal);
        System.out.println("Media (promedio) de los números: " + mediaPorcentaje);
    }

    //Numeros aleatorios entre -10 y 10 hasta que salga el 10
    public static ArrayList<Integer> recolectarNumerosHastaDiez() {
        ArrayList<Integer> lista = new ArrayList<>();
        Random random = new Random();
        int numeroGenerado;
        
        do {
            numeroGenerado = random.nextInt(21) - 10;
            lista.add(numeroGenerado);
        } while (numeroGenerado != 10); // Se detiene al salir el 10
        
        return lista;
    }

    //sumar los elementos de la lista
    public static int calcularSuma(ArrayList<Integer> lista) {
        int suma = 0;
        for (int num : lista) {
            suma += num;
        }
        return suma;
    }

    //calcula la media
    public static double calcularMedia(int suma, int cantidadElementos) {
        if (cantidadElementos == 0) {
            return 0;
        }
        
        return (double) suma / cantidadElementos;
    }
}


