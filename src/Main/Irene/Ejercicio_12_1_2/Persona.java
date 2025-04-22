package Main.Irene.Ejercicio_12_1_2;

    public class Persona implements Comparable<Persona> {
        private String nombre;
        private int edad;

        public Persona(String nombre, int edad) {
            this.nombre = nombre;
            this.edad = edad;
        }

        public String getNombre() {
            return nombre;
        }

        public int getEdad() {
            return edad;
        }

        @Override
        public int compareTo(Persona otraPersona) {
            // Comparamos la edad de las dos personas
            return Integer.compare(this.edad, otraPersona.edad);
        }

        @Override
        public String toString() {
            return "Persona{" +
                    "nombre='" + nombre + '\'' +
                    ", edad=" + edad +
                    '}';
        }
    }

