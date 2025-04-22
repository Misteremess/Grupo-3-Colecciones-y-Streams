package Main.Pedro.Zooilo;

import java.util.*;

public class Metodos {
    private List<String> listaAnimales;
    private Set<String> hashSetAnimales;
    private Set<String> treeSetAnimales;
    private Set<String> linkedHashSetAnimales;

    public Metodos() {
        listaAnimales = new ArrayList<>(); //Permite elementos repetidos y tiene orden
        hashSetAnimales = new HashSet<>(); //No permite repetidos, no tiene orden
        treeSetAnimales = new TreeSet<>(); // No tiene repetidos, ordena alfabeticamente
        linkedHashSetAnimales = new LinkedHashSet<>(); // No permite repetidos, mantiene el orden de insercion

        agregarAnimalesIniciales();
    }

    private void agregarAnimalesIniciales() {
        String[] animales = {
                "Dálmata de 564 que muje no ladra",
                "Vaca que ladra no muje",
                "Una vaca que ríe",
                "Una vaca que llora",
                "Cangrejo adelantao",
                "Mono en estéreo",
                "Cabra de playa",
                "Ciempiés con esguinces",
                "Tigre Hugo Boss",
                "Flamenco heavy",
                "Topo con miopía",
                "Cebra que no pasa",
                "Camello que sí pasa",
                "Elefanta de naranja",
                "Escaralto",
                "Caracola light",
                "Cigüeña estéril",
                "Mantis agnóstica",
                "Panda en un Renault",
                "Toro con mujer fiel"
        };

        for (String animal : animales) {
            for (int i = 0; i < new Random().nextInt(3) + 1; i++) {
                listaAnimales.add(animal);
                hashSetAnimales.add(animal);
                treeSetAnimales.add(animal);
                linkedHashSetAnimales.add(animal);
            }
        }
    }

    public void mostrarAnimales() {
        System.out.println("Lista de animales en el zoológico:");
        Map<String, Integer> conteo = new LinkedHashMap<>();
        for (String animal : listaAnimales) {
            conteo.put(animal, conteo.getOrDefault(animal, 0) + 1);
        }
        conteo.forEach((k, v) -> System.out.println(k + " x" + v));
    }

    public void agregarAnimal(String animal) {
        listaAnimales.add(animal);
        hashSetAnimales.add(animal);
        treeSetAnimales.add(animal);
        linkedHashSetAnimales.add(animal);
        System.out.println("Animal agregado: " + animal);
    }

    public void eliminarAnimal(String animal) {
        if (listaAnimales.remove(animal)) {
            System.out.println("Animal eliminado de la lista: " + animal);
        } else {
            System.out.println("Animal no encontrado en la lista.");
        }
        hashSetAnimales.remove(animal);
        treeSetAnimales.remove(animal);
        linkedHashSetAnimales.remove(animal);
    }

    public void vaciarZoologico() {
        listaAnimales.clear();
        hashSetAnimales.clear();
        treeSetAnimales.clear();
        linkedHashSetAnimales.clear();
        System.out.println("Zoológico vaciado.");
    }

    public void mostrarCantidad() {
        System.out.println("Cantidad total de animales: " + listaAnimales.size());
    }

    public void estaVacio() {
        System.out.println(listaAnimales.isEmpty() ? "El zoológico está vacío." : "El zoológico NO está vacío.");
    }

    public void contieneAnimal(String animal) {
        System.out.println(listaAnimales.contains(animal) ? "El zoológico contiene ese animal." : "Ese animal no está en el zoológico.");
    }

    public void mostrarToString() {
        System.out.println(listaAnimales.toString());
    }

    public void iterarConIterator() {
        System.out.println("Iterando con Iterator:");
        Iterator<String> iterator = listaAnimales.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public void iterarConForEach() {
        System.out.println("Iterando con for-each:");
        for (String animal : listaAnimales) {
            System.out.println(animal);
        }
    }

    public void contieneTodo(List<String> otraLista) {
        System.out.println(listaAnimales.containsAll(otraLista) ? "La lista contiene todos los elementos de la otra lista." : "Faltan elementos de la otra lista.");
    }

    public void agregarTodo(List<String> otraLista) {
        listaAnimales.addAll(otraLista);
        System.out.println("Elementos agregados a la lista principal.");
    }

    public void eliminarTodo(List<String> otraLista) {
        listaAnimales.removeAll(otraLista);
        System.out.println("Elementos eliminados de la lista principal.");
    }

    public void retenerTodo(List<String> otraLista) {
        listaAnimales.retainAll(otraLista);
        System.out.println("Solo se mantuvieron los elementos presentes en ambas listas.");
    }

    public void convertirAArray() {
        Object[] array = listaAnimales.toArray();
        System.out.println("Animales en array:");
        for (Object a : array) {
            System.out.println(a);
        }
    }

    public void ordenarAnimales() {
        Collections.sort(listaAnimales);
        System.out.println("Lista de animales ordenada alfabéticamente:");
        mostrarAnimales();
    }
}
