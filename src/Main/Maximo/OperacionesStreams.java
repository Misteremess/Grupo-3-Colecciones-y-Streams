package Main.Maximo;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.*;

public class OperacionesStreams {

    // Clase Cliente para los ejemplos
    static class Cliente {
        String dni;
        String nombre;
        LocalDate fechaNacimiento;

        public Cliente(String dni, String nombre, String fechaNacimiento) {
            this.dni = dni;
            this.nombre = nombre;
            this.fechaNacimiento = LocalDate.parse(fechaNacimiento);
        }

        public int edad() {
            return LocalDate.now().getYear() - fechaNacimiento.getYear();
        }

        @Override
        public String toString() {
            return dni + " - " + nombre + " (" + fechaNacimiento + ")";
        }
    }

    public static void main(String[] args) {
        Cliente[] tClie = {
                new Cliente("111", "Marta", "2000-02-12"),
                new Cliente("115", "Jorge", "1999-03-16"),
                new Cliente("112", "Carlos", "2002-10-01"),
                new Cliente("211", "Ana", "2001-12-07")
        };

        // filter + forEach
        System.out.println("Clientes que empiezan por 'A':");
        Arrays.stream(tClie)
                .filter(c -> c.nombre.startsWith("A")) // Filtro
                .forEach(System.out::println);        // Terminal

        // sorted (orden natural por DNI) + forEach
        System.out.println("\nClientes ordenados por DNI:");
        Arrays.stream(tClie)
                .sorted(Comparator.comparing(c -> c.dni)) // Orden por DNI
                .forEach(System.out::println);

        // sorted con lambda (orden por nombre) + forEach
        System.out.println("\nClientes ordenados por nombre:");
        Arrays.stream(tClie)
                .sorted((x, y) -> x.nombre.compareTo(y.nombre)) // Orden por nombre
                .forEach(System.out::println);

        // map + forEach
        System.out.println("\nDNI de los clientes:");
        Arrays.stream(tClie)
                .map(c -> c.dni) // Transformar Cliente -> String (DNI)
                .forEach(System.out::println);

        // filter + count
        long count = Arrays.stream(tClie)
                .filter(c -> c.fechaNacimiento.isAfter(LocalDate.of(2000, 12, 31))) // Nacidos después del 2000
                .count();
        System.out.println("\nClientes nacidos después del año 2000: " + count);

        // distinct + forEach
        System.out.println("\nNúmeros únicos:");
        Stream.of(4, 3, 7, 1, 0, 8, 9, 3, 5, 4, 2, 1, 4, 6, 8, 1, 0, 2, 3)
                .distinct() // Eliminar duplicados
                .forEach(x -> System.out.print(x + " "));
        System.out.println();

        // mapToInt + sum
        int sumaEdades = Arrays.stream(tClie)
                .mapToInt(Cliente::edad) // Transformar a IntStream
                .sum();                  // Sumar edades
        System.out.println("\nSuma de edades: " + sumaEdades);

        // mapToInt + average + getAsDouble
        double media = Arrays.stream(tClie)
                .mapToInt(Cliente::edad)
                .average() // Devuelve OptionalDouble
                .getAsDouble(); // Obtener double
        System.out.println("Media de edades: " + media);

        // map + reduce
        int sumaReduce = Arrays.stream(tClie)
                .map(Cliente::edad) // Stream<Integer>
                .reduce(0, Integer::sum); // Acumulación
        System.out.println("Suma (reduce): " + sumaReduce);

        // concat + distinct + forEach
        System.out.println("\nConcatenar Streams:");
        Stream<Integer> stream1 = Stream.of(1, 2, 3);
        Stream<Integer> stream2 = Stream.of(4, 5, 6);
        Stream.concat(stream1, stream2)
                .distinct() // Elimina duplicados si los hay
                .forEach(x -> System.out.print(x + " "));
        System.out.println();

        // distinct + filter + toArray (constructor)
        Integer[] pares = Stream.of(-1, -6, -3, -3, 2, 4, 2, -1)
                .distinct()
                .filter(x -> x % 2 == 0) // Filtrar pares
                .toArray(Integer[]::new); // Convertir a Integer[]
        System.out.println("\nArray de pares: " + Arrays.toString(pares));

        // collect toList
        List<Integer> listaNumeros = Stream.of(2, 5, 1, 4, -6, -3, -3)
                .collect(Collectors.toList());
        System.out.println("Lista de números: " + listaNumeros);

        // collect toCollection con TreeSet (set ordenado)
        Set<Integer> conjuntoOrdenado = Stream.of(5, 1, 2, 6, 3, 9, 4, 1, 7, 3, 5)
                .collect(Collectors.toCollection(TreeSet::new));
        System.out.println("Set ordenado: " + conjuntoOrdenado);

        // collect toMap (DNI -> Nombre)
        Map<String, String> mapaClientes = Arrays.stream(tClie)
                .collect(Collectors.toMap(c -> c.dni, c -> c.nombre));
        System.out.println("Mapa DNI -> Nombre: " + mapaClientes);

        // collect summarizingInt (estadísticas)
        IntSummaryStatistics stats = Arrays.stream(tClie)
                .collect(Collectors.summarizingInt(Cliente::edad));
        System.out.println("Estadísticas de edad: " + stats);

        // map + collect joining
        String nombres = Arrays.stream(tClie)
                .map(c -> c.nombre)
                .collect(Collectors.joining(", ", "Nombres: [", "]"));
        System.out.println(nombres);
    }
}

