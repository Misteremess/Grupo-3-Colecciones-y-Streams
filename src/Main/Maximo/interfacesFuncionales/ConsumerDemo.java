package Main.Maximo.interfacesFuncionales;

import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        Consumer<String> imprimir = s -> System.out.println("Mensaje: " + s);

        imprimir.accept("Hola Max");
        imprimir.accept("¿Cómo vas con los streams?");
    }
}

