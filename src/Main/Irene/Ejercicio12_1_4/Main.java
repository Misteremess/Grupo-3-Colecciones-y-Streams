package Main.Irene.Ejercicio12_1_4;

public class Main {

    public static void main(String[] args) {
        // Crear una colección de enteros
        ColeccionGenerico<Integer> enteros = new ColeccionGenerico<>();
        enteros.agregarElemento(10);
        enteros.agregarElemento(20);
        enteros.agregarElemento(30);
        System.out.println("Colección de enteros:");
        enteros.imprimirElementos();

        // Crear una colección de reales
        ColeccionGenerico<Double> reales = new ColeccionGenerico<>();
        reales.agregarElemento(10.5);
        reales.agregarElemento(20.8);
        reales.agregarElemento(30.2);
        System.out.println("Colección de reales:");
        reales.imprimirElementos();

        // Crear una colección de cadenas
        ColeccionGenerico<String> cadenas = new ColeccionGenerico<>();
        cadenas.agregarElemento("Hola");
        cadenas.agregarElemento("Mundo");
        cadenas.agregarElemento("Java");
        System.out.println("Colección de cadenas:");
        cadenas.imprimirElementos();
    }
}
