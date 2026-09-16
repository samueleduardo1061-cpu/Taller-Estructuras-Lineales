public class Ejercicio14 {
    public static void main(String[] args) {
        
        int[][] matrizInicial = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };

        
        int filas = matrizInicial.length;       
        int columnas = matrizInicial[0].length;    

        // Inicializar la matriz transpuesta con dimensiones invertidas
        int[][] matrizTranspuesta = new int[columnas][filas]; // Queda de 4 filas por 3 columnas

        // Intercambio de filas y columnas para crear la matriz transpuesta
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                // El elemento de la coordenada (i, j) pasa a ser (j, i)
                matrizTranspuesta[j][i] = matrizInicial[i][j];
            }
        }

        //Imprimir la matriz inicial
        System.out.println("--- Matriz Inicial (" + filas + "x" + columnas + ") ---");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matrizInicial[i][j] + "\t");
            }
            System.out.println();
        }

        //Imprimir la matriz transpuesta
        System.out.println("\n--- Matriz Transpuesta (" + columnas + "x" + filas + ") ---");
        for (int i = 0; i < columnas; i++) {    
            for (int j = 0; j < filas; j++) {  
                System.out.print(matrizTranspuesta[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
