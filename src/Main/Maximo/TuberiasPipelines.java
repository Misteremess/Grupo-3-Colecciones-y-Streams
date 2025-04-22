package Main.Maximo;

import java.util.*;

public class TuberiasPipelines {
    public static void main(String[] args) {
        List<String> nombres = Arrays.asList("Ana", "Luis", "Carlos", "Laura", "Eva");

        System.out.println("-Nombres originales-");
        nombres.forEach(System.out::println);

        // Pipeline: convertir a mayúsculas, filtrar, ordenar y mostrar
        System.out.println("\n-Nombres con más de 3 letras, en mayúsculas y ordenados-");
        nombres.stream()                          // Origen
                .map(String::toUpperCase)          // Intermedia
                .filter(n -> n.length() > 3)       // Intermedia
                .sorted()                          // Intermedia
                .forEach(System.out::println);     // Terminal

        // Otro ejemplo: contar cuántos nombres empiezan por 'L'
        long empiezanPorL = nombres.stream()
                .filter(n -> n.startsWith("L"))
                .count();

        System.out.println("\nCantidad de nombres que empiezan por 'L': " + empiezanPorL);
    }
}

