package Main.Maximo.interfacesFuncionales;

import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {
        Supplier<Double> aleatorio = () -> Math.random();

        System.out.println("Número aleatorio 1: " + aleatorio.get());
        System.out.println("Número aleatorio 2: " + aleatorio.get());
    }
}

