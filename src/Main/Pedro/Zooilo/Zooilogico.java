package Main.Pedro.Zooilo;

import java.util.Scanner;
import java.util.*;

public class Zooilogico extends Metodos {
    public static void main(String[] args) {
        Zooilogico zoo = new Zooilogico();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n---- ZOOLÓGICO MENU ----");
            System.out.println("1. Mostrar animales");
            System.out.println("2. Agregar animal");
            System.out.println("3. Eliminar animal");
            System.out.println("4. Vaciar zoológico");
            System.out.println("5. Mostrar cantidad de animales");
            System.out.println("6. ¿Zoológico vacío?");
            System.out.println("7. Buscar un animal");
            System.out.println("8. Mostrar .toString()");
            System.out.println("9. Iterar con Iterator");
            System.out.println("10. Iterar con For-each");
            System.out.println("11. containsAll");
            System.out.println("12. addAll");
            System.out.println("13. removeAll");
            System.out.println("14. retainAll");
            System.out.println("15. toArray");
            System.out.println("16. Ordenar animales");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();  // limpiar buffer

            switch (opcion) {
                case 1: zoo.mostrarAnimales(); break;
                case 2:
                    System.out.print("Nombre del animal a agregar: ");
                    String nuevo = scanner.nextLine();
                    zoo.agregarAnimal(nuevo);
                    break;
                case 3:
                    System.out.print("Nombre del animal a eliminar: ");
                    String borrar = scanner.nextLine();
                    zoo.eliminarAnimal(borrar);
                    break;
                case 4: zoo.vaciarZoologico(); break;
                case 5: zoo.mostrarCantidad(); break;
                case 6: zoo.estaVacio(); break;
                case 7:
                    System.out.print("Animal a buscar: ");
                    String buscar = scanner.nextLine();
                    zoo.contieneAnimal(buscar);
                    break;
                case 8: zoo.mostrarToString(); break;
                case 9: zoo.iterarConIterator(); break;
                case 10: zoo.iterarConForEach(); break;
                case 11:
                    List<String> listaEjemplo = Arrays.asList(
                            "001 - Dálmata de 564 que muje no ladra",
                            "002 - Vaca que ladra no muje"
                    );
                    zoo.contieneTodo(listaEjemplo); break;
                case 12:
                    List<String> nuevosAnimales = Arrays.asList(
                            "Aguila republicana",
                            "Pedro programador"
                    );
                    zoo.agregarTodo(nuevosAnimales); break;
                case 13:
                    List<String> animalesAEliminar = Arrays.asList(
                            "003 - Una vaca que ríe",
                            "004 - Una vaca que llora"
                    );
                    zoo.eliminarTodo(animalesAEliminar); break;
                case 14:
                    List<String> animalesImportantes = Arrays.asList(
                            "005 - Cangrejo adelantao",
                            "006 - Mono en estéreo",
                            "019 - Panda en un Renault"
                    );
                    zoo.retenerTodo(animalesImportantes); break;
                case 15: zoo.convertirAArray(); break;
                case 16: zoo.ordenarAnimales(); break;
                case 0: System.out.println("¡Hasta luego!"); break;
                default: System.out.println("Opción inválida.");
            }
        } while (opcion != 0);
        scanner.close();
    }
}


