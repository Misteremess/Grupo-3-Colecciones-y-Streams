package Main.Maximo.interfacesFuncionales;

import java.util.function.BinaryOperator;

public class BinaryOperatorDemo {
    public static void main(String[] args) {
        BinaryOperator<Integer> suma = (a, b) -> a + b;

        int resultado = suma.apply(5, 8);
        System.out.println("Suma de 5 + 8 = " + resultado);
    }
}

