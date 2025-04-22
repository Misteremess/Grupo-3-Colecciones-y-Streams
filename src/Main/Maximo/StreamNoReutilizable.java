package Main.Maximo;

import java.util.*;
import java.util.stream.*;

public class StreamNoReutilizable {
    public static void main(String[] args) {
        List<String> nombres = List.of("Ana", "Luis", "Carlos");

        Stream<String> stream = nombres.stream();

        // Primera operación terminal: OK
        stream.forEach(System.out::println);

        // Segunda operación terminal: lanza excepción
        long cuenta = stream.count(); // ERROR: IllegalStateException
        System.out.println("Cantidad: " + cuenta);
    }
}

