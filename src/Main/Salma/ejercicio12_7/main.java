package Main.Salma.ejercicio12_7;
import java.util.*;
public class main {
    public static void main(String[] args) {
            // Creamos un LinkedHashMap para mantener el orden en el que metemos los elementos
        Map<String, Integer> mapa = new LinkedHashMap<>();

            // Insertamos entradas usando put (es la única forma de añadir a un mapa)
        mapa.put("Ana", 8);
        mapa.put("Luis", 7);
        mapa.put("Pedro", 10);
        mapa.put("Sofía", 7); // Valor repetido

        // === VISTA DE CLAVES (keySet) ===
        System.out.println("Claves:");
        for (String clave : mapa.keySet()) {
            System.out.println(clave); // Se puede iterar porque devuelve un Set
            }

        // === VISTA DE VALORES (values) ===
        System.out.println("\nValores:");
        for (Integer valor : mapa.values()) {
            System.out.println(valor); // Devuelve una Collection, se pueden repetir
            }

        // === VISTA DE ENTRADAS (entrySet) ===
        System.out.println("\nEntradas:");
        for (Map.Entry<String, Integer> entrada : mapa.entrySet()) {
            System.out.println(entrada.getKey() + " -> " + entrada.getValue());
            }

        // === ELIMINACIÓN SEGURA DURANTE LA ITERACIÓN DE LAS CLAVES ===
        System.out.println("\nEliminamos claves que empiecen por 'L':");
        Iterator<String> it = mapa.keySet().iterator();
        while (it.hasNext()) {
            String clave = it.next();
            if (clave.startsWith("L")) {
                it.remove(); // única forma segura de eliminar mientras iteramos
                }
            }

        System.out.println("Mapa después de eliminar:");
        for (Map.Entry<String, Integer> entrada : mapa.entrySet()) {
            System.out.println(entrada.getKey() + " -> " + entrada.getValue());
            }

        // === TreeMap: inserta ordenado por clave (orden natural) ===
        Map<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Ana", 8);
        treeMap.put("Luis", 7);
        treeMap.put("Pedro", 10);
        treeMap.put("Sofía", 7);

        System.out.println("\nTreeMap (ordenado por clave):");
        for (Map.Entry<String, Integer> entrada : treeMap.entrySet()) {
            System.out.println(entrada.getKey() + " -> " + entrada.getValue());
            }
        }
    }


