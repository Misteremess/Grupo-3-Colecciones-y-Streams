package Main.Irene.Ejercicio12_1_3;

public class Main {

    public static class Operador<A extends Number, B extends Number> {
        A valorA;
        B valorB;
        public Operador(A valorA, B valorB) {
            this.valorA = valorA;
            this.valorB = valorB;
        }
        public Double getSuma() {
            return this.valorA.doubleValue() + this.valorB.doubleValue();
        }
        public Double getProducto() {
            return this.valorA.doubleValue() * this.valorB.doubleValue();
        }
    }
}
