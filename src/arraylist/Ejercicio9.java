import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
public class Ejercicio9 {


    public static void main(String[] args) {
        
        List<Integer> listaOriginal = new ArrayList<>();
        Random random = new Random();
        
         // numeros del 1 al 100 (maximo 20 numeros)
        for (int i = 0; i < 20; i++) {
            listaOriginal.add(random.nextInt(100) + 1);
        }

        System.out.println(" Arreglo Original:     " + listaOriginal);

        // Ordenar de menor a mayor
        List<Integer> listaMenorAMayor = new ArrayList<>(listaOriginal);
        Collections.sort(listaMenorAMayor);
        System.out.println(" Menor a Mayor:        " + listaMenorAMayor);

        //Ordenar de mayor a menor
        List<Integer> listaMayorAMenor = new ArrayList<>(listaOriginal);
        Collections.sort(listaMayorAMenor, Collections.reverseOrder());
        System.out.println(" Mayor a Menor:        " + listaMayorAMenor);

        // Lista de pares
        List<Integer> pares = listaOriginal.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        //Lista de impares
        List<Integer> impares = listaOriginal.stream().filter(n -> n % 2 != 0).collect(Collectors.toList());

        System.out.println(" Números Pares:        " + pares);
        System.out.println(" Números Impares:      " + impares);
    }
}


