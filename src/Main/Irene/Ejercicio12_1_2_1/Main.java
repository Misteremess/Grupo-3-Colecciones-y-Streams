package Main.Irene.Ejercicio12_1_2_1;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // Crear un objeto de tipo Persona
        Persona persona1 = new Persona("Juan", 25);
        Persona persona2 = new Persona("Ana", 30);
        Persona persona3 = new Persona("Carlos", 20);
        Persona persona4 = new Persona("Ana", 25);

        // Crear un array de personas
        Persona[] personas = {persona1, persona2, persona3, persona4};

        // Utilizar compareTo para ordenar el array
        Arrays.sort(personas, (p1, p2) -> p1.getNombre().compareTo(p2.getNombre()));

        // Mostrar el array ordenado
        System.out.println("Persona ordenada por nombre:");
        for (Persona persona : personas) {
            System.out.println(persona);
        }

        // Utilizar compareTo para ordenar el array por edad
        Arrays.sort(personas, (p1, p2) -> Integer.compare(p1.getEdad(), p2.getEdad()));

        // Mostrar el array ordenado
        System.out.println("\nPersona ordenada por edad:");
        for (Persona persona : personas) {
            System.out.println(persona);
        }
    }
}
