package Main.Yunas.Stream;

import java.util.*;

// Clase principal
public class FuncionalesyLambda {

    // Clase Persona
    static class Persona {
        String nombre;

        Persona(String nombre) {
            this.nombre = nombre;
        }

        @Override
        public String toString() {
            return nombre;
        }
    }

    // Primera forma: clase que implementa Comparator
    static class ComparadorPorNombre implements Comparator<Persona> {
        public int compare(Persona p1, Persona p2) {
            return p1.nombre.compareTo(p2.nombre);
        }
    }

    // Método main para probar las tres formas
    public static void main(String[] args) {
        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Carlos"));
        personas.add(new Persona("Ana"));
        personas.add(new Persona("Beatriz"));

        // Primera forma
        Collections.sort(personas, new ComparadorPorNombre());
        System.out.println("Ordenado (1ª forma - clase aparte): " + personas);

        // Segunda forma: clase anónima
        Collections.sort(personas, new Comparator<Persona>() {
            public int compare(Persona p1, Persona p2) {
                return p1.nombre.compareTo(p2.nombre);
            }
        });
        System.out.println("Ordenado (2ª forma - clase anónima): " + personas);

        // Tercera forma: expresión lambda
        Collections.sort(personas, (p1, p2) -> p1.nombre.compareTo(p2.nombre));
        System.out.println("Ordenado (3ª forma - lambda): " + personas);
    }
}
