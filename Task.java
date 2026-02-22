/**
 * Task
 * 
 * Representa una tarea individual dentro de la aplicación de listado de tareas.
 * Cada tarea tiene un identificador único, un nombre y un estado de completado.
 * 
 * @author TodoListApp
 * @version 1.0
 */
public class Task {

    /** Identificador único de la tarea */
    private int id;

    /** Nombre o descripción de la tarea */
    private String name;

    /** Indica si la tarea ha sido completada */
    private boolean completed;

    /**
     * Constructor de la clase Task.
     * Crea una nueva tarea con el id y nombre proporcionados.
     * Por defecto, la tarea se crea como no completada.
     *
     * @param id   Identificador único de la tarea
     * @param name Nombre o descripción de la tarea
     */
    public Task(int id, String name) {
        this.id = id;
        this.name = name;
        this.completed = false;
    }

    /**
     * Obtiene el identificador de la tarea.
     *
     * @return El id de la tarea
     */
    public int getId() {
        return id;
    }

    /**
     * Establece el identificador de la tarea.
     *
     * @param id El nuevo id de la tarea
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Obtiene el nombre de la tarea.
     *
     * @return El nombre de la tarea
     */
    public String getName() {
        return name;
    }

    /**
     * Establece el nombre de la tarea.
     *
     * @param name El nuevo nombre de la tarea
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Verifica si la tarea está completada.
     *
     * @return true si la tarea está completada, false en caso contrario
     */
    public boolean isCompleted() {
        return completed;
    }

    /**
     * Establece el estado de completado de la tarea.
     *
     * @param completed El nuevo estado de completado
     */
    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    /**
     * Devuelve una representación en texto de la tarea.
     * Muestra el id, el estado (✔ completada, ✘ pendiente) y el nombre.
     *
     * @return Cadena con el formato: "id. [estado] nombre"
     */
    @Override
    public String toString() {
        String status = completed ? "✔" : "✘";
        return id + ". [" + status + "] " + name;
    }
}
