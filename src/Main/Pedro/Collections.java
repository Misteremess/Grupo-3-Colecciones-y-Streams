package Main.Pedro;

import java.util.*;

public class Collections {
    public static void main(String[] args) {
        // LISTA
        List<String> lista = new ArrayList<>();

        //Pedro esta a dieta y se ha ido a la fruteria a comprar cosas sanas
        // .add()
        lista.add("Manzana");
        lista.add("Banana");
        lista.add("Naranja");
        System.out.println("Lista: " + lista);
        System.out.println();

        //Pedro no esta seguro si ha metido la banana a la cesta y quiere verficarlo
        // .contains()
        System.out.println("¿Contiene 'Banana'? " + lista.contains("Banana"));
        System.out.println();

        //Ve que si, pero recuerda que el ya lleva el Banano de serie, asique lo quita de la cesta
        // .remove()
        lista.remove("Banana");
        System.out.println("Cesta tras eliminar 'Banana': " + lista);
        System.out.println();

        //Al dejarlos en su sitio se le cae la cesta y quiere verificar si se le ha caido
        // todo de la cesta porque ha comido muchas torrijas y con la panza no ve el suelo
        // .isEmpty()
        System.out.println("¿La cesta está vacía? " + lista.isEmpty());
        System.out.println();

        //Ademas verifica el contenido de la cesta que deberian ser 2 frutas ahora mismo
        // .size()
        System.out.println("Tamaño de la cesta: " + lista.size());
        System.out.println();

        //Pedro prefiere revisar la fruta una por una
        // for-each
        System.out.println("Recorriendo con for-each:");
        for (String fruta : lista) {
            System.out.println(fruta);
        }
        System.out.println();

        //Y lo vuelve a hacer porque se acordo de la noche de ayer y se ha distraido
        // .iterator()
        Iterator<String> iterador = lista.iterator();
        System.out.println("Recorriendo con Iterator:");
        while (iterador.hasNext()) { // .hasNext()
            String fruta = iterador.next(); // .next()
            System.out.println(fruta);
        }
        System.out.println();

        // .toArray()
        Object[] array = lista.toArray();
        System.out.println("Convertido a array: " + Arrays.toString(array));
        System.out.println();

        // SETS

        //Pedro se resbala con la cascara del banano,
        // y un medico le pide que diga colores aleatorios sin repetirlos
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Rojo");
        hashSet.add("Verde");
        hashSet.add("Azul");
        System.out.println(hashSet);
        System.out.println();

        //Para comprobar realmente que no se ha quedado con secuelas, le nombra 3 animales
        // y le pide que se los ordene por orden alfabetico
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Zebra");
        treeSet.add("Elefante");
        treeSet.add("Abeja");
        System.out.println(treeSet);
        System.out.println();

        //Por si acaso, por ultimo le indica una serie de numeros
        // y quiere que se los repita en el mismo orden en el que se lo ha dicho
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Uno");
        linkedHashSet.add("Tres");
        linkedHashSet.add("Dos");
        System.out.println(linkedHashSet);
        System.out.println();

        //Resulta que en la fruteria hay una oferta con frutas y Pedro
        // quiere ver que cosas contiene
        // .containsAll()
        List<String> lista2 = new ArrayList<>();
        lista2.add("Papaya");
        lista2.add("Albaricoques");
        lista2.add("Peras");
        System.out.println("\n¿La cesta contiene todos los elementos de cesta2? " + lista.containsAll(lista2));
        System.out.println();

        //Le gusta lo que ve y se lo lleva todo, asi que lo mete en su cesta
        // .addAll()
        lista.addAll(lista2);
        System.out.println("Cesta tras addAll(lista2): " + lista);
        System.out.println();

        //En caja ve el precio y decide no llevarseala.
        // Joder! Como 7.99? Ni que fuera una pizza del Dominos
        // .removeAll()
        lista.removeAll(lista2);
        System.out.println("Lista tras removeAll(lista2): " + lista);
        System.out.println();

        // .retainAll()
        lista.add("Kiwi");
        lista.add("Uva");
        lista2.clear();
        lista2.add("Uva");
        System.out.println("Cesta antes de retainAll: " + lista);
        lista.retainAll(lista2);
        System.out.println("Cesta tras retainAll(lista2): " + lista);
        System.out.println();

        //Al final del todo se da cuenta que todos nos morimos,
        // para que vivir triste comiendo manzanas
        // .clear()
        lista.clear();
        System.out.println("Lista después de clear(): " + lista);
        System.out.println();
    }
}
