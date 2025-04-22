package Main.Maximo;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;

public class ReferenciasAMetodos {

    // 1. Metodo estático
    public static int duplicar(int x) {
        return x * 2;
    }

    // 2. Metodo de instancia de un objeto concreto
    public void saludar(String nombre) {
        System.out.println("Hola, " + nombre);
    }

    public static void main(String[] args) {

        // 1. Referencia a metodo estático -> Clase::metodoEstatico

        Function<Integer, Integer> funcionDoble = ReferenciasAMetodos::duplicar;
        System.out.println("1. Doble de 4: " + funcionDoble.apply(4)); // 8


        // 2. Referencia a metodo de instancia de un objeto concreto -> objeto::metodoInstancia

        ReferenciasAMetodos ejemplo = new ReferenciasAMetodos();
        Consumer<String> consumidor = ejemplo::saludar;
        System.out.print("2. Saludo: ");
        consumidor.accept("Max"); // Hola, Max


        // 3. Referencia a metodo de instancia de un objeto arbitrario de un tipo -> Clase::metodoInstancia

        List<String> nombres = List.of("ana", "beatriz", "carlos");
        System.out.println("3. Nombres en mayúsculas:");
        nombres.stream()
                .map(String::toUpperCase) // Equivale a s -> s.toUpperCase()
                .forEach(System.out::println);

        // Otro ejemplo: ordenar por longitud usando String::length
        System.out.println("3. Nombres ordenados por longitud:");
        nombres.stream()
                .sorted(Comparator.comparingInt(String::length)) // s -> s.length()
                .forEach(System.out::println);


        // 4. Referencia a constructor -> Clase::new

        Supplier<ArrayList<String>> creadorLista = ArrayList::new;
        ArrayList<String> lista = creadorLista.get(); // Crea una nueva ArrayList
        lista.add("Ejemplo");
        lista.add("con");
        lista.add("constructor");
        System.out.println("4. Lista creada con constructor:");
        lista.forEach(System.out::println);

        // También se puede usar en collect()
        List<String> nombresFiltrados = nombres.stream()
                .filter(n -> n.contains("a"))
                .collect(Collectors.toCollection(ArrayList::new)); // Crea un ArrayList con los resultados

        System.out.println("4. Lista filtrada y creada con constructor:");
        nombresFiltrados.forEach(System.out::println);
    }
}

