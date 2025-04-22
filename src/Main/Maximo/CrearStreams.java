package Main.Maximo;

import java.util.*;
import java.util.stream.*;

public class CrearStreams {
    public static void main(String[] args) {

        // 1. Desde una colección
        List<String> nombres = List.of("Ana", "Luis", "Carlos");
        Stream<String> stream1 = nombres.stream();
        System.out.println("Desde una colección:");
        stream1.forEach(System.out::println);

        // 2. Desde un array usando Stream.of()
        String[] colores = {"Rojo", "Verde", "Azul"};
        Stream<String> stream2 = Stream.of(colores);
        System.out.println("\nDesde un array con Stream.of():");
        stream2.forEach(System.out::println);

        // 3. Desde un array usando Arrays.stream()
        String[] frutas = {"Manzana", "Pera", "Uva"};
        Stream<String> stream3 = Arrays.stream(frutas);
        System.out.println("\nDesde un array con Arrays.stream():");
        stream3.forEach(System.out::println);

        // 4. Directamente con Stream.of() y lista de parámetros
        Stream<String> stream4 = Stream.of("Lunes", "Martes", "Miércoles");
        System.out.println("\nDirectamente con Stream.of() y varios valores:");
        stream4.forEach(System.out::println);
    }
}

