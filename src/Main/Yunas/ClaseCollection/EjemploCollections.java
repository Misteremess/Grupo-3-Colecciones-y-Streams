package Main.Yunas.ClaseCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EjemploCollections {
    public static void main(String[] args) {
        // Creo una lista con los nombres como he hecho anteriormente
        List<String> nombres = new ArrayList<>();
        nombres.add("Pedro");
        nombres.add("Yunas");
        nombres.add("Max");
        nombres.add("Salma");
        nombres.add("Irene");

        System.out.println("Lista original:");
        System.out.println(nombres);

        // 1. Este método permite ordenar alfabéticamente
        Collections.sort(nombres);
        System.out.println("\nOrdenados (alfabéticamente):");
        System.out.println(nombres);

        // 2. Este método permite buscar un nombre
        int pos = Collections.binarySearch(nombres, "Max");
        System.out.println("\nPosición de 'Max': " + pos);

        // 3. Este metodo sirve para ntercambiar dos nombres segun su posicion en la lista
        Collections.swap(nombres, 0, 4); // Cambia el primero y el último
        System.out.println("\nDespués de intercambiar primer y último:");
        System.out.println(nombres);

        // 4. Reemplazar un nombre 
        Collections.replaceAll(nombres, "Pedro", "Mario");
        System.out.println("\nDespués de reemplazar 'Pedro' por 'Mario':");
        System.out.println(nombres);

        // 5. Rellenar toda la lista con "Julio"
        Collections.fill(nombres, "Julio");
        System.out.println("\nDespués de rellenar con 'Julio':");
        System.out.println(nombres);

        // Restauramos los nombres para seguir el ejemplo
        nombres = new ArrayList<>(Arrays.asList("Pedro", "Yunas", "Max", "Salma", "Irene"));

        // 6. Copiar en otra lista
        List<String> copia = new ArrayList<>(Arrays.asList("", "", "", "", ""));
        Collections.copy(copia, nombres);
        System.out.println("\nCopia de la lista:");
        System.out.println(copia);

        // 7. Mezclar aleatoriamente
        Collections.shuffle(nombres);
        System.out.println("\nLista mezclada:");
        System.out.println(nombres);

        // 8. Contar cuántas veces aparece "Max"
        nombres.add("Max");
        int veces = Collections.frequency(nombres, "Max");
        System.out.println("\n'Cantidad de veces que aparece Max': " + veces);

        // 9. Obtener el nombre mayor (alfabéticamente)
        String maxNombre = Collections.max(nombres);
        System.out.println("\nNombre 'máximo' alfabéticamente: " + maxNombre);

        // 10. Obtener el nombre menor (alfabéticamente)
        String minNombre = Collections.min(nombres);
        System.out.println("Nombre 'mínimo' alfabéticamente: " + minNombre);

        // 11. Invertir la lista
        Collections.reverse(nombres);
        System.out.println("\nLista invertida:");
        System.out.println(nombres);

        // 12. Eliminar todos los "Max"
        nombres.removeAll(Collections.singleton("Max"));
        System.out.println("\nDespués de eliminar todos los 'Max':");
        System.out.println(nombres);
    }
}
