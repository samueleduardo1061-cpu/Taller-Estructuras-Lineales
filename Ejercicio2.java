public class Ejercicio2 {
    public static void main(String[] args) {
        //Inicializar el arreglo
        int[] pares = new int[100];
        for (int i = 0; i < 100; i++) {
            pares[i] = (i + 1) * 2; 
        }

        //Imprimir los 100 primeros pares en 1 sola linea
        System.out.println("Imprensión en 1 linea");
        for (int i = 0; i < pares.length; i++) {
            System.out.print(pares[i] + "");
            if (i < pares.length -1) {
                System.out.print(", "); 
            }
        }
        System.out.println("\n"); 

        // Imprmir los 100 primeros pares en 10 lineas
        System.out.println("Impresión en 10 lineas");
        int elementosPorLinea = 10;
        
        for (int linea = 0; linea < 10; linea++) {
            System.out.print("Línea " + (linea + 1) + ": ");
            
            for (int j = 0; j < elementosPorLinea; j++) {
                

                int posicion_del_arreglo = (linea * elementosPorLinea) + j;


                System.out.print(pares[posicion_del_arreglo]);
                
                if (j < elementosPorLinea - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println(); // Salto al terminar cada línea
        }
    }
}


