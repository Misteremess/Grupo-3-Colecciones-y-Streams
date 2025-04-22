package Main.Irene.Ejercicio12_1_2_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Creamos una lista de personas
        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Juan", 25));
        personas.add(new Persona("Ana", 30));
        personas.add(new Persona("Pedro", 20));
        personas.add(new Persona("Luis", 35));

        // Imprimimos la lista original
        System.out.println("Lista original:");
        for (Persona persona : personas) {
            System.out.println(persona);
        }

        // Ordenamos la lista por nombre y luego por edad
        Collections.sort(personas, new Comparator<Persona>() {
            @Override
            public int compare(Persona p1, Persona p2) {
                int comparacionNombre = p1.getNombre().compareTo(p2.getNombre());
                if (comparacionNombre != 0) {
                    return comparacionNombre;
                } else {
                    return Integer.compare(p1.getEdad(), p2.getEdad());
                }
            }
        });

        // Imprimimos la lista ordenada
        System.out.println("\nLista ordenada:");
        for (Persona persona : personas) {
            System.out.println(persona);
        }
    }
}
