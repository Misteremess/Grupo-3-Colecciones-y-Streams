package Main.Irene.Ejercicio_12_1_2;

public class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan", 25);
        Persona persona2 = new Persona("Maria", 30);
        Persona persona3 = new Persona("Juan", 25);

        System.out.println("Persona 1: " + persona1);
        System.out.println("Persona 2: " + persona2);
        System.out.println("Persona 3: " + persona3);

        // Comparar personas según su edad
        System.out.println("Persona 1 vs Persona 2: " + persona1.compareTo(persona2));
        System.out.println("Persona 2 vs Persona 1: " + persona2.compareTo(persona1));
        System.out.println("Persona 1 vs Persona 3: " + persona1.compareTo(persona3));
    }
}
