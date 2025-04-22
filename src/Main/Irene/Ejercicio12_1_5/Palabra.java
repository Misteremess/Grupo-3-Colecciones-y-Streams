package Main.Irene.Ejercicio12_1_5;

import java.util.ArrayList;
import java.util.List;

public class Palabra {

    private String palabra;

    public Palabra(String palabra) {
        this.palabra = palabra;
    }

    public String getPalabra() {
        return palabra;
    }
}

class Palabras {
    private List<Palabra> palabras;

    public Palabras() {
        this.palabras = new ArrayList<>();
    }

    public void agregarPalabra(Palabra palabra) {
        this.palabras.add(palabra);
    }

    public List<Palabra> buscarPalabras(String patron) {
        List<Palabra> resultados = new ArrayList<>();

        for (Palabra palabra : palabras) {
            if (palabra.getPalabra().matches(patron)) {
                resultados.add(palabra);
            }
        }

        return resultados;
    }
}

