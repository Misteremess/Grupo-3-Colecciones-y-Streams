package Main.Irene.Ejercicio12_1_3;

public class Test {

    public static void main(String[] args) {

        Main.Operador op1 = new Main.Operador(4, 5);
        System.out.println("Suma: " + op1.getSuma());
        System.out.println("Producto: " + op1.getProducto());

        Main.Operador op2 = new Main.Operador(4.6, 5);
        System.out.println("Suma: " + op2.getSuma());
        System.out.println("Producto: " + op2.getProducto());

        Main.Operador op3 = new Main.Operador(2.5, 1.65);
        System.out.println("Suma: " + op3.getSuma());
        System.out.println("Producto: " + op3.getProducto());
    }
}
