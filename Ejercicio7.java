import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        // Inicializar el ArrayList con los primeros 20 números pares
        ArrayList<Integer> numerosPares = inicializarPrimerosPares(20);
        
        //Imprimir el ArrayList inicial
        System.out.println("1. ArrayList inicial de pares: " + numerosPares);
        
        
        // Leer numero e insertarlo en la posición correcta
        System.out.print("2. Ingrese cualquier número entero para insertar: ");
        int numeroAInsertar = teclado.nextInt();

        insertarEnOrden(numerosPares, numeroAInsertar);

        System.out.println("   ArrayList verificado (con inserción): " + numerosPares);
       
        
        // Solicitar un valor y borrarlo
        System.out.print("3. Ingrese el valor exacto que desea borrar del ArrayList: ");
        int valorABorrar = teclado.nextInt();
        boolean eliminado = eliminarValor(numerosPares, valorABorrar);
        
        if (eliminado) {
            System.out.println("   Valor eliminado con éxito");
        } else {
            System.out.println("   El valor " + valorABorrar + " no se encontraba en el ArrayList.");
        }
        System.out.println("   ArrayList verificado: " + numerosPares);
        teclado.close();
    }

    //Genera el arraylist con los primeros 20 numeros pares
    public static ArrayList<Integer> inicializarPrimerosPares(int cantidad) {
        ArrayList<Integer> lista = new ArrayList<>();
        for (int i = 0; i < cantidad; i++) {
            lista.add(i * 2); 
        }
        return lista;
    }

  //Busca la posición correta para insertar el numero
    public static void insertarEnOrden(ArrayList<Integer> lista, int numero) {
        int posicionDestino = lista.size();
        
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) >= numero) {
                posicionDestino = i; // Encontró su lugar en la lista
                break; 
            }
        }
        
        // Java inserta el elemento en el índice indicado y rueda el resto hacia la derecha
        lista.add(posicionDestino, numero); 
    }

    //Elimina el numero indicado
    public static boolean eliminarValor(ArrayList<Integer> lista, int valor) {
       
        return lista.remove(Integer.valueOf(valor));
    }
}


