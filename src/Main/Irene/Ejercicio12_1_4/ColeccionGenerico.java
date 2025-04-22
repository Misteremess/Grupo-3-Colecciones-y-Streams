package Main.Irene.Ejercicio12_1_4;

import java.util.ArrayList;
import java.util.List;


public class ColeccionGenerico<T> {

    private List<T> elementos;

    public ColeccionGenerico() {
        this.elementos = new ArrayList<T>();
    }

    public void agregarElemento(T elemento) {
        this.elementos.add(elemento);
    }

    public void eliminarElemento(T elemento) {
        this.elementos.remove(elemento);
    }

    public void imprimirElementos() {
        for (T elemento : this.elementos) {
            System.out.println(elemento);
        }
    }
}