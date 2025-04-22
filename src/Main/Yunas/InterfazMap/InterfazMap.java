package Main.Yunas.InterfazMap;

import java.util.HashMap;
import java.util.Map;

public class InterfazMap {
    public static void main(String[] args) {
        // Creo el mapa: clave = nombre del líder, valor = número de habitantes
        Map<String, Long> lideres = new HashMap<>();

        // Inserto datos (líder y población)
        lideres.put("Pedro Sánchez", 48000000L);
        lideres.put("Emmanuel Macron", 68000000L);
        lideres.put("Joe Biden", 331000000L);
        lideres.put("Rishi Sunak", 67000000L);

        // Mostrar todo el mapa
        System.out.println("Líderes y población de su país: " + lideres);

        // Con get podemos obtener por ejemplo la población del país gobernado por Macron
        Long poblacionFrancia = lideres.get("Emmanuel Macron");
        System.out.println("Francia tiene una población de: " + poblacionFrancia);

        // Verificar si un líder está en la lista
        if (lideres.containsKey("Joe Biden")) {
            System.out.println("Joe Biden está en la lista.");
        }

        // Verificar si existe algún país con 48 millones de habitantes
        if (lideres.containsValue(48000000L)) {
            System.out.println("Hay un país con 48 millones de habitantes.");
        }

        // Eliminar a Rishi Sunak
        lideres.remove("Rishi Sunak");
        System.out.println("Después de eliminar a Rishi Sunak: " + lideres);

        // Actualizar el número de habitantes de España
        lideres.put("Pedro Sánchez", 47000000L);
        System.out.println("Después de actualizar la población de España: " + lideres);

        // Vaciar el mapa
        lideres.clear();
        System.out.println("Después de vaciar el mapa: " + lideres);
    }
}
