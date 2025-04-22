package Main.Salma.clasesParametrosGenericos;
// Creamos una clase genérica llamada Caja
// T es un parámetro de tipo que puede ser cualquier clase (String, Integer, etc.)
public class caja<T>  {
        private T contenido;
        // Constructor que recibe el contenido
        public caja(T contenido) {
            this.contenido = contenido;
        }

        // Método para obtener el contenido de la caja
        public T getContenido() {
            return contenido;
        }

        // Método para cambiar el contenido de la caja
        public void setContenido(T nuevoContenido) {
            this.contenido = nuevoContenido;
        }

        // Método para mostrar el contenido por pantalla
        public void mostrarContenido() {
            System.out.println("La caja contiene: " + contenido);
        }
    }


