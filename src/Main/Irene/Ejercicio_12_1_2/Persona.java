package Main.Irene.Ejercicio_12_1_2;

    //Declaramos la clasedenominada persona;
    //Implementamos la interfaz Comparable<Persona> que nos permitirá comparar
    //dos personas mediante el metodo CompareTo();
    public class Persona implements Comparable<Persona> {
        private String nombre;
        private int edad;

        //Añadimos los atributos como el nombre y la edad de la persona
        //Al ser privados solo podremos acceder a ellos dentro de la clase o con metodos como get
        public Persona(String nombre, int edad) {
            this.nombre = nombre;
            this.edad = edad;
        }

        //Creamos un contrustor que nos permite crear un objeto(persona) como nombre y edad
        //this.nombre, this se refiere al atributo y nombre al valor que le pasa
        public String getNombre() {
            return nombre;
        }

        //Get es un metodo que se utiliza para acceder a los valores de nombre y persona
        public int getEdad() {
            return edad;
        }

        //Este metodo se utiliza para comparar a dos personas
        //Devuelve: valor negativo, positivo o 0
        @Override
        public int compareTo(Persona otraPersona) {
            // Comparamos la edad de las dos personas
            return Integer.compare(this.edad, otraPersona.edad);
        }

        //Este metodo personaliza, es decir, le da nombre y edad a la persona creada
        @Override
        public String toString() {
            return "Persona{" +
                    "nombre='" + nombre + '\'' +
                    ", edad=" + edad +
                    '}';
        }
    }

