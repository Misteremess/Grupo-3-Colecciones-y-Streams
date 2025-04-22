package Main.Irene.Ejercicio12_1_5;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Palabras palabras = new Palabras();

        palabras.agregarPalabra(new Palabra("hola"));
        palabras.agregarPalabra(new Palabra("hola mundo"));

        List<Palabra> resultados = palabras.buscarPalabras("h.*");

        System.out.println("Resultados de la búsqueda:");
        for (Palabra palabra : resultados) {
            System.out.println(palabra.getPalabra());
        }
    }
}
