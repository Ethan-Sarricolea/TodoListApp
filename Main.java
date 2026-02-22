import java.util.ArrayList;
import java.util.Scanner;

/**
 * Main
 * 
 * Clase principal de la aplicación de listado de tareas (Todo List).
 * Contiene el menú interactivo y las funciones para gestionar las tareas.
 * Las tareas se almacenan en un ArrayList de objetos Task.
 * 
 * @author TodoListApp
 * @version 1.0
 */
public class Main {

    /** Lista que almacena todas las tareas de la aplicación */
    private static ArrayList<Task> tasks = new ArrayList<>();

    /** Contador para generar IDs únicos de las tareas */
    private static int nextId = 1;

    /**
     * Método principal de la aplicación.
     * Ejecuta un bucle que muestra el menú de opciones y procesa
     * la selección del usuario hasta que elija salir.
     *
     * @param args Argumentos de línea de comandos (no utilizados)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        System.out.println("========================================");
        System.out.println("   Bienvenido a la App de Tareas");
        System.out.println("========================================");

        while (running) {
            System.out.println("\n--- Menu de Opciones ---");
            System.out.println("1. Agregar tarea");
            System.out.println("2. Listar tareas");
            System.out.println("3. Marcar tarea como completada");
            System.out.println("4. Eliminar tarea");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opcion: ");

            String input = scanner.nextLine().trim();
            int option;

            try {
                option = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Error: Ingrese un numero valido.");
                continue;
            }

            switch (option) {
                case 1:
                    addTask(scanner);
                    break;
                case 2:
                    listTasks();
                    break;
                case 3:
                    System.out.println("Opcion no implementada aun.");
                    break;
                case 4:
                    System.out.println("Opcion no implementada aun.");
                    break;
                case 5:
                    running = false;
                    System.out.println("Saliendo de la aplicacion. Hasta luego!");
                    break;
                default:
                    System.out.println("Opcion no valida. Seleccione entre 1 y 5.");
                    break;
            }
        }

        scanner.close();
    }

    /**
     * Agrega una nueva tarea a la lista.
     * Solicita al usuario el nombre de la tarea por consola,
     * crea un objeto Task con un ID auto-incremental y lo añade al ArrayList.
     *
     * @param scanner Objeto Scanner para leer la entrada del usuario
     */
    private static void addTask(Scanner scanner) {
        System.out.print("Ingrese el nombre de la tarea: ");
        String taskName = scanner.nextLine().trim();

        if (taskName.isEmpty()) {
            System.out.println("Error: El nombre de la tarea no puede estar vacio.");
            return;
        }

        Task newTask = new Task(nextId, taskName);
        tasks.add(newTask);
        System.out.println("Tarea agregada exitosamente con ID: " + nextId);
        nextId++;
    }

    /**
     * Lista todas las tareas almacenadas en el ArrayList.
     * Muestra cada tarea con su ID, estado (completada/pendiente) y nombre.
     * Si no hay tareas registradas, muestra un mensaje informativo.
     */
    private static void listTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No hay tareas registradas.");
            return;
        }

        System.out.println("\n--- Lista de Tareas ---");
        for (Task task : tasks) {
            System.out.println(task.toString());
        }
        System.out.println("----------------------");
        System.out.println("Total de tareas: " + tasks.size());
    }
}
