package Main.Salma.clasesParametrosGenericos;

public class main {
    public static void main(String[] args) {
        // Creamos una Caja de tipo String
        caja<String> cajaDeTexto = new caja<>("Hola DAM");
        cajaDeTexto.mostrarContenido(); // Imprime: La caja contiene: Hola DAM

        // Creamos una Caja de tipo Integer
        caja<Integer> cajaDeNumero = new caja<>(42);
        cajaDeNumero.mostrarContenido(); // Imprime: La caja contiene: 42

        // Si no usamos genéricos y lo dejamos sin tipo, se comporta como Object
        // Esto puede dar error si intentamos hacer un cast incorrecto
        caja cajaSinTipo = new caja("Soy una caja sin tipo");
        cajaSinTipo.mostrarContenido(); // Funciona, pero puede dar error en tiempo de ejecución
    }
}
