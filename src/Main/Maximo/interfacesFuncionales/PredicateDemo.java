package Main.Maximo.interfacesFuncionales;

import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        Predicate<String> empiezaConA = s -> s.startsWith("A");

        System.out.println(empiezaConA.test("Antonio")); // true
        System.out.println(empiezaConA.test("Benito"));  // false
    }
}
