package Main.Maximo.interfacesFuncionales;

import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {

         /* Creamos un Predicate que toma un String y devuelve true si empieza con la letra "A".
         * La sintaxis "s -> s.startsWith("A")" es una expresión lambda.
         * Esto reemplaza la necesidad de escribir una clase anónima.
         */
        Predicate<String> empiezaConA = s -> s.startsWith("A");

         /* Usamos el metodo test() de Predicate para evaluar si el String "Antonio"
         * comienza con "A". Como sí comienza, devuelve true.
         */
        System.out.println(empiezaConA.test("Antonio")); // true

         /* Ahora probamos con el String "Benito", que no comienza con "A", así que devuelve false.
         */
        System.out.println(empiezaConA.test("Benito"));  // false
    }
}
