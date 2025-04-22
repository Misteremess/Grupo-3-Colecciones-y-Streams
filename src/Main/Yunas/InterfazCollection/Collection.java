
package Main.Yunas.InterfazCollection.java;
import java.util.*;

public class BodaJava {
    public static void main(String[] args) {
        
        //Lista de invitados (puede tener repetidos y mantiene el orden)
        List<String> invitados = new ArrayList<>();
        invitados.add("Ana");
        invitados.add("Juan");
        invitados.add("Ana"); // Ana se repite
        invitados.add("Carlos");
        invitados.add("Lucía");

        System.out.println("Lista de invitados (List):");
        for (String nombre : invitados) {
            System.out.println("- " + nombre);
        }

        //Registro de entrada (no puede tener repetidos)
        Set<String> registrados = new HashSet<>();
        registrados.add("Ana");
        registrados.add("Juan");
        registrados.add("Ana"); // Ana ya esta asi que se ignora
        registrados.add("Carlos");
        registrados.add("Lucía");

        System.out.println("Registro de entrada (Set):");
        for (String nombre : registrados) {
            System.out.println("- " + nombre);
        }

        //El organizador solo quiere una colección para recorrerla (da igual si es lista o set)
        Collection<String> coleccion = invitados; // puedes usar tambien : registrados

        System.out.println("Colección genérica (Collection):");
        for (String nombre : coleccion) {
            System.out.println("- " + nombre);
        }
    }
}
