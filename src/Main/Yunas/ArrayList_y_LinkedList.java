package Main.Yunas.ArrayList_y_LinkedList.java;

import java.util.*;

public class BodaJava {
    public static void main(String[] args) {

        // Creo una lista de invitados (ArrayList)
        List<String> invitados = new ArrayList<>();

        // Inserto invitados (puede haber repetidos, mantiene el orden)
        invitados.add("Ana");
        invitados.add("Juan");
        invitados.add("Ana");     // Repetido
        invitados.add("Carlos");
        invitados.add("Lucía");

        // Inserto un nuevo invitado
        invitados.add("María");

        // Inserto en una posición específica
        invitados.add(2, "Pedro"); // Se inserta en la posición 2

        // Elimino por nombre
        invitados.remove("Ana");

        // Elimino por posicion en la lista
        invitados.remove(3); 

        
        System.out.println("Lista de invitados con ArrayList :");
        for (String nombre : invitados) {
            System.out.println("- " + nombre);
        }
    }
}
