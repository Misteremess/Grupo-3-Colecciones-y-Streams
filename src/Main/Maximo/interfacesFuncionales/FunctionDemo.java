package Main.Maximo.interfacesFuncionales;

import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {
        Function<String, Integer> longitud = s -> s.length();

        System.out.println("Longitud de 'Hola': " + longitud.apply("Hola")); // 4
        System.out.println("Longitud de 'Mundo': " + longitud.apply("Mundo")); // 5
    }
}
