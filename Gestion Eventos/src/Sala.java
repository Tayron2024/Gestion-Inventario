public class Sala {
    private String nombre;
    private int capacidad;

    // Constructor
    public Sala(String nombre, int capacidad) {
        this.nombre = nombre;
        this.capacidad = capacidad;
    }

    // Métodos getter
    public String getNombre() {
        return nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }
}